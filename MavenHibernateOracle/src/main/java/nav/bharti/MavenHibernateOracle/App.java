package nav.bharti.MavenHibernateOracle;

import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration config = new Configuration();
        
        config.configure();
        
        
    }
}
