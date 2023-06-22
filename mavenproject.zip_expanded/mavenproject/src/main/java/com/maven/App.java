package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();

        // test saveStudent
        Student student =new Student();
        Student student12 =new Student();
        Student student21 = new Student();
        //Add values
        student.setFirstName("Akshay");
        student.setLastName("Thube");
        student.setEmail("akshay@gmail.com");
        student12.setFirstName("Pankaj");
        student12.setLastName("Ghodake");
        student12.setEmail("pankaj@gmail.com");
        student21.setFirstName("Kiran");
        student21.setLastName("Thube");
        student21.setEmail("kirant127@gmail.com");
        
        //passing value in parameterized constructor
        studentDao.saveStudent(student);

        
        // test updateStudent
       student.setFirstName("Anju");
        studentDao.updateStudent(student);
       student12.setFirstName("pappu");
       studentDao.updateStudent(student12);
       student21.setFirstName("Bablu");
       studentDao.updateStudent(student21);
        
       // test getStudentById
        //Student student2 = studentDao.getStudentById(student.getId());

        // test getAllStudents
        List < Student > students = studentDao.getAllStudents();
        System.out.println("List of the students:"); 
        students.forEach(student2 -> System.out.println("Student Id:"+student2.getId()+"    " +"Name:"+student2.getFirstName()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deleteStudent
     //   studentDao.deleteStudent(1);

    }
    }



