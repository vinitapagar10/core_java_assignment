import java.util.Comparator;

public class EmpNameSorting implements Comparator<EmpDemo>{

	@Override
	public int compare(EmpDemo o1, EmpDemo o2) {
		// TODO Auto-generated method stub
		return o1.ename.compareTo(o2.ename);
	}
	
	

}
