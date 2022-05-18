package com.example.demoOneToMany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoOneToManyApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(DemoOneToManyApplication.class, args);
		
		CartRepository cart=context.getBean(CartRepository.class);
		ItemsRepository items=context.getBean(ItemsRepository.class);
		
		Cart c1=new Cart(1,"civil");
		cart.save(c1);
		Items s1=new Items(1,"Mouse",200,c1);
		items.save(s1);
		
		
				
		
		
	}

}
