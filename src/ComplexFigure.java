public class ComplexFigure
{
    private Square square;
    private Circle inscribedCircle;

    public ComplexFigure(float side)
    {
        this.square = new Square(side);
        this.inscribedCircle = new Circle(side / 2);
    }

    public float area(int squareQuarterParts, int circleParts, int squareQuarterWithoutCircleParts)
    {
        return squareQuarterParts * areaOfSquareQuarter() +
                circleParts * inscribedCircle.area() +
                squareQuarterWithoutCircleParts * areaOfSquareQuarterWithoutCircle();
    }

    private float areaOfSquareQuarter()
    {
        return square.area() / 4;
    }

    private float areaOfSquareQuarterWithoutCircle()
    {
        return (square.area() - inscribedCircle.area()) / 4;
    }
}