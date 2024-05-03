import java.util.Scanner;
public class AtmDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
 
        if(cash % 100 == 0)
        {
            if(cash >= 500)//1200
            {
                int no = cash / 500;
                cash = cash - no*500;
                System.out.println(no+" * 500 ="+(no*500));
            }
            if(cash >= 200)
            {
                int no = cash / 200;
                cash = cash - no*200;
                System.out.println(no+" * 200 ="+(no*200));
            }
            if(cash >= 100)
            {
                int no = cash / 100;
                cash = cash - no*100;
                System.out.println(no+" * 100 ="+(no*100));
            }
        }
        else
        {
            System.out.println("enter cash / by 100");
        }
    }
}

