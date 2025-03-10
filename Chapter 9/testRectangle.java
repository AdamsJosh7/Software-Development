class testRectangle {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4,40);
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		
		double getArea;
		double getPerimeter;
		
		System.out.println("The Width of rectangle 1 is: ");
		System.out.println("The Height of rectangle 1 is: ");
		System.out.println("The Area of rectangle 1 is: ");
		System.out.println("The Perimeter of rectangle 1 is: ");
		System.out.println("The Width of rectangle 2 is: ");
		System.out.println("The Height of rectangle 2 is: ");
		System.out.println("The Area of rectangle 2 is: ");
		System.out.println("The Perimeter of rectangle 2 is: ");
		
	}
		double getArea(double w, double h) {
			return w * h;
		}
		double getPerimeter(double w, double h) {
			return (w * 2) + (h * 2);
		}
}
