
import dao.MemberDAO;
import entity.Member;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.model.SelectItem;
import utilities.EnumNivelAcesso;


public class NewClass {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Member m = new Member();
            MemberDAO mdao = new MemberDAO();
            List<Member> lmember =  new ArrayList<>();
            lmember = mdao.getAll();
            m = lmember.get(3);
            //System.out.println(EnumNivelAcesso.getById(1));
            Member l  = new Member();
            l.setNomeMember("Marcelo");
            l.setNivelAcesso(EnumNivelAcesso.getById(0));
            mdao.save(l);
            System.out.println("Aqui " + m.getNivelAcesso().getNivelDeAcesso());
            
            SelectItem[] items2 = getNiveisValues();
            System.out.println(" " + items2[2].getValue());
        } catch (SQLException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static SelectItem[] getNiveisValues() {
        SelectItem[] items = new SelectItem[EnumNivelAcesso.values().length];
        int i = 0;
        for (EnumNivelAcesso g : EnumNivelAcesso.values()) {
            items[i++] = new SelectItem(g, g.getFuncao());
        }
        return items;
    }
}
