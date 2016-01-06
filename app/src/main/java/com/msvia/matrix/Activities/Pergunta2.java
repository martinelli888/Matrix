package com.msvia.matrix.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.msvia.matrix.Constants;
import com.msvia.matrix.Model.Trecho;
import com.msvia.matrix.R;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class Pergunta2 extends AppCompatActivity {


    @Bind(R.id.DigitaKMI)
    EditText DigitaKMI;

    @Bind(R.id.DigitaESI)
    EditText DigitaESI;

    @Bind(R.id.DigitaKMF)
    EditText DigitaKMF;

    @Bind(R.id.DigitaESF)
    EditText DigitaESF;

    @Bind(R.id.texto121)
    TextView testederecebimento;

    @Bind(R.id.DigitaComp001)
    EditText vemComprimento;

    @Bind(R.id.DigitaLarg001)
    EditText vemLargura;

    @Bind(R.id.DigitaEsp001)
    EditText vemEspessura;

    @Bind(R.id.DigitaDens001)
    EditText vemDensidade;

    @Bind(R.id.BotaoGerar)
    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Vinculo da Activity com o layout
        setContentView(R.layout.activity_pergunta2);
        //Habilitando as Injeções de View pelo ButterKnife
        ButterKnife.bind(this);

        //recebe as informações do MainActivity

    }

    public EditText getDigitaKMI() {
        return DigitaKMI;
    }

    public void setDigitaKMI(EditText digitaKMI) {
        DigitaKMI = digitaKMI;
    }

    public EditText getDigitaESI() {
        return DigitaESI;
    }

    public void setDigitaESI(EditText digitaESI) {
        DigitaESI = digitaESI;
    }

    public EditText getDigitaKMF() {
        return DigitaKMF;
    }

    public void setDigitaKMF(EditText digitaKMF) {
        DigitaKMF = digitaKMF;
    }

    public EditText getDigitaESF() {
        return DigitaESF;
    }

    public void setDigitaESF(EditText digitaESF) {
        DigitaESF = digitaESF;
    }

    public TextView getTestederecebimento() {
        return testederecebimento;
    }

    public void setTestederecebimento(TextView testederecebimento) {
        this.testederecebimento = testederecebimento;
    }

    public EditText getVemComprimento() {
        return vemComprimento;
    }

    public void setVemComprimento(EditText vemComprimento) {
        this.vemComprimento = vemComprimento;
    }

    public EditText getVemLargura() {
        return vemLargura;
    }

    public void setVemLargura(EditText vemLargura) {
        this.vemLargura = vemLargura;
    }

    public EditText getVemEspessura() {
        return vemEspessura;
    }

    public void setVemEspessura(EditText vemEspessura) {
        this.vemEspessura = vemEspessura;
    }

    public EditText getVemDensidade() {
        return vemDensidade;
    }

    public void setVemDensidade(EditText vemDensidade) {
        this.vemDensidade = vemDensidade;
    }

