package com.msvia.matrix.Model;

import android.view.View;

import java.io.Serializable;
import java.util.Date;

import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.annotations.AutoIncrement;
import se.emilsjolander.sprinkles.annotations.Column;
import se.emilsjolander.sprinkles.annotations.Key;
import se.emilsjolander.sprinkles.annotations.Table;


@Table("Tabelausuario")


public class Trecho extends Model implements Serializable {

    @Key
    @AutoIncrement
    @Column("id")
    private Long Id;

    @Column("concessao")
    private String concessao;
    @Column("empresa")
    private String empresa;
    @Column("projeto")
    private String Projeto;
    @Column("data")
    private String data;
    @Column("turno")
    private String turno;
    @Column("clima")
    private String clima;
    @Column("observacoes")
    private String observacoes;
    @Column("responsavel")
    private String responsavel;
    @Column("analista")
    private String analista;

    @Column("servico")
    private String serviço;

    @Column("duplicacao")
    private String duplicacao;
    @Column("sentido")
    private String sentido;
    @Column("pista")
    private String pista;
    @Column("faixa")
    private String faixa;
    @Column("kminicial")
    private Double kminicial;
    @Column("estacainicial")
    private Double estacainicial;
    @Column("kmfinal")
    private Double kmfinal;
    @Column("conforme")
    private String conforme;

    @Column("comprimento")
    private Double comprimento;
    @Column("largura")
    private Double largura;
    @Column("espessura")
    private Double espessura;

    @Column("estacafinal")
    private Double estacafinal;
    @Column("densidade")
    private Double densidade;
    @Column("metrolinear")
    private Double metrolinear;
    @Column("unidades")
    private String unidades;

    //areas
    @Column("aMicroFresagem")
    private Double aMicroFresagem;
    @Column("aMicroRevestimento")
    private Double aMicroRevestimento;

    //volume
    @Column("fresagem")
    private Double fresagem;

    //volumes x densidade (toneladas)
    @Column("cbuqFresagem")
    private Double cbuqFresagem;
    @Column("cbuqRecobrimento")
    private Double cbuqRecobrimento;
    @Column("pmqAcostamento")
    private Double pmqAcostamento;

    //area
    @Column("pintura")
    private Double pintura;

    //metro linear
    @Column("selagemDeTrinca")
    private Double selagemDeTrinca;

    //volume
    @Column("reciclagem")
    private Double reciclagem;

    //area
    @Column("tss")
    private Double tss;
    @Column("impermeabilizacao")
    private Double impermabilizacao;

    @Column("volume")
    private Double volume;
    @Column("area")
    private Double area;
    @Column("foto")
    private int foto;


    //insumos
    @Column("mat_CAP_Pista")
    private Double mat_CAP_Pista;
    @Column("mat_CAP_Pmq")
    private Double mat_CAP_Pmq;
    @Column("mat_Emulpen")
    private Double mat_Emulpen;
    @Column("mat_RR2C")
    private Double mat_RR2C;
    @Column("mat_R1CE")
    private Double mat_R1CE;
    @Column("mat_SelaTrinca")
    private Double mat_SelaTrinca;
    @Column("mat_Cimento")
    private Double mat_Cimento;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProjeto() {
        return Projeto;
    }

    public void setProjeto(String projeto) {
        Projeto = projeto;
    }
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getAnalista() {
        return analista;
    }

    public void setAnalista(String analista) {
        this.analista = analista;
    }

    public String getServiço() {
        return serviço;
    }

    public void setServiço(String serviço) {
        this.serviço = serviço;
    }

    public String getDuplicacao() {
        return duplicacao;
    }

    public void setDuplicacao(String    duplicacao) {
        this.duplicacao = duplicacao;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public Double getKminicial() {
        return kminicial;
    }

    public void setKminicial(Double kminicial) {
        this.kminicial = kminicial;
    }

    public Double getEstacainicial() {
        return estacainicial;
    }

    public void setEstacainicial(Double estacainicial) {
        this.estacainicial = estacainicial;
    }

    public Double getKmfinal() {
        return kmfinal;
    }

    public void setKmfinal(Double kmfinal) {
        this.kmfinal = kmfinal;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getEspessura() {
        return espessura;
    }

    public void setEspessura(Double espessura) {
        this.espessura = espessura;
    }

    public Double getEstacafinal() {
        return estacafinal;
    }

    public void setEstacafinal(Double estacafinal) {
        this.estacafinal = estacafinal;
    }

    public Double getDensidade() {
        return densidade;
    }

    public void setDensidade(Double densidade) {
        this.densidade = densidade;
    }

    public Double getMetrolinear() {
        return metrolinear;
    }

    public void setMetrolinear(Double metrolinear) {
        this.metrolinear = metrolinear;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public Double getaMicroFresagem() {
        return aMicroFresagem;
    }

    public void setaMicroFresagem(Double aMicroFresagem) {
        this.aMicroFresagem = aMicroFresagem;
    }

    public Double getaMicroRevestimento() {
        return aMicroRevestimento;
    }

    public void setaMicroRevestimento(Double aMicroRevestimento) {
        this.aMicroRevestimento = aMicroRevestimento;
    }

    public Double getFresagem() {
        return fresagem;
    }

    public void setFresagem(Double fresagem) {
        this.fresagem = fresagem;
    }

    public Double getCbuqFresagem() {
        return cbuqFresagem;
    }

    public void setCbuqFresagem(Double cbuqFresagem) {
        this.cbuqFresagem = cbuqFresagem;
    }

    public Double getCbuqRecobrimento() {
        return cbuqRecobrimento;
    }

    public void setCbuqRecobrimento(Double cbuqRecobrimento) {
        this.cbuqRecobrimento = cbuqRecobrimento;
    }

    public Double getPmqAcostamento() {
        return pmqAcostamento;
    }

    public void setPmqAcostamento(Double pmqAcostamento) {
        this.pmqAcostamento = pmqAcostamento;
    }

    public Double getPintura() {
        return pintura;
    }

    public void setPintura(Double pintura) {
        this.pintura = pintura;
    }

    public Double getSelagemDeTrinca() {
        return selagemDeTrinca;
    }

    public void setSelagemDeTrinca(Double selagemDeTrinca) {
        this.selagemDeTrinca = selagemDeTrinca;
    }

    public Double getReciclagem() {
        return reciclagem;
    }

    public void setReciclagem(Double reciclagem) {
        this.reciclagem = reciclagem;
    }

    public String getFaixa() {return faixa; }

    public Double getTss() {
        return tss;
    }

    public void setTss(Double tss) {
        this.tss = tss;
    }

    public Double getImpermabilizacao() {
        return impermabilizacao;
    }

    public void setImpermabilizacao(Double impermabilizacao) {
        this.impermabilizacao = impermabilizacao;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getConcessao() {
        return concessao;
    }

    public void setConcessao(String concessao) {
        this.concessao = concessao;
    }

    public String getConforme() {
        return conforme;
    }

    public void setConforme(String conforme) {
        this.conforme = conforme;
    }

    public Double getMat_CAP_Pista() {
        return mat_CAP_Pista;
    }

    public void setMat_CAP_Pista(Double mat_CAP_Pista) {
        this.mat_CAP_Pista = mat_CAP_Pista;
    }

    public Double getMat_CAP_Pmq() {
        return mat_CAP_Pmq;
    }

    public void setMat_CAP_Pmq(Double mat_CAP_Pmq) {
        this.mat_CAP_Pmq = mat_CAP_Pmq;
    }

    public Double getMat_Emulpen() {
        return mat_Emulpen;
    }

    public void setMat_Emulpen(Double mat_Emulpen) {
        this.mat_Emulpen = mat_Emulpen;
    }

    public Double getMat_RR2C() {
        return mat_RR2C;
    }

    public void setMat_RR2C(Double mat_RR2C) {
        this.mat_RR2C = mat_RR2C;
    }

    public Double getMat_R1CE() {
        return mat_R1CE;
    }

    public void setMat_R1CE(Double mat_R1CE) {
        this.mat_R1CE = mat_R1CE;
    }

    public Double getMat_SelaTrinca() {
        return mat_SelaTrinca;
    }

    public void setMat_SelaTrinca(Double mat_SelaTrinca) {
        this.mat_SelaTrinca = mat_SelaTrinca;
    }

    public Double getMat_Cimento() {
        return mat_Cimento;
    }

    public void setMat_Cimento(Double mat_Cimento) {
        this.mat_Cimento = mat_Cimento;
    }

    public String getObservacoes() { return observacoes; }

    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public String getSentido() {return sentido;}

    public void setSentido(String sentido) {this.sentido = sentido;}

    public void setFaixa(String faixa) {this.faixa = faixa;}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}