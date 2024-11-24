package com.facimp.projetoPooJava.model.modelComputador;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "computador")
public class Computador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "mac")
    private String mac;

    @Column(name = "local_host_name")
    private String localHostName;

    @Column(name = "processador")
    private String processador;

    @Column(name = "ram_size")
    private double ramSize;

    @Column(name = "data_de_instalacao")
    private String dataDeInstalacao;

    @Column(name = "sistema_operacional")
    private String sistemaOperacional;

    @Column(name = "ip")
    private String ip;

    @Column(name = "loja")
    private String loja;

    @Column(name = "data_atual")
    @Temporal(TemporalType.DATE)
    private Date dataAtual;

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
