/*CLINICA VETERNINÁRIA: Informações do cliente: nome, endereço, telefone. Informações do animal:
*nome, idade, peso. Ações: Novo cadastro, atualização. Histórico de tratamentos: sessões de tratamento
*(sintomas, exames, diagnóstico, tratamento), organizar por datas (anotação em caso de retornos)*/

package exercitando;

public class petclinica {
    String cliente;
    String endereco;
    int telefone;
    String animal;
    int idade;
    float peso;
    int dia;
    int mes;
    String diagnostico;
    String tratamento;
  
    public void setCliente (String cliente){
        this.cliente = cliente;
    }
    
    public String getCliente(){
        return this.cliente;
    }
    
    public void setEndereco (String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return this.endereco;
    }

    public void setTelefone (int telefone){
        this.telefone = telefone;
    }
    
    public int getTelefone(){
        return this.telefone;
    }

    public void setAnimal(String animal){
        this.animal = animal;
    }
    
    public String getAnimal(){
        return this.animal;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return this.peso;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getDia(){
        return this.dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getMes(){
        return this.mes;
    }

    public void setDiagnostico(String diagnostico){
        this.diagnostico = diagnostico;
    }

    public String getDiagnostico(){
        return this.diagnostico;
    }

    public void setTratamento(String tratamento){
        this.tratamento = tratamento;
    }

    public String getTratamento(){
        return this.tratamento;
    }
    public void cliente(){
        petclinica cliente = new petclinica();
        cliente.setCliente("José dos Santos");
        cliente.setEndereco("Rua América, 234, Centro");
        cliente.setTelefone(99999999);
    }
                
    public void animal(){
        petclinica animal = new petclinica();
        animal.setAnimal("Pipoca");
        animal.setIdade(2);
        animal.setPeso(3.5f);
    }

    public void dia(){
        petclinica dia = new petclinica();
        dia.setDia(18);
        dia.setMes(5);
        dia.setDiagnostico("Verminose");
        dia.setTratamento("Vermífugo, nome, dosagem");
    }
                
    public void main (String args[]){  
        System.out.println ("Cliente: " + getCliente());
        System.out.println ("Animal: " + getAnimal());
        System.out.println ("Idade: " + getIdade());
        System.out.println ("Dia da consulta " + getDia());
    }
}