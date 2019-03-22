package ru.itis.app;

import org.springframework.stereotype.Component;

//The interface of student, has two implementations for two different injections

@Component
public interface Student {

    String getSno();

    void setSno(String sno);

    String getSname();

    void setSname(String sname);

    Major getMajor();

}
