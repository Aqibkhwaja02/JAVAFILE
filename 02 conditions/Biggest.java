

public class Biggest 
{

public static void main(String[] hexa)
{
    int a = Integer.parseInt(hexa[0]);
    int b = Integer.parseInt(hexa[1]);
    int c = Integer.parseInt(hexa[2]);
if (a>b && a>c)
{
    System.out.println("a is big");

}
else if(b>c && b>a)
System.out.println("b is big");
else 
System.out.println("c is big");


}
}
