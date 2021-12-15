class Rectangle
{
    private final int l,b;

    Rectangle(int l, int b)
    {
        this.l=l;
        this.b=b;
    }

    public int getArea()
    {
        return l*b;
    }
}
public class Area {
    public static void main(String[] args) {
        System.out.println("Rectangle_1 Area: " + new Rectangle(4,5).getArea());
        System.out.println("Rectangle_2 Area: " + new  Rectangle(5,8).getArea());
    }
}
