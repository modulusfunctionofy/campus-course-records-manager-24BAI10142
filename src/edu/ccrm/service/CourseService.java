package edu.ccrm.service;

import edu.ccrm.domain.Course;
import java.util.*;

/** CourseService (Author: Aryan Mauryakant) */
public class CourseService {
    private Map<String,Course> courses=new HashMap<>();
    public void addCourse(Course c){ courses.put(c.getCode(),c); }
    public List<Course> listAll(){ return new ArrayList<>(courses.values()); }
}
