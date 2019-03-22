package ru.itis.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentWithConstr implements Student {

    private String sno;
    private String sname;

    private Major major;

    //Constructor injection
    @Autowired
    public StudentWithConstr(String sno, String sname, Major major) {
        this.sno = sno;
        this.sname = sname;
        this.major = major;
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
