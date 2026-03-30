package edu.ccrm.cli;

import edu.ccrm.domain.*;import edu.ccrm.service.*;import edu.ccrm.io.*;import edu.ccrm.util.*;
import java.util.*;import java.nio.file.*;

 /** CCRMApp CLI (Author: Aryan Mauryakant) */
public class CCRMApp {
    private static StudentService studentService=new StudentService();
    private static CourseService courseService=new CourseService();
    private static EnrollmentService enrollmentService=new EnrollmentService();

    public static void main(String[]args)throws Exception{
        seed();
        Scanner sc=new Scanner(System.in);
        boolean run=true;
        while(run){
            System.out.println("\n--- CCRM Menu (by Aryan Mauryakant) ---");
            System.out.println("1) List students");
            System.out.println("2) List courses");
            System.out.println("3) Enroll student");
            System.out.println("4) List enrollments");
            System.out.println("5) Backup data");
            System.out.println("0) Exit");
            String op=sc.nextLine();
            switch(op){
                case "1": studentService.listAll().forEach(System.out::println);break;
                case "2": courseService.listAll().forEach(System.out::println);break;
                case "3": enroll(sc);break;
                case "4": enrollmentService.listAll().forEach(System.out::println);break;
                case "5": backup();break;
                case "0": run=false;break;
                default: System.out.println("Invalid");
            }
        }
        System.out.println("Goodbye - Aryan Mauryakant");
    }

    private static void seed(){
        studentService.addStudent(new Student("1","24BAI10142","Aryan Mauryakant","aryan.24BAI10142@vitbhopal.ac.in"));
        courseService.addCourse(new Course.Builder().code("CSx101").title("Programming in Java").credits(4).instructor("Shaiful Alom").semester(Semester.SPRING).department("CS").build());
    }

    private static void enroll(Scanner sc){
        System.out.print("Enter student id: ");String sid=sc.nextLine();
        System.out.print("Enter course code: ");String cc=sc.nextLine();
        Enrollment e=new Enrollment(sid,cc);enrollmentService.enroll(e);
        System.out.println("Enrolled: "+e);
    }

    private static void backup(){
        try{
            Path b=BackupService.createBackupFolder(Paths.get("exports"));
            System.out.println("Backup created: "+b);
            System.out.println("Size: "+RecursiveUtils.folderSize(b));
        }catch(Exception e){ e.printStackTrace(); }
    }
}
