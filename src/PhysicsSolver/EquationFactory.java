package PhysicsSolver;

public abstract class EquationFactory
{
    public KinematicEquation createKinematicEquation(String equationType)
    {

        if (equationType == null)
        {
            return null;
        }
        if (equationType.equalsIgnoreCase(KinematicEquation.TYPE_1))
        {
            return new TypeOneEquation();
        }
        else if (equationType.equalsIgnoreCase(KinematicEquation.TYPE_2))
        {
            return new TypeTwoEquation();
        }
        else if (equationType.equalsIgnoreCase(KinematicEquation.TYPE_3))
        {
            return new TypeThreeEquation();
        }
        else if (equationType.equalsIgnoreCase(KinematicEquation.TYPE_4))
        {
            return new TypeFourEquation();
        }
        return null;
    }
}
