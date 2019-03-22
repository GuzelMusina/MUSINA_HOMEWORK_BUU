package ru.itis.app;

import java.util.List;

public class SoftawareEngenMajor implements Major {

    private String mname;
    private String mcategory;
    private int myears;

    private List<Student> students;

    public SoftawareEngenMajor(String mname, String mcategory, int myears) {
        this.mname = mname;
        this.mcategory = mcategory;
        this.myears = myears;
    }

    @Override
    public String getMname() {
        return mname;
    }

    @Override
    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public String getMcategory() {
        return mcategory;
    }

    @Override
    public void setMcategory(String mcategory) {
        this.mcategory = mcategory;
    }

    @Override
    public int getMyears() {
        return myears;
    }

    @Override
    public void setMyears(int myears) {
        this.myears = myears;
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void setStudents(List<Student> students) {
        this.students = students;

        System.out.println(students);
    }

    @Override
    public String toString() {
        return mname + " " + mcategory + " " + myears + " years";
    }
}
