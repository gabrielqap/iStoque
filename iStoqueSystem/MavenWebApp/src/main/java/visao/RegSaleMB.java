package visao;

import java.util.LinkedList;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import iStoqueBusiness.RegisterFunctionaryRemote;
import iStoqueBusiness.RegisterSaleRemote;
import iStoqueDomain.Functionary;
import iStoqueDomain.Product;

@Named(value = "SaleMB")
@RequestScoped
public class RegSaleMB {


	private int idSale;
	private LinkedList<Product> products;
	private String dataDaVenda;
	Functionary funcionario;
	
	@EJB
	private RegisterSaleRemote ejb;
	
	public String RegFunc() {
		ejb.RegisterSale(idSale, products, dataDaVenda, funcionario);
		return "principal";
	}
	
	
	public int getIdSale() {
		return idSale;
	}
	public void setIdSale(int id) {
		idSale = id;
	}
	public LinkedList<Product> getProductsSale() {
		return products;
	}
	public void setProducts(LinkedList <Product> products) {
		this.products = products;
	}
	
	public String getDataDaVenda() {
		return dataDaVenda == null ? "" : dataDaVenda;
	}
	public void setDataDaVenda(String data) {
		this.dataDaVenda = data;
	}

	public Functionary getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Functionary funcionario) {
		this.funcionario = funcionario;
	}
	
}
