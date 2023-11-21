package PhysicsSolver;

public class TypeThreeEquation implements KinematicEquation
{
    public Displacement s = new Displacement();
    public InitialVelocity u = new InitialVelocity();
    public Time t = new Time();
    public Acceleration a = new Acceleration();

    //0.5at² + ut - s = 0

    //s = ut + 0.5at²
    //u = (s - 0.5at²)/t
    //t = (-ut + ((ut)² - 4*0.5*a*t*(-s))^0.5)/2*0.5*a*t²
    //a = (s - ut)/0.5t²
    @Override
    public void calculate()
    {
        if (s.isUnknown)
        {
            s.value = u.value*t.value + 0.5*a.value*Math.pow(t.value, 2);
            System.out.println("s: " + s.value);
        }
        else if (u.isUnknown)
        {
            u.value = (s.value - 0.5*a.value*Math.pow(t.value, 2)) / t.value;
            System.out.println("u: " + u.value);
        }
        else if (t.isUnknown)
        {
            double root1;
            double root2;

            root1 = (-u.value + Math.pow((Math.pow(u.value,2) - 4*0.5*a.value*s.value),0.5)) / 2*0.5*a.value*Math.pow(t.value,2);
            root2 = (-u.value - Math.pow((Math.pow(u.value,2) - 4*0.5*a.value*s.value),0.5)) / 2*0.5*a.value*Math.pow(t.value,2);

            t.value = root1;
            System.out.println("t: " + t.value + "(or " + root2 + ")");
        }
        else if (a.isUnknown)
        {
            a.value = (s.value - u.value*t.value)/(0.5 * Math.pow(t.value,2));
            System.out.println("a: " + a.value);
        }
    }

    @Override
    public String toString()
    {
        return s.value + " = " + "(" + u.value + ")(" + t.value + ") + 0.5" + "(" + a.value + ")(" + t.value + "²)";
    }
}
