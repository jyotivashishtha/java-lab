class Students
{
    private int age;
    private String name,address;

    Students()
    {
        age=0;
        name="unknown";
        address="not available";
    }

    public void setInfo(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public void setInfo(String name, int age ,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public void getInfo()
    {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address: "+ address);
    }

}

public class StudentInfo {
    public static void main(String[] args) {
        Students[] s= new Students[10];
           for(int i=0;i<10;i++)
               s[i] = new Students();
            s[0].setInfo("Ram",12);
            s[1].setInfo("Rahu",13);
            s[2].setInfo("Shyam",13,"SkyIsland");
            s[3].setInfo("Modi",15,"Chintupur");
            s[4].setInfo("Sarthak",15);
            s[5].setInfo("Raj",16,"Ramnagar");
            s[6].setInfo("Ayushi",12);
            s[7].setInfo("Priyanshi",15,"Gandhinagar");
            s[8].setInfo("Surya",13);
            s[9].setInfo("Pratap",16,"Rathambor");

            for (int i=0;i<10;i++)
                s[i].getInfo();

    }
}
