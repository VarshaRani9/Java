class Shape{
	void dimension() {
		System.out.println("Dimension is 2D");
	}
}
class Circle extends Shape{
    void area(int r) {
		System.out.println("Area of Circle : "+Math.PI*r*r);
	}
	void perimeter(int r) {
		System.out.println("Perimeter of Circle : "+2*Math.PI*r);
	}
}
class Square extends Shape{
    void area(int l) {
    	System.out.println("Area of Square : "+l*l);
	}
	void perimeter(int l) {
		System.out.println("Perimeter of Square : "+4*l);
	}
}
class Rectangle extends  Shape{
	void area(int l, int b) {
    	System.out.println("Area of Rectangle : "+l*b);
	}
	void perimeter(int l, int b) {
		System.out.println("Perimeter of Rectangle : "+2*(l+b));
	}
}
class Cone extends  Shape{
	@Override
	void dimension() {
		System.out.println("Dimension is 3D");
	}
    void curvedSurfaceArea(int l) {
    	System.out.println("Curved Surface Area of Cone : "+Math.PI*l);
	}
    void totalSurfaceArea(int l, int r) {
    	System.out.println("Total Surface Area of Cone : "+Math.PI*r*(l+r));
	}
	void volume(int r, int h) {
		System.out.println("Volume of Cone : "+(Math.PI*r*r*h)/3);
	}
}

class Caller{
	void callShape(Shape shape) {
		shape.dimension();
		if(shape instanceof Circle) {
			((Circle)shape).area(7);
			((Circle)shape).perimeter(7);
		}
		else if(shape instanceof Square) {
			((Square)shape).area(7);
			((Square)shape).perimeter(7);
		}
		else if(shape instanceof Rectangle) {
			((Rectangle)shape).area(7,6);
			((Rectangle)shape).perimeter(7,6);
     }
		else if(shape instanceof Cone) {
			((Cone)shape).totalSurfaceArea(7,4);
			((Cone)shape).curvedSurfaceArea(7);
			((Cone)shape).volume(7,3);
     }
	}
}

public class DrawingAppln {

	public static void main(String[] args) {
		Caller obj = new Caller();
		obj.callShape(new Circle());
		obj.callShape(new Square());
		obj.callShape(new Rectangle());
		obj.callShape(new Cone());
	}
}
