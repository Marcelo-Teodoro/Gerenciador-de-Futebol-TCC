/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author Pgz
 */
public enum EnumNivelAcesso {
    
    NADA(0, "Nenhuma Função"),
    ADM(1, "Administrador"),
    JOGADOR(2, "Jogador"),
    S_TORCEDOR(3, "Sócio Torcedor"),
    VISITANTE(4, "Visitante"),
    TESOUREIRO(5, "Tesoureiro"),
    PRESIDENTE(6, "Presidente"),
    V_PRESIDENTE(7, "Vice-Presidente");

    private int nivelDeAcesso;
    private String funcao;

    private EnumNivelAcesso(int nivelDeAcesso, String funcao) {
        this.nivelDeAcesso = nivelDeAcesso;
        this.funcao = funcao;
    } 

    public static EnumNivelAcesso getById(Integer id) {
        for (EnumNivelAcesso e : values()) {
            if (e.nivelDeAcesso == id) {
                return e;
            }
        }
        return EnumNivelAcesso.NADA;
    }

    public int getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(int nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
