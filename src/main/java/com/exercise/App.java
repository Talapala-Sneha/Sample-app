package com.exercise;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	BasicConfigurator.configure();  
    	  logger.info("Hello world");  
    	  logger.info("we are in logger info mode"); 
    }
}


