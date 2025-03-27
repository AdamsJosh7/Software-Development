class testRectangle {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(4,40);
		Rectangle rectangle2 = new Rectangle(3.5,35.9);
		double rectangle1w = 4;
		double rectangle1h = 40;
		double rectangle1a = 160;
		double rectangle1p = 88;
		double rectangle2w = 3.5;
		double rectangle2h = 39.5;
		double rectangle2a = 138.25;
		double rectangle2p = 78.8;
		printrectangle(rectangle1w, rectangle1h, rectangle1a, rectangle1p, rectangle2w, rectangle2h, rectangle2a, rectangle2p);
	}
	
	public static void printrectangle(double rectangle1w, double rectangle1h, double rectangle1a, double rectangle1p, double rectangle2w, double rectangle2h, double rectangle2a, double rectangle2p) {
		double getArea;
		double getPerimeter;
		
		System.out.println("The Width of rectangle 1 is: " + rectangle1w);
		System.out.println("The Height of rectangle 1 is: " + rectangle1h);
		System.out.println("The Area of rectangle 1 is: " + rectangle1a);
		System.out.println("The Perimeter of rectangle 1 is: " + rectangle1p);
		
		double getArea2;
		double getPerimeter2;
		
		System.out.println("The Width of rectangle 2 is: " + rectangle2h);
		System.out.println("The Height of rectangle 2 is: " + rectangle2w);
		System.out.println("The Area of rectangle 2 is: " + rectangle2a);
		System.out.println("The Perimeter of rectangle 2 is: " + rectangle2p);
		
	}
}
