
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        EligibilityCheck obj = new EligibilityCheck();

        System.out.println("\n Enter your name : ");
        String name = s.next();

        System.out.println("\n Enter your Mathematics marks : ");
        int maths = s.nextInt();

        System.out.println("\n Enter your Physics marks : ");
        int phy = s.nextInt();

        System.out.println("\n Enter your Chemistry marks : ");
        int chem = s.nextInt();

        System.out.println("\n Welcome to Course Eligibility Test");
        obj.getName(name);
        obj.getMarks(maths, phy, chem);

        int total = obj.getTotal(maths, phy, chem);

        obj.eligible(maths, phy, chem, total );
    }
}
