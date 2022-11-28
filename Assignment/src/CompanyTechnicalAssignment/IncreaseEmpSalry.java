package CompanyTechnicalAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IncreaseEmpSalry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp=new ArrayList<Employee>();
		Employee  e1=new Employee(21,"Vinita",10000);
		Employee e2=new Employee(22, "Reshma", 12000);
		Employee e3=new Employee(26, "Reshma", 18000);
		Employee e4=new Employee(28, "Reshma", 19000);
		Employee e5=new Employee(24, "Reshma", 17000);
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.stream().map( e ->{
			
			if(e.getAge()>25)
			{
				e.setSalary(e.getSalary()*1.10);
			}
			return e;
			
		}).collect(Collectors.toList());
		
	
				
		

	}

}
