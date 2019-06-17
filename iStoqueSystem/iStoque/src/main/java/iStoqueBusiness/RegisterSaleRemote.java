package iStoqueBusiness;

import java.util.LinkedList;

import iStoqueDomain.Functionary;
import iStoqueDomain.Product;
import iStoqueDomain.Sale;


public interface RegisterSaleRemote {

	public LinkedList<Sale> listOfSales();

	public Sale getSaleById(int id);
	
	public void RegisterSale(int id,LinkedList<Product> products,String data,
							Functionary funcionario);
	public double getValorTotal(int id);
	
	

}
