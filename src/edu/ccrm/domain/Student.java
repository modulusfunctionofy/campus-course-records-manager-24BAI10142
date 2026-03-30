package edu.ccrm.domain;

import java.util.*;

 /** Student class (Author: Aryan Mauryakant) */
public class Student extends Person {
    private String regNo;
    private boolean active;
    private List<Enrollment> enrollments=new ArrayList<>();

    public Student(String id,String regNo,String fullName,String email){
        super(id,fullName,email);
        this.regNo=regNo; this.active=true;
    }
    public String getRegNo(){ return regNo; }
    public boolean isActive(){ return active; }
    public void deactivate(){ active=false; }
    public void addEnrollment(Enrollment e){ enrollments.add(e); }
    public List<Enrollment> getEnrollments(){ return enrollments; }
    public String toString(){ return fullName+" - "+email+" ("+regNo+")"; }
}
