import java.util.Scanner;

/**
 * Getting user input to calculate the volume of a sphere.
 *
 * @author Jessah
 * @version 1.0
 * @since 2024-02-15
 */
public final class VolSphere {

  private VolSphere() {
    // whitespace
  }

  /**
   * Print message.
   *
   * @param args Command-line arguments (not used in program).
   */

  // Declare variables
  static float UserNum;

  public static void main(final String[] args) {
    // Get user input
    Scanner input = new Scanner(System.in);
    System.out.println("Sphere Volume Calculator, Enter a radius:");
    UserNum = input.nextFloat();

    // use if else statements to check if user can vote
    if (UserNum >= 1) {
      // Output for right value.
      final double Volume = (4d / 3d) * (Math.PI) * (Math.pow(UserNum, 3));
      System.out.println("The volume of a circle with the radius of");
      System.out.format(UserNum + " is " + "%.3f", Volume + "cm");

    } else {
      // Output for incorrect value.
      System.out.println(UserNum + " is invalid");
      System.out.println("because it cannot be zero or negative.");
    }
    input.close();
  }
}
