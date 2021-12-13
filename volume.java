class Box
{
    private final float l,w,h;

    Box(float l,float w,float h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }

    public float getBoxVolume()
    {
        return l*w*h;
    }
}


public class Volume {
    public static void main(String[] args) {
        System.out.println(new Box(2.5f,1.5f,2.0f).getBoxVolume());
    }
}
