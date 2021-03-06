package visonn;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import iStoqueBusiness.AuthenticationRemote;

@ManagedBean
public class LoginMBean {

	private String login;
	private String senha;

	@EJB
	private AuthenticationRemote ejb;
	
	public String autenticar() {
		if(ejb.AuthLogin(login, senha)) {
			return "principal";
		}
		else {
			FacesMessage fm = new FacesMessage("Login ou Senha Invalido");
			FacesContext.getCurrentInstance().addMessage("msg", fm);
			return null;
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
