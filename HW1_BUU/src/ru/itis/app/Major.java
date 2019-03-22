package ru.itis.app;

import org.springframework.stereotype.Component;

import java.util.List;

//The interface of major, has two implementation

@Component
public interface Major {

    public String getMname();

    public void setMname(String mname);

    public String getMcategory();

    public void setMcategory(String mcategory);

    public int getMyears();

    public void setMyears(int myears);

    public List<Student> getStudents();

    public void setStudents(List<Student> students);
}
