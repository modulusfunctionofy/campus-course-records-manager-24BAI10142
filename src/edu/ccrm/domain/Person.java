package edu.ccrm.domain;

import java.time.LocalDate;

/** Abstract Person (Author: Aryan Mauryakant) */
public abstract class Person {
    protected String id, fullName, email;
    protected LocalDate createdAt;

    public Person(String id, String fullName, String email){
        this.id=id; this.fullName=fullName; this.email=email;
        this.createdAt=LocalDate.now();
    }
    public String getId(){ return id; }
    public String getFullName(){ return fullName; }
    public String getEmail(){ return email; }
    public String toString(){ return fullName+" ("+id+")"; }
}
