public class CityCar extends Car
{
    int NumberOfSeats;
    int CostPerKilometer;
    int Fuel;
    public CityCar()
    {
       NumberOfSeats=4;
       CostPerKilometer=6;
       Fuel=100;
    }
    public CityCar(String OwnerName,int NumberOfSeats, int CostPerKilometer,int Fuel)
    {   super.OwnerName=OwnerName;
        this.NumberOfSeats=NumberOfSeats;
        this.CostPerKilometer=CostPerKilometer;
        this.Fuel=Fuel;
    }
    public void ShowFullInfo()
    {
        System.out.print("Owner is "+OwnerName + " Model: "+Model + " Max speed:" + MaxSpeed );
        System.out.print("color: " + Color + " MaxSpeed left:"+ weight + " Number of seats" + NumberOfSeats);
        System.out.print("cost per kilometer: " +CostPerKilometer + " Fuel: "+Fuel );
    }
    public void TransferFuel (CityCar a)
    {
        this.Fuel-=10;
        a.Fuel+=10;
    }

}
