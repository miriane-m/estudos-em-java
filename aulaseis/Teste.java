package aulaseis;

public class Teste {
    public static void main (String[] args) {
        Pessoa professor = new Professor ("João", "Matemática");
        Pessoa aluno = new Aluno ("Rafael", "124873223");
        System.out.println (professor);
        System.out.println (aluno);
    }
}