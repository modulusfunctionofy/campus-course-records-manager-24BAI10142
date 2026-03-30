package edu.ccrm.service;

import edu.ccrm.domain.Enrollment;
import java.util.*;

/** EnrollmentService (Author: Aryan Mauryakant) */
public class EnrollmentService {
    private List<Enrollment> list=new ArrayList<>();
    public void enroll(Enrollment e){ list.add(e); }
    public List<Enrollment> listAll(){ return new ArrayList<>(list); }
}
