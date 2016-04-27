package bean;

import dao.MemberDAO;
import entity.Member;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.joda.time.DateTime;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import utilities.EnumNivelAcesso;

/**
 * @author Pgz
 */
@ManagedBean(name = "MBMember")
@ViewScoped
public class memberBean implements Serializable {
    
    private Member member;
    private ListDataModel<Member> memberList;
    private EnumNivelAcesso[] enumNivelAcessos;

    public memberBean(Member member, ListDataModel<Member> memberList, EnumNivelAcesso[] enumNivelAcessos) {
        this.member = member;
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
        MemberDAO memberDao = new MemberDAO();
        List<Member> memberArrayList = memberDao.getAll();
        memberList = new ListDataModel<>(memberArrayList);
    }

    public void prepararMember() {
        member = new Member();
    }

    public void saveMember() {
        MemberDAO memberDAO = new MemberDAO();
        memberDAO.save(member);
        ArrayList<Member> listMembers = (ArrayList<Member>) memberDAO.getAll();
        memberList = new ListDataModel<Member>(listMembers);
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void onRowSelect(SelectEvent event) {
        member = (Member) event.getObject();
        System.out.println("Member name " + member.getNomeMember());
    }

    public EnumNivelAcesso[] getNivel() {
        prepararMember();
        return EnumNivelAcesso.values();
    }
   
    public EnumNivelAcesso[] getEnumNivelAcessos() {
        return enumNivelAcessos;
    }

    public void setEnumNivelAcessos(EnumNivelAcesso[] enumNivelAcessos) {
        this.enumNivelAcessos = enumNivelAcessos;
    }
    
    

}
