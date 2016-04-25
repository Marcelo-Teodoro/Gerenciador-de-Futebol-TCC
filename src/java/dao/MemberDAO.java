package dao;

import connection.ConnectionManager;
import entity.Member;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pgz
 */
public class MemberDAO {
    
    public int save(Member member) {

        //inicializando o retorno da função, caso tenha algum problema deve retornar o valor -1
        int resultado = -1;

        Connection conn = ConnectionManager.getConnection();
        try {
            PreparedStatement stmt = null;
            String QUERY_INSERT = "insert into member (nomeMember, dtNascimento, endereco, cpf, rg, email, nivelacesso) values (?, ?, ?, ?, ?, ?, ?)";
            String QUERY_UPDATE = "update member set nomeMember = ?, dtNascimento = ?, endereco = ? , cpf = ?, rg = ?, email = ?, nivelacesso = ? where idmember = ? ";

            if (member.getIdMember()== null) {

                stmt = conn.prepareStatement(QUERY_INSERT, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, member.getNomeMember());
                stmt.setDate(2, (Date) member.getDtNascimento());
                stmt.setString(3, member.getEndereco());
                stmt.setInt(4, member.getCpf());
                stmt.setInt(5, member.getRg());
                stmt.setString(6, member.getEmail());
                stmt.setString(7, member.getNivelAcesso());

                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();

                if (rs.next()) {
                    resultado = rs.getInt(1);
                }
                conn.close();
                stmt.close();

            } else {

                stmt = conn.prepareStatement(QUERY_UPDATE);
                stmt.setString(1, member.getNomeMember());
                stmt.setDate(2, (Date) member.getDtNascimento());
                stmt.setString(3, member.getEndereco());
                stmt.setInt(4, member.getCpf());
                stmt.setInt(5, member.getRg());
                stmt.setString(6, member.getEmail());
                stmt.setString(7, member.getNivelAcesso());
                stmt.setInt(4, member.getIdMember());

                stmt.executeUpdate();
                resultado = member.getIdMember(); // alterei aqui pra ficar igual ao do ProfessorDAO
                conn.close();
                stmt.close();
            }

        } catch (Exception ex) {

            ex.printStackTrace();
            resultado = -1;
        }       
        return resultado;
    }

    public boolean delete(Member member) {

        boolean resultado = false;
        Connection conn = ConnectionManager.getConnection();

        try {
            PreparedStatement stmt = null;

            String QUERY_DELETE = "delete from member where idmember = ?";

            stmt = conn.prepareStatement(QUERY_DELETE);
            stmt.setInt(1, member.getIdMember());

            stmt.executeUpdate();
            conn.close();
            stmt.close();

            resultado = true;

        } catch (SQLException ex) {

            ex.printStackTrace();
            resultado = false;
        }
        return resultado;
    }
    
    public Member byLoginPass (String login, String pass){
        Integer idMember = null;
        Member member = new Member();
        
        Connection conn = ConnectionManager.getConnection();
        
        try{
            
            String Query_Pesquisa = "select * from member where login = ? "
                    + "and pass = ?"; 
            PreparedStatement stmt = null;
            
            ResultSet rs = null;
            
            stmt = conn.prepareStatement(Query_Pesquisa);
            stmt.setString(1, login);
            stmt.setString(2, pass);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                member.setIdMember(rs.getInt("idmember"));
                member.setNomeMember(rs.getString("nomeMember"));
                member.setDtNascimento(rs.getDate("dtnascimento"));
                member.setEndereco(rs.getString("endereco"));
                member.setCpf(rs.getInt("cpf"));
                member.setRg(rs.getInt("rg"));
                member.setEmail(rs.getString("endereco"));
                member.setNivelAcesso(rs.getString("nivelAcesso"));
            }
            
            conn.close();
            stmt.close();
            
        }catch (Exception ex) { 

            ex.printStackTrace();
            member = null;

        }
        
        return member;
        
    }
    
    public Member getByID (Integer id){
        Integer idMember = null;
        Member member = new Member();
        
        Connection conn = ConnectionManager.getConnection();
        
        try{
            
            String Query_Pesquisa = "select * from member where idmember = ?"; 
            PreparedStatement stmt = null;
            
            ResultSet rs = null;
            
            stmt = conn.prepareStatement(Query_Pesquisa);
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                member.setIdMember(rs.getInt("idmember"));
                member.setNomeMember(rs.getString("nomeMember"));
                member.setDtNascimento(rs.getDate("dtnascimento"));
                member.setEndereco(rs.getString("endereco"));
                member.setCpf(rs.getInt("cpf"));
                member.setRg(rs.getInt("rg"));
                member.setEmail(rs.getString("endereco"));
                member.setNivelAcesso(rs.getString("nivelAcesso"));
            }
            
            conn.close();
            stmt.close();
            
        }catch (Exception ex) { 

            ex.printStackTrace();
            member = null;

        }
        
        return member;
        
    }
    
    public List<Member> getAll (){
        List<Member> memberList = new ArrayList<Member>();
        Member member;
        
        Connection conn = ConnectionManager.getConnection();
        
        try{
            
            String Query_Pesquisa = "select * from member"; 
            PreparedStatement stmt = null;
            
            ResultSet rs = null;
            
            stmt = conn.prepareStatement(Query_Pesquisa);
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                member = new Member();
                member.setIdMember(rs.getInt("idMember"));
                member.setNomeMember(rs.getString("nomeMember"));
                System.out.println(member.getNomeMember());
                member.setDtNascimento(rs.getDate("dtNascimento"));
                member.setEndereco(rs.getString("endereco"));
                member.setCpf(rs.getInt("cpf"));
                member.setRg(rs.getInt("rg"));
                member.setEmail(rs.getString("email"));
                member.setNivelAcesso(rs.getString("nivelacesso"));
                memberList.add(member);
            }
            
            conn.close();
            stmt.close();
            
        }catch (Exception ex) { 

            ex.printStackTrace();
            member = null;

        }
        
        return memberList;
        
    }
    
}