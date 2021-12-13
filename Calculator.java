class Power
{
    static int power(int num1, int num2)
    {
        return (int) Math.pow(num1,num2);
    }

    static  double power(double num1,int num2)
    {
        return Math.pow(num1,num2);
    }
}


public class Calculator {
    public static void main(String[] args) {
        int value;
        double value1;

        value = Power.power(2,2);
        value1 = Power.power(2.3,5);

        System.out.println("Value: " + value);
        System.out.println("Value1: " + value1);

    }
}
