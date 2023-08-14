
package br.edu.qi.DAO;

import br.edu.qi.ConexaoBD.ConexaoBD;
import br.edu.qi.DTO.Servico;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Date;

public class ServicoDAO {
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet resultado;
    private ArrayList<Servico> listaDeServicos = new ArrayList<>();
    
    public void cadastrarServico(Servico objServico) throws ClassNotFoundException{
        String sql = "insert into tb_servico(nome,preco,dia,horario) values(?,?,?,?)";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            pstm = this.conexao.prepareStatement(sql);
            pstm.setString(1, objServico.getNome());
            pstm.setFloat(2, objServico.getPreco());
            pstm.setDate(3, (java.sql.Date) objServico.getDia());
            pstm.setString(4, objServico.getHorario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ServicoDAO no metodo cadastrarServico()"+e);
        }
    }
    
    public ArrayList<Servico> listarTodosServicos() throws ClassNotFoundException{
        String sql = "select * from tb_servico";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            this.pstm = this.conexao.prepareStatement(sql);
            this.resultado = this.pstm.executeQuery(sql);
            
            while(this.resultado.next()){
                Servico objServico = new Servico();
                
                objServico.setIdservico(this.resultado.getInt("idservico"));
                objServico.setNome(this.resultado.getString("nome"));
                objServico.setPreco(this.resultado.getFloat("preco"));
                objServico.setDia(this.resultado.getDate("dia"));
                objServico.setHorario(this.resultado.getString("horario"));
                
                this.listaDeServicos.add(objServico);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ServicoDAO no metodo listarTodosServicos()"+e);
        }
        return this.listaDeServicos;
    }
    
    public void alterarServico(Servico objServico) throws ClassNotFoundException{
        String sql = "update tb_servico"
                + " set nome = ?, preco = ?, dia = ?, horario = ?"
                + " where idservico = ?";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            this.pstm = this.conexao.prepareStatement(sql);
            this.pstm.setString(1, objServico.getNome());
            this.pstm.setFloat(2, objServico.getPreco());
            this.pstm.setDate(3, (java.sql.Date) objServico.getDia());
            this.pstm.setString(4, objServico.getHorario());
            
            this.pstm.execute();
            this.pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ServicoDAO no metodo alterarServico() "+e);
        }
    }
    
    public void excluirServico(Servico objServico) throws ClassNotFoundException{
        String sql = "delete from tb_servico where idservico = ?";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            this.pstm = this.conexao.prepareStatement(sql);
            this.pstm.setInt(1, objServico.getIdservico());
            
            this.pstm.execute();
            this.pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ServicoDAO no metodo excluirServico() "+e);
        }
    }
    
    public ArrayList<Servico> pesquisarServicoPorNome(String nome) throws ClassNotFoundException{
        String sql = "select * from tb_servico where nome = ?";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            this.pstm = this.conexao.prepareStatement(sql);
            this.resultado = this.pstm.executeQuery(sql);
            
            while(this.resultado.next()){
                Servico objServico = new Servico();
                
                objServico.setIdservico(this.resultado.getInt("idservico"));
                objServico.setNome(this.resultado.getString("nome"));
                objServico.setPreco(this.resultado.getFloat("preco"));
                objServico.setDia(this.resultado.getDate("dia"));
                objServico.setHorario(this.resultado.getString("horario"));
                
                if(resultado.getString("nome").equalsIgnoreCase(nome)){
                    this.listaDeServicos.add(objServico);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ServicoDAO no metodo listarServicoPorNome() "+e);
        }
        return this.listaDeServicos;
    }
}
