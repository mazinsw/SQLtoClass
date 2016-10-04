unit DispositivoBase;

interface

type
  TDispositivoType = (dtComputer, dtTablet);

  TDispositivoBase = class
  private
    FID: Integer;
    FEmpresaID: Integer;
    FDeviceID: string;
    FType: TDispositivoType;
    FDescricao: string;
    FModelo: string;
    FDataCadastro: TDateTime;
    FDataAtualizacao: TDateTime;
  public
    class function StringToDispositivoType(const Value: string): TDispositivoType;
    procedure Assign(Value: TDispositivoBase);
    property ID: Integer read FID write FID;
    property EmpresaID: Integer read FEmpresaID write FEmpresaID;
    property DeviceID: string read FDeviceID write FDeviceID;

    /// <summary>
    ///   Tipo de dispositivo
    /// </summary>
    property Type: TDispositivoType read FType write FType;
    property Descricao: string read FDescricao write FDescricao;
    property Modelo: string read FModelo write FModelo;
    property DataCadastro: TDateTime read FDataCadastro write FDataCadastro;
    property DataAtualizacao: TDateTime read FDataAtualizacao write FDataAtualizacao;
  end;

const
  DispositivoTypeToString: array[TDispositivoType] of string = ('Computer', 'Tablet');
  DispositivoTypeToIndex: array[TDispositivoType] of Integer = (0, 1);
  IndexToDispositivoType: array[0..1] of TDispositivoType = (dtComputer, dtTablet);

implementation

uses
  SysUtils;

{ TDispositivoBase }

class function TDispositivoBase.StringToDispositivoType(const Value: string): TDispositivoType;
begin
  for Result := Low(TDispositivoType) to High(TDispositivoType) do
  begin
    if DispositivoTypeToString[Result] = Value then
      Exit;
  end;
  raise Exception.CreateFmt('Não foi possível converter de "%s" para TDispositivoType', [Value]);
end;

procedure TDispositivoBase.Assign(Value: TDispositivoBase);
var
  I: Integer;
begin
  FID := Value.FID;
  FEmpresaID := Value.FEmpresaID;
  FDeviceID := Value.FDeviceID;
  FType := Value.FType;
  FDescricao := Value.FDescricao;
  FModelo := Value.FModelo;
  FDataCadastro := Value.FDataCadastro;
  FDataAtualizacao := Value.FDataAtualizacao;
end;

end.
