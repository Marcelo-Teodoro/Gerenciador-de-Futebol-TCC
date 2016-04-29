/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.text.SimpleDateFormat;
import utilities.EnumNivelAcesso;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Pgz
 */
public class Member {
    
    private Integer idMember;
    private String nomeMember;
    private Date dtNascimento;
    private String endereco;
    private String cpf;
    private String rg;
    private String eMail;
    private List<Integer> telefone;
    private EnumNivelAcesso nivelAcesso;

    public Member(Integer idMember, String nomeMember, Date dtNascimento, String endereco, String cpf, String rg, String eMail, List<Integer> telefone, EnumNivelAcesso nivelAcesso) {
        this.idMember = idMember;
        this.nomeMember = nomeMember;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.eMail = eMail;
        this.telefone = telefone;
        this.nivelAcesso = nivelAcesso;
    }

    public Member() {
    }

    public Integer getIdMember() {
        return idMember;
    }

    public void setIdMember(Integer idMember) {
        this.idMember = idMember;
    }

    public String getNomeMember() {
        return nomeMember;
    }

    public void setNomeMember(String nomeMember) {
        this.nomeMember = nomeMember;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
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

    public String getEmail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public EnumNivelAcesso getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(EnumNivelAcesso nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
  
    
}
