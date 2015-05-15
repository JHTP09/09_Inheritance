package examples.section4.section4;

/**
 *
 * @author Mohamed Elsayed
 */
public class BasePlusCommissionEmployee extends CommissionEmployee 
{
    private double baseSalary;      // base salary per week
    
    public BasePlusCommissionEmployee( String first, String last, String ssn,
            double sales, double rate, double salary )
    {
        super( first, last, ssn, sales, rate );
        
        setBaseSalary( salary );
    }
    
    public void setBaseSalary( double salary )
    {
        if ( salary >= 0 )
            baseSalary = salary;
        else
            throw new IllegalArgumentException( "Base salary must be >= 0" );
    }
    
    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    public double earnings()
    {
        return baseSalary + ( commissionRate * grossSales );
    }
    
    @Override
    public String toString()
    {
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
                "base-salaried commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate,
                "base salary", baseSalary );
    }
}
