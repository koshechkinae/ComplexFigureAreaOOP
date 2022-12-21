public class Square
{
    private float side;

    public Square(float side)
    {
        if (side <= 0) throwSideLengthMustBePositive();

        this.side = side;
    }

    private void throwSideLengthMustBePositive()
    {
        throw new IllegalArgumentException("Длина стороны квадрата должна быть больше 0!");
    }

    public float area()
    {
        return (float) Math.pow(side, 2);
    }
}
