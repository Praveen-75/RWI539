package manyTomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveDataManyToMany {
    public void saveCart(Cart cart) {
        Session session = ManyToManyConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(cart);
        transaction.commit();
        session.close();
    }
}
