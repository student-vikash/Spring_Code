package in.viru.app;

import in.viru.beans.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UseStudent
{
    public static void main(String[] args) {
        Resource res = new ClassPathResource("/in/viru/resource/beanconfig.xml");
        BeanFactory container = new XmlBeanFactory(res);
        Student st=(Student)container.getBean("stObj");

        System.out.println("Name : "+st.getName()+"\n Roll no : "+st.getRoll_no());
    }
}
