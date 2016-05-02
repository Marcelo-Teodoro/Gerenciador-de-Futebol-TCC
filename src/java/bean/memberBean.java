package bean;

import dao.MemberDAO;
import entity.Member;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;
import java.io.Serializable;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import org.primefaces.event.SelectEvent;
import utilities.EnumNivelAcesso;
import utilities.JSFUtils;

/**
 * @author Pgz
 */
@ManagedBean(name = "MBMember")
@ViewScoped
public class memberBean implements Serializable {

    private boolean selecionado;
    private Member member;
    private ListDataModel<Member> memberList;
    private EnumNivelAcesso[] enumNivelAcessos;

    public memberBean(Member member, boolean selecionado, ListDataModel<Member> memberList, EnumNivelAcesso[] enumNivelAcessos) {
        this.member = member;
        this.selecionado = selecionado;
        this.memberList = memberList;
        this.enumNivelAcessos = enumNivelAcessos;
    }

    public memberBean() {
    }

    public ListDataModel<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ListDataModel<Member> memberList) {
        this.memberList = memberList;
    }

    @PostConstruct
    public void getAllMember() {
        
        try {
            MemberDAO memberDao = new MemberDAO();
            List<Member> memberArrayList = memberDao.getAll();
            memberList = new ListDataModel<>(memberArrayList);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JSFUtils.adicionarMensagemErro(ex.getMessage());
        }
        
    }

    public void prepararMember() {
        member = new Member();
    }

    public void saveMember() {
        try {
            MemberDAO memberDAO = new MemberDAO();
            memberDAO.save(member);
            ArrayList<Member> listMembers = (ArrayList<Member>) memberDAO.getAll();
            memberList = new ListDataModel<Member>(listMembers);
            JSFUtils.adicionarMensagemSucesso("Membro salvo com sucesso!!!");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JSFUtils.adicionarMensagemErro(ex.getMessage());
        }
    }
    
    public void deleteMember() {
        try {
            MemberDAO memberDAO = new MemberDAO();
            memberDAO.delete(member);
            ArrayList<Member> listMembers = (ArrayList<Member>) memberDAO.getAll();
            memberList = new ListDataModel<Member>(listMembers);
            JSFUtils.adicionarMensagemSucesso("Membro excluído com sucesso!!!");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            JSFUtils.adicionarMensagemErro(ex.getMessage());
        }
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void onRowSelect(SelectEvent event) {
        member = (Member) event.getObject();
        selecionado = true;
        setSelecionado(true);
        System.out.println("Member = " + member.getNomeMember()
        + " SELECIONADO " + selecionado);
    }

    public EnumNivelAcesso[] getNivel() {
        
        return EnumNivelAcesso.values();
    }

    public EnumNivelAcesso[] getEnumNivelAcessos() {
        return enumNivelAcessos;
    }

    public void setEnumNivelAcessos(EnumNivelAcesso[] enumNivelAcessos) {
        this.enumNivelAcessos = enumNivelAcessos;
    }


    public String getFormatoBr(Date data) {
        prepararMember();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }

    public boolean isSelecionado() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
    }
    
    public void onRowUnselect(SelectEvent event){
        selecionado = false;
    }
        
}
