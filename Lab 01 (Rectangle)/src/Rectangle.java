public class Rectangle {

	int width;
	int length;
	
	Rectangle(){
		width = 1;
		length = 1;
	}
	
	Rectangle(int x, int y){
		width = x;
		length = y;
	}
	
	double findArea() {
		return width*length; 
	}
	
	double findPerimeter() {
		return 2*(width+length);
	}
	
	double  findDiagonal() {
		return Math.sqrt((width*width)+(length*length));
	}
	
	boolean isSquare() {
		if (width == length)
			return true;
		else
			return false;
	}
	
	void printBasicInfo() {
		System.out.println("The width is " + width);
		System.out.println("The length is " + length);
	}
}

