package Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Product> prodhashset = new LinkedHashSet<>();

		Product p1 = new Product("Laptop", 5000, "Dell");
		Product p2 = new Product("Tab", 6000, "Apple");
		Product p3 = new Product("Ac", 4000, "Crompton");
		Product p4 = new Product("Fan", 2000, "Amazon");
		Product p5 = new Product("Car", 3000, "Toyato");
		Product p6 = new Product("Jeep", 1000, "Linnen");
		Product p7 = new Product("Tablet", 7000, "Apple");
		Product p8 = new Product("Dryer", 8000, "Revlon");
		Product p9 = new Product("Watch", 500, "MK");
		Product p10 = new Product("Pouch", 50, "Guess");
		prodhashset.add(p1);
		prodhashset.add(p2);
		prodhashset.add(p3);
		prodhashset.add(p4);
		prodhashset.add(p5);
		prodhashset.add(p6);
		prodhashset.add(p7);
		prodhashset.add(p8);
		prodhashset.add(p9);
		prodhashset.add(p10);

		System.out.println("Product Application");
		System.out.print("*************");
		System.out.println(" MY PRODUCT APP");
		System.out.print("*************");
		for (Product p : prodhashset) {
			System.out.println(p);
		}

		while (true) {
			System.out.println("Product Application List");
			System.out.println("A.Display Product Name");
			System.out.println("B.Display Product Price");
			System.out.println("C.Display Product Brand");
			System.out.println("D.Enter a Valid Choice");
			System.out.println("E.Exit Option");
			System.out.println("Enter your Choice");
			System.out.println("Select an Option");
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			{
				switch (c) {
				case 'A':
					System.out.println("Display all the Product Name in Insertion Order");

					for (Product p : prodhashset) {
						System.out.println(p.pname);
					}
					break;
				case 'B':

					TreeSet<Product> prodtreeset = new TreeSet<>(prodhashset);

					for (Product p : prodtreeset) {
						System.out.println("After sorting : " + p.pprice);
					}

					// prodtreeset.add(p1);
					// prodtreeset.add(p2);
					// prodtreeset.add(p3);
					// prodtreeset.add(p4);
					// prodtreeset.add(p5);
					// prodtreeset.add(p6);
					// prodtreeset.add(p7);
					// prodtreeset.add(p8);
					// prodtreeset.add(p9);
					// prodtreeset.add(p10);

					// for (Product p:prodtreeset)
					// {
					// System.out.println(p.pprice);
					// }

					break;

				case 'C':
					System.out.println("Display all the Product Brands");

					for (Product p : prodhashset) {

						System.out.println(p.pbrand);
					}
					break;

				case 'D':
					System.out.println("Invalid Choice Please Enter Valid Choice");
					break;
				case 'E':
					System.exit(0);

				}

			}

		}
	}
}
