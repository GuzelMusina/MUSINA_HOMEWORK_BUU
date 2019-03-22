package ru.itis.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itis.app.StudentWithConstr;
import ru.itis.app.StudentWithSetter;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ru/itis/resourses/student_major_config.xml");

        StudentWithConstr student1 = context.getBean("peter", StudentWithConstr.class);
        StudentWithConstr student2 = context.getBean("bond", StudentWithConstr.class);
        StudentWithSetter student3 = context.getBean("vanya", StudentWithSetter.class);

        ((ConfigurableApplicationContext) context).close();
    }
}

