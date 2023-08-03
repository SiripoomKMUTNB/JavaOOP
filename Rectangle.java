// Mr.Siripoom Arthornsirirat
// ID:6602041510084
import java.lang.Math;
public class Rectangle {
	// Property
	private double width;
	private double height;
	String color;
	// Constructor is same name as a class
	// Default Constructor
	public Rectangle() {
		this.width = 1.0;
		this.height = 1.0;
		this.color = "Green";
	}
	// Constructor Overloading
	public Rectangle(double width,double height) {
		//this.setWidth(width); 
 		//this.setHeight(height);
 		this.setSize(width, height);
 		this.color = "Green";
	}
	public Rectangle(double width,double height,String color){
		//this.setWidth(width); 
 		//this.setHeight(height);
 		this.setSize(width, height);
 		this.color=color;
	}
	
	// Methods
	public double conpuArea() {
		double area = this.width*this.height;
		return area;
	}
	// setter() no return : with argument
	void setWidth(double width) { // Use .setter() then have access modifier(private) variable
 		if (width == 0){
 			this.height = 1.0;
 		}else if(width<0) {
 			width = Math.abs(width);
 			// Optional width *= -1;
 			this.width = width;
 		}else {
 			this.width = width;	
 		}	
	}
	void setHeight(double height) {
		if (height == 0){
			this.height=1.0;
 		}else if(height<0) {
 			height = Math.abs(height);
 			this.height = height;
 		}else {
 			this.height = height;	
 		}	
	}
	
	public void setSize(double width,double height){
		this.setWidth(width); // Call setWidth() for send value to process.
 		this.setHeight(height); // Call setHeight() for send value to process.
	}
	
	// getter() return : no argument
	double getWidth() { // Use .getter() then have access modifier(private) variable
		return  this.width;
	}
	double getHeight() {
		return  this.height;
	}
	
	public void displayDetail(){
		System.out.println("====="+this.color+" Rectangle"+"=====");
		System.out.println("Width : "+this.getWidth()); // Use getter() or getWidth() then used setter().
		System.out.println("Height: "+this.getHeight());
		System.out.println("area  : "+String.format("%.2f",this.conpuArea()));
		System.out.println("==========================");
	}
}
