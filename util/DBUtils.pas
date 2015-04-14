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
var
  OldSQL: string;
begin
  if Qry.Tag > 0 then
    Qry.Tag := Qry.Tag - 1;
  if Qry.Tag > 0 then
    Exit;
  OldSQL := Qry.SQL.Text;
  Qry.SQL.Text := 'COMMIT';
  Qry.ExecSQL;
  Qry.SQL.Text := OldSQL;
end;

class procedure TDBUtil.Rollback(Qry: TZQuery);
var
  OldSQL: string;
begin
  if Qry.Tag > 0 then
    Qry.Tag := Qry.Tag - 1;
  if Qry.Tag > 0 then
    Exit;
  OldSQL := Qry.SQL.Text;
  Qry.SQL.Text := 'ROLLBACK';
  Qry.ExecSQL;
  Qry.SQL.Text := OldSQL;
end;

class procedure TDBUtil.StartTransaction(Qry: TZQuery);
var
  OldSQL: string;
begin
  Qry.Tag := Qry.Tag + 1;
  if Qry.Tag > 1 then
    Exit;
  OldSQL := Qry.SQL.Text;
  Qry.SQL.Text := 'START TRANSACTION';
  Qry.ExecSQL;
  Qry.SQL.Text := OldSQL;
end;

class function TDBUtil.GetLastInsertedID(Qry: TZQuery): Integer;
var
  OldSQL: string;
begin
  OldSQL := Qry.SQL.Text;
  Qry.SQL.Text := 'SELECT LAST_INSERT_ID() as ID';
  Qry.Open;
  Result := Qry.FieldByName('ID').AsInteger;
  Qry.Close;
  Qry.SQL.Text := OldSQL;
end;

end.
