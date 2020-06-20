package exercitando.interfaces;

public class TesteComparacao {
    public static void main (String[] args) {
        Quadrado q1 = new Quadrado (10);
        Quadrado q2 = new Quadrado (20);
        int resultado = q1.compareTo (q2);
        
switch(resultado) {
    case 0: System.out.println ("q1 e q2 têm a mesma área"); break;
    case 1: System.out.println ("q1 é maior que q2"); break;
    case -1: System.out.println ("q1 é menor que q2"); break; 
}
}
}