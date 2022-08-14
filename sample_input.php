<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

return new class extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('$[table]', function (Blueprint $table) {
$[field.each(all)]
    $[field.if(primary)]
        $[field.if(enum)]
            $[field.if(few_fields)]
            $table->enum('$[field]', [$[field.each(option)]$[field.if(first)]$[field.else], $[field.end]'$[field.option]'$[field.end]])$[field.if(null)]->nullable()$[field.end]$[field.if(default)]->default($[field.default])$[field.end];
            $[field.else]
            $table->enum(
                '$[field]',
                [
                $[field.each(option)]
                    '$[field.option]',
                $[field.end]
                ]
            )$[field.if(null)]->nullable()$[field.end]$[field.if(default)]->default($[field.default])$[field.end];
            $[field.end]
        $[field.else]
            $[field.if(bigint)]
            $table->id('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
            $[field.else]
            $table->increments('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
            $[field.end]
        $[field.end]
    $[field.else.if(reference)]
        $[field.if(bigint)]
            $table->foreignId('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
        $[field.else]
            $table->unsignedInteger('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
        $[field.end]
    $[field.else.if(date)]
            $table->date('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(time)]
            $table->time('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(datetime)]
            $table->dateTime('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(currency)]
            $table->decimal('$[field]', 19, 4)$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(float)]
            $table->float('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(double)]
            $table->double('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(bigint)]
            $table->bigInteger('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(integer)]
            $table->integer('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(blob)]
            $table->binary('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(text)]
            $table->text('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(boolean)]
            $table->boolean('$[field]')$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.else.if(enum)]
        $[field.if(few_fields)]
            $table->enum('$[field]', [$[field.each(option)]$[field.if(first)]$[field.else], $[field.end]'$[field.option]'$[field.end]])$[field.if(null)]->nullable()$[field.end]$[field.if(default)]->default($[field.default])$[field.end];
        $[field.else]
            $table->enum(
                '$[field]',
                [
            $[field.each(option)]
                    '$[field.option]',
            $[field.end]
                ]
            )$[field.if(null)]->nullable()$[field.end]$[field.if(default)]->default($[field.default])$[field.end];
        $[field.end]
    $[field.else.if(string)]
            $table->string('$[field]', $[field.length])$[field.if(null)]->nullable()$[field.end]$[field.if(info)]->default($[Field.info])$[field.end];
    $[field.end]
$[field.end]
$[table.exists(index|constraint)]

$[table.else]
    $[field.each(all)]
        $[field.if(primary)]
            $[field.if(enum)]

            $[field.end]
        $[field.end]
    $[field.end]
$[table.end]
$[field.each(all)]
    $[field.if(primary)]
        $[field.if(enum)]
            $table->primary('$[field]');
        $[field.end]
    $[field.end]
$[field.end]
$[table.each(unique)]
    $[unique.if(primary)]
    $[unique.else]
        $[unique.if(few_fields)]
            $table->unique([$[unique.each(all)]$[field.if(first)]$[field.else], $[field.end]'$[field]'$[unique.end]]);
        $[unique.else]
            $table->unique(
                [
            $[unique.each(all)]
                    '$[field]',
            $[unique.end]
                ],
                '$[unique.name]'
            );
        $[unique.end]
    $[unique.end]
$[table.end]
$[table.each(index)]
    $[index.if(few_fields)]
            $table->index([$[index.each(all)]$[field.if(first)]$[field.else], $[field.end]'$[field]'$[index.end]]);
    $[index.else]
            $table->index(
                [
        $[index.each(all)]
                    '$[field]',
        $[index.end]
                ],
                '$[index.name]'
            );
    $[index.end]
$[table.end]
$[field.each(reference)]
            $table->foreign('$[field]')
                ->references('id')->on('$[reference]')
                ->onUpdate('cascade')
                ->onDelete('$[field.on.delete]');
$[field.end]
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('$[table]');
    }
};
