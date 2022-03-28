package com.spring.orm;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;


public class App 
{
    public static void main( String[] args )
    {
 	   ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
 	     StudentDao studentDao=ac.getBean("Dao",StudentDao.class);
 	     Student student=new Student(33,"Raj","Indore");
 	    //int i= studentDao.insert(student);
 	     
 	   // studentDao.updateStudent(student);
 	     
       // studentDao.delStudent(student);
 	     
 	           // *****Show*****
 	   Student s1=studentDao.showStudent(1);
 	   if(s1==null)
 	   {
 		   System.out.print("no student present");
 	   }
 	   else
 	   {
 	    System.out.println(s1.getSid()+" "+s1.getSname()+" "+s1.getScity());
 	   }
 	     
 	     
    }
}
