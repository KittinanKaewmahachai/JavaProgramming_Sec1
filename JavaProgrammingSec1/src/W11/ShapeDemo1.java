package W11;
import java.util.*;

public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input height :");
		double height = scan.nextDouble();
		
		Circle cr = new Circle(radius,null);
		System.out.println("Circle["+ cr +"]");
		System.out.println("Circle[area = "+cr.getArea()+"]");
		System.out.println();
		
		Cylinder cy = new Cylinder(radius,height);
		System.out.println("Cylinder["+ cy +"]");
		System.out.println("Cylinder[area = "+ cy.getArea() +"]");
		System.out.println("Cylinder[volume = "+ cy.getVolume() +"]");
		
		
		
	}

}
