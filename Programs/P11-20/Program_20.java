import java.util.Scanner;
import java.lang.Math;

public class test{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
   
        System.out.println("Enter coefficient numbers: ");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
        
        float root = ((b * b) - (4 * a * c));
		if (root < 0)
		{
			System.out.println("Imaginary roots");
		}

		else
		{
			double root1 = Math.sqrt(root);
			root1 = - b + root1;
			root1 = root1 / (2f * a);

			double root2 = Math.sqrt(root);
			root2 = - b - root2;
			root2 = root2 / (2f * a);

			System.out.println("Root1: " + root1);
			System.out.println("Root2: " + root2);

		}
	}
}
