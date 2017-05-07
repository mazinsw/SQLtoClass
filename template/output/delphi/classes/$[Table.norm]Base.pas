unit $[tAble.norm]Base;

interface
$[table.exists(blob)]

uses
  Classes;
$[table.end]

type
$[field.each(all)]
$[field.if(primary)]
$[field.else.if(enum)]
  T$[tAble.norm]$[fIeld.norm] = ($[field.each(option)]$[field.if(first)]$[field.else], $[field.end]$[table.chars]$[field.chars]$[fIeld.option.norm]$[field.end]);
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
  T$[tAble.norm]Base = class
  private
$[field.each(all)]
$[field.if(repeated)]
$[field.else.if(enum)]
$[field.if(primary)]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Integer;
$[field.else]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]T$[tAble.norm]$[fIeld.norm];
$[field.end]
$[field.else.if(integer)]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Integer;
$[field.else.if(bigint)]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Int64;
$[field.else.if(date|time|datetime)]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]TDateTime;
$[field.else.if(float)]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Single;
$[field.else.if(double)]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Double;
$[field.else.if(currency)]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Currency;
$[field.else.if(boolean)]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]Boolean;
$[field.else.if(blob)]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]TStream;
$[field.else]
    F$[fIeld.norm]: $[field.if(array)]array[1..$[field.array.count]] of $[field.end]string;
$[field.end]
$[field.end]
$[field.each(all)]
$[field.if(repeated)]
$[field.else.if(array)]
    function Get$[fIeld.norm](Index: Integer): $[field.if(integer)]Integer$[field.else.if(bigint)]Int64$[field.else.if(date|time|datetime)]TDateTime$[field.else.if(float)]Single$[field.else.if(double)]Double$[field.else.if(currency)]Boolean$[field.else.if(boolean)]$[field.else]string$[field.end];
    procedure Set$[fIeld.norm](Index: Integer; const Value: $[field.if(integer)]Integer$[field.else.if(bigint)]Int64$[field.else.if(date|time|datetime)]TDateTime$[field.else.if(float)]Single$[field.else.if(double)]Double$[field.else.if(currency)]Boolean$[field.else.if(boolean)]$[field.else]string$[field.end]);
$[field.else.if(blob)]
    procedure Set$[fIeld.norm](Value: TStream);
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
    ///   Converte uma string para o tipo T$[tAble.norm]$[fIeld.norm]
    /// </summary>
    /// <param name="Value">Texto que será convertido
    /// </param>
    /// <returns>T$[tAble.norm]$[fIeld.norm] se conseguir;
    /// caso contrário uma Exception será lançada.
    /// </returns>
    class function StringTo$[tAble.norm]$[fIeld.norm](const Value: string): T$[tAble.norm]$[fIeld.norm];
$[field.end]
$[field.end]

    /// <summary>
    ///   Atribui todos os valores do parâmetro Source para a instância própria
    /// </summary>
    /// <param name="Source">Instância de onde os valores serão copiados
    /// </param>
    procedure Assign(Source: T$[tAble.norm]Base); virtual;
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
    property $[fIeld.norm][Index: Integer]: Integer read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: Integer read F$[fIeld.norm] write F$[fIeld.norm];
$[field.end]
$[field.else.if(array)]
    property $[fIeld.norm][Index: Integer]: T$[tAble.norm]$[fIeld.norm] read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: T$[tAble.norm]$[fIeld.norm] read F$[fIeld.norm] write F$[fIeld.norm];
$[field.end]
$[field.else.if(integer)]
$[field.if(array)]
    property $[fIeld.norm][Index: Integer]: Integer read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: Integer read F$[fIeld.norm] write F$[fIeld.norm];
$[field.end]
$[field.else.if(bigint)]
$[field.if(array)]
    property $[fIeld.norm][Index: Integer]: Int64 read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: Int64 read F$[fIeld.norm] write F$[fIeld.norm];
$[field.end]
$[field.else.if(date|time|datetime)]
$[field.if(array)]
    property $[fIeld.norm][Index: Integer]: TDateTime read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: TDateTime read F$[fIeld.norm] write F$[fIeld.norm];
$[field.end]
$[field.else.if(float)]
$[field.if(array)]
    property $[fIeld.norm][Index: Integer]: Single read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: Single read F$[fIeld.norm] write F$[fIeld.norm];
$[field.end]
$[field.else.if(double)]
$[field.if(array)]
    property $[fIeld.norm][Index: Integer]: Double read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: Double read F$[fIeld.norm] write F$[fIeld.norm];
$[field.end]
$[field.else.if(currency)]
$[field.if(array)]
    property $[fIeld.norm][Index: Integer]: Currency read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: Currency read F$[fIeld.norm] write F$[fIeld.norm];
$[field.end]
$[field.else.if(boolean)]
$[field.if(array)]
    property $[fIeld.norm][Index: Integer]: Boolean read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: Boolean read F$[fIeld.norm] write F$[fIeld.norm];
$[field.end]
$[field.else.if(blob)]
$[field.if(array)]
    property $[fIeld.norm][Index: Integer]: TStream read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: TStream read F$[fIeld.norm] write Set$[fIeld.norm];
