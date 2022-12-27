public class ComplexFigure
{
    private Square square;
    private Circle inscribedCircle;

    public ComplexFigure(float side)
    {
        this.square = new Square(side);
        this.inscribedCircle = new Circle(side / 2);
    }

    public float getArea(int squareQuarterParts, int circleParts, int squareQuarterWithoutCircleParts)
    {
        return squareQuarterParts * getAreaOfSquareQuarter() +
                circleParts * inscribedCircle.getArea() +
                squareQuarterWithoutCircleParts * getAreaOfSquareQuarterWithoutCircle();
    }

    private float getAreaOfSquareQuarter()
    {
        return square.getArea() / 4;
    }

    private float getAreaOfSquareQuarterWithoutCircle()
    {
        return (square.getArea() - inscribedCircle.getArea()) / 4;
    }
}