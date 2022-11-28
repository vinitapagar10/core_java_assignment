package Set;

public class Product implements Comparable<Product> {
	String pname;
	int pprice;
	String pbrand;

	public Product(String pname, int pprice, String pbrand) {
		super();
		this.pname = pname;
		this.pprice = pprice;
		this.pbrand = pbrand;
	}

	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pprice=" + pprice + ", pbrand=" + pbrand + "]";
	}

	@Override
	public int compareTo(Product o) 
	{
		// TODO Auto-generated method stub
		if(this.pprice>o.pprice)
		{
			return 1;
		}
		else if(this.pprice==o.pprice)
		{
			return 0;
		}
		else 
			return -1;
		
	}

	
	
	
	
}
	
