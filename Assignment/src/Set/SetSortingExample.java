package Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class SetSortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Product> phashset=new LinkedHashSet<>();
		System.out.println("Product Application");
		System.out.print("*************");
		System.out.println(" MY PRODUCT APP");
		for (int i=1;i<=10;i++) 
		{
			
			phashset.add(new  Product("Laptop"+i,100+i,"Dell"+i));
			phashset.add(new Product("AC"+i,50+i,"Crompton"+i));
		}
		for (Product p:phashset) 
		{
			System.out.println(p);
		}
		
		System.out.println("Product Application");
		System.out.print("*************");
		System.out.println(" MY PRODUCT APP");
		
		while(true)
		{
		System.out.println("Product Application List");
		System.out.println("A.Display Product Name");
		System.out.println("B.Display Product Price");
		System.out.println("C.Display Product Brand");
		System.out.println("D.Enter a Valid Choice");
		System.out.println("E.Exit Option");
		System.out.println("Enter your Choice");
		System.out.println("Select an Option");
		Scanner sc = new Scanner(System.in);
		char  c = sc.next().charAt(0);
		{
		switch(c)
		{
		case 'A':
				System.out.println("Display all the Product Name in Insertion Order");
		
				
				for (Product p:phashset) 
				{
					System.out.println(p.pname);
				}
				break;
		case 'B':
					
			
			TreeSet<Product> prodtreeset=new TreeSet<>(phashset);
				
				for (Product p:prodtreeset)
				{
					System.out.println("After sorting : "+p.pprice);
				}
				
				break;
			
case 'C': 
			 System.out.println("Display all the Product Brands");
			 
			 for (Product p:phashset)
			 {
			 
			  System.out.println(p.pbrand);
			  }
			 break;
			 
case 'D':
			System.out.println("Invalid Choice Please Enter Valid Choice");
			break;
case 'E': System.exit(0);		

}


}
}
}
}