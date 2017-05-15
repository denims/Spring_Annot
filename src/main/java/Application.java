import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deni.test.service.CustomerService;

public class Application {
	
	public static void main(String[] args) {
		//CustomerService customer = new CustomerServiceImpl();
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customer = context.getBean("customerServiceImpl", com.deni.test.service.CustomerServiceImpl.class);
		System.out.println(customer.getAll().get(0).getCustomerFirstName());
	}

}
