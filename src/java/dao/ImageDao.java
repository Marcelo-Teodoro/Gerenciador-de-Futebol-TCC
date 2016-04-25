package dao;

import connection.ConnectionManager;
import entity.Imagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ImageDao {
    
    public int save(Imagem image) {

        //inicializando o retorno da função, caso tenha algum problema deve ser retornar o valor -1
        int resultado = -1;

        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement stmt = null;
            String QUERY_INSERT = "insert into image (nome, descricao, tamanho, caminho) values (?, ?, ?, ?)";
            String QUERY_UPDATE = "update image set nome = ?, descricao = ?, tamanho = ?, caminho  where idimage = ? ";

            if (image.getIdImage()== null) {

                stmt = conn.prepareStatement(QUERY_INSERT, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, image.getNome());
                stmt.setString(2, image.getDescricao());
                stmt.setString(3, image.getTamanho());
                stmt.setString(4, image.getCaminho());

                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();

                if (rs.next()) {
                    resultado = rs.getInt(1);
                }
                conn.close();

            } else {

                stmt = conn.prepareStatement(QUERY_UPDATE);
                stmt.setString(1, image.getNome());
                stmt.setString(2, image.getDescricao());
                stmt.setString(3, image.getTamanho());
                stmt.setString(4, image.getCaminho());
                stmt.executeUpdate();
                resultado = image.getIdImage(); // alterei aqui pra ficar igual ao do ProfessorDAO
                conn.close();
            }

        } catch (SQLException ex) {

            ex.printStackTrace();
            resultado = -1;
        }
        
        return resultado;
        
    }
    
}
