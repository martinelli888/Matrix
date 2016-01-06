package com.msvia.matrix.Activities;



import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.msvia.matrix.R;
public class porta extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porta);

        Handler handler = new Handler();
        handler.postDelayed(this, 3500);
    }
    public void run() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}