package in.viru.app;

import in.viru.beans.Student2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent2
{
    public static void main(String[] args)
    {
        ApplicationContext container = new ClassPathXmlApplicationContext("/in/viru/resource/beanconfig2.xml");
        Student2 st=container.getBean(Student2.class);

        System.out.println("Your Name is : "+st.getName()+"\nYour enrollment is : "+st.getEnrollment());

    }
}
