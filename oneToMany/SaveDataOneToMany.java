package oneToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveDataOneToMany {
    public void saveItems(Items items) {
        Session session = OneToManyConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(items);
        transaction.commit();
        session.close();
    }

    public void saveCart(Carts cart) {
        Session session = OneToManyConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(cart);
        transaction.commit();
        session.close();
    }

    public void displayItems(long id) {
        Session session = OneToManyConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Items items = session.get(Items.class, id);
        System.out.println(items.toString());
        transaction.commit();
        session.close();
    }
}
