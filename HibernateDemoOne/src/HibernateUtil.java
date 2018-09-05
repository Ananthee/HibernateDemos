import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static void main(String args[])
	{
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		com.Product product=new com.Product();
		product.setProductId(1002);
		product.setProductName("demo");
		product.setProductDesc("description");
		product.setPrice(5000);
				
		Transaction transaction=session.beginTransaction();
		session.save(product);
		
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
		System.out.println("Prodcut Object Saved");
	}

	}
