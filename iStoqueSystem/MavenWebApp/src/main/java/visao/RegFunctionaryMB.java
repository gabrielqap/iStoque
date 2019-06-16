package visao;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.inject.Inject;
import iStoqueBusiness.RegisterFunctionaryRemote;

import javax.ejb.EJB;

@Named(value = "RegFunctionaryMB")
@RequestScoped
public class RegFunctionaryMB {
	private String loginFunc;
	private String passFunc;
	private String nameFunc;
	
	
	@EJB
	private RegisterFunctionaryRemote ejb;
	
	public String RegFunc() {
		ejb.RegisterFunc(loginFunc, passFunc, nameFunc);
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
	public String getNameFunc() {
		return nameFunc == null ? "" : nameFunc;
	}
	public void setNameFunc(String nameFunc) {
		this.nameFunc = nameFunc;
	}
	
	
}
