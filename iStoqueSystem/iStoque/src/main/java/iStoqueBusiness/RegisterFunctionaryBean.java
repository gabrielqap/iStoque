package iStoqueBusiness;

import java.util.LinkedList;

import javax.ejb.Stateless;

import iStoqueDAO.*;
import iStoqueDomain.*;
@Stateless
public class RegisterFunctionaryBean implements RegisterFunctionaryRemote {

	@Override
	public LinkedList<Functionary> ListOfFuncs() {
		return (LinkedList<Functionary>)FunctionaryDAO.ReturnList();
	}

	@Override
	public LinkedList<Product> ListOfProducts() {
		return (LinkedList<Product>)ProductDAO.ReturnList(); 
	}

	@Override
	public void RegisterBoss(String login, String password) {
		Administrator boss = new Administrator();
		boss.setIdFunc(ListOfFuncs().size() + 1);
		boss.setLogin(login);
		boss.setPassword(password);
		FunctionaryDAO.AddFunc(boss);
	}

	@Override
	public void RegisterFunc(String login, String password) {
		Functionary func = new Functionary();
		func.setIdFunc(ListOfFuncs().size() + 1);
		func.setLogin(login);
		func.setPassword(password);
	}

	@Override
	public void RegisterProd(String productName, String category, int quantity, float value) {
		Product newProd = new Product();
		newProd.setId(ListOfProducts().size() + 1);
		newProd.setProductName(productName);
		newProd.setCategory(category);
		newProd.setQuantity(quantity);
		newProd.setValue(value);
	}

	@Override
	public void RemoveProd(int id, String name) {
		Product p = GetProdByID(id);
		ListOfProducts().remove(p);
	}

	@Override
	public float TotalValueStock() {
		float totalValue = 0;
		for(Product p : ListOfProducts()) {
			totalValue += p.getValue();
		}
		return totalValue;
	}

	@Override
	public Functionary GetFuncByID(int id) {
		for(Functionary f : ListOfFuncs()) {
			if(f.getIdFunc() == id) {
				return f;
			}
		}
		return null;
	}

	@Override
	public Product GetProdByID(int id) {
		for(Product p : ListOfProducts()) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void RemoveFunc(int id, String name) {
		Functionary toRemove = GetFuncByID(id);
		ListOfFuncs().remove(toRemove);
	}
		
}
