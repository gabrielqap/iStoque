package iStoqueBusiness;

import java.util.LinkedList;

import javax.ejb.Stateless;

import iStoqueDAO.SaleDAO;
import iStoqueDomain.Functionary;
import iStoqueDomain.Product;
import iStoqueDomain.Sale;

@Stateless
public class RegisterSaleBean implements RegisterSaleRemote {

	@Override
	public LinkedList<Sale> listOfSales() {
		return (LinkedList<Sale>)SaleDAO.ReturnList();
	}

	@Override
	public Sale getSaleById(int id) {
		for(Sale s : listOfSales()) {
			if(s.getIdSale() == id) {
				return s;
			}
		}
		return null;
	}

	@Override
	public double getValorTotal(int id) {
		double valor = 0;
		
		for(Product p : getSaleById(id).getProducts()) {
			valor += p.getValue();
		}
		return valor;
		
	}
	
	@Override 
	public void RegisterSale(int id, LinkedList<Product> product, 
							String data, Functionary funcionario) {
		
		Sale s = new Sale(id, product, data, funcionario);
	}
}
