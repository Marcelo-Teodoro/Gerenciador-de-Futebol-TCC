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
    
    ADM(1,"Administrador"), 
    JOGADOR(2,"Jogador"),
    S_TORCEDOR(3,"Sócio Torcedor"),
    VISITANTE(4,"Visitante"),
    TESOUREIRO(5,"Defesa"),
    
    PRESIDENTE(6,"Presidente"),
    V_PRESIDENTE(7,"Vice-Presidente");
    
    private int nivelDeAcesso;
    private String funcao;
    
    private EnumNivelAcesso(int nivelDeAcesso, String funcao) {
        this.nivelDeAcesso = nivelDeAcesso;
        this.funcao = funcao;
    }

    
}
