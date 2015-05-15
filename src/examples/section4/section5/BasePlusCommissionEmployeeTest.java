package examples.section4.section5;

/**
 *
 * @author Mohamed Elsayed
 */
public class BasePlusCommissionEmployeeTest 
{
    public static void main( String[] args )
    {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
                "Sami", "Yusuf", "222-22-2222", 10000, 0.05, 300 );
        
        System.out.println( "Employee information obtained by get methods:\n" );
        System.out.printf( "%s %s\n", 
                "First name is", employee.getFirstName() );
        System.out.printf( "%s %s\n",
                "Last name is", employee.getLastName() );
        System.out.printf( "%s %s\n",
                "Social security number is", 
                employee.getSocialSecurityNumber() );
        System.out.printf( "%s %.2f\n",
                "Gross sales is", employee.getGrossSales() );
        System.out.printf( "%s %.2f\n",
                "Commssion rate is", employee.getCommissionRate() );
        System.out.printf( "%s %.2f\n",
                "Base salary is", employee.getBaseSalary() );
        
        employee.setBaseSalary( 1000 );
        
        System.out.println( 
                "\nUpdated employee information obtained by toString: \n" );
        System.out.println( employee );
    }
}
