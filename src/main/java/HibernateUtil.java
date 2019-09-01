import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static SessionFactory factory;
    private static ServiceRegistry sr;

    static {
        Configuration configuration = new Configuration();
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        factory = new Configuration().configure().buildSessionFactory();

    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}