package iStoqueBusiness;

import java.util.LinkedList;
import iStoqueDomain.*;

public interface RegisterFunctionaryRemote {
		public LinkedList<Functionary> ListOfFuncs();
		public LinkedList<Product> ListOfProducts();
	
		public Functionary GetFuncByID(int id);
		public Product GetProdByID(int id);
		
		public void RegisterBoss(String login, String password);
		public void RegisterFunc(String login, String password);
		public void RegisterProd(String productName, String category, int quantity, float value);
		public void RemoveProd(int id, String name);
		public void RemoveFunc(int id, String name);
		public float TotalValueStock();
		
		
}
