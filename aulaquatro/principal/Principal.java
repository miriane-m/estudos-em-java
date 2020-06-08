package aulaquatro.principal;

import aulaquatro.modelos.Aluno;

public class Principal {
    public static void main(String args[]) {

        Aluno aluno1 = new Aluno("Pedro", 8.75, 6.25);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getNota1());
        System.out.println(aluno1.getNota2());
        System.out.println(calcularMedia(aluno1.getNota1(), aluno1.getNota2()));
    }
    public static double calcularMedia(double valor1, double valor2){
        return (valor1 + valor2)/2;
    }
}