package com.msvia.matrix.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.msvia.matrix.Constants;
import com.msvia.matrix.Model.Trecho;
import com.msvia.matrix.R;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @Bind(R.id.leitorEmpresa)
    EditText Empresa;

    @Bind(R.id.leitorProjeto)
    EditText Projeto;

    @Bind(R.id.leitorData)
    EditText Data;

    @Bind(R.id.leitorObservacoes)
    EditText Observacoes;

    @Bind(R.id.leitorResponsavel)
    EditText Responsavel;

    @Bind(R.id.leitorAnalista)
    EditText Analista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }





    //recolhe a resposta da Turno
    public String respostaGrupoTurno() {
        RadioGroup vemradioTurno;
        RadioButton oEscolhidofoi;

        vemradioTurno = (RadioGroup) findViewById(R.id.grupoTurno);
        int turnoEscolha = vemradioTurno.getCheckedRadioButtonId();
        oEscolhidofoi = (RadioButton) findViewById(turnoEscolha);
        return oEscolhidofoi.getText().toString();
    }
    //recolhe a resposta da Clima
    public String respostaGrupoClima() {
        RadioGroup vemradioClima;
        RadioButton oEscolhidofoi;

        vemradioClima = (RadioGroup) findViewById(R.id.grupoClima);
        int climaEscolha = vemradioClima.getCheckedRadioButtonId();
        oEscolhidofoi = (RadioButton) findViewById(climaEscolha);
        return oEscolhidofoi.getText().toString();
    }
    //recolhe a resposta do Conforme
    public String respostaGrupoConforme() {
        RadioGroup vemradioConforme;
        RadioButton oEscolhidofoi;

        vemradioConforme = (RadioGroup) findViewById(R.id.grupoConforme);
        int conformeEscolha = vemradioConforme.getCheckedRadioButtonId();
        oEscolhidofoi = (RadioButton) findViewById(conformeEscolha);
        return oEscolhidofoi.getText().toString();
    }

    //Método executado quando clica no botão
    @OnClick(R.id.botao002)
    public void PassaFase2() {

        Intent transport = new Intent(MainActivity.this, Pergunta2.class);
        transport.putExtra(Constants.CAMINHAODOFEDEX, getTrechoNovo());
        startActivity(transport);

    }

    @OnClick(R.id.botao001)
    public void PassaFase3 (View view) {
        Intent vaipraservicos = new Intent(MainActivity.this, Servicos.class);
       vaipraservicos.putExtra(Constants.CAMINHAODOFEDEX, getTrechoNovo());
        startActivity(vaipraservicos);
    }








    //cria um objeto trecho e seta
    public Trecho getTrechoNovo() {

        Trecho trecho001 = new Trecho();

        trecho001.setEmpresa(Empresa.getText().toString());
        trecho001.setData("hoje");
        trecho001.setTurno(respostaGrupoTurno());
        trecho001.setClima(respostaGrupoClima());
        trecho001.setProjeto(Projeto.getText().toString());
        trecho001.setConforme(respostaGrupoConforme());
        trecho001.setObservacoes (Observacoes.getText().toString());
        trecho001.setResponsavel(Responsavel.getText().toString());
        trecho001.setAnalista(Analista.getText().toString());
        trecho001.setFoto(R.drawable.ccr_logo_msvia);

        return trecho001;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


