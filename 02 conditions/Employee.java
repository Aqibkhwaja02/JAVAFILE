public class Employee
{
    String name;
    String gender;
    String role;
    double salary;
 
    public void calculateSalary(int leave)
    {
        if(leave > 1)
        {
            salary = salary - (salary/30);
        }
        System.out.println(salary);
    }
    public void getHike(double hikePercent)
    {
        salary = (salary * 12)*(hikePercent);
        System.out.println(salary);
    }
}


