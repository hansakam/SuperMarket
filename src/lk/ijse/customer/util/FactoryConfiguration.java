/**
 * @author :Hansaka Malshan
 * created 3/27/2023---11:10 AM
 */
package lk.ijse.customer.util;

import lk.ijse.customer.entity.Customer;
import lk.ijse.customer.entity.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Item.class)
                .addAnnotatedClass(Customer.class);
         sessionFactory = configuration.buildSessionFactory();

    }
    public static FactoryConfiguration getinstance(){
       return factoryConfiguration==null ? factoryConfiguration=new FactoryConfiguration() :factoryConfiguration;
    }
    public Session getsession(){
        return sessionFactory.openSession();
    }

}
