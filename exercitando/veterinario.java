package exercitando;

public class veterinario{

    public static void cliente(String nome, String endereco, int telefone){
        System.out.println ("Nome do cliente: " + nome + ", endereço: " + endereco + ", telefone: "+ telefone);
    }
                
    public static void animal(String especie, int idade, float peso){
        System.out.println ("Espécie do animal: " + especie + ", idade: " + idade + ", peso " + peso);
    }

    public static void consulta(int dia, int mes, String diagnostico, String tratamento){
        System.out.println ("A consulta foi realizada na data de " + dia + "/" + mes +", o diagnóstico foi de " + diagnostico + " e o tratamento indicado foi: " + tratamento);
    }
                
    public static void main (String args[]){  
        cliente("José dos Santos", "Rua América, 234, centro", 99999999);
        animal("Cão", 2, 3.5f);
        consulta(18, 5, "Verminose", "Vermífugo, nome, dosagem");
    }
}
