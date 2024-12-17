
public class TestRectangle {

	public static void main(String[] args) {

		Rectangle box1 = new Rectangle();
		box1.printBasicInfo();
		
		System.out.println("The area is "+ box1.findArea());
		System.out.println("The perimeter is "+ box1.findPerimeter());
		System.out.println("The diagonal is "+ box1.findDiagonal());
		
		if (box1.isSquare() == true)
			System.out.println("It is a square box.");
		else
			System.out.println("It is not a square box.");
		
		System.out.println();
		
		Rectangle box2 = new Rectangle(3,4);
		box2.printBasicInfo();
		
		System.out.println("The area is "+ box2.findArea());
		System.out.println("The perimeter is "+ box2.findPerimeter());
		System.out.println("The diagonal is "+ box2.findDiagonal());
		
		if (box2.isSquare() == true)
			System.out.println("It is a square box.");
		else
			System.out.println("It is not a square box.");
	}

}
