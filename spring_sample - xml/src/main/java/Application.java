import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.model.Customer;
import com.aman.service.CustomerService;
import com.aman.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerService service=new CustomerServiceImpl();
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service= 
				applicationContext.getBean("customerService", CustomerService.class);
		
		
		
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
