package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    public void save(Customer customer) {
        //mernis
        if (customerCheckService.checkIfRealPerson(customer)) {
            System.out.println("Saved to db: " + customer.getFirstName());
        } else {
            System.out.println("Dogrulanamadi");
        }

    }
}
