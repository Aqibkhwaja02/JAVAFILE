

import java.util.Scanner;

public class Prime

{

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
 
        /* for(int i=0;i<=n;i++)

        {

            System.out.println(i);

        } */

        int count = 0;

        for(int i=2; i<n; i++)

        {

            if(n%i == 0)

            {

                count++;

                //System.out.println(i);

            }

        }

        if(count == 0)

            System.out.println("prime");

        else

            System.out.println("not prime");   

    }

}

