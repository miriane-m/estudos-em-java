package aulacinco;

public class C extends A{
    private int bonus;
    public C (int valor, int bonus){
        super();
        this.bonus=bonus;
    }
    public int calcularValor(){
        return super.calcularValor()+bonus;
    }
    public void cumprimentar(String cumprimento){
        System.out.println("Olá"+cumprimento);
    }
    public static void main(String args[]){
        C objetoTipoC = new C (10,50);
        System.out.println(objetoTipoC.calcularValor());
    }
}