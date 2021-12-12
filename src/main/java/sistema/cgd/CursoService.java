package sistema.cgd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import sistema.cdp.Curso;

public class CursoService {
    private final Session session;
    private Transaction transaction;

    public CursoService(String url) {
        Configuration configuration = new Configuration().configure(url);
        SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
        session = sessionFactory.openSession();
    }

    public void save(Curso curso) {
        session.save(curso);
        transaction = session.beginTransaction();
        transaction.commit();
    }

    public void delete(Curso curso) {
        session.delete(curso);
        transaction = session.beginTransaction();
        transaction.commit();
    }
}
