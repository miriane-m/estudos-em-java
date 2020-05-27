import java.util.Random;
/* Esta classe demonstra o conteúdo trabalhado na segunda parte da aula 2 do Curso de Fundamentos de
*Programação Orientada a Objetos com Java, pela DELL LEADS, abordando comandos de conntrole de fluxos*/
public class aula2{
    public static void main(String args[]){
         int numero = new Random().nextInt(200) - 100;

/* Se a diretiva if tiver apenas uma instrução no seu escopo, não é necessário utilizar chave - ()*/
	if(numero%2==1)
        System.out.println("O número é impar!");
/* Neste caso o if deve ter chaves, pois tem duas instruções no seu escopo*/
    if(numero%2==0){
    	System.out.println("O número é par!");
    	numero++;
    }
/* Utilização do if composto.*/
        if(numero%2==0){
             System.out.println("O número é par!");
        }
        else{   
            System.out.println("O número é ímpar!");
        }
/**Esta classe exemplifica uma outra maneira de se utilizar a derivada if.
	    * Verifica se um número gerado aleatoriamente é positivo e par**/
        if(numero%2 == 0){	
                 if(numero > 0){
                 System.out.println("O número é par e positivo");
                 }
                 else{
                 System.out.println("O número é par e negativo");
                 }
        }
        else{
        if(numero > 0){
                System.out.println("O número é impar e positivo");
        }
        else{
                System.out.println("O número é impar e negativo");
            }
        }
/*Uso da estrutura 'swhitch'*/
        int opcao = 4;
		switch(opcao){

			case 1: 
				System.out.println("Opção 1, escolhida");
				break;
			case 2: 
				System.out.println("Opção 2, escolhida");			
				break;			
			case 3: 				
				System.out.println("Opção 3, escolhida");
				break;
			case 4: 
				System.out.println("Opção 4, escolhida");
				break;
			default: 
				System.out.println("Opção não existe!");
								
            }	
/*Funcionamento da estrutura de repetição 'while'*/		
            int loop;
		    loop = 5;

		    while(loop > opcao){
		    	System.out.println("Valor da variável num "+ opcao +"\n");
		        opcao++;
            }
/* Na estrutura do-while, o bloco da instrução é executado pelo menos uma vez, mesmo que
 inicialmente o valor da variável 'num' seja maior do que o valor da variável 'loop' */
            do{
                System.out.println("Valor da variável num "+ opcao +"\n");
                opcao++;
            } while(loop > opcao);
/* A instrução 'for' representa um laço que irá girar quantas vezes o usuário determinar */			
     	for(int i = 1; i < 5; i++ ){
            System.out.println("O valor da variável i = "+i);
        }
     }
 }
 	
			

        