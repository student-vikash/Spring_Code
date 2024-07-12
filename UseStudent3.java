package in.viru.app;

import in.viru.beans.Student3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent3
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("in/viru/resource/beanconfig3.xml");
        System.out.println("Container Started Viru...");
        Student3 st1=(Student3) container.getBean("stObj1");
        System.out.println("=========== First Bean ============");
        System.out.println("Your Name is "+ st1.getName()+"\nYour Enrollment is "+ st1.getEnrollment());

        System.out.println("\n");
        Student3 st2 = (Student3) container.getBean("stObj2");
        System.out.println("======= Second Bean ========");
        System.out.println("Your Name is "+st2.getName()+"\nYour Enrollment is "+st2.getEnrollment());

    }
}
