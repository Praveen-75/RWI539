package app;

import Model.StudentModel;
import dao.StudentDao;

import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        StudentModel student = new StudentModel("Priya", "Sharma", "priyasharma@gamil.com");
//        studentDao.saveStudent(student);


        studentDao.displayRecord(1);
        List<StudentModel> students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.toString()));
    }
}
