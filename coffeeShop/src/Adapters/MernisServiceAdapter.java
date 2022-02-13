package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import Mernis.ACWKPSPublicSoap;

import java.util.Locale;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        ACWKPSPublicSoap client = new ACWKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                    customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(),
                    customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            return false;
        }
    }
}
