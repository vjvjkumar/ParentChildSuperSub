package overLoading;

public class runOverLoading {

	public static void main(String[] args) {
		
		OverLoading obj1 = new OverLoading();
		
		obj1.Add(12, 15);
		obj1.Add(15, 25, 35);
		obj1.Add(25.30, 18.56);
		obj1.Add(1224.32, 15);
		obj1.Add(12, 1234.78);

	}

}
