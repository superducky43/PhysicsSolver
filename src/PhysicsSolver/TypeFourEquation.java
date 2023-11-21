package PhysicsSolver;

public class TypeFourEquation implements KinematicEquation
{
    public Displacement s = new Displacement();
    public InitialVelocity u = new InitialVelocity();
    public FinalVelocity v = new FinalVelocity();
    public Time t = new Time();

    //s = (u + v)/2 * t , s = t(u + v)/2
    //u = (2s - tv)/t
    //v = (2s - tu)/t
    //t = 2s/(u + v)

    @Override
    public void calculate()
    {
        if (s.isUnknown)
        {
            s.value = ((u.value + v.value)/2) * t.value;
            System.out.println("s: " + s.value);
        }
        else if (u.isUnknown)
        {
            u.value = (2*s.value - t.value*v.value)/t.value;
            System.out.println("u: " + u.value);
        }
        else if (v.isUnknown)
        {
            v.value = (2*s.value - t.value*u.value)/t.value;
            System.out.println("v: " + v.value);
        }
        else if (t.isUnknown)
        {
            t.value = 2*s.value/(u.value + v.value);
            System.out.println("t: " + t.value);
        }
    }

    @Override
    public String toString()
    {
        return s.value + " = (" + u.value + " + " + v.value + ")/2 * " + t.value;
    }
}
