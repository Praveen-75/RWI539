package ManyToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveDataManyToOne {
    public void saveUser(users user) {
        Session session = ManyToOneConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }
}
