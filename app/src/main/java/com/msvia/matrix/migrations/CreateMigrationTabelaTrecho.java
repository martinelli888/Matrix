package com.msvia.matrix.migrations;

import android.database.sqlite.SQLiteDatabase;

import se.emilsjolander.sprinkles.Migration;
import se.emilsjolander.sprinkles.annotations.Column;

/**
 * Created by Hp on 21-Nov-15.
 */
public class CreateMigrationTabelaTrecho extends Migration{

    @Override
    protected void doMigration(SQLiteDatabase db){
        db.execSQL("CREATE TABLE TabelaTrecho ("+
        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "concessao TEXT," +
        "empresa TEXT," +
        "projeto TEXT," +
        "data TEXT," +
        "turno TEXT," +
        "clima TEXT," +
        "observacoes TEXT," +
        "responsavel TEXT," +
        "analista TEXT," +

        "servico TEXT," +
        "duplicacao TEXT," +
        "sentido TEXT," +
        "pista TEXT," +
        "faixa TEXT," +

        "kminicial DECIMAL(3,0)," +
        "estacainicial DECIMAL(3,0)," +
        "kmfinal DECIMAL(3,0)," +
        "estacafinal DECIMAL(3,0)," +

        "conforme TEXT," +
        "comprimento DECIMAL(5,2)," +
        "largura DECIMAL(5,2)," +
        "espessura DECIMAL(5,2)," +
        "densidade DECIMAL(2,2)," +
        "metrolinear DECIMAL(3,2)," +
        "unidades DECIMAL(5,0)," +
        "aMicroFresagem DECIMAL(5,2)," +
        "aMicroRevestimento DECIMAL(5,2)," +
        "fresagem DECIMAL(5,2)," +
        "cbuqFresagem DECIMAL(5,2)," +
        "cbuqRecobrimento DECIMAL(5,2)," +
        "pmqAcostamento DECIMAL(5,2)," +
        "pintura DECIMAL(5,2)," +
        "selagemDeTrinca DECIMAL(5,2)," +
        "reciclagem DECIMAL(5,2)," +
        "tss DECIMAL(5,2)," +

        "impermeabilizacao DECIMAL(5,2)," +
        "volume DECIMAL(5,2)," +
        "area DECIMAL(5,2)," +
        "foto INT," +
        "mat_CAP_Pista DECIMAL(5,2)," +
        "mat_CAP_Pmq DECIMAL(5,2)," +
        "mat_Emulpen DECIMAL(5,2)," +
        "mat_RR2C DECIMAL(5,2)," +
        "mat_R1CE DECIMAL(5,2)," +
        "mat_SelaTrinca DECIMAL(5,2)," +
        "mat_Cimento DECIMAL(5,2),"+")");

    }
}
