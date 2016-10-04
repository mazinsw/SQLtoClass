unit EmpresaBase;

interface

type
  ///	<summary>
  ///	  Informações da empresa Informações da empresa Informações da empresa
  ///	  Informações da empresa Informações da empresa
  ///	</summary>
  TEmpresaBase = class
  private
    FID: Integer;
    FFantasia: string;
    FRazaoSocial: string;
    FEmail: string;
    FSenha: string;
    FCNPJ: string;
    FEstadoID: Integer;
    FCidadeID: Integer;
    FEndereco: string;
    FFone: array[1..2] of string;
    FSite: string;
    FGUID: string;
    FDataCadastro: TDateTime;
    FDataAtualizacao: TDateTime;
    function GetFone(Index: Integer): string;
    procedure SetFone(Index: Integer; Value: string);
  public
    procedure Assign(Value: TEmpresaBase);
    property ID: Integer read FID write FID;
    property Fantasia: string read FFantasia write FFantasia;
    property RazaoSocial: string read FRazaoSocial write FRazaoSocial;
    property Email: string read FEmail write FEmail;
    property Senha: string read FSenha write FSenha;
    property CNPJ: string read FCNPJ write FCNPJ;
    property EstadoID: Integer read FEstadoID write FEstadoID;
    property CidadeID: Integer read FCidadeID write FCidadeID;
    property Endereco: string read FEndereco write FEndereco;
    property Fone[Index: Integer]: string read GetFone write SetFone;
    property Site: string read FSite write FSite;
    property GUID: string read FGUID write FGUID;
    property DataCadastro: TDateTime read FDataCadastro write FDataCadastro;
    property DataAtualizacao: TDateTime read FDataAtualizacao write FDataAtualizacao;
  end;

implementation

{ TEmpresaBase }

procedure TEmpresaBase.Assign(Value: TEmpresaBase);
begin
  FID := Value.FID;
  FFantasia := Value.FFantasia;
  FRazaoSocial := Value.FRazaoSocial;
  FEmail := Value.FEmail;
  FSenha := Value.FSenha;
  FCNPJ := Value.FCNPJ;
  FEstadoID := Value.FEstadoID;
  FCidadeID := Value.FCidadeID;
  FEndereco := Value.FEndereco;
  for I := 1 to 2 do
    FFone[I] := Value.FFone[I];
  FSite := Value.FSite;
  FGUID := Value.FGUID;
  FDataCadastro := Value.FDataCadastro;
  FDataAtualizacao := Value.FDataAtualizacao;
end;

function TEmpresaBase.GetFone(Index: Integer): string;
begin
  if (Index < 1) or (Index > 2) then
    raise Exception.CreateFmt('Índice %d inválido, mínimo %d, máximo %d', [Index, 1, 2]);
  Result := FFone[Index];
end;

procedure TEmpresaBase.SetFone(Index: Integer; Value: string);
begin
  if (Index < 1) or (Index > 2) then
    raise Exception.CreateFmt('Índice %d inválido, mínimo %d, máximo %d', [Index, 1, 2]);
  FFone[Index] := Value;
end;

end.
