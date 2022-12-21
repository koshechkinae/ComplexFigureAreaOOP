public class ComplexFigure
{
    private Square square;
    private Circle inscribedCircle;

    public ComplexFigure(float side)
    {
        this.square = new Square(side);
        this.inscribedCircle = new Circle(side / 2);
    }

    public float areaOf(int squareQuarterParts, int circleParts, int squareQuarterWithoutCircleParts)
    {
        return squareQuarterParts * (square.area() / 4) +
                circleParts * inscribedCircle.area() +
                squareQuarterWithoutCircleParts * ((square.area() - inscribedCircle.area()) / 4);
    }
}