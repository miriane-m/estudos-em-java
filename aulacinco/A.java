package aulacinco;

public class A {
    public int valor;
    public A(){
        this.valor=0;
    }
    public int calcularValor(){
        return valor;
    }
    public void cumprimentar(){
        System.out.println("Olá");
    }
    private String nome;
    public A (String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
}