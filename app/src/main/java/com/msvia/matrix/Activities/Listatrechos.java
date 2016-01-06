package com.msvia.matrix.Activities;

import android.app.DownloadManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.msvia.matrix.Adapter.TrechoListAdapter;
import com.msvia.matrix.Constants;
import com.msvia.matrix.Model.Trecho;
import com.msvia.matrix.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import se.emilsjolander.sprinkles.Query;

public class Listatrechos extends AppCompatActivity {

//recebe o banco de dados
    public List<Trecho> queryStuff(){
        return Query.all(Trecho.class).get().asList();
    }



    @Bind(R.id.escada)
    ListView escada;


    private String[] nomes = {
            "Alison",
            "Joabe",
            "Marcus",
            "Jiyan",
            "Édipo",
            "César",
            "Adriano",
            "Cleber",
            "Fulano",
            "Ciclano",
            "Beltrano",
            "Presbiterano"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listatrechos);
        ButterKnife.bind(this);
    }

//cria o adapter personalizado
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.listatrechos,bancodedados);
//        escada.setAdapter(adapter);

//        TrechoListAdapter Adapter = new TrechoListAdapter(this,R.layout.listatrechos,queryStuff());
//        trechos.setAdapter(adapter);
//        TrechoListAdapter Adapter = new TrechoListAdapter(this,R.layout.listatrechos,queryStuff());
//        trechos.setAdapter(adapter);

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_servicos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
