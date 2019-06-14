package iStoqueDAO;
import java.util.LinkedList;

import iStoqueDomain.Product;

public class ProductDAO {
	private static final LinkedList<Product> ListOfProducts = new LinkedList<Product>();
	
	public static final Product GetProductById(int ID) {
		for(Product toFind : ListOfProducts) {
			if(toFind.getId() == ID) {
				return toFind;
			}
		}
		return null;
	}
	
	public static final Product GetProductByName(String name) {
		for(Product toFind : ListOfProducts) {
			if(toFind.getProductName().contains(name)) {
				return toFind;
			}
		}
		return null;
	}
	
	public static Product AddProduct(Product newProd) {
		ListOfProducts.add(newProd);
		newProd.setId(ListOfProducts.size());
		return newProd;
	}
	
	public static void RemoveProduct(int ID) {
		Product toRemove = GetProductById(ID);
		ListOfProducts.remove(toRemove);
	}

	public static LinkedList<Product> ReturnList() {
		return ListOfProducts;
	}
	
	
	
}
