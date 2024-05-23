package dao;

import HibernateCon.hibernateConnection;
import Model.StudentAddress;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentAddressDao {

    public void saveStudentAddress(StudentAddress student) {
        Session session = hibernateConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
    }
    

    public List<StudentAddress> getStudentsAddress() {
        Session session = hibernateConnection.getSessionFactory().openSession();
        return session.createQuery("from address", StudentAddress.class).list();
    }


    public StudentAddress getStudentById(int id) {
        Session session = hibernateConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StudentAddress studentAddress = session.get(StudentAddress.class, id);
        transaction.commit();
        return studentAddress;
    }

    public StudentAddress deleteStudentById(int id) {
        Session session = hibernateConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StudentAddress studentAddress = session.get(StudentAddress.class, id);
        session.delete(studentAddress);
        transaction.commit();
        return studentAddress;
    }

    public void updateStudentAddress(StudentAddress studentAddress) {
        Session session = hibernateConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(studentAddress);
        transaction.commit();
    }
}
