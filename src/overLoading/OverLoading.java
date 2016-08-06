package overLoading;

public class OverLoading {

	
		//Signature: No. of arguments, Type(dataType) of arguments, Order of arguments 
		//This is known as method overLoading & compileTime binding or earlyBinding

	public static void main(String[] args) 
			{
				OverLoading obj1 = new OverLoading();
				
				obj1.Add(12, 15);
				obj1.Add(15, 25, 35);
				obj1.Add(25.30, 18.56);
				obj1.Add(1224.32, 15);
				obj1.Add(12, 1234.78);
			}
				public void Add(int a, int b)
				{
					int c = a+b;
					System.out.println("Sum of two numbers is: "+c);
				}
				
				public void Add(int a, int b, int d)
				{
					int c = a+b+d;
					System.out.println("Sum of three numbers is: "+c);
				}
				
				public void Add(double a, double b)
				{
					double c = a+b;
					System.out.println("Sum of two numbers is: "+c);
				}
				
				public void Add(int a, double b)
				{
					double sum = a+b;
					System.out.println("Sum of two numbers is: "+sum);
				}
				
				public void Add(double a, int b)
				{
					double sum = a+b;
					System.out.println("Sum of two numbers is: "+sum);
				}
		}

	

