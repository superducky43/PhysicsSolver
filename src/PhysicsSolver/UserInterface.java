package PhysicsSolver;

import java.util.Objects;
import java.util.Scanner;

public class UserInterface
{
    private int selectedEquation;
    private final Scanner scanner = new Scanner(System.in);

    private void typeOneInput(TypeOneEquation equation)
    {
        String currentInput;
        System.out.println("""
                Type in the values for the variables in the equation.
                If the variable is unknown, type "unknown".
                """);
        for (int i = 0; i < 4; i++)
        {
            switch (i)
            {
                case 0 ->
                {
                    System.out.println("Please input the value for v: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.v.isUnknown = true;
                    }
                    else
                    {
                        equation.v.value = Double.parseDouble(currentInput);
                    }
                }
                case 1 ->
                {
                    System.out.println("Please input the value for u: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.u.isUnknown = true;
                    }
                    else
                    {
                        equation.u.value = Double.parseDouble(currentInput);
                    }
                }
                case 2 ->
                {
                    System.out.println("Please input the value for a: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.a.isUnknown = true;
                    }
                    else
                    {
                        equation.a.value = Double.parseDouble(currentInput);
                    }
                }
                case 3 ->
                {
                    System.out.println("Please input the value for t: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.t.isUnknown = true;
                    }
                    else
                    {
                        equation.t.value = Double.parseDouble(currentInput);
                    }
                }
            }
        }
    }
    private void typeTwoInput(TypeTwoEquation equation)
    {
        String currentInput;
        System.out.println("""
                Type in the values for the variables in the equation.
                If the variable is unknown, type "unknown".
                """);
        for (int i = 0; i < 4; i++)
        {
            switch (i)
            {
                case 0 ->
                {
                    System.out.println("Please input the value for v: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.v.isUnknown = true;
                    }
                    else
                    {
                        equation.v.value = Double.parseDouble(currentInput);
                    }
                }
                case 1 ->
                {
                    System.out.println("Please input the value for u: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.u.isUnknown = true;
                    }
                    else
                    {
                        equation.u.value = Double.parseDouble(currentInput);
                    }
                }
                case 2 ->
                {
                    System.out.println("Please input the value for a: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.a.isUnknown = true;
                    }
                    else
                    {
                        equation.a.value = Double.parseDouble(currentInput);
                    }
                }
                case 3 ->
                {
                    System.out.println("Please input the value for s: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.s.isUnknown = true;
                    }
                    else
                    {
                        equation.s.value = Double.parseDouble(currentInput);
                    }
                }
            }
        }
    }
    private void typeThreeInput(TypeThreeEquation equation)
    {
        String currentInput;
        System.out.println("""
                Type in the values for the variables in the equation.
                If the variable is unknown, type "unknown".
                """);
        for (int i = 0; i < 4; i++)
        {
            switch (i)
            {
                case 0 ->
                {
                    System.out.println("Please input the value for u: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.u.isUnknown = true;
                    }
                    else
                    {
                        equation.u.value = Double.parseDouble(currentInput);
                    }
                }
                case 1 ->
                {
                    System.out.println("Please input the value for t: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.t.isUnknown = true;
                    }
                    else
                    {
                        equation.t.value = Double.parseDouble(currentInput);
                    }
                }
                case 2 ->
                {
                    System.out.println("Please input the value for a: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.a.isUnknown = true;
                    }
                    else
                    {
                        equation.a.value = Double.parseDouble(currentInput);
                    }
                }
                case 3 ->
                {
                    System.out.println("Please input the value for s: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.s.isUnknown = true;
                    }
                    else
                    {
                        equation.s.value = Double.parseDouble(currentInput);
                    }
                }
            }
        }
    }
    private void typeFourInput(TypeFourEquation equation)
    {
        String currentInput;
        System.out.println("""
                Type in the values for the variables in the equation.
                If the variable is unknown, type "unknown".
                """);
        for (int i = 0; i < 4; i++)
        {
            switch (i)
            {
                case 0 ->
                {
                    System.out.println("Please input the value for s: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.s.isUnknown = true;
                    }
                    else
                    {
                        equation.s.value = Double.parseDouble(currentInput);
                    }
                }
                case 1 ->
                {
                    System.out.println("Please input the value for u: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.u.isUnknown = true;
                    }
                    else
                    {
                        equation.u.value = Double.parseDouble(currentInput);
                    }
                }
                case 2 ->
                {
                    System.out.println("Please input the value for v: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.v.isUnknown = true;
                    }
                    else
                    {
                        equation.v.value = Double.parseDouble(currentInput);
                    }
                }
                case 3 ->
                {
                    System.out.println("Please input the value for t: ");
                    currentInput = scanner.next();
                    if (Objects.equals(currentInput, "unknown"))
                    {
                        equation.t.isUnknown = true;
                    }
                    else
                    {
                        equation.t.value = Double.parseDouble(currentInput);
                    }
                }
            }
        }
    }

    public void startInterface()
    {
        String INITIAL_TEXT = """
                Welcome to the solver of kinematic Equations!\s
                please select which equation you would like to use:
                            
                Equation 1: v = u + at
                Equation 2: v² = u² + 2as
                Equation 3: s = ut + 0.5at²
                Equation 4: s = (u + v)/2 * t
                            
                Type the number of the equation you would like to use:
                """;
        System.out.print(INITIAL_TEXT);
        selectedEquation = scanner.nextInt();

        if (selectedEquation == 1)
        {
            TypeOneEquation equation = new TypeOneEquation();
            typeOneInput(equation);
            equation.calculate();
            System.out.println(equation.toString());

        }
        else if (selectedEquation == 2)
        {
            TypeTwoEquation equation = new TypeTwoEquation();
            typeTwoInput(equation);
            equation.calculate();
            System.out.println(equation.toString());
        }
        else if (selectedEquation == 3)
        {
            TypeThreeEquation equation = new TypeThreeEquation();
            typeThreeInput(equation);
            equation.calculate();
            System.out.println(equation.toString());
        }
        else if (selectedEquation == 4)
        {
            TypeFourEquation equation = new TypeFourEquation();
            typeFourInput(equation);
            equation.calculate();
            System.out.println(equation.toString());
        }
    }

    public String getSelectedEquation()
    {
        if (selectedEquation == 1)
        {
            return KinematicEquation.TYPE_1;
        }
        else if (selectedEquation == 2)
        {
            return KinematicEquation.TYPE_2;
        }
        else if (selectedEquation == 3)
        {
            return KinematicEquation.TYPE_3;
        }
        else if (selectedEquation == 4)
        {
            return KinematicEquation.TYPE_4;
        }
        else
        {
            throw new RuntimeException("No Equation type provided.");
        }
    }
}
