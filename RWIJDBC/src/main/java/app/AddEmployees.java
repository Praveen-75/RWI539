package app;

import Model.Employees;
import Model.EmployeesDetail;
import dao.StudentDao;

public class AddEmployees {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Employees employees = new Employees("Akash", "Verma", "verma@gmail.com");

        EmployeesDetail employeesDetail = new EmployeesDetail("railworld", 20);

        employees.setStudentGfgDetail(employeesDetail);
        studentDao.saveEmployees(employees);

        System.out.println("Transaction Successfully Completed!");
    }
}

