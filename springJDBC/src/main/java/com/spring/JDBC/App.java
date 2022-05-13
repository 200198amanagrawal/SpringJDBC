package com.spring.JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.JDBC.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/JDBC/config.xml");
        JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
        String query="Select * from student where sid=?";
        //rowmapperimpl mapRow method returns an object of student type and that will be used as a single output
       Student student= template.queryForObject(query,new RowMapperImpl(),1);
       
       //for multiple use query
       List<Student> list=template.query("select * from student", new RowMapperImpl());
       for(Student s:list)
       {
    	   System.out.println(s);
       }
       System.out.println("******** Single ************");
       System.out.println(student);
    }
}
