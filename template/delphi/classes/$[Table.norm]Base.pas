unit $[Table.norm]Base;

interface
$[table.exists(blob)]

uses
  Classes;
$[table.end]

type
$[field.each(all)]
$[field.if(primary)]
$[field.else.if(enum)]
  T$[Table.norm]$[Field.norm] = ($[field.each(option)]$[field.if(first)]$[field.else], $[field.end]$[table.chars]$[field.chars]$[Field.option.norm]$[field.end]);
$[field.end]
$[field.end]
$[table.exists(enum)]

$[table.end]
$[table.if(comment)]
  /// <summary>
$[table.each(comment)]
  ///   $[Table.comment]
$[table.end]
  /// </summary>
$[table.end]
  T$[Table.norm]Base = class
  private
$[field.each(all)]
$[field.if(repeated)]
$[field.else.if(enum)]
$[field.if(primary)]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Integer;
$[field.else]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]T$[Table.norm]$[Field.norm];
$[field.end]
$[field.else.if(integer)]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Integer;
$[field.else.if(bigint)]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Int64;
$[field.else.if(date|time|datetime)]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]TDateTime;
$[field.else.if(float)]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Single;
$[field.else.if(double)]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Double;
$[field.else.if(currency)]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Currency;
$[field.else.if(boolean)]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Boolean;
$[field.else.if(blob)]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]TStream;
$[field.else]
    F$[Field.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]string;
$[field.end]
$[field.end]
$[field.each(all)]
$[field.if(repeated)]
$[field.else.if(array)]
    function Get$[Field.norm](Index: Integer): $[field.if(integer)]Integer$[field.else.if(bigint)]Int64$[field.else.if(date|time|datetime)]TDateTime$[field.else.if(float)]Single$[field.else.if(double)]Double$[field.else.if(currency)]Boolean$[field.else.if(boolean)]$[field.else]string$[field.end];
    procedure Set$[Field.norm](Index: Integer; const Value: $[field.if(integer)]Integer$[field.else.if(bigint)]Int64$[field.else.if(date|time|datetime)]TDateTime$[field.else.if(float)]Single$[field.else.if(double)]Double$[field.else.if(currency)]Boolean$[field.else.if(boolean)]$[field.else]string$[field.end]);
$[field.else.if(blob)]
    procedure Set$[Field.norm](Value: TStream);
$[field.end]
$[field.end]
  public
$[table.exists(blob)]
    destructor Destroy; override;
$[table.end]
$[field.each(all)]
$[field.if(primary)]
$[field.else.if(enum)]

    /// <summary>
    ///   Converte uma string para o tipo T$[Table.norm]$[Field.norm]
    /// </summary>
    /// <param name="Value">Texto que será convertido
    /// </param>
    /// <returns>T$[Table.norm]$[Field.norm] se conseguir;
    /// caso contrário uma Exception será lançada.
    /// </returns>
    class function StringTo$[Table.norm]$[Field.norm](const Value: string): T$[Table.norm]$[Field.norm];
$[field.end]
$[field.end]

    /// <summary>
    ///   Atribui todos os valores do parâmetro Source para a instância própria
    /// </summary>
    /// <param name="Source">Instância de onde os valores serão copiados
    /// </param>
    procedure Assign(Source: T$[Table.norm]Base); virtual;
$[field.each(all)]
$[field.if(repeated)]
$[field.else.if(comment)]

    /// <summary>
$[field.each(comment)]
    ///   $[Field.comment]
$[field.end]
    /// </summary>
$[field.end]
$[field.if(repeated)]
$[field.else.if(enum)]
$[field.if(primary)]
$[field.if(array)]
    property $[Field.norm][Index: Integer]: Integer read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: Integer read F$[Field.norm] write F$[Field.norm];
$[field.end]
$[field.else.if(array)]
    property $[Field.norm][Index: Integer]: T$[Table.norm]$[Field.norm] read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: T$[Table.norm]$[Field.norm] read F$[Field.norm] write F$[Field.norm];
$[field.end]
$[field.else.if(integer)]
$[field.if(array)]
    property $[Field.norm][Index: Integer]: Integer read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: Integer read F$[Field.norm] write F$[Field.norm];
$[field.end]
$[field.else.if(bigint)]
$[field.if(array)]
    property $[Field.norm][Index: Integer]: Int64 read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: Int64 read F$[Field.norm] write F$[Field.norm];
$[field.end]
$[field.else.if(date|time|datetime)]
$[field.if(array)]
    property $[Field.norm][Index: Integer]: TDateTime read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: TDateTime read F$[Field.norm] write F$[Field.norm];
$[field.end]
$[field.else.if(float)]
$[field.if(array)]
    property $[Field.norm][Index: Integer]: Single read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: Single read F$[Field.norm] write F$[Field.norm];
$[field.end]
$[field.else.if(double)]
$[field.if(array)]
    property $[Field.norm][Index: Integer]: Double read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: Double read F$[Field.norm] write F$[Field.norm];
$[field.end]
$[field.else.if(currency)]
$[field.if(array)]
    property $[Field.norm][Index: Integer]: Currency read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: Currency read F$[Field.norm] write F$[Field.norm];
$[field.end]
$[field.else.if(boolean)]
$[field.if(array)]
    property $[Field.norm][Index: Integer]: Boolean read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: Boolean read F$[Field.norm] write F$[Field.norm];
