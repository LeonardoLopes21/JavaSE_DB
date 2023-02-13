package models;

import java.time.LocalDate;

public class Paciente {

    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataNasci;
    private String tel;

    public Paciente() {
    }

    public Paciente(int id, String nome, String cpf, LocalDate dataNasci, String tel) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasci = dataNasci;
        this.tel = tel;
    }

    public Paciente(String nome, String cpf, LocalDate dataNasci, String tel) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasci = dataNasci;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasci() {
        return dataNasci;
    }

    public void setDataNasci(LocalDate dataNasci) {
        this.dataNasci = dataNasci;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
