package utilities;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class JSFUtils {
    public static void adicionarMensagemSucesso(String msg){
        FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.addMessage(null, mensagem);
    }
    public static void adicionarMensagemErro(String msg){
        FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.addMessage(null, mensagem);
    }
}
