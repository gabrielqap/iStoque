package iStoqueDAO;

import java.util.LinkedList;

import iStoqueDomain.Sale;

public class SaleDAO {
	private static final LinkedList<Sale> ListOfSales = new LinkedList<Sale>();
	
	public static final Sale GetSaleById(int ID) {
		for(Sale toFind : ListOfSales) {
			if(toFind.getIdSale() == ID) {
				return toFind;
			}
		}
		return null;
	}
	
	public static final Sale GetSaleByFunctionary(String name) {
		for(Sale toFind : ListOfSales) {
			if(toFind.getFuncionario().getName().contains(name)) {
				return toFind;
			}
		}
		return null;
	}
	
	public static Sale AddSale(Sale newSale) {
		ListOfSales.add(newSale);
		newSale.setIdSale(ListOfSales.size());
		return newSale;
	}
	
	public static void RemoveSale(int ID) {
		Sale toRemove = GetSaleById(ID);
		ListOfSales.remove(toRemove);
	}

	public static LinkedList<Sale> ReturnList() {
		return ListOfSales;
	}

}