$[field.end]
$[field.else]
$[field.if(array)]
    property $[fIeld.norm][Index: Integer]: string read Get$[fIeld.norm] write Set$[fIeld.norm];
$[field.else]
    property $[fIeld.norm]: string read F$[fIeld.norm] write F$[fIeld.norm];
$[field.end]
$[field.end]
$[field.end]
  end;
$[field.each(all)]
$[field.if(primary)]
$[field.else.if(enum)]

const
  $[tAble.norm]$[fIeld.norm]ToString: array[T$[tAble.norm]$[fIeld.norm]] of string = ($[field.each(option)]$[field.if(first)]$[field.else], $[field.end]'$[field.option]'$[field.end]);
  $[tAble.norm]$[fIeld.norm]ToIndex: array[T$[tAble.norm]$[fIeld.norm]] of Integer = ($[field.each(option)]$[field.if(first)]$[field.else], $[field.end]$[field.option.index]$[field.end]);
  IndexTo$[tAble.norm]$[fIeld.norm]: array[$[field.option.low]..$[field.option.high]] of T$[tAble.norm]$[fIeld.norm] = ($[field.each(option)]$[field.if(first)]$[field.else], $[field.end]$[table.chars]$[field.chars]$[fIeld.option.norm]$[field.end]);
$[field.end]
$[field.end]

implementation
$[table.exists(array|enum)]

uses
  SysUtils;
$[table.end]

{ T$[tAble.norm]Base }
$[table.exists(blob)]

destructor T$[tAble.norm]Base.Destroy;
begin
$[field.each(all)]
$[field.if(blob)]
  if F$[fIeld.norm] <> nil then
    F$[fIeld.norm].Free;
$[field.end]
$[field.end]
  inherited;
end;
$[table.end]
$[field.each(all)]
$[field.if(primary)]
$[field.else.if(enum)]

class function T$[tAble.norm]Base.StringTo$[tAble.norm]$[fIeld.norm](const Value: string): T$[tAble.norm]$[fIeld.norm];
begin
  for Result := Low(T$[tAble.norm]$[fIeld.norm]) to High(T$[tAble.norm]$[fIeld.norm]) do
  begin
    if $[tAble.norm]$[fIeld.norm]ToString[Result] = Value then
      Exit;
  end;
  raise Exception.CreateFmt('Não foi possível converter de "%s" para T$[tAble.norm]$[fIeld.norm]', [Value]);
end;
$[field.end]
$[field.end]

procedure T$[tAble.norm]Base.Assign(Source: T$[tAble.norm]Base);
$[table.exists(array)]
var
  I: Integer;
$[table.end]
begin
$[field.each(all)]
$[field.if(repeated)]
$[field.else.if(array)]
  for I := 1 to $[field.array.count] do
    F$[fIeld.norm][I] := Source.F$[fIeld.norm][I];
$[field.else.if(blob)]
  Set$[fIeld.norm](Source.F$[fIeld.norm]);
$[field.else]
  F$[fIeld.norm] := Source.F$[fIeld.norm];
$[field.end]
$[field.end]
end;
$[field.each(all)]
$[field.if(blob)]

procedure T$[tAble.norm]Base.Set$[fIeld.norm](Value: TStream);
var
  Position: Int64;
begin
  if F$[fIeld.norm] = Value then
    Exit;
  if Value = nil then
  begin
    if F$[fIeld.norm] <> nil then
      F$[fIeld.norm].Free;
    F$[fIeld.norm] := nil;
  end
  else
  begin
    if F$[fIeld.norm] = nil then
      F$[fIeld.norm] := TMemoryStream.Create;
    Position := Value.Position;
    Value.Position := 0;
    F$[fIeld.norm].Size := 0;
    F$[fIeld.norm].CopyFrom(Value, Value.Size);
    Value.Position := Position;
  end;
end;
$[field.end]
$[field.end]
$[field.each(all)]
$[field.if(repeated)]
$[field.else.if(array)]

function T$[tAble.norm]Base.Get$[fIeld.norm](Index: Integer): $[field.if(integer)]Integer$[field.else.if(bigint)]Int64$[field.else.if(date|time|datetime)]TDateTime$[field.else.if(float)]Single$[field.else.if(double)]Double$[field.else.if(currency)]Boolean$[field.else.if(boolean)]$[field.else]string$[field.end];
begin
  if (Index < 1) or (Index > $[field.array.count]) then
    raise Exception.CreateFmt('Índice %d inválido, mínimo %d, máximo %d', [Index, 1, $[field.array.count]]);
  Result := F$[fIeld.norm][Index];
end;

procedure T$[tAble.norm]Base.Set$[fIeld.norm](Index: Integer; const Value: $[field.if(integer)]Integer$[field.else.if(bigint)]Int64$[field.else.if(date|time|datetime)]TDateTime$[field.else.if(float)]Single$[field.else.if(double)]Double$[field.else.if(currency)]Boolean$[field.else.if(boolean)]$[field.else]string$[field.end]);
begin
  if (Index < 1) or (Index > $[field.array.count]) then
    raise Exception.CreateFmt('Índice %d inválido, mínimo %d, máximo %d', [Index, 1, $[field.array.count]]);
  F$[fIeld.norm][Index] := Value;
end;
$[field.end]
$[field.end]

end.
