package lk.ijse.customer;

import lk.ijse.customer.embedd.Name;
import lk.ijse.customer.entity.Customer;
import lk.ijse.customer.entity.Item;
import lk.ijse.customer.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author :Hansaka Malshan
 * created 3/26/2023---11:15 PM
 */

public class Appinitializer {
    public static void main(String[] args) {


        Name name = new Name();
            name.setFName("Maduka");
            name.setMName("Malshan");
            name.setLName("Ranasinghe");

        Customer c2 = new Customer();
                c2.setId("C002");
                c2.setName(name);
                c2.setAddress("Galle");
                c2.setSalary(100000);

        Session session = FactoryConfiguration.getinstance().getsession();

        Transaction transaction = session.beginTransaction();

        session.save(c2);
      /*  Customer d = session.get(Customer.class, "C001");
        session.delete(d);*/

        transaction.commit();
        session.close();

    }
}
