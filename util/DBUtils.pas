unit DBUtils;

interface

uses
  ZDataset;

type
  TDBUtil = class
  public
    class function GetLastInsertedID(Qry: TZQuery): Integer;
    class procedure StartTransaction(Qry: TZQuery);
    class procedure Commit(Qry: TZQuery);
    class procedure Rollback(Qry: TZQuery);
  end;

implementation



{ TDBUtil }

class procedure TDBUtil.Commit(Qry: TZQuery);
begin
  if Qry.Tag > 0 then
    Qry.Tag := Qry.Tag - 1;
  if Qry.Tag > 0 then
    Exit;
  Qry.SQL.Text := 'COMMIT';
  Qry.ExecSQL;
end;

class procedure TDBUtil.Rollback(Qry: TZQuery);
begin
  if Qry.Tag > 0 then
    Qry.Tag := Qry.Tag - 1;
  if Qry.Tag > 0 then
    Exit;
  Qry.SQL.Text := 'ROLLBACK';
  Qry.ExecSQL;
end;

class procedure TDBUtil.StartTransaction(Qry: TZQuery);
begin
  Qry.Tag := Qry.Tag + 1;
  if Qry.Tag > 1 then
    Exit;
  Qry.SQL.Text := 'START TRANSACTION';
  Qry.ExecSQL;
end;

class function TDBUtil.GetLastInsertedID(Qry: TZQuery): Integer;
begin
  Qry.SQL.Text := 'SELECT LAST_INSERT_ID() as ID';
  Qry.Open;
  Result := Qry.FieldByName('ID').AsInteger;
  Qry.Close;
end;

end.
