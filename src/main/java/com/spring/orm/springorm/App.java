package com.spring.orm.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.springorm.Entitu.Student;
import com.spring.orm.springorm.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/orm/springorm/config.xml");
        StudentDao studentdao=context.getBean("studentdao",StudentDao.class);
//        Student st=new Student(1211,"Mohsin","Mkn");
//        int t=studentdao.insert(st);
//      
//        System.out.println(t+"Done");
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        boolean flag=true;
        
        while(flag){
        System.out.println("Press 1 for add student");
        System.out.println("Press 2 for dispay all student");
        System.out.println("Press 3 for get single student details");
        System.out.println("Press 4 for delete student");
        System.out.println("Press 5 for update student");
        System.out.println("Press 6 for Exit");
        try {
        	
        	int i=Integer.parseInt(br.readLine());
//        	if(i==1)
//        	{
//        		//add a new student 
//        		
//        	}
        	Scanner st=new Scanner(System.in);
        	switch(i)
        	{
        	case 1:
        		//add new studnet
        		Student s=new Student();
        		s.setStudentId(st.nextInt());
        		s.setStudentName(st.next());
        		s.setStudentCity(st.next());
        		studentdao.insert(s);
        		break;
        	case 2:
        		//display all;
        		for(Student s2:studentdao.getAll())
        		{
        			System.out.println(s2);
        		}
        		break;
        	case 3:
        		//get single studnet ;
        		Student ssss=studentdao.getStudents(st.nextInt());
        		System.out.println(ssss);
        		break;
        		
        	case 4:
        		System.out.println("ENter studnet id for deleting");
        		studentdao.deteleStudnet(st.nextInt());
        		break;
        	case 5:
	 		
             
        		
        		Student stu=new Student();
        		stu.setStudentId(st.nextInt());
        		stu.setStudentName(st.next());
        		stu.setStudentCity(st.next());
        		
        		studentdao.update(stu);
        		break;
        	case 6:
        		flag=false;
        		break;
        		
        		
        		
        	}
        	
        }catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
     }
    }
}
