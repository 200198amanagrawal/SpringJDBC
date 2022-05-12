package com.spring.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
        //String query="Insert into student(sname,sphone,scity) values (?,?,?)"; insert query
        String query="Update student set sname=? where sid=?";
       int result= template.update(query,"spring5",5);
       System.out.println("number of records udpated....."+result);
    }
}
