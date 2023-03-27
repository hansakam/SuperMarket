/**
 * @author :Hansaka Malshan
 * created 3/27/2023---11:10 AM
 */
package lk.ijse.customer.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration = new Configuration().configure();

    }
    public FactoryConfiguration getinstance(){
       return factoryConfiguration==null ? new FactoryConfiguration() :factoryConfiguration;
    }
    public Session getsession(){
        return sessionFactory.openSession();
    }

}
