package com.msvia.matrix.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.msvia.matrix.Constants;
import com.msvia.matrix.Model.Trecho;
import com.msvia.matrix.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Servicos extends AppCompatActivity {

    @Bind(R.id.listaGeral)
    ListView ListGeral;

    private static final String []NOMESERVICOS = new String[]{
    "MICRO-FRESAGEM (M2)",
    "MICRO-REVESTIMENTO (M2)",
    "FRESAGEM (M3)",
    "CBUQ RECOMPOSIÇÃO (t)",
    "CBUQ REFORÇO (t)",
    "PMQ Acostamento (t)",
    "SELAGEM DE TRINCA",
    "RECICLAGEM",
    "DRENAGEM"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicos);
        ButterKnife.bind(this);

        ArrayAdapter<String>
                adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,NOMESERVICOS);
        ListGeral.setAdapter(adapter);
    }

//cria o trecho 001 nesse layout

    public Trecho getTrechoNovo() {

        Trecho trecho001 = new Trecho();

//gerar metodo para preencher o servico
        trecho001.setServiço("Fresagem");

// coloca os campos digitados na tela main no obj da tela 2
//usa o objeto trecho G pra receber e setar no Objeto Trecho001
        if (getIntent().getExtras().containsKey(Constants.CAMINHAODOFEDEX)) {
            Trecho trechoG = (Trecho) getIntent().getExtras().getSerializable(Constants.CAMINHAODOFEDEX);
            if (trechoG != null) {
                if (trechoG.getEmpresa() != null)
                    trecho001.setEmpresa(trechoG.getEmpresa());
            }
            if (trechoG != null) {
                if (trechoG.getData() != null)
                    trecho001.setData(trechoG.getData());
            }

            if (trechoG != null) {
                if (trechoG.getTurno() != null)
                    trecho001.setTurno(trechoG.getTurno());
            }

            if (trechoG != null) {
                if (trechoG.getClima() != null)
                    trecho001.setClima(trechoG.getClima());
            }
            if (trechoG != null) {
                if (trechoG.getProjeto() != null)
                    trecho001.setProjeto(trechoG.getProjeto());
            }

            if (trechoG != null) {
                if (trechoG.getConforme() != null)
                    trecho001.setConforme(trechoG.getConforme());
            }

            if (trechoG != null) {
                if (trechoG.getObservacoes() != null)
                    trecho001.setObservacoes(trechoG.getObservacoes());
            }
            if (trechoG != null) {
                if (trechoG.getResponsavel() != null)
                    trecho001.setResponsavel(trechoG.getResponsavel());
            }
            if (trechoG != null) {
                if (trechoG.getAnalista() != null)
                    trecho001.setAnalista(trechoG.getAnalista());
            }
        }
        return trecho001;
    }

    // aqui tem q colocar o botao certo pra chamar o click e levar a informacao pra pergunta2
//    @OnClick(R.id.listaGeral)
//    public void irParaPergunta2(){
//        Intent transport = new Intent(Servicos.this, Pergunta2.class);
//        transport.putExtra(Constants.CAMINHAODOSEDEX, getTrechoNovo());
//        startActivity(transport);
//    }


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
