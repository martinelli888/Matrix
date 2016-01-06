package com.msvia.matrix;

import android.app.Application;

import com.msvia.matrix.migrations.CreateMigrationTabelaTrecho;

import se.emilsjolander.sprinkles.Sprinkles;

/**
 * Created by Hp on 21-Nov-15.
 */
public class MatrixApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //instancia o sprinkles
        Sprinkles sprinkles = Sprinkles.init(getApplicationContext());
        //sprinkles executa o migrations das entidades
        sprinkles.addMigration(new CreateMigrationTabelaTrecho());
//    runMigrations(sprinkles);
    }
}