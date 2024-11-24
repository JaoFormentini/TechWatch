package com.facimp.projetoPooJava.controller.computadorController.dto;

import com.facimp.projetoPooJava.model.modelComputador.Computador;

import java.util.Date;

public class ComputadorRs {
    private Long id;
    private String mac;
    private String localHostName;
    private String processador;
    private double ramSize;
    private String dataDeInstalacao;
    private String sistemaOperacional;
    private String ip;
    private String loja;
    private Date dataAtual;

    public static ComputadorRs converter(Computador c){
        var computador = new ComputadorRs();
        computador.setId(c.getId());
        computador.setMac(c.getMac());
        computador.setLocalHostName(c.getLocalHostName());
        computador.setProcessador(c.getProcessador());
        computador.setRamSize(c.getRamSize());
        computador.setDataDeInstalacao(c.getDataDeInstalacao());
        computador.setSistemaOperacional(c.getSistemaOperacional());
        computador.setIp(c.getIp());
        computador.setLoja(c.getLoja());
        computador.setDataAtual(c.getDataAtual());

        return computador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalHostName() {
        return localHostName;
    }

    public void setLocalHostName(String localHostName) {
        this.localHostName = localHostName;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public double getRamSize() {
        return ramSize;
    }

    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    public String getDataDeInstalacao() {
        return dataDeInstalacao;
    }

    public void setDataDeInstalacao(String dataDeInstalacao) {
        this.dataDeInstalacao = dataDeInstalacao;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }
}
