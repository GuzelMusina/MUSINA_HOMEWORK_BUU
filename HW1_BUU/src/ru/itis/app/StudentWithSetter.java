package ru.itis.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentWithSetter implements Student {
    private String sno;
    private String sname;

    @Autowired
    private Major major;

    //Setter injection
    @Autowired
    public void setMajor(Major major) {
        this.major = major;
    }

    public StudentWithSetter(String sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Major getMajor() {
        return major;
    }


    @Override
    public String toString() {
        return "Student " + this.getSname() + "(" + this.getSno() + ")  " + this.getMajor();

    }
}
