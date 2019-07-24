/*
import com.jfs.service.CustomerServiceImpl;
//import java.util.*;
//import com.jfs.model.Customer;
import com.jfs.repository.*;
public class Application {
	public static void main(String[] args) {
		
		//ArrayList<Customer> cust=new ArrayList<Customer>();
		// TODO Auto-generated method stub
		CustomerServiceImpl cs=new CustomerServiceImpl();
		//CustomerRepositoryImpl cri=new CustomerRepositoryImpl();
		//cri.findAll(); wrong
		cs.setCustomerRepository(new CustomerRepositoryImpl());
		//cust=cs.findAll();
	System.out.println(cs.findAll().get(0).getFirstname());
	/*
	      for (Customer obj : cust) { 		      
	           System.out.println(obj.getFirstname()+" "); 		
	      }
	      */
//	}
//}


//import com.jfs.service.CustomerService;
import com.jfs.service.CustomerServiceImpl;
import com.jfs.repository.*;
public class Application {
	public static void main(String[] args) {
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(new CustomerRepositoryImpl());
		System.out.println(service.findAll().get(0).getFirstname());
	}
}
