package kethua;
import java.util.Scanner; 
public class lab4KThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	public class Circle {
		public double radius;
		public String color;		
		public Circle(Double radius,String color){
			this.radius = radius;
			this.color = color;
		}
		public double getRadius(){
			return this.radius;
		}
		public void setRadius(double radius){
			this.radius = radius;
		}
		public String getcolor(){
			return this.color;
		}
		public void setColor(String color){
			this.color = color;
		}
		public double getArea(){
			return 3.14*this.radius*this.radius;
		}
		public String toString(){
			return this.radius +"/"+ this.color;
		}
	}
	public class Cylinder extends Circle{
		private double height;
		public Cylinder(){}
		public Cylinder(String color, double radius,double height) {
			 super(color, radius);
			 this.height=height;
		}
		public double getHeight() {
			 return height;
		}
		public void setHeight(double height) {
			 this.height = height;
		}
		public double getVolume() {
			 return this.getArea()*height;
		}
		public void inRadius() {
			 System.out.println("radius la:"+this.getRadius());
		}		
	}
	public class classmain {
		public static void main(String[] args) {
			 Cylinder c1=new Cylinder();
			 Scanner input=new Scanner(System.in);
			 System.out.println("nhap radius");
			 c1.setRadius(input.nextDouble());
			 System.out.println("nhap height");
			 c1.setHeight(input.nextDouble());
			 System.out.println("ket qua la: "+c1.getVolume());
			 c1.inRadius();
		}		
	}
	}
}
