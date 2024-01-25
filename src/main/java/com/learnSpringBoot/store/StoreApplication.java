package com.learnSpringBoot.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(ProductDAO productDAO){
		return runner -> {
			//createProduct(productDAO);

			//readProduct(productDAO);

			//queryForStudents(productDAO);

			//findByName(productDAO);
			//update(productDAO);

			//updateName(productDAO);

			//deleteProductById(productDAO);

		};
	}*/

	/*private void deleteProductById(ProductDAO productDAO) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = scan.nextInt();
		Product tempProduct = productDAO.findById(id);
		productDAO.delete(id);
		System.out.println("Deleted");
	}

	private void updateName(ProductDAO productDAO) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = scan.nextInt();
		System.out.println("Enter name: ");
		String newName = scan.next();

		Product theProduct = productDAO.findById(id);
		theProduct.setName(newName);
		productDAO.updateName(theProduct);
		System.out.println("updated");

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

	private void update(ProductDAO productDAO){
		Product theProduct = productDAO.findById(11);
		theProduct.setName("Wise-original");
		productDAO.update(theProduct);
		System.out.println("update product: "+productDAO.findById(11));

	}*/

}
