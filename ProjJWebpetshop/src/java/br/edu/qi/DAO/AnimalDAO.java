
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
    
}
