package examples.section4.section4;

/**
 *
 * @author Mohamed Elsayed
 */
public class CommissionEmployee 
{
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double grossSales;      // gross weekly sales
    protected double commissionRate;  // commission percentage
    
    public CommissionEmployee( String first, String last, String ssn,
            double sales, double rate )
    {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales( sales );
        setCommissionRate( rate );
    }
    
    public void setFirstName( String first )
    {
        firstName = first;  // should validate
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setLastName( String last )
    {
        lastName = last;    // should validate
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setSocialSecurityNumber( String ssn )
    {
        socialSecurityNumber = ssn; //should validate
    }
    
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    
    public void setGrossSales( double sales )
    {
        if ( sales >= 0.0 )
            grossSales = sales;
        else
            throw new IllegalArgumentException( 
            "Gross sales must be >= 0" );
    }
    
    public double getGrossSales()
    {
        return grossSales;
    }
    
    public void setCommissionRate( double rate )
    {
        if ( rate > 0.0 && rate < 1.0 )
            commissionRate = rate;
        else
            throw new IllegalArgumentException( 
            "Commision rate must be > 0.0 and < 1.0" );
    }
    
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    public double earnings()
    {
        return commissionRate * grossSales;
    }
    
    @Override
    public String toString()
    {
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate );
    }
}
