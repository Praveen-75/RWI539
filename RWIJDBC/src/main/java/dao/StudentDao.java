package dao;

import HibernateCon.hibernateConnection;
import Model.Employees;
import Model.EmployeesDetail;
import Model.StudentModel;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao {
    public void saveStudent(StudentModel student) {
        Session session = hibernateConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }

    public List<StudentModel> getStudents() {
        Session session = hibernateConnection.getSessionFactory().openSession();
        return session.createQuery("select a from student a", StudentModel.class).list();
    }

    public void displayRecord(int id) {
        Session session = hibernateConnection.getSessionFactory().openSession();
        StudentModel studentModel = (StudentModel) session.get(StudentModel.class, id);
        System.out.println(studentModel.toString());
        session.close();
    }

    public void saveEmployees(Employees employees) {
        Session session = hibernateConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employees);
        transaction.commit();
        session.close();
    }

    public void displayRecordEmployees(int id) {
        Session session = hibernateConnection.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Employees employees = session.get(Employees.class, id);
        EmployeesDetail studentGfgDetail = employees.getEmployeesDetail();
        employees.setEmail("praveen@gmail.com");
        studentGfgDetail.setNoOfEmployees(200);
        session.update(employees);
        transaction.commit();
        session.close();
    }
}
