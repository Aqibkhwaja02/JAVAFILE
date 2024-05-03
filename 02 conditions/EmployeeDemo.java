public class EmployeeDemo
{
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.name = "Sanjay";
        obj.gender = "male";
        obj.role = "manager";
        obj.salary = 150000;
 
        obj.calculateSalary(3);
        obj.getHike(1.06);
 
        Employee obj2 = new Employee();
        obj2.name = "Manoj";
        obj2.gender = "male";
        obj2.role = "deputy manager";
        obj2.salary = 90000;
 
        obj2.calculateSalary(3);
        obj2.getHike(1.06);
    }
}
