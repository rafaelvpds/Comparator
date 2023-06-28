package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> lista = new ArrayList<>();

		lista.add(new Product("tv", 900.00));
		lista.add(new Product("notebook", 900.00));
		lista.add(new Product("tablet", 900.00));

		Collections.sort(lista);

		for (Product p : lista) {
			System.out.println(p);
		}

	}

}
