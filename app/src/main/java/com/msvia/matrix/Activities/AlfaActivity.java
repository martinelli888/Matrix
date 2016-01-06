package com.msvia.matrix.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.msvia.matrix.Constants;
import com.msvia.matrix.Model.Trecho;
import com.msvia.matrix.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AlfaActivity extends AppCompatActivity {


    @Bind(R.id.retempresa)
    TextView mostraEmpresa;

    @Bind(R.id.retdata)
    TextView mostraData;

    @Bind(R.id.retconforme)
    TextView mostraConforme;

    @Bind(R.id.retprojeto)
    TextView mostraProjeto;

    @Bind(R.id.retturno)
    TextView mostraTurno;

    @Bind(R.id.retclima)
    TextView mostraClima;

    @Bind(R.id.retduplicacao)
    TextView mostraDuplicação;

    @Bind(R.id.retsentido)
    TextView mostraSentido;

    @Bind(R.id.retpista)
    TextView mostraPista;

    @Bind(R.id.retfaixa)
    TextView mostraFaixa;

    @Bind(R.id.retkmi)
    TextView mostraKMI;

    @Bind(R.id.retesi)
    TextView mostraESI;

    @Bind(R.id.retkmf)
    TextView mostraKMF;

    @Bind(R.id.retesf)
    TextView mostraESF;

    @Bind(R.id.mostraComprimento)
    TextView mostraComprimento;

    @Bind(R.id.mostraLargura)
    TextView mostraLargura;

    @Bind(R.id.mostraEspessura)
    TextView mostraEspessura;

    @Bind(R.id.mostraVolume)
    TextView mostraVolume;

    @Bind(R.id.mostraArea)
    TextView mostraArea;

    @Bind(R.id.mostraFresagem)
    TextView mostraFresagem;

    @Bind(R.id.mostraCBUQR1)
    TextView mostraCBUQR1;

    @Bind(R.id.mostraCBUQR2)
    TextView mostraCBUQR2;

    @Bind(R.id.mostraPmq)
    TextView mostraPmq;

    @Bind(R.id.mostraMicroFresagem)
    TextView mostraMicroFresagem;

    @Bind(R.id.mostraMicroRevestimento)
    TextView mostraMicroRevestimento;

    @Bind(R.id.mostraReciclagem)
    TextView mostraReciclagem;

    @Bind(R.id.mostraTSS)
    TextView mostraTSS;

    @Bind(R.id.mostraImpermeabilizacao)
    TextView mostraImpermeabilizacao;

    @Bind(R.id.mostraSelaTrinca)
    TextView mostraSelaTrinca;

    @Bind(R.id.mostraCapPista)
    TextView mostraCAPPista;

    @Bind(R.id.mostraCAPAcostamento)
    TextView mostraCAPAcostamento;

    @Bind(R.id.mostraEmulpen)
    TextView mostraEmulpen;

    @Bind(R.id.mostraRR2C)
    TextView mostraRR2C;

    @Bind(R.id.mostraRC1CE)
    TextView mostraRC1CE;

    @Bind(R.id.mostraSelador)
    TextView mostraSelador;

    @Bind(R.id.mostraCimento)
    TextView mostraCimento;

    @Bind(R.id.BotaoSalvar3)
    TextView BotaoSalvar;

    String telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alfa);
        ButterKnife.bind(this);

        //Pega o que vem pelo Caminhao na pergunta2 e carregado no Trecho

        if (getIntent().getExtras().containsKey(Constants.CAMINHAODOSEDEX)) {
            Trecho trecho = (Trecho) getIntent().getExtras().getSerializable(Constants.CAMINHAODOSEDEX);
            Trecho trechoOculto = (Trecho) getIntent().getExtras().getSerializable(Constants.CAMINHAODOSEDEX);
            if (trecho != null) {
                if (trecho.getAnalista() != null)
                    telefone = (String.valueOf(trecho.getAnalista()));
                else {
                    mostraEmpresa.setText("erro no telefone");
                }
                if (trecho != null) {
                    if (trecho.getComprimento() != null && trecho.getComprimento() > 0)
                        mostraComprimento.setText(String.valueOf(trecho.getComprimento()));
                    else {
                        mostraComprimento.setText("erro no comprimento");
                    }
                    if (trecho.getLargura() != null && trecho.getLargura() >= 0)
                        mostraLargura.setText(String.valueOf(trecho.getLargura()));
                    else {
                        mostraLargura.setText("erro na Largura ");
                    }
                    if (trecho.getData() != null)
                        mostraData.setText(String.valueOf(trecho.getData()));
                    else {
                        mostraData.setText("erro na Data");
                    }
                    if (trecho.getEmpresa() != null)
                        mostraEmpresa.setText(String.valueOf(trecho.getEmpresa()));
                    else {
                        mostraEmpresa.setText("erro na Empresa");
                    }
                    if (trecho.getDuplicacao() != null)
                        mostraDuplicação.setText(String.valueOf(trecho.getDuplicacao()));
                    else {
                        mostraDuplicação.setText("erro");
                    }
                    if (trecho.getSentido() != null)
                        mostraSentido.setText(String.valueOf(trecho.getSentido()));
                    else {
                        mostraSentido.setText("erro");
                    }
                    if (trecho.getPista() != null)
                        mostraPista.setText(String.valueOf(trecho.getPista()));
                    else {
                        mostraPista.setText("erro");
                    }
                    if (trecho.getFaixa() != null)
                        mostraFaixa.setText(String.valueOf(trecho.getFaixa()));
                    else {
                        mostraFaixa.setText("erro");
                    }
                    if (trecho.getKminicial() != null)
                        mostraKMI.setText(String.valueOf(trecho.getKminicial()));
                    else {
                        mostraKMI.setText("erro");
                    }
                    if (trecho.getKmfinal() != null)
                        mostraKMF.setText(String.valueOf(trecho.getKmfinal()));
                    else {
                        mostraKMF.setText("erro");
                    }
                    if (trecho.getEstacainicial() != null)
                        mostraESI.setText(String.valueOf(trecho.getEstacainicial()));
                    else {
                        mostraESI.setText("erro");
                    }
                    if (trecho.getEstacafinal() != null)
                        mostraESF.setText(String.valueOf(trecho.getEstacafinal()));
                    else {
                        mostraESF.setText("erro");
                    }
                    if (trecho.getEspessura() != null && trecho.getEspessura() >= 0)
                        mostraEspessura.setText(String.valueOf(trecho.getEspessura()));
                    else {
                        mostraEspessura.setText("erro na Espessura");
                    }
                    if (trecho.getArea() != null && trecho.getArea() >= 0)
                        mostraArea.setText(String.valueOf(trecho.getArea()));
                    else {
                        mostraArea.setText("erro na área");
                    }
                    if (trecho.getVolume() != null && trecho.getVolume() >= 0)
                        mostraVolume.setText(String.valueOf(trecho.getVolume()));
                    else {
                        mostraVolume.setText("erro no Volume");
                    }
                    if (trecho.getFresagem() != null && trecho.getFresagem() >= 0)
                        mostraFresagem.setText(String.valueOf(trecho.getFresagem()));
                    else {
                        mostraFresagem.setText("erro na Fresagem");
                    }
                    if (trecho.getCbuqFresagem() != null && trecho.getCbuqFresagem() >= 0)
                        mostraCBUQR1.setText(String.valueOf(trecho.getCbuqFresagem()));
                    else {
                        mostraCBUQR1.setText("erro no CBUQ");
                    }
                    if (trecho.getCbuqRecobrimento() != null && trecho.getCbuqRecobrimento() >= 0)
                        mostraCBUQR2.setText(String.valueOf(trecho.getCbuqRecobrimento()));
                    else {
                        mostraCBUQR2.setText("erro no CBUQ");
                    }
                    if (trecho.getPmqAcostamento() != null && trecho.getPmqAcostamento() >= 0)
                        mostraPmq.setText(String.valueOf(trecho.getPmqAcostamento()));
                    else {
                        mostraPmq.setText("erro no PMQ");
                    }
                    if (trecho.getProjeto() != null)
                        mostraProjeto.setText(String.valueOf(trecho.getProjeto()));
                    else {
                        mostraProjeto.setText("erro no Projeto");
                    }
                    if (trecho.getConforme() != null)
                        mostraConforme.setText(String.valueOf(trecho.getConforme()));
                    else {
                        mostraConforme.setText("erro na Conformidade");
                    }
                    if (trecho.getTurno() != null)
                        mostraTurno.setText(String.valueOf(trecho.getTurno()));
                    else {
                        mostraTurno.setText("erro no Turno");
                    }
                    if (trecho.getClima() != null)
                        mostraClima.setText(String.valueOf(trecho.getClima()));
                    else {
                        mostraClima.setText("erro no Clima");
                    }
                    if (trecho.getaMicroFresagem() != null)
                        mostraMicroFresagem.setText(String.valueOf(trecho.getaMicroFresagem()));
                    else {
                        mostraMicroFresagem.setText("erro no MicroFresagem");
                    }
                    if (trecho.getaMicroRevestimento() != null)
                        mostraMicroRevestimento.setText(String.valueOf(trecho.getaMicroRevestimento()));
                    else {
                        mostraMicroRevestimento.setText("erro no MicroRevestimento");
                    }
                    if (trecho.getReciclagem() != null)
                        mostraReciclagem.setText(String.valueOf(trecho.getReciclagem()));
                    else {
                        mostraReciclagem.setText("erro na Reciclagem");
                    }
                    if (trecho.getTss() != null)
                        mostraTSS.setText(String.valueOf(trecho.getTss()));
                    else {
                        mostraTSS.setText("erro no TSS");
                    }
                    if (trecho.getImpermabilizacao() != null)
                        mostraImpermeabilizacao.setText(String.valueOf(trecho.getImpermabilizacao()));
                    else {
                        mostraImpermeabilizacao.setText("erro na Impermeabilização");
                    }
                    if (trecho.getSelagemDeTrinca() != null)
                        mostraSelaTrinca.setText(String.valueOf(trecho.getSelagemDeTrinca()));
                    else {
                        mostraSelaTrinca.setText("erro no Sela Trinca");
                    }
                    if (trecho.getMat_CAP_Pista() != null)
                        mostraCAPPista.setText(String.valueOf(trecho.getMat_CAP_Pista()));
                    else {
                        mostraCAPPista.setText("erro no CAP da Pista");
                    }
                    if (trecho.getMat_CAP_Pmq() != null)
                        mostraCAPAcostamento.setText(String.valueOf(trecho.getMat_CAP_Pmq()));
                    else {
                        mostraCAPAcostamento.setText("erro no CAP do Acostamento");
                    }
                    if (trecho.getMat_Emulpen() != null)
                        mostraEmulpen.setText(String.valueOf(trecho.getMat_Emulpen()));
                    else {
                        mostraEmulpen.setText("erro no Emulpen");
                    }
                    if (trecho.getMat_RR2C() != null)
                        mostraRR2C.setText(String.valueOf(trecho.getMat_RR2C()));
                    else {
                        mostraRR2C.setText("erro no RR2C");
                    }
                    if (trecho.getMat_R1CE() != null)
                        mostraRC1CE.setText(String.valueOf(trecho.getMat_R1CE()));
                    else {
                        mostraRC1CE.setText("erro no RC1CE");
                    }
                    if (trecho.getMat_SelaTrinca() != null)
                        mostraSelador.setText(String.valueOf(trecho.getMat_SelaTrinca()));
                    else {
                        mostraSelador.setText("erro no Selador");
                    }
                    if (trecho.getMat_Cimento() != null)
                        mostraCimento.setText(String.valueOf(trecho.getMat_Cimento()));
                    else {
                        mostraCimento.setText("erro no Cimento");
                    }
                }
            }
        }
    }

    @OnClick(R.id.BotaoSalvar3)
    public void Enviar() {

        Trecho trechoPronto = new Trecho();
            trechoPronto.setKminicial(Double.parseDouble(mostraKMI.getText().toString()));
            trechoPronto.setEstacainicial(Double.parseDouble(mostraESI.getText().toString()));
            trechoPronto.setEmpresa(mostraEmpresa.getText().toString());
            trechoPronto.setFresagem(Double.parseDouble(mostraFresagem.getText().toString()));
            trechoPronto.setCbuqFresagem(Double.parseDouble(mostraCBUQR1.getText().toString()));
        trechoPronto.setArea(Double.parseDouble(mostraArea.getText().toString()));
        trechoPronto.setServiço(mostraEmpresa.getText().toString());

        trechoPronto.setAnalista(telefone);

        String praquem = trechoPronto.getAnalista();
        String onde=trechoPronto.getKminicial().toString();
        String onde2=trechoPronto.getEstacainicial().toString();
        String empresa=trechoPronto.getEmpresa().toString();
        String oque1=trechoPronto.getServiço().toString();
        String servicos1=trechoPronto.getFresagem().toString();
        String servicos2=trechoPronto.getCbuqFresagem().toString();
        String area=trechoPronto.getArea().toString();
        String concatenado = "FRESAGEM no km: " + onde + "+" + onde2 + "," + " área:" + area + "m2, fresagem:" + servicos1 + "m3 e" + servicos2 + " de CBUQ, " + empresa + " #CM#";


        Intent smsIntent = new Intent(Intent.ACTION_VIEW);
        smsIntent.setType("vnd.android-dir/mms-sms");
        smsIntent.putExtra("address", praquem);
        smsIntent.putExtra("sms_body",concatenado);
        startActivity(smsIntent);

//        Trecho trechoPronto = new Trecho();
//        trechoPronto.setKminicial(Double.parseDouble(mostraKMI.getText().toString()));
//        trechoPronto.setKmfinal(Double.parseDouble(mostraKMF.getText().toString()));
//        trechoPronto.setEstacainicial(Double.parseDouble(mostraESI.getText().toString()));
//        trechoPronto.setEstacafinal(Double.parseDouble(mostraESF.getText().toString()));
//        trechoPronto.setEmpresa(mostraEmpresa.getText().toString());
//        trechoPronto.save();
//
//        Intent transport = new Intent(AlfaActivity.this, Listatrechos.class);
//        startActivity(transport);

    }
}

