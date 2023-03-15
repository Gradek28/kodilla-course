import java.util.Scanner;

public class UserColour {
    public static String getUserColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select colour - type first letter (R-red , Y-yellow , B-blue , P-pink)");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "R":
                    return "red";
                case "Y":
                    return "yellow";
                case "B":
                    return "blue";
                case "P":
                    return "pink";
                default:
                    System.out.println("Wrong colour. Try again.");
            }
        }
    }

}
