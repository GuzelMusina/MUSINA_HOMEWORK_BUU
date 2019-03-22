package ru.itis.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itis.app.StudentWithConstr;
import ru.itis.app.StudentWithSetter;

public class TestMajorInjectInStudent extends Assert {
    @Test
    public void testWConstructor1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ru/itis/resourses/student_major_config.xml");
        StudentWithConstr studentWithConstr1 = context.getBean("peter", StudentWithConstr.class);
        assertNotNull(studentWithConstr1.getMajor());
    }
    @Test
    public void testWConstructor2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ru/itis/resourses/student_major_config.xml");
        StudentWithConstr studentWithConstr2 = context.getBean("bond", StudentWithConstr.class);
        assertNotNull(studentWithConstr2.getMajor());
    }
    @Test
    public void testWSetter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ru/itis/resourses/student_major_config.xml");
        StudentWithSetter studentWithSetter = context.getBean("vanya", StudentWithSetter.class);
        assertNotNull(studentWithSetter.getMajor());
    }
}
