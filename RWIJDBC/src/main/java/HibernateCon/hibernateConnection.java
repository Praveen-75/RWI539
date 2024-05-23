package HibernateCon;

import Model.Employees;
import Model.EmployeesDetail;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;


public class hibernateConnection {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/Employee?useSSL=false");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "praveen");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

                settings.put(Environment.SHOW_SQL, "true");

                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

//                settings.put(Environment.HBM2DDL_AUTO, "create-drop");
                //first time run this line create-drop
                // and all time run update line
                settings.put(Environment.HBM2DDL_AUTO, "update");

                configuration.setProperties(settings);

                //first table create
//                configuration.addAnnotatedClass(StudentModel.class);

                //second table create
//                configuration.addAnnotatedClass(StudentAddress.class);

                configuration.addAnnotatedClass(Employees.class);
                configuration.addAnnotatedClass(EmployeesDetail.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error");
            }
        }
        return sessionFactory;
    }
}