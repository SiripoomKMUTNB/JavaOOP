 public class Box extends Rectangle {
	 //Property
	 private double depth;
	 
	 // Default Constructor
	 public Box() {
		 super(); // Call deault constructor of superblass
		 this.depth = 1.0;
	 }
	 
	 public Box(double width,double height,double depth) {
		 super(width,height);
		 super.color = "Green";
		 this.depth = depth;
	 }
	 
	 public Box(double width,double height,double depth,String color) {
		 super(width,height);
		 super.color = color;
		 this.depth = depth;
	 }
	 
	 public void setDepth(double d) {
		 this.depth = (d<0) ? d*-1 : (d==0) ? 1 : d;	
	 }
	 
	 public double getDepth() {
		 return this.depth;
		 }
	 
	 public void setSize(double width,double height,double depth){
		 super.setSize(width, height);
		 this.setDepth(depth);
	 }
	 
	 public double coumputeVolume() {
		 return super.conpuArea()*this.depth;
	 }
	 
	 
	 public void displayDetail() { 
		System.out.println("====="+this.color+" Box"+"=====");
		System.out.println("Width : "+super.getWidth()); // Use getter() or getWidth() then used setter().
		System.out.println("Height: "+super.getHeight());
		System.out.println("Depth : "+this.getDepth());
		System.out.println("Volume: "+String.format("%.2f",this.coumputeVolume()));
		System.out.println("====================");
	 }
	}
	 
