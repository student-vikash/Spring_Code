package in.viru.app;

import in.viru.beans.StudentAr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudentAr
{
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("/in/viru/resource/beanconfigA.xml");
        StudentAr st=container.getBean(StudentAr.class);
        System.out.println("Your Name is : "+st.getName()+"\nYour Enrollment is : "+st.getEnrollment());
        String []s=st.getSubjects();
        System.out.println("Your subjects are : ");
        for(String sub:s)
        {
            System.out.print(sub+ " , ");
        }
    }
}
