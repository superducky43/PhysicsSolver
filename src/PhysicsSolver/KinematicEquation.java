package PhysicsSolver;

public interface KinematicEquation
{
    final static public String TYPE_1 = "TYPE_1";
    final static public String TYPE_2 = "TYPE_2";
    final static public String TYPE_3 = "TYPE_3";
    final static public String TYPE_4 = "TYPE_4";
    /*
    TYPES:
    type 1: v = u + at
    type 2: v² = u² + 2as
    type 3: s = ut + 0.5at²
    type 4: s = (u + v)/2 * t
     */

    public void calculate();
}
