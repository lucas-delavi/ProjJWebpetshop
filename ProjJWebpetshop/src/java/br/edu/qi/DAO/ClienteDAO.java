
package br.edu.qi.DAO;

import br.edu.qi.ConexaoBD.ConexaoBD;
import br.edu.qi.DTO.Cliente;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet resultado;
    private ArrayList<Cliente> listaDeClientes = new ArrayList<>();
    
    public void cadastrarCliente(Cliente objCliente) throws ClassNotFoundException{
        
      String sql = "insert into tb_cliente(nome,cpf,telefone,endereco,cidade) values(?,?,?,?,?)";
      this.conexao = new ConexaoBD().getConexao();
      
        try {
            pstm = this.conexao.prepareStatement(sql);
            pstm.setString(1, objCliente.getNome());
            pstm.setString(2, objCliente.getCpf());
            pstm.setLong(3, objCliente.getTelefone());
            pstm.setString(4, objCliente.getEndereco());
            pstm.setString(5, objCliente.getCidade());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ClienteDAO no metodo cadastrarCliente()"+e);
        }
        
    }
    
    public ArrayList<Cliente> listarTodosClientes() throws ClassNotFoundException{
        String sql = "select * from tb_cliente";
        this.conexao = new ConexaoBD().getConexao();
         try {
            this.pstm = this.conexao.prepareStatement(sql);
            this.resultado = this.pstm.executeQuery(sql);
            
            while(this.resultado.next()){
                Cliente objCliente = new Cliente();
                
                objCliente.setIdcliente(this.resultado.getInt("idcliente"));
                objCliente.setNome(this.resultado.getString("nome"));
                objCliente.setCpf(this.resultado.getString("cpf"));
                objCliente.setTelefone(this.resultado.getLong("telefone"));
                objCliente.setEndereco(this.resultado.getString("endereco"));
                objCliente.setCidade(this.resultado.getString("cidade"));
                
                
                this.listaDeClientes.add(objCliente);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ClienteDAO no metodo listarTodosClientes()"+e);
        }               
        return this.listaDeClientes;
    }
    
    public void alterarCliente(Cliente objCliente) throws ClassNotFoundException{
         String sql = "update tb_cliente "
                     + " set nome = ?, cpf = ?, telefone = ?, endereco = ?, cidade = ?"
                     + " where idcliente = ?";
         this.conexao = new ConexaoBD().getConexao();
         
         try {
             this.pstm = this.conexao.prepareStatement(sql);
             this.pstm.setString(1, objCliente.getNome());
             this.pstm.setString(2, objCliente.getCpf());
             this.pstm.setLong(3, objCliente.getTelefone());
             this.pstm.setString(4, objCliente.getEndereco());
             this.pstm.setString(5, objCliente.getCidade());
             
             this.pstm.execute();
             this.pstm.close();
             
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Deu merda na classe ClienteDAO no metodo alterarCliente() "+e);
         }                 
    }
    
    public void excluirCliente(Cliente objCliente) throws ClassNotFoundException{
         String sql = "delete from tb_cliente where idcliente = ?";
         this.conexao = new ConexaoBD().getConexao();
         
         try {
             this.pstm = this.conexao.prepareStatement(sql);
             this.pstm.setInt(1, objCliente.getIdcliente());
             
             this.pstm.execute();
             this.pstm.close();
             
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Deu merda na classe ClienteDAO no metodo excluirCliente() "+e);
         }
    }
    
    public ArrayList<Cliente> pesquisarClientePorNome(String nome) throws ClassNotFoundException {
        String sql = "SELECT * FROM tb_cliente where nome = ?";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            this.pstm = this.conexao.prepareStatement(sql);
            this.resultado = this.pstm.executeQuery(sql);
            
            while (this.resultado.next()) {
                Cliente objCliente = new Cliente();
                
                objCliente.setIdcliente(this.resultado.getInt("idcliente"));
                objCliente.setNome(this.resultado.getString("nome"));
                objCliente.setCpf(this.resultado.getString("cpf"));
                objCliente.setTelefone(this.resultado.getLong("telefone"));
                objCliente.setEndereco(this.resultado.getString("endereco"));
                objCliente.setCidade(this.resultado.getString("cidade"));
                
                if (resultado.getString("nome").equalsIgnoreCase(nome)) {
                    this.listaDeClientes.add(objCliente);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ClienteDAO no metodo pesquisarClientePorNome() " + e);
        }
        return this.listaDeClientes;
    }
}
