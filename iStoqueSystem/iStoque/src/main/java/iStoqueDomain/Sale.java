package iStoqueDomain;

import java.util.LinkedList;

public class Sale {

	private int idSale;
	private LinkedList<Product> products;
	private String dataDaVenda;
	Functionary funcionario;
	
	public int getIdSale() {
		return idSale;
	}
	public void setIdSale(int idSale) {
		this.idSale = idSale;
	}
	public LinkedList<Product> getProducts() {
		return products;
	}
	public void setProducts(LinkedList<Product> products) {
		this.products = products;
	}
	public String getDataDaVenda() {
		return dataDaVenda;
	}
	public void setDataDaVenda(String dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}
	public Functionary getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Functionary funcionario) {
		this.funcionario = funcionario;
	}
	public Sale(int idSale, LinkedList<Product> products, String dataDaVenda, Functionary funcionario) {

		this.idSale = idSale;
		this.products = products;
		this.dataDaVenda = dataDaVenda;
		this.funcionario = funcionario;
	}
	
	
	
	
	
}
