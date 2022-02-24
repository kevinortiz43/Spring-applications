package com.Fruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FruitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context = SpringApplication.run(FruitApplication.class, args);
		Apple ap1 = Context.getBean(Apple.class);
		Banana ba1 = Context.getBean(Banana.class);
		Kiwi ki1 = Context.getBean(Kiwi.class);
 		Growing growing1 = Context.getBean(Growing.class);
		Growing growing2 = Context.getBean(Growing.class);
		Growing growing3 = Context.getBean(Growing.class);

		growing1.setGname("Granny Apple");
		growing1.setGlocation("North American");
		growing1.setGontrees(false);
		growing1.setGseason("Year-round");
		growing1.setGtemperature(34);

		growing2.setGname("Banana");
		growing2.setGlocation("South American");
		growing2.setGontrees(false);
		growing2.setGseason("Summer");
		growing2.setGtemperature(80);

		growing3.setGname("Kiwi");
		growing3.setGlocation("American");
		growing3.setGontrees(false);
		growing3.setGseason("Summer");
		growing3.setGtemperature(34);

		ap1.setGrow(growing1);
		ba1.setGrow(growing2);
		ki1.setGrow(growing3);

		ap1.getGrow().display();
		ba1.getGrow().display();
		ki1.getGrow().display();

	}

}