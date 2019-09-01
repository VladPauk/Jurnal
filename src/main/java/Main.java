import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Group groupOne = context.getBean("group1", Group.class);
        Group groupTwo = context.getBean("group2", Group.class);
        Student student1 = context.getBean("student1", Student.class);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(groupTwo);
       //filterStudents(groupOne.getStudents(),session);
        //Query query = session.createNativeQuery("SELECT * from student WHERE name = 'Artur' or name = 'Vlad'", Student.class);
        //List <Student> student = query.list();
        //System.out.println(student);
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
        context.close();
    }

    private static void filterStudents(List<Student> students, Session session) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).mark > 5 && students.get(i).getStatus().equals("online")) {
                session.save(students.get(i));
            }
        }
    }
}
