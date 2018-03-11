//package crud.servlet.hibernate.utils;
//
//import org.hibernate.HibernateException;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import java.util.logging.Logger;
//
//public class HibernateUtil {
//    private static SessionFactory factory;
//
//    static {
//        try {
//            factory = new Configuration()
//                    .configure()
//                    .buildSessionFactory();
//        } catch (HibernateException e) {
//            e.getMessage();
//        }
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return factory;
//    }
//}
