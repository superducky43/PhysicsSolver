package PhysicsSolver;

import java.beans.ConstructorProperties;

public class TypeTwoEquation implements KinematicEquation
{
    public FinalVelocity v = new FinalVelocity();
    public InitialVelocity u = new InitialVelocity();
    public Acceleration a = new Acceleration();
    public Displacement s = new Displacement();

    //v² = u² + 2as
    //v = (u² + 2as)^0.5
    //u = (v² - 2as)^0.5
    //a = (v² - u²)/(2*s)
    //s = (v² - u²)/(2a)

    @Override
    public void calculate()
    {
        if (v.isUnknown)
        {
            v.value = Math.pow((Math.pow(u.value, 2) + 2*a.value*s.value),0.5);
            System.out.println("v: " + v.value);
        }
        else if (u.isUnknown)
        {
            u.value = Math.pow(Math.pow(v.value, 2) - 2*a.value*s.value , 0.5);
            System.out.println("u: " + u.value);
        }
        else if (a.isUnknown)
        {
            a.value = (Math.pow(v.value, 2) - Math.pow(u.value, 2)) / (2*s.value);
            System.out.println("a: " + a.value);
        }
        else if (s.isUnknown)
        {
            s.value = (Math.pow(v.value, 2) - Math.pow(u.value, 2)) / (2*a.value);
            System.out.println("s: " + s.value);
        }
    }

    @Override
    public String toString()
    {
        return v.value + "² = " + u.value + "² + " + "2(" + a.value + ")" + "(" + s.value + ")";
    }
}
