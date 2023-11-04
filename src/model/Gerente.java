package model;
<<<<<<< HEAD

public class Gerente extends Funcionario{
    private String formacao;
=======
public abstract class Gerente extends Funcionario{
>>>>>>> 343d7415b8b5383aadbdb2119aaa5fd74db87e17

    public Gerente() {
    }

<<<<<<< HEAD
    public Gerente(Integer matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String formacao) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "formacao='" + formacao + '\'' +
                '}';
    }
}
=======
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public abstract double getBonus();
}
>>>>>>> 343d7415b8b5383aadbdb2119aaa5fd74db87e17
