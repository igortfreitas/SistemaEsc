package sistema.cgd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class Service {
    private final Session session;
    private Transaction transaction;

    public Service(String url){
        Configuration configuration = new Configuration().configure(url);
        SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
        session = sessionFactory.openSession();
    }
    public void save(Object object){
        session.save(object);
        transaction = session.beginTransaction();
        transaction.commit();
    }
    public void delete(Object object){
        session.delete(object);
        transaction = session.beginTransaction();
        transaction.commit();
    }
    @SuppressWarnings("rawtypes")
    public List list(String tablename){
        return (List) session.createSQLQuery("select * from "+tablename);

    }
    public Session getSession() {
        return session;
    }
}
