import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        float side = readSquareSide();
        try
        {
            ComplexFigure complexFigure = new ComplexFigure(side);

            float areaOfPicture1 = complexFigure.areaOf(0,0,2);

            float areaOfPicture2 = complexFigure.areaOf(0,1,2);

            float areaOfPicture3 = complexFigure.areaOf(1,0,1);

            printAreaOfPicture("1", areaOfPicture1);
            printAreaOfPicture("2", areaOfPicture2);
            printAreaOfPicture("3", areaOfPicture3);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static float readSquareSide()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата:");

        return scan.nextFloat();
    }

    private static void printAreaOfPicture(String figureNumber, float areaOfPicture)
    {
        System.out.printf("Площадь фигуры %s = %.2f\n", figureNumber, areaOfPicture);
    }
}