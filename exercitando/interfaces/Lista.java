package exercitando.interfaces;

public class Lista implements Organizavel {

    int numeros[];
    boolean continuar;

    public void ordemCrescente() {
        //Organiza os elementos do vetor números em ordem crescente
        continuar = true;
        while (continuar ==true) {
            continuar = false;
            for (int i=0; i<(numeros.length-1); i++){
                if (numeros[i] > numeros [i+1]) {
                int variavelAuxiliar = numeros[i+1];
                numeros[i+1] = numeros[i];
                numeros[i] = variavelAuxiliar;
                continuar = true;
                }
            }
        }
    }   

    public void ordemDecrescente() {
        //Organiza os elementos do vetor números em ordem decrescente
        continuar = true;
        while(continuar == true) {
            continuar = false;
            for (int i=0; i<(numeros.length-1); i++) {
                if (numeros[i] <= numeros[i+1]) {
                    int variavelAuxiliar = numeros[i+1];
                    numeros[i+1] = numeros[i];
                    numeros[i] = variavelAuxiliar;
                    continuar = true;
                    }
                }
            }
    }
    

    public String listarItens() {
        String itens = "";
        for (int i=0; i<numeros.length; i++) {
            itens = numeros[i] + "";
        }
        return itens;
    }

}