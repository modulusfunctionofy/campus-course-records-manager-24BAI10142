package edu.ccrm.service;

import edu.ccrm.domain.Student;
import java.util.*;

/** StudentService (Author: Aryan Mauryakant) */
public class StudentService {
    private Map<String,Student> students=new HashMap<>();
    public void addStudent(Student s){ students.put(s.getId(),s); }
    public List<Student> listAll(){ return new ArrayList<>(students.values()); }
    public Optional<Student> findById(String id){ return Optional.ofNullable(students.get(id)); }
}
