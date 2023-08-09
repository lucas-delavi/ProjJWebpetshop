
package br.edu.qi.DAO;

import br.edu.qi.ConexaoBD.ConexaoBD;
import br.edu.qi.DTO.Produto;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet resultado;
    private ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    
    public void cadastrarProduto(Produto objProduto) throws ClassNotFoundException{
        String sql = "insert into tb_produto(nome,preco,disponibilidade) values(?,?,?)";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            pstm = this.conexao.prepareStatement(sql);
            pstm.setString(1, objProduto.getNome());
            pstm.setFloat(2, objProduto.getPreco());
            pstm.setBoolean(3, true);
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ProdutoDAO no metodo cadastrarProduto()"+e);            

        }
    }
    
    public ArrayList<Produto> listarTodosProdutos() throws ClassNotFoundException{
        String sql = "select * from tb_produto";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            this.pstm = this.conexao.prepareStatement(sql);
            this.resultado = this.pstm.executeQuery(sql);
            
            while(this.resultado.next()){
              
                Produto objProduto = new Produto();
                
                objProduto.setCod(this.resultado.getInt("cod"));
                objProduto.setNome(this.resultado.getString("nome"));
                objProduto.setPreco(this.resultado.getFloat("preco"));
                objProduto.setDisponibilidade(true);
                
                this.listaDeProdutos.add(objProduto);
                                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ProdutoDAO no metodo listarTodosProdutos()"+e);
            
        }
        return this.listaDeProdutos;
    }
    
    public void alterarProduto(Produto objProduto){
        
    }
    
    public void excluirProduto(Produto objProduto){
        
    }
}
