package W11;
import javax.swing.JOptionPane;

public class ShapeDemo3 {

	public static void main(String[] args) {
		int size = 5;
		int e;
		double[] radius = new double[size];
		double[] height = new double[size];
		double[] volume = new double[size];

		for (int i = 0; i < size; i++) {
			String data = JOptionPane.showInputDialog("Input radius and height " + (i + 1) + ": ");
			radius[i] = Double.parseDouble(data.split(" ")[0]);
			height[i] = Double.parseDouble(data.split(" ")[1]);
		}
		for (e = 0; e < size; e++) {
			Cylinder cylinder = new Cylinder(radius[e], height[e]);

			volume[e] = cylinder.getVolume();
		}

		//DISPLAY
		JOptionPane.showMessageDialog(null, "Cylinder 1 volume = "    + volume[0] +"\nCylinder 2 volume = " + volume[1]
				                            +"\nCylinder 3 volume = " + volume[2] +"\nCylinder 4 volume = " + volume[3]
											+"\nCylinder 5 volume = " + volume[4]);

	}
}
