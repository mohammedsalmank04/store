package com.learnSpringBoot.store;

import com.learnSpringBoot.store.dao.ProductDAO;
import com.learnSpringBoot.store.entity.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ProductDAO productDAO){
		return runner -> {
			//createProduct(productDAO);

			//readProduct(productDAO);

			//queryForStudents(productDAO);

			findByName(productDAO);

		};
	}

	private void queryForStudents(ProductDAO productDAO) {

		List<Product> productsList = productDAO.findAll();

		for(Product p:productsList){
			System.out.println(p);
		}
	}

	private void readProduct(ProductDAO productDAO) {
		Product productById = productDAO.findById(4);
		System.out.println(productById);
	}

	private void createProduct(ProductDAO productDAO) {

		System.out.println("Creating product");

		Product newProduct = new Product("Wise-Honey BBQ",25,2.25);
		productDAO.save(newProduct);

		System.out.println("saved product: "+ newProduct.getId());



	}

	private void findByName(ProductDAO productDAO){
		String name = "Broom - Push";
		List<Product> theProducts = productDAO.findByName(name);

		for(Product p:theProducts){
			System.out.println(p);
		}
	}

}
