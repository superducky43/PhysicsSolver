package PhysicsSolver;

public class TypeOneEquation implements KinematicEquation
{
    public FinalVelocity v = new FinalVelocity();
    public InitialVelocity u = new InitialVelocity();
    public Acceleration a = new Acceleration();
    public Time t = new Time();

    //v = u + at     case v unknown
    //u = v - at     case u unknown
    //a = (v - u)/t  case a unknown
    //t = (v - u)/a  case t unknown

    @Override
    public void calculate()
    {
        if (v.isUnknown)
        {
            v.value = u.value + a.value*t.value;
            System.out.println("v: " + v.value);
        }
        else if (u.isUnknown)
        {
            u.value = v.value - a.value*t.value;
            System.out.println("u: " + u.value);
        }
        else if (a.isUnknown)
        {
            a.value = (v.value - u.value)/t.value;
            System.out.println("a: " + a.value);
        }
        else if (t.isUnknown)
        {
            t.value = (v.value - u.value)/a.value;
            System.out.println("t: " + t.value);
        }
    }

    @Override
    public String toString()
    {
        return v.value + " = " + u.value + " + " + "(" + a.value + ")" + "(" + t.value + ").";
    }
}