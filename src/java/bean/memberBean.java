
package bean;

import dao.MemberDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;
import entity.Member;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

/**
 * @author Pgz
 */

@ManagedBean(name = "MBMember")
@ViewScoped
public class memberBean {
    private Member member;
    private ListDataModel<Member> memberList;

    public ListDataModel<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ListDataModel<Member> memberList) {
        this.memberList = memberList;
    }
    
    @PostConstruct
    public void getAllMember(){
        MemberDAO memberDao = new MemberDAO();
        List<Member> memberArrayList = memberDao.getAll();
        memberList = new ListDataModel<Member>(memberArrayList);
    }
    
    public void prepararMember(){
        member = new Member();
    }
    
    public void saveMember(){        
        MemberDAO memberDAO = new MemberDAO();
        memberDAO.save(member);
        ArrayList<Member> listMembers = (ArrayList<Member>) memberDAO.getAll();
        memberList = new ListDataModel<>(listMembers);
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
  
}
