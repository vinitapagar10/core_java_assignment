import java.util.Comparator;

public class EmpSalSorting implements Comparator<EmpDemo>{

	@Override
	public int compare(EmpDemo o1, EmpDemo o2) {
		// TODO Auto-generated method stub
	
		
		
		if(o1.salary>o2.salary)
		{
			return 1;
		}
		else if(o1.empid==o2.empid)
		{
			return 0;
		}
		
		return -1;
	}
	

}
