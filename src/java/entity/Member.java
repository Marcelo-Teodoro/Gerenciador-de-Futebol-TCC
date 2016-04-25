/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

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
    private int cpf;
    private int rg;
    private String eMail;
    private String nivelAcesso;
    private List<Integer> telefone;

    public Member() {
    }

    public Member(Integer idMember, String nomeMember, Date dtNascimento, String endereco, Integer cpf, Integer rg, List<Integer> telefone, String eMail, String nivelAcesso) {
        this.idMember = idMember;
        this.nomeMember = nomeMember;
        this.dtNascimento = dtNascimento;
        this.endereco = endereco;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.eMail = eMail;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }
    

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

  
    
}
