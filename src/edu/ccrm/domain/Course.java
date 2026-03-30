package edu.ccrm.domain;

/** Course with Builder (Author: Aryan Mauryakant) */
public class Course {
    private final String code,title,instructor,department;
    private final int credits;
    private final Semester semester;

    private Course(Builder b){
        code=b.code; title=b.title; credits=b.credits;
        instructor=b.instructor; semester=b.semester; department=b.department;
    }
    public String getCode(){ return code; }
    public String getTitle(){ return title; }
    public String toString(){ return code+": "+title+" ("+credits+"cr) - "+instructor; }

    public static class Builder{
        private String code,title,instructor,department;
        private int credits;
        private Semester semester;
        public Builder code(String c){code=c;return this;}
        public Builder title(String t){title=t;return this;}
        public Builder credits(int c){credits=c;return this;}
        public Builder instructor(String i){instructor=i;return this;}
        public Builder semester(Semester s){semester=s;return this;}
        public Builder department(String d){department=d;return this;}
        public Course build(){ return new Course(this); }
    }
}