//    @Override
//    public TextView getTitle() {
//        return title;
//    }
//
//    public void setTitle(TextView title) {
//        this.title = title;
//    }

    public Trecho getTrechoNovo() {
        Trecho trecho001 = new Trecho();

        trecho001.setComprimento(Double.parseDouble(vemComprimento.getText().toString()));
        trecho001.setLargura(Double.parseDouble(vemLargura.getText().toString()));
        trecho001.setEspessura(Double.parseDouble(vemEspessura.getText().toString()));
        trecho001.setKminicial(Double.parseDouble(DigitaKMI.getText().toString()));
        trecho001.setEstacainicial(Double.parseDouble(DigitaESI.getText().toString()));
        trecho001.setKmfinal(Double.parseDouble(DigitaKMF.getText().toString()));
        trecho001.setEstacafinal(Double.parseDouble(DigitaESF.getText().toString()));

        trecho001.setDuplicacao(respostaGrupoDuplicacao());
        trecho001.setSentido(respostaGrupoSentido());
        trecho001.setPista(respostaGrupoPista());
        trecho001.setFaixa(respostaGrupoFaixa());

        trecho001.setFoto(R.drawable.ccr_logo_msvia);
        trecho001.setVolume(calculaVolume());
        trecho001.setArea(calculaArea());
        trecho001.setFresagem(calculaVolume());
        trecho001.setaMicroFresagem(calculaArea());
        trecho001.setaMicroRevestimento(calculaArea());
        trecho001.setCbuqFresagem(calculaPeso());
        trecho001.setCbuqRecobrimento(calculaPeso());
        trecho001.setPmqAcostamento(calculaPeso());
        trecho001.setPintura(calculaArea());
        trecho001.setReciclagem(calculaVolume());
        trecho001.setTss(calculaArea());
        trecho001.setImpermabilizacao(calculaArea());
        //fazer o recebimento da informaçao
        trecho001.setSelagemDeTrinca(0.00);

        //Insumos
        trecho001.setMat_CAP_Pista(calcula_CAP_pista());
        trecho001.setMat_CAP_Pmq(calcula_CAP_acost());
        trecho001.setMat_Emulpen(calculaEmulpen());
        trecho001.setMat_RR2C(calculaRR2C());
        trecho001.setMat_R1CE(calculaRC1CE());
        trecho001.setMat_SelaTrinca(calculaSelaTrinca());
        trecho001.setMat_Cimento(calculaCimento());

        // coloca os campos digitados na tela main no obj da tela 2

        if (getIntent().getExtras().containsKey(Constants.CAMINHAODOFEDEX)) {
            Trecho trechoM = (Trecho) getIntent().getExtras().getSerializable(Constants.CAMINHAODOFEDEX);
            if (trechoM != null) {
                if (trechoM.getServiço() != null)
                    trecho001.setServiço(trechoM.getServiço());
            }

            if (trechoM != null) {
                if (trechoM.getEmpresa() != null)
                    trecho001.setEmpresa(trechoM.getEmpresa());
            }

            if (trechoM != null) {
                if (trechoM.getData() != null)
                    trecho001.setData(trechoM.getData());
            }

            if (trechoM != null) {
                if (trechoM.getTurno() != null)
                    trecho001.setTurno(trechoM.getTurno());
            }

            if (trechoM != null) {
                if (trechoM.getClima() != null)
                    trecho001.setClima(trechoM.getClima());
            }

            if (trechoM != null) {
                if (trechoM.getProjeto() != null)
                    trecho001.setProjeto(trechoM.getProjeto());
            }

            if (trechoM != null) {
                if (trechoM.getConforme() != null)
                    trecho001.setConforme(trechoM.getConforme());
            }
            if (trechoM != null) {
                if (trechoM.getObservacoes() != null)
                    trecho001.setObservacoes(trechoM.getObservacoes());
            }
            if (trechoM != null) {
                if (trechoM.getResponsavel() != null)
                    trecho001.setResponsavel(trechoM.getResponsavel());
            }
            if (trechoM != null) {
                if (trechoM.getAnalista() != null)
                    trecho001.setAnalista(trechoM.getAnalista());
            }
        }
        return trecho001;
    }

