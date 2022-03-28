package com.spring.orm;



import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

import antlr.collections.List;


public class ShowAll 
{
    public static void main( String[] args )
    {
 	   ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
 	     StudentDao studentDao=ac.getBean("Dao",StudentDao.class);
 	     Student student=new Student();
 	    
 	    // *****Show particular student*****
 	// on progess.....
 	   
 	    //System.out.println(s1.getSid()+" "+s1.getSname()+" "+s1.getScity());
 	   
 	     
 	     
    }
}
