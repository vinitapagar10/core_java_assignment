import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpApplication 
{
	
     public static void main(String[] args) 
     {
	List<EmpDemo> emplst=new ArrayList<>();
	emplst.add(new EmpDemo(3,"Vinita",4000));
	emplst.add(new EmpDemo(1,"Vihan",5000));
	emplst.add(new EmpDemo(4,"Reshma",3000));
	Collections.sort(emplst, new EmpIdSorting());
	/*
	 * for(EmpDemo e :emplst) { System.out.println("Employee Id Sorting "+e.empid);
	 * }
	 */
	
		Collections.sort(emplst,Comparator.comparing(EmpDemo::getEmpid).thenComparing(EmpDemo::getEname).
			thenComparing(EmpDemo::getSalary));
		System.out.println("Employee Application After Sorting");
		for(EmpDemo e:emplst)
		{
			
			System.out.println(e.empid+" " +e.ename+" "+e.salary);
			
		}
}
}
