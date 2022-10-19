package hibernateproject.com.Learnhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {  
       //step1-Create object of configuration
       Configuration cfg=new Configuration().configure();
       
       //step2-Build Session Factory
       SessionFactory sf=cfg.buildSessionFactory();
       
       //step3-Open Session
       Session s=sf.openSession();
       System.out.println("Hibernate is working"); 
       
       //step4-create the object of entity class
       Student1 stu=new Student1 (1,"Jyothi",98,98,98);
       
       //step5-get Transcation
       
       Transaction tx=s.beginTransaction();
       
       //step6-Save the object
       s.save(stu);
       
       //step7-commit the changes in transcation
       tx.commit();
       
       //step8-Close the session
       s.close();
    }
}
