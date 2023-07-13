

    public class EmployeeTest
    {
        public static void main(String[] args)
        {
             Employee employee1 = new Employee("Donald", "Trump", 2000);
             Employee employee2 = new Employee("James", "Bond", 10000);
          
             employee1.setFirstName("Timmy");
             employee1.setLastName("Anifowose");
             employee1.setMonthlySalary(3500);
             System.out.printf("%s %s annual salary is %.2f", employee1.getFirstName(), employee1.getLastName(), employee1.getAnnualSalary());

             // lets increase the monthly salary by 10%

            System.out.println();
 
            System.out.print("\nlets increase the monthly salary by 10%\n");
            System.out.println(); 
            
            employee1.increaseSalary();
            System.out.printf("%s %s new annual salary after 10 percent raise is %.2f", employee1.getFirstName(), employee1.getLastName(), employee1.getAnnualSalary()); 
        }
     } 