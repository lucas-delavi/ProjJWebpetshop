
package br.edu.qi.DAO;

import br.edu.qi.ConexaoBD.ConexaoBD;
import br.edu.qi.DTO.Animal;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AnimalDAO {
    
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet resultado;
    private ArrayList<Animal> listaDeAnimais = new ArrayList<>();
    
     public void cadastrarAnimal(Animal objAnimal) throws ClassNotFoundException{
        String sql = "insert into tb_animal(nome,especie,raca,peso,sexo,tutor) values(?,?,?,?,?,?)";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            pstm = this.conexao.prepareStatement(sql);
            pstm.setString(1,objAnimal.getNome());
            pstm.setString(2, objAnimal.getEspecie());
            pstm.setString(3, objAnimal.getRaca());
            pstm.setFloat(4, objAnimal.getPeso());
            pstm.setString(5, objAnimal.getSexo());
            pstm.setString(6, objAnimal.getTutor());
                        
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe ContatoDAO no metodo cadastrarContato()   ===> "+e);
        }
    }
    
     public ArrayList<Animal> listarTodosAnimais() throws ClassNotFoundException{
         
            String sql = "SELECT * FROM tb_animal";
            this.conexao = new ConexaoBD().getConexao();
            
            try {
                
                this.pstm = this.conexao.prepareStatement(sql);
                this.resultado = this.pstm.executeQuery(sql);
                
                while(this.resultado.next()){
                    
                    Animal objAnimal = new Animal();
                    
                    objAnimal.setIdanimal(this.resultado.getInt("idanimal"));
                    objAnimal.setNome(this.resultado.getString("nome"));
                    objAnimal.setEspecie(this.resultado.getString("especie"));
                    objAnimal.setRaca(this.resultado.getString("raca"));
                    objAnimal.setPeso(this.resultado.getFloat("peso"));
                    objAnimal.setSexo(this.resultado.getString("sexo"));
                    objAnimal.setTutor(this.resultado.getString("tutor"));
                    
                    this.listaDeAnimais.add(objAnimal);
                    
                }
                
         } catch (SQLException e) {
             
            JOptionPane.showMessageDialog(null,"Deu merda na classe AnimalDAO no metodo listarTodosAnimais()   ===> "+ e);
             
         }
         return this.listaDeAnimais;
     }
     
     public void alterarAnimal(Animal objAnimal) throws ClassNotFoundException{
         String sql = "update tb_animal "
                     + " set nome = ?, especie = ?, raca = ?, peso = ?, sexo = ?, tutor = ?"
                     + " where idanimal = ?";
         this.conexao = new ConexaoBD().getConexao();
         
         try {
             this.pstm = this.conexao.prepareStatement(sql);
             this.pstm.setString(1, objAnimal.getNome());
             this.pstm.setString(2, objAnimal.getEspecie());
             this.pstm.setString(3, objAnimal.getRaca());
             this.pstm.setFloat(4, objAnimal.getPeso());
             this.pstm.setString(5, objAnimal.getSexo());
             this.pstm.setString(6, objAnimal.getTutor());
             
             this.pstm.execute();
             this.pstm.close();
             
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Deu merda na classe AnimalDAO no metodo alterarAnimal() "+e);
         }
                 
     }
     
     public void excluirAnimal(Animal objAnimal) throws ClassNotFoundException{
         String sql = "delete from tb_animal where idanimal = ?";
         this.conexao = new ConexaoBD().getConexao();
         
         try {
             this.pstm = this.conexao.prepareStatement(sql);
             this.pstm.setInt(1, objAnimal.getIdanimal());
             
             this.pstm.execute();
             this.pstm.close();
             
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Deu merda na classe AnimalDAO no metodo excluirAnimal() "+e);
         }
     }
     
     public ArrayList<Animal> pesquisarAnimalPorNome(String nome) throws ClassNotFoundException {
        String sql = "SELECT * FROM tb_animal where nome = ?";
        this.conexao = new ConexaoBD().getConexao();
        
        try {
            this.pstm = this.conexao.prepareStatement(sql);
            this.resultado = this.pstm.executeQuery(sql);
            
            while (this.resultado.next()) {
                Animal objAnimal = new Animal();
                
                objAnimal.setIdanimal(this.resultado.getInt("idanimal"));
                objAnimal.setNome(this.resultado.getString("nome"));
                objAnimal.setEspecie(this.resultado.getString("especie"));
                objAnimal.setRaca(this.resultado.getString("raca"));
                objAnimal.setPeso(this.resultado.getFloat("peso"));
                objAnimal.setSexo(this.resultado.getString("sexo"));
                objAnimal.setTutor(this.resultado.getString("tutor"));
                
                if (resultado.getString("nome").equalsIgnoreCase(nome)) {
                    this.listaDeAnimais.add(objAnimal);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Deu merda na classe AnimalDao no metodo pesquisarAnimalPorNome() " + e);
        }
        return this.listaDeAnimais;
    }
}
