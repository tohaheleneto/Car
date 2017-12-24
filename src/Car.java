public class Car
{
    private static int CountOfCars;
    String OwnerName;
    String Model;
    int MaxSpeed;
    String Color;
    int weight;
//конструкторы
    Car()
    {
        CountOfCars++;
        OwnerName="Aleksander";
        Model="BMW X5";
        MaxSpeed=450;
        Color="Black";
        weight=2075;
    }
    Car(String OwnerName, String Model, int MaxSpeed)
    {
        CountOfCars++;
        this.OwnerName=OwnerName;
        this.Model=Model;
        this.MaxSpeed=MaxSpeed;
        this.Color="Black";
        this.weight=2075;
    }
    Car(String OwnerName, String Model, int MaxSpeed, String Color, int weight)
    {
        CountOfCars++;
        this.OwnerName=OwnerName;
        this.Model=Model;
        this.MaxSpeed=MaxSpeed;
        this.Color=Color;
        this.weight=weight;
    }

//методы
    public void ShowOwnerAndModel()
    {
        System.out.println("Owner is "+OwnerName + " Model: "+Model);
    }
    public void ShowOwnerModelMaxSpeed()
    {
        System.out.println("Owner is "+OwnerName + " Model: "+Model + " Max speed:" + MaxSpeed);
    }
    public void ShowOwnerModelMaxSpeedColor()
    {
        System.out.println("Owner is "+OwnerName + " Model: "+Model + " Max speed:" + MaxSpeed +"color: " + Color);
    }
    public void ShowInfo()
    {
        System.out.println("Owner is "+OwnerName + " Model: "+Model + " Max speed:" + MaxSpeed +"color: " + Color + " MaxSpeed left:"+ weight);
    }

    public void ShowCount()
    {
        System.out.println("Count of cars:" + CountOfCars);
    }

}
