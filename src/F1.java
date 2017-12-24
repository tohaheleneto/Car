public class F1 extends Car
{
    double Acceleration0_100KM ;
    double braking0_100KM;
    int CostPerLap;

    public F1()
    {
        Acceleration0_100KM=1.7;//seconds
        braking0_100KM=1.4;//seconds
        CostPerLap=500;
    }
    public F1(String Name,double Acceleration0_100KM, double braking0_100KM, int CostPerLap )
    {
        super.OwnerName=Name;
        this.Acceleration0_100KM=Acceleration0_100KM;
        this.braking0_100KM=braking0_100KM;
        this.CostPerLap=CostPerLap;
    }
    public void ShowFullInfo()
    {
        System.out.print("Owner is "+OwnerName + " Model: "+Model + " Max speed:" + MaxSpeed );
        System.out.print("color: " + Color + " MaxSpeed left:"+ weight + "Acceleration from 0 to 100km:" + Acceleration0_100KM);
        System.out.print("seconds  braking from 100 to 0: " +braking0_100KM + "cost per lap: "+CostPerLap  );


    }
    public void ShowF1Info()
    {
        System.out.print("Acceleration from 0 to 100km:" + Acceleration0_100KM +"seconds  braking from 100 to 0: "
                +braking0_100KM + "cost per lap: "+CostPerLap  );
    }

}
