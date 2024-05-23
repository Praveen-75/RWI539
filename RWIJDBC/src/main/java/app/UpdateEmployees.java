package app;

import dao.StudentDao;

public class UpdateEmployees {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        studentDao.displayRecordEmployees(2);
        System.out.println("Transaction Successfully Completed!");
    }
}

