import java.util.Scanner;

public class SwitchDemo

{

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        String day = sc.next();

        final String val = "monday";

        switch(day)

        {

            case val:

                System.out.println("day 1");

            break;

            case "tuesday":

                System.out.println("day 2");

            break;

            default:

                System.out.println("incorrect day");

            break;

        }

    }

}