//Método executado quando clica no botão

    @OnClick(R.id.BotaoGerar)
    public void irParaAlfa() {
        Intent transport = new Intent(Pergunta2.this, AlfaActivity.class);
        transport.putExtra(Constants.CAMINHAODOSEDEX, getTrechoNovo());
        startActivity(transport);
    }

    @OnLongClick(R.id.BotaoGerar)
    public boolean longClick() {
        title.setText("Solta do Dedo!");
        return true;
    }

    //calcula a Area
    private Double calculaArea() {
        Double vComprimento = Double.parseDouble(vemComprimento.getText().toString());
        Double vLargura = Double.parseDouble(vemLargura.getText().toString());
        Double aFinal;
        return aFinal = vComprimento * vLargura;
    }


    //calcula o volume
    private Double calculaVolume() {
        Double vComprimento = Double.parseDouble(vemComprimento.getText().toString());
        Double vLargura = Double.parseDouble(vemLargura.getText().toString());
        Double vEspessura = Double.parseDouble(vemEspessura.getText().toString());
        Double vFinal;
        return vFinal = vComprimento * vLargura * vEspessura;
    }

    //calcula peso - DENSIDADE MASSA (cbuq, cbuq, fresagem,
    private Double calculaPeso() {

        Double vComprimento = Double.parseDouble(vemComprimento.getText().toString());
        Double vLargura = Double.parseDouble(vemLargura.getText().toString());
        Double vEspessura = Double.parseDouble(vemEspessura.getText().toString());
        Double vDensidade = Double.parseDouble((vemDensidade.getText().toString()));
        Double vDensidadeMassa = Constants.DENSIDADEMASSA;
        Double pesoFinal;
        return pesoFinal = vComprimento * vLargura * vEspessura * vDensidadeMassa;
    }

    //calcula insumo - Cimento
    private Double calculaCimento() {

        Double vComprimento = Double.parseDouble(vemComprimento.getText().toString());
        Double vLargura = Double.parseDouble(vemLargura.getText().toString());
        Double vEspessura = Double.parseDouble(vemEspessura.getText().toString());
        Double vTaxa = Constants.TAXACIMENTO;
        Double cappistaFinal;
        return cappistaFinal = vComprimento * vLargura * vEspessura * vTaxa;
    }

    //calcula insumo - Cap Pista
    private Double calcula_CAP_pista() {

        Double vComprimento = Double.parseDouble(vemComprimento.getText().toString());
        Double vLargura = Double.parseDouble(vemLargura.getText().toString());
        Double vEspessura = Double.parseDouble(vemEspessura.getText().toString());
        Double vTaxa = Constants.CAP_PISTA;
        Double cappistaFinal;
        return cappistaFinal = vComprimento * vLargura * vEspessura * vTaxa;
    }

    //calcula insumo - Cap Pista
    private Double calcula_CAP_acost() {

        Double vComprimento = Double.parseDouble(vemComprimento.getText().toString());
        Double vLargura = Double.parseDouble(vemLargura.getText().toString());
        Double vEspessura = Double.parseDouble(vemEspessura.getText().toString());
        Double vTaxa = Constants.CAP_PMQ;
        Double cappistaFinal;
        return cappistaFinal = vComprimento * vLargura * vEspessura * vTaxa;
    }

    //calcula insumo - Emulpen
    private Double calculaEmulpen() {

        Double vComprimento = Double.parseDouble(vemComprimento.getText().toString());
        Double vLargura = Double.parseDouble(vemLargura.getText().toString());
        Double vEspessura = Double.parseDouble(vemEspessura.getText().toString());
        Double vTaxa = Constants.EMULPEN_T;
        Double emulpen;
        emulpen = vComprimento * vLargura * vEspessura * vTaxa;
        // return emulpen;
        //  ate aqui tava certo ele retorna o valor que quero

        NumberFormat formato2casas = new DecimalFormat(".#");
        formato2casas.format(emulpen);
        return emulpen;
    }

    //calcula insumo - RR2C
    private Double calculaRR2C() {

        Double vComprimento = Double.parseDouble(vemComprimento.getText().toString());
        Double vLargura = Double.parseDouble(vemLargura.getText().toString());
        Double vEspessura = Double.parseDouble(vemEspessura.getText().toString());
        Double vTaxa = Constants.RR2C;
        Double cappistaFinal;
        return cappistaFinal = vComprimento * vLargura * vEspessura * vTaxa;
    }

    //calcula insumo - RR2C
    private Double calculaRC1CE() {

        Double vComprimento = Double.parseDouble(vemComprimento.getText().toString());
        Double vLargura = Double.parseDouble(vemLargura.getText().toString());
        Double vEspessura = Double.parseDouble(vemEspessura.getText().toString());
        Double vTaxa = Constants.RC1C;
        Double rr2cFinal;
        return rr2cFinal = vComprimento * vLargura * vEspessura * vTaxa;
    }

    //calcula insumo - Material de Sela Trinca
    private Double calculaSelaTrinca() {

        Double vComprimento = Double.parseDouble(vemComprimento.getText().toString());
        Double vLargura = Double.parseDouble(vemLargura.getText().toString());
        Double vEspessura = Double.parseDouble(vemEspessura.getText().toString());
        Double vTaxa = Constants.M_SELA_TRINCA;
        Double rr1cFinal;
        return rr1cFinal = vComprimento * vLargura * vEspessura * vTaxa;
    }

//recolhe a resposta da Duplicacao
        public String respostaGrupoDuplicacao() {
        RadioGroup vemradioDuplicada;
        RadioButton oEscolhidofoi;

        vemradioDuplicada = (RadioGroup) findViewById(R.id.grupoDuplicada);
        int duplicadoEscolha = vemradioDuplicada.getCheckedRadioButtonId();
        oEscolhidofoi = (RadioButton) findViewById(duplicadoEscolha);
        return oEscolhidofoi.getText().toString();
    }

//recolhe a resposta do Sentido da Via
        public String respostaGrupoSentido() {
        RadioGroup vemradioSentido;
        RadioButton oEscolhidofoi;

        vemradioSentido = (RadioGroup) findViewById(R.id.grupoSentido);
        int sentidoEscolha = vemradioSentido.getCheckedRadioButtonId();
        oEscolhidofoi = (RadioButton) findViewById(sentidoEscolha);
        return oEscolhidofoi.getText().toString();
    }

//recolhe a resposta: Pista Nova ou Existente
        public String respostaGrupoPista() {
        RadioGroup vemradioPista;
        RadioButton oEscolhidofoi;

        vemradioPista = (RadioGroup) findViewById(R.id.grupoPista);
        int pistaEscolha = vemradioPista.getCheckedRadioButtonId();
        oEscolhidofoi = (RadioButton) findViewById(pistaEscolha);
        return oEscolhidofoi.getText().toString();
    }



    //recolhe a resposta: Pista Nova ou Existente
    private String respostaGrupoFaixa() {
        RadioGroup vemradioFaixa;
        RadioButton oEscolhidofoi;

        vemradioFaixa = (RadioGroup) findViewById(R.id.grupoFaixa);
        int faixaEscolha = vemradioFaixa.getCheckedRadioButtonId();
        oEscolhidofoi = (RadioButton) findViewById(faixaEscolha);
        return oEscolhidofoi.getText().toString();
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
