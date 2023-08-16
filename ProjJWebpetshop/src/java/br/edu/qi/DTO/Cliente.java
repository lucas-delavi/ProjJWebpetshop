
package br.edu.qi.DTO;

public class Cliente {
    private int idcliente;
    private String nome;
    private String cpf;
    private Long telefone;
    private String endereco;
    private String cidade;

    
    public int getIdcliente() {
        return idcliente;
    }

 
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

 
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   
    public Long getTelefone() {
        return telefone;
    }

  
    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

  
    public String getEndereco() {
        return endereco;
    }

 
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

  
    public String getCidade() {
        return cidade;
    }

 
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
}
