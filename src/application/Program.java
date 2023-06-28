package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;
import service.MyComparator;

public class Program {

	public static void main(String[] args) {

		List<Product> lista = new ArrayList<>();

		lista.add(new Product("tv", 900.00));
		lista.add(new Product("notebook", 900.00));
		lista.add(new Product("tablet", 900.00));
		// implementando expressao lambda :

		Comparator<Product> comp = (p1, p2) -> {

			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

		};
		lista.sort(comp);

		for (Product p : lista) {
			System.out.println(p);
		}

	}

}
