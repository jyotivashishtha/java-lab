/* Q1. Create a class Car having properties manufacturer and price.
Create three instances of the class and display the details of each car sorted with respect to the price.
 */

class Car
{
    private float price;
    private String mfr;

    Car(float price,String mfr)
    {
        this.price=price;
        this.mfr=mfr;
    }

    static void sortDisplay(Car[] arr,int n) {
        Car temp;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].price > arr[j + 1].price) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        for (Car car : arr)
            System.out.println("Price = "+ car.price + " " +"Manufacturer = " + car.mfr);

    }
}

public class CarPrice
{
    public static void main(String[] args)
    {
        Car[] arr = new Car[3];

        arr[0] = new Car(78000,"Suzuki");
        arr[1] = new Car(67800,"Honda");
        arr[2] = new Car(89000,"Tata Motors");

        Car.sortDisplay(arr, arr.length);
    }

}
