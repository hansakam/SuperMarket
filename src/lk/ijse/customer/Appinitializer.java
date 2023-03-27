package lk.ijse.customer;

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
        Item i2 = new Item();
             i2.setCode("I002");
             i2.setDescription("Biscuite");
             i2.setPrice(200);
             i2.setQty(800);

        Session session = FactoryConfiguration.getinstance().getsession();

        Transaction transaction = session.beginTransaction();

                  /* session.save(i2);*/
                    /*session.update(i1);*/
/*
        Item i01 = session.get(Item.class,"I001");
        System.out.println(i01.getDescription());*/

        Item item = session.get(Item.class, "I002");
        session.delete(item);

                    transaction.commit();
                    session.close();


    }
}
