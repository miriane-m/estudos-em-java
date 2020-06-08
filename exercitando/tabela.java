/*Exercício para a criação de uma tabela de produtos com valor e quantidade*/

package exercitando;

public class tabela{
    
    private String produto;
    private float valor;
    private int quantidade;
    
    public void setProduto (String produto){
        this.produto = produto;
    }
    
    public String getProduto(){
        return this.produto;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public class Principal{
        public void main (String args[]){
            tabela produto = new tabela();
            produto.setProduto("Arroz");
            produto.setValor(3.50f);
            produto.setQuantidade(10);
    
            System.out.println ("Produto: "+getProduto());
            System.out.println ("Valor: "+getValor());
            System.out.println ("Quantidade: "+getQuantidade());
        }
    }
    }