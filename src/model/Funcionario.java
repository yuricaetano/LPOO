package model;
<<<<<<< HEAD

public class Funcionario {
    private Integer matricula;
    private String nome;
    private String endereco;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Funcionario() {
    }

    public Funcionario(Integer matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
=======
public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(){
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
>>>>>>> 343d7415b8b5383aadbdb2119aaa5fd74db87e17
    }

    public String getNome() {
        return nome;
    }
<<<<<<< HEAD

=======
>>>>>>> 343d7415b8b5383aadbdb2119aaa5fd74db87e17
    public void setNome(String nome) {
        this.nome = nome;
    }

<<<<<<< HEAD
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
=======
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonus();
>>>>>>> 343d7415b8b5383aadbdb2119aaa5fd74db87e17
}