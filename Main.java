
public class Main {
	public static void main(String[]args) {
		Rectangle obj1 = new Rectangle(); //Default Constructor.
		Rectangle obj2 = new Rectangle(12.3,6.7,"Yellow"); // Constructor Overloading 
		
		//obj1.setWidth(-22); // Use setWidth() because width have access modifier is private.
		//obj1.setHeight(0);
		//String color = obj1.color = "Blue";
		
		//obj2.setWidth(11.5);
		//obj2.setHeight(22.4);
		//obj2.setSize(13.3, 6.8);
		//double area = obj2.conpuArea();
		
		//System.out.println("====="+obj2.color+" Rectangle"+"=====");
		//System.out.println("Width : "+obj2.getWidth()); // Use getter() or getWidth() then used setter().
		//System.out.println("Height: "+obj2.getHeight());
		//System.out.println("area  : "+String.format("%.2f",area));
		
		obj2.displayDetail();
	}
}
