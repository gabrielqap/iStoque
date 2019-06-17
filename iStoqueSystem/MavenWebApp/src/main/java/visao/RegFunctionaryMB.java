package visao;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import iStoqueBusiness.RegisterFunctionaryRemote;

import javax.ejb.EJB;

@Named(value = "RegFunctionaryMB")
@RequestScoped
public class RegFunctionaryMB {
	private String loginFunc;
	private String passFunc;
	private String emailFunc;
	
	
	@EJB
	private RegisterFunctionaryRemote ejb;
	
	public String RegFunc() {
		ejb.RegisterFunc(loginFunc, passFunc, emailFunc);
		return "principal";
	}
	
	
	public String getLoginFunc() {
		return loginFunc == null ? "" : loginFunc;
	}
	public void setLoginFunc(String loginFunc) {
		this.loginFunc = loginFunc;
	}
	public String getPassFunc() {
		return passFunc == null ? "" : passFunc;
	}
	public void setPassFunc(String passFunc) {
		this.passFunc = passFunc;
	}
	public String getemailFunc() {
		return emailFunc == null ? "" : emailFunc;
	}
	public void setemailFunc(String emailFunc) {
		this.emailFunc = emailFunc;
	}
	
	
}
