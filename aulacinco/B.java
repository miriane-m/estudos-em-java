package aulacinco;

public class B extends A{
    public String texto;

    /*Sobrescrita de método*/
public void cumprimentar(){
    System.out.println("Olá você");
}
private String profissao;
public B (String nome, String profissao){
    super (nome);
    this.profissao=profissao;
}
public void dados(){
    System.out.println("O nome é " + getNome() + "a profissão é " + profissao);
}
}
