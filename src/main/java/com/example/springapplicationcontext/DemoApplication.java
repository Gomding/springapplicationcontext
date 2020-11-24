package com.example.springapplicationcontext;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class); // 이 클래스를 빈 설정으로 함
        //ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService.bookRepository != null);
    }

}
