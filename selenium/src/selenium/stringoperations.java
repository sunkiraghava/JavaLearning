package selenium;

public class stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="raghav is a good boy";
		String[] splittedstring = s.split("is");
		System.out.println(splittedstring[1].trim());
for (int i =s.length()-1; i>=0; i--)
{
	System.out.println(s.charAt(i));
	}
}
}