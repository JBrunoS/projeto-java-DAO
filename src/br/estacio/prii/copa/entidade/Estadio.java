package br.estacio.prii.copa.entidade;


public class Estadio 
{
    private Integer codigo;
    private String nome;
    private String cidade;
    private Integer capacidade;

    public Estadio() {
    }

    public Estadio(Integer codigo, String nome, 
            String cidade, Integer capacidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
        this.capacidade = capacidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

}
