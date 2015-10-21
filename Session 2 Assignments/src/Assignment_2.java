
public class Assignment_2 {

	public static void main(String[] args) {
		int a = 1, b = 0;
		
		System.out.print("The prime numbers between 1 and 100");
		System.out.println("\n");
		
		while (a <= 100)
		{
		
			int c = 1;
			
				while (c <= 100)
			
				{
					
				 if (a % c == 0)
					
				 	{
						b++;
						c++;
					}
				
				 else 
					 	c++;
				
				}
				
				if (b == 2)
					System.out.println(a);
						b = 0;
						a++;			
		}
	}

}
