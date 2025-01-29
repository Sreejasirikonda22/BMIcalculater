
import java.util.Scanner;
public class BMIcalculater {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        String category = determineBMICategory(bmi);

        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        System.out.println("Your BMI category is: " + category);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String determineBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else {
            switch ((int) bmi) {
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    return "Normal weight";
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    return "Overweight";
                default:
                    return "Obese";
            }
        }
    }
}