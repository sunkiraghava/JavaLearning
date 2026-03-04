package selenium;

public class ifelseexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,4,5,6,7,8,9,66};
		for(int i : arr2)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
			
			}
			else
			{
				System.out.println(arr2[i] +"not even number");
			}
		}
			
			

	}

}
