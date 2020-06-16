public class aula3{
public void Exemplo1(){
    /* Array (vetor) de caracteres, com tamanho igual a 4*/
          char letras[];
          letras = new char[4];
    /* Adicionando elementos ao array*/
         letras [0] = 'J'; 
         letras [1] = 'a'; 
         letras [2] = 'v';
         letras [3] = 'a';   
    /* Exibição do conteúdo do array */
            int indice = 0;
              while(indice < 4){
                        System.out.println(letras[indice]);
                        indice++;
                       }
                     }
    public void Exemplo2(){
    /* Array (vetor) de inteiros, com tamanho igual a 50 */
          int numeros[] = new int[50];
    /*Laço 'for' que preenche o vetor com valores de 0 a 50 sempre aumentando de 10 em 10 unidades*/
                                   for(int i = 0; i <= numeros.length; i++){
                                       numeros[i] = i * 10;
                                        }
                                      }
public void Exemplo3(int quantidadeAlunos, int notasPorAluno){

    float notas[][] = new float[quantidadeAlunos][notasPorAluno];
                              
        for(int i = 0; i < quantidadeAlunos; i++){
            System.out.println("Notas do Aluno " + (i+1));
        for(int j = 0; j < notasPorAluno; j++){
            float temp = 0;
                System.out.println("Informe a nota " +(j+1) +" do Aluno " + (i+1) +": ");
/* Considere que o usuário irá formecer um valor para a variável temp aqui: */         
    /* Atribuição da nota j para aluno i */
         notas[i][j] = temp;
                                                                              
        }
                                                                              
   }
                              
}
}