package entity;

import java.util.List;

/**
 *
 * @author Pgz
 */
public class UserAdmin {
    
    private Integer idUserAdmin;
    private String nome;
    private String login;
    private String password;
    private String eMail;
    private Integer cpf;
    private Integer rg;
    private String endereco;
    private List<Integer> telefone;
    private Team team;
    private Imagem imagem;

    public UserAdmin() {
    }

    public UserAdmin(Integer idUser, String name, String login, List<Integer> telefone, String eMail, Integer cpf, Integer rg, String endereco, String password, Team team) {
        this.idUserAdmin = idUser;
        this.nome = name;
        this.login = login;
        this.telefone = telefone;
        this.eMail = eMail;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.password = password;
        this.team = team;
    }

    public Integer getIdUserAdmin() {
        return idUserAdmin;
    }

    public void setIdUserAdmin(Integer idUserAdmin) {
        this.idUserAdmin = idUserAdmin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Integer> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Integer> telefone) {
        this.telefone = telefone;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }
    
    
    
    
}
