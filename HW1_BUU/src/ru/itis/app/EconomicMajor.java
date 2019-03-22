package ru.itis.app;

import java.util.List;

public class EconomicMajor implements Major {

    private String mname;
    private String mcategory;

    private int myears;
    private String isFull;

    private List<Student> students;

    public EconomicMajor(String mname, String mcategory, int myears) {
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

    public String getIsFull() {
        return isFull;
    }

    public void setIsFull(String isFull) {
        this.isFull = isFull;
    }

    @Override
    public String toString() {
        return mname + " " + mcategory + " " + myears + " years";
    }

}
