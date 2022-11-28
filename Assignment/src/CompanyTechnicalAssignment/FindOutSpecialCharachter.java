package CompanyTechnicalAssignment;

public class FindOutSpecialCharachter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Computer#@%";
		String specialcharacteremoved="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i))&& !Character.isLetter(s.charAt(i))&&!Character.isWhitespace(s.charAt(i)))

			{
				count++;
			}
			else
			{
				specialcharacteremoved=specialcharacteremoved+s.charAt(i);
		}
	}

		if(count==0)
		{
			System.out.println("There are no Special Characters in string ");
		}
		else
		{
			System.out.println("The Special Characters are"+count);
		}
		System.out.println("Special Characters Removed"+"   "+specialcharacteremoved);
}
}
