import java.util.Scanner;

/**
 * Getting user input to calculate the volume of a sphere.
 *
 * @author Jessah
 * @version 1.0
 * @since 2024-02-15
 */
final public class VolSphere {

  // Declare variables
  static float UserNum;

  public static void main(final String[] args) { // Calculator

    // Get user input
    System.out.print("Sphere Volume Calculator, Enter a radius: ");
    final Scanner input = new Scanner(System.in);
    final float UserNum = input.nextFloat();


    // use if else statements to check if user can vote
    if (UserNum >= 1) {
      // Output for right value.
      final double SphVol = (4d / 3d) * (Math.PI) * (Math.pow(UserNum, 3));
      System.out.print("The volume of a circle with the radius of ");
      System.out.print(UserNum + " is ");
      System.out.format("%.3f", SphVol);
      System.out.println();

    } else {
      // Output for incorrect value.
      System.out.println(UserNum + " is invalid");
      System.out.println("because it cannot be zero or negative.");
    }
    input.close();
  }
}
