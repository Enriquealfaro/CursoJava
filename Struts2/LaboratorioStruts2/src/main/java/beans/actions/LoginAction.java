package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport {

    Logger log = LogManager.getLogger(LoginAction.class);

    private String usuario;
    private String password;

    public String execute() {
        log.info("usuario : " + this.usuario + "\n"
                + "password :" + password);
        return SUCCESS;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitulo1F() {
        return getText("formLogin.titulo1F");
    }

    public String getTitulo2F() {
        return getText("formLogin.titulo2F");
    }

    public String getUsuarioF() {
        return getText("formLogin.usuarioF");
    }

    public String getPasswordF() {
        return getText("formLogin.passwordF");
    }

    public String getEnviarF() {
        return getText("formLogin.enviarF");
    }

}
