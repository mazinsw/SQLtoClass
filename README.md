SQLtoClass
==========

Cria arquivos de classes usando tabelas SQL como modelo

Com essa aplicação você poderá criar classes em PHP ou Delphi rapidamente
basta selecionar o arquivo .sql e escolher a pasta de destino

![Alt text](/img/screenshots/generated_class.png?raw=true "Exemplo de classe gerada")

## Modelando
```
format:[command:options]
example: [N:name|names]

explanation: inform that table or field has beautiful name "name" and plural "names"
```

commands:
```
N: set the beautiful name and/or plural name
	example: [N:name|names]

U: set the unix name and/or plural unix name
	example: [U:unixname|unixnames]

F: describe the field or table
	example: [F:This field must be filled]

M: set field as masked by option
	example: [M:999-9999]

D: Default field, with this flag, the field will not be filled by the user

I: Treats that field as image url, options sets the image dimension and base directory
	example: [I:64x64|user|default.png] will be /static/img/user/image_uploaded.png

S: indicate that field must be used to search entries in his table
	options: S, use select element to search
	example: [S:S], search with select html element

R: fill that enum field choosing html radio element

T: force field to be filled as textarea element

E: Informs enum beautiful names
	example: [E:Apple|Orange|Banana]

G: name gender
	example: [G:a] or [G:o]

L: field style
	[L:form-control]

P: Treats that field as password field

K: define a package
	example: [K:package.io|package/io/]

H: Define inheritance
	example: [H:table or name]
```

## Template

```
format: $[command]
example: $[table]
output: my_table
```

```
commands:
table = database table name
table.unix = Table name in unix format
table.unix.plural = database table name on plural
table.norm = Table name normalized and despluralized
table.norm.default = Table name normalized without despluralize
table.name = Beautiful name of table
table.name.plural = Beautiful name of table on plural
table.style = css style of table
table.style.extra = css extra style of table
table.info = Describe the table functionality
table.comment = Comment of table or each comment line wrapped when in loop
table.gender = table gender
table.chars = all word first characters of table name
table.letter = first char of table name
table.package =  defined package for table
table.inherited =  defined package for table
table.path =  defined path for class file
table.order = left zero padded table order
table.if(attribute) = table condition, attributes: comment, inherited, package, path, unpluralizable, pluralizable, index, unique
table.exists(type|attribute) = check if the table contains a field with matching type or attribute
	example: $[table.exists(comment)] = check if table has commentary
table.finds(column_name) = check if the table contains a field called column_name
	example: $[table.finds(.*_at)] = check if table has field name as date
table.each = for each all tables
	example: table.each(index), for each all index
	example: table.each(unique), for each unique index including primary
	example: table.each(primary), for each primary key index
	example: table.each(constraint), for each all constraint including primary and unique index
	example: table.each(foreign), for each all foreign key
	example: table.each(comment), for each comment line wrapped
table.end = end table exists condition or each loop
index.name = index name
index.each(type|attribute) = for each field of index
index.if(attribute) = few_fields, fulltext
unique.name = unique index name
unique.each(type|attribute) = for each field of unique index
primarykey.name = primary key index
primarykey.each(type|attribute) = for each field of primary key index
constraint.name = constraint name
constraint.each(type|attribute) = for each field of constraint
foreign.name = foreign key name
foreign.each(type|attribute) = for each field of foreign key
inherited =  inherited table
primary = primary key field have all field properties, when primary key have only one field
descriptor = main field of table, have all field properties
reference = referenced table by field or constraint, have all table commands
*reference.each(type|attribute&all) = for each field of referenced constraint table
field = name of table field
field.unix = name of field in unix format
field.norm = name of field normalized
field.norm.singular = Table name normalized on singular
field.name = Beautiful name of table field
field.info = Describe the field functionality
field.comment = Comment of the field or each comment line wrapped when in loop
field.content = fill with each field template generated
field.mask = mask informed on model for the field
field.style = css style of field
field.gender = field gender
field.chars = all word first characters of field name
field.letter = first char of field name
field.array.count = number of common fields, i.e, same name with different number
field.array.index = current index of common field, start from 0
field.array.number = current number of common field, start from 1
field.size = Size of the field in bytes
*field.length = Length of the string field
field.each = for each field process content
*	example: field.each(primary), for each primary key fields
	example: field.each(reference & required)
	example: field.each(comment), for each comment line wrapped
	example: field.each(search)
	example: field.each(option), for each option of field(enum items)
	example: field.each(all), for each all table field
field.end = end each loop
field.if(type|attribute) = test if field type or has attributes
	types: reference, primary, repeated, few_fields, many, single, first, non_first, null, optional, non_null, not_null, required, default, info, descriptor, searchable, comment, description, unique, radio, masked, array, image, integer, bigint, string, text, boolean, currency, double, float, date, datetime, time, enum, blob
	example: field.if(reference)
field.else = when if condition is false (must be the last before field.end)
field.else.if(type|attribute) = when if condition is false and make a test if field type or has attributes
field.end = end if
field.match(regex) = test if regex match field SQL name
field.end = end match
field.contains(text) = test if field SQL name contains "text"
field.end = end contains
field.option = enum item value
field.option.unix = enum item value as unix name
field.option.norm = enum item value normalized
field.option.low = first enum item index, start from 0
field.option.high = last enum item index, start from 0
field.option.index = current index of option, start from 0
*field.option.number = current number of option, start from 1
field.option.count = count of enum items
field.image.width = recommended image width
field.image.height = recommended image height
field.image.folder = image folder to upload
field.image.default = default image url
class = class name for the table
```

```
Tip: all command allow case formatting
example: for table category, $[Table.name] outputs: Category
example: for table Category, $[table.name] outputs: category
example: for table category, $[TABLE.name] outputs: CATEGORY
example: for table CaTeGoRy, $[tAble.name] outputs: CaTeGoRy
```

## Desenvolvimento

Rode o comando abaixo após alterar o arquivo SQL.g4 para gerar atualizar as classes
```sh
./make_parser.sh
```