$[field.end]
$[field.else.if(blob)]
$[field.if(array)]
    property $[Field.norm][Index: Integer]: TStream read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: TStream read F$[Field.norm] write Set$[Field.norm];
$[field.end]
$[field.else]
$[field.if(array)]
    property $[Field.norm][Index: Integer]: string read Get$[Field.norm] write Set$[Field.norm];
$[field.else]
    property $[Field.norm]: string read F$[Field.norm] write F$[Field.norm];
$[field.end]
$[field.end]
$[field.end]
  end;
$[field.each(all)]
$[field.if(primary)]
$[field.else.if(enum)]

const
  $[Table.norm]$[Field.norm]ToString: array[T$[Table.norm]$[Field.norm]] of string = ($[field.each(option)]$[field.if(first)]$[field.else], $[field.end]'$[field.option]'$[field.end]);
  $[Table.norm]$[Field.norm]ToIndex: array[T$[Table.norm]$[Field.norm]] of Integer = ($[field.each(option)]$[field.if(first)]$[field.else], $[field.end]$[field.option.index]$[field.end]);
  IndexTo$[Table.norm]$[Field.norm]: array[$[field.option.low]..$[field.option.high]] of T$[Table.norm]$[Field.norm] = ($[field.each(option)]$[field.if(first)]$[field.else], $[field.end]$[table.chars]$[field.chars]$[Field.option.norm]$[field.end]);
$[field.end]
$[field.end]

implementation
$[table.exists(array|enum)]

uses
  SysUtils;
$[table.end]

{ T$[Table.norm]Base }
$[table.exists(blob)]

destructor T$[Table.norm]Base.Destroy;
begin
$[field.each(all)]
$[field.if(blob)]
  if F$[Field.norm] <> nil then
    F$[Field.norm].Free;
$[field.end]
$[field.end]
  inherited;
end;
$[table.end]
$[field.each(all)]
$[field.if(primary)]
$[field.else.if(enum)]

class function T$[Table.norm]Base.StringTo$[Table.norm]$[Field.norm](const Value: string): T$[Table.norm]$[Field.norm];
begin
  for Result := Low(T$[Table.norm]$[Field.norm]) to High(T$[Table.norm]$[Field.norm]) do
  begin
    if $[Table.norm]$[Field.norm]ToString[Result] = Value then
      Exit;
  end;
  raise Exception.CreateFmt('Não foi possível converter de "%s" para T$[Table.norm]$[Field.norm]', [Value]);
end;
$[field.end]
$[field.end]

procedure T$[Table.norm]Base.Assign(Source: T$[Table.norm]Base);
$[table.exists(array)]
var
  I: Integer;
$[table.end]
begin
$[field.each(all)]
$[field.if(repeated)]
$[field.else.if(array)]
  for I := 1 to $[field.array.count] do
    F$[Field.norm][I] := Source.F$[Field.norm][I];
$[field.else.if(blob)]
  Set$[Field.norm](Source.F$[Field.norm]);
$[field.else]
  F$[Field.norm] := Source.F$[Field.norm];
$[field.end]
$[field.end]
end;
$[field.each(all)]
$[field.if(blob)]

procedure T$[Table.norm]Base.Set$[Field.norm](Value: TStream);
var
  Position: Int64;
begin
  if F$[Field.norm] = Value then
    Exit;
  if Value = nil then
  begin
    if F$[Field.norm] <> nil then
      F$[Field.norm].Free;
    F$[Field.norm] := nil;
  end
  else
  begin
    if F$[Field.norm] = nil then
      F$[Field.norm] := TMemoryStream.Create;
    Position := Value.Position;
    Value.Position := 0;
    F$[Field.norm].Size := 0;
    F$[Field.norm].CopyFrom(Value, Value.Size);
    Value.Position := Position;
  end;
end;
$[field.end]
$[field.end]
$[field.each(all)]
$[field.if(repeated)]
$[field.else.if(array)]

function T$[Table.norm]Base.Get$[Field.norm](Index: Integer): $[field.if(integer)]Integer$[field.else.if(bigint)]Int64$[field.else.if(date|time|datetime)]TDateTime$[field.else.if(float)]Single$[field.else.if(double)]Double$[field.else.if(currency)]Boolean$[field.else.if(boolean)]$[field.else]string$[field.end];
begin
  if (Index < 1) or (Index > $[field.array.count]) then
    raise Exception.CreateFmt('Índice %d inválido, mínimo %d, máximo %d', [Index, 1, $[field.array.count]]);
  Result := F$[Field.norm][Index];
end;

procedure T$[Table.norm]Base.Set$[Field.norm](Index: Integer; const Value: $[field.if(integer)]Integer$[field.else.if(bigint)]Int64$[field.else.if(date|time|datetime)]TDateTime$[field.else.if(float)]Single$[field.else.if(double)]Double$[field.else.if(currency)]Boolean$[field.else.if(boolean)]$[field.else]string$[field.end]);
begin
  if (Index < 1) or (Index > $[field.array.count]) then
    raise Exception.CreateFmt('Índice %d inválido, mínimo %d, máximo %d', [Index, 1, $[field.array.count]]);
  F$[Field.norm][Index] := Value;
end;
$[field.end]
$[field.end]

end.
