public class Circle
{
    private float radius;

    public Circle(float radius)
    {
        if (radius <= 0) throwRadiusLengthMustBePositive();

        this.radius = radius;
    }

    private void throwRadiusLengthMustBePositive()
    {
        throw new IllegalArgumentException("Радиус круга должен быть больше 0!");
    }

    public float area()
    {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
}
