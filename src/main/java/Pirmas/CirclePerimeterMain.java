package Pirmas;


import java.text.DecimalFormat;
import java.util.Scanner;

//Write an application that will read diameter of a circle (variable of type float
//   and calculate perimeter of given circle. Firstly, assume π = 3.14.
//   Later, use value of π from built-in Math class.
// It is calculated using the formula Pi x diameter
public class CirclePerimeterMain {
    public static void main(String[] args) {


        float circleDiameter = circleDiameterInput();

        calculateCirclePerimeter(circleDiameter);

    }

    private static void calculateCirclePerimeter(float circleDiameter) {
        DecimalFormat df = new DecimalFormat("#.##");
        double circlePerimeter1 = Math.PI * circleDiameter;
        System.out.println("circle perimeter is " + df.format(circlePerimeter1));
    }

    private static float circleDiameterInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please input circle diameter in cm: ");
        float circleDiameter = scanner.nextFloat();
        return circleDiameter;
    }

}
