
package br.edu.qi.DAO;

import br.edu.qi.ConexaoBD.ConexaoBD;
import br.edu.qi.DTO.Funcionario;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
  
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet resultado;
    private ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();
    
    public void cadastrarFuncionario(Funcionario objFuncionario) throws ClassNotFoundException{
        String sql = "insert into tb_funcionario(nome,cpf,telefone,endereco,cidade,email,senha) values(?,?,?,?,?,?,?)";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            pstm = this.conexao.prepareStatement(sql);
            pstm.setString(1, objFuncionario.getNome());
            pstm.setString(2, objFuncionario.getCpf());
            pstm.setLong(3, objFuncionario.getTelefone());
            pstm.setString(4, objFuncionario.getEndereco());
            pstm.setString(5, objFuncionario.getCidade());
            pstm.setString(6, objFuncionario.getEmail());
            pstm.setString(7, objFuncionario.getSenha());
            
            pstm.execute();
            pstm.close();
                     
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Deu merda na classe FuncionarioDAO no metodo cadastrarFuncionario()"+e);
        }
    }
    
    public ArrayList<Funcionario> listarTodosFuncionarios() throws ClassNotFoundException{
        String sql = "select + from tb_funcionario";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            this.pstm = this.conexao.prepareStatement(sql);
            this.resultado = this.pstm.executeQuery(sql);
            
            while(this.resultado.next()){
                Funcionario objFuncionario = new Funcionario();
                
                objFuncionario.setIdfuncionario(this.resultado.getInt("idfuncionario"));
                objFuncionario.setNome(this.resultado.getString("nome"));
                objFuncionario.setCpf(this.resultado.getString("cpf"));
                objFuncionario.setTelefone(this.resultado.getLong("telefone"));
                objFuncionario.setEndereco(this.resultado.getString("endereco"));
                objFuncionario.setCidade(this.resultado.getString("cidade"));
                objFuncionario.setEmail(this.resultado.getString("email"));
                objFuncionario.setSenha(this.resultado.getString("senha"));
                
                this.listaDeFuncionarios.add(objFuncionario);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe FuncionarioDAO no metodo listarTodosFuncionarios()"+e);
        }
               
        return this.listaDeFuncionarios;
    }
    
    public void alterarFuncionario(Funcionario objFuncionario) throws ClassNotFoundException{
         String sql = "update tb_funcionario "
                     + " set nome = ?, cpf = ?, telefone = ?, endereco = ?, cidade = ?, email = ?, senha = ?"
                     + " where idfuncionario = ?";
         this.conexao = new ConexaoBD().getConexao();
         
         try {
             this.pstm = this.conexao.prepareStatement(sql);
             this.pstm.setString(1, objFuncionario.getNome());
             this.pstm.setString(2, objFuncionario.getCpf());
             this.pstm.setLong(3, objFuncionario.getTelefone());
             this.pstm.setString(4, objFuncionario.getEndereco());
             this.pstm.setString(5, objFuncionario.getCidade());
             this.pstm.setString(6, objFuncionario.getEmail());
             this.pstm.setString(7, objFuncionario.getSenha());
             
             this.pstm.execute();
             this.pstm.close();
             
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Deu merda na classe FuncionarioDAO no metodo alterarFuncionario() "+e);
         }
                 
     }
    
    public void excluirFuncionario (Funcionario objFuncionario) throws ClassNotFoundException{
         String sql = "delete from tb_funcionario where idfuncionario = ?";
         this.conexao = new ConexaoBD().getConexao();
         
         try {
             this.pstm = this.conexao.prepareStatement(sql);
             this.pstm.setInt(1, objFuncionario.getIdfuncionario());
             
             this.pstm.execute();
             this.pstm.close();
             
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Deu merda na classe FuncionarioDAO no metodo excluirFuncionario() "+e);
         }
    }
    
    public ArrayList<Funcionario> pesquisarFuncionarioPorNome(String nome) throws ClassNotFoundException {
        String sql = "SELECT * FROM tb_funcionario where nome = ?";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            this.pstm = this.conexao.prepareStatement(sql);
            this.resultado = this.pstm.executeQuery(sql);
            
            while (this.resultado.next()) {
                Funcionario objFuncionario = new Funcionario();
                
                objFuncionario.setIdfuncionario(this.resultado.getInt("idfuncionario"));
                objFuncionario.setNome(this.resultado.getString("nome"));
                objFuncionario.setCpf(this.resultado.getString("cpf"));
                objFuncionario.setTelefone(this.resultado.getLong("telefone"));
                objFuncionario.setEndereco(this.resultado.getString("endereco"));
                objFuncionario.setCidade(this.resultado.getString("cidade"));
                objFuncionario.setEmail(this.resultado.getString("email"));
                objFuncionario.setSenha(this.resultado.getString("senha"));
                
                if (resultado.getString("nome").equalsIgnoreCase(nome)) {
                    this.listaDeFuncionarios.add(objFuncionario);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe FuncionarioDAO no metodo pesquisarFuncionarioPorNome() " + e);
        }
        return this.listaDeFuncionarios;
    }
}
