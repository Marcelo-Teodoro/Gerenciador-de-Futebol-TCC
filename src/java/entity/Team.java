package entity;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Pgz
 */
public class Team {
    
    private Integer idTeam;
    private String teamNome;
    private String endereco;
    private UserAdmin userAdmin;
    private Integer cnpj;
    private Date dataFundacao;
    private String presidente;
    private String email;
    private List<Integer> telefone;
    private List<Member> idJogador;
    private Imagem teamSymbol;

    public Integer getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Integer idTeam) {
        this.idTeam = idTeam;
    }

    public String getTeamName() {
        return teamNome;
    }

    public void setTeamName(String teamName) {
        this.teamNome = teamName;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public UserAdmin getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(UserAdmin userAdmin) {
        this.userAdmin = userAdmin;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Date getFoundationDate() {
        return dataFundacao;
    }

    public void setFoundationDate(Date foundationDate) {
        this.dataFundacao = foundationDate;
    }

    public String getPresident() {
        return presidente;
    }

    public void setPresident(String president) {
        this.presidente = president;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public List<Integer> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Integer> telefone) {
        this.telefone = telefone;
    }

    public List<Member> getIdJogador() {
        return idJogador;
    }

    public void setIdJogador(List<Member> idJogador) {
        this.idJogador = idJogador;
    }

    public Imagem getTeamSymbol() {
        return teamSymbol;
    }

    public void setTeamSymbol(Imagem teamSymbol) {
        this.teamSymbol = teamSymbol;
    }

    

}