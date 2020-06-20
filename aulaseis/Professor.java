package aulaseis;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor (String nome, String disciplina) {
        super (nome);
        this.disciplina = disciplina;
    }
    public String toString() {
        return super.toString() + "(Professor)" + "\n Disciplina: " + disciplina;
    }
}