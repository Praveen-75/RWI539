package app;


import Model.StudentAddress;
import Model.StudentModel;
import dao.StudentAddressDao;
import dao.StudentDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        StudentAddressDao studentDao = new StudentAddressDao();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rollNumber");
        String rollNumber = sc.nextLine();
        System.out.println("Enter clg name");
        String clgName = sc.nextLine();
        System.out.println("enter city");
        String city = sc.nextLine();
        StudentAddress student = new StudentAddress(rollNumber, clgName, city);
        studentDao.saveStudentAddress(student);

//        student.setId(2);
//        student.setCollege("TIT");
//        student.setAddress("Indore");
//        student.setRollNumber("201079");
//        studentDao.updateStudentAddress(student);
//        studentDao.deleteStudentById(9);
        List<StudentAddress> students = studentDao.getStudentsAddress();
        students.forEach(s -> System.out.println(s.getRollNumber()));

    }
}
