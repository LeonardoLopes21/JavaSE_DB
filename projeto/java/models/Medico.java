package models;

public class Medico {
    private String nome;
    private String Cro;
    private String especialidade;
    private int id;

    public Medico() {
    }

    public Medico(String nome, String especialidade, String cro) {
        this.nome = nome;
        Cro = cro;
        this.especialidade = especialidade;
    }

    public Medico(String nome, String especialidade, String cro, int id) {
        this.nome = nome;
        Cro = cro;
        this.especialidade = especialidade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCro() {
        return Cro;
    }

    public void setCro(String cro) {
        Cro = cro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
