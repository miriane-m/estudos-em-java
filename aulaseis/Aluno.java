package aulaseis;

public class Aluno extends Pessoa {
    private String matricula;
    public Aluno (String nome, String matricula) {
        super (nome);
        this.matricula = matricula;
    }
    public String toString() {
            return super.toString() + "(Aluno)" + "\n Matrícula: " + matricula;
    }
}