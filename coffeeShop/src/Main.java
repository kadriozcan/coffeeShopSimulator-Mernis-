import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setFirstName("Kadri");
        c1.setId(123);
        c1.setLastName("Özcan");
        c1.setNationalityId("44227401318");
        c1.setDateOfBirth(LocalDate.of(2002, 6, 12));


        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(c1);
    }
}
