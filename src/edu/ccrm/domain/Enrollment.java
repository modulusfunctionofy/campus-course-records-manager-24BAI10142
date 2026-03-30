package edu.ccrm.domain;

import java.time.LocalDate;

/** Enrollment record (Author: Aryan Mauryakant) */
public class Enrollment {
    private String studentId, courseCode;
    private LocalDate enrolledOn;
    private Grade grade;

    public Enrollment(String sid,String cc){
        studentId=sid; courseCode=cc; enrolledOn=LocalDate.now();
    }
    public void setGrade(Grade g){ grade=g; }
    public String toString(){ return studentId+" -> "+courseCode+" "+enrolledOn+" "+(grade==null?"N/A":grade); }
}
