package Cars;

public class ElectricCar extends Car{
    private final float batterySize;
    private final float batteryRangeKm;

    private final float batteryConsumption;
    private float RemainingRange;
    private float RemainingElectricity;


    public ElectricCar(float BatterySize, float BatteryRangeKm){
        this.batterySize = BatterySize;
        this.batteryRangeKm = BatteryRangeKm;
        this.batteryConsumption = batteryRangeKm/batterySize;
        this.RemainingRange = batteryRangeKm;
        this.RemainingElectricity = this.RemainingRange/this.batteryConsumption;
    }

    public void charge(float kiloWattPerHour){
        this.RemainingElectricity += kiloWattPerHour;
        if(this.RemainingElectricity > this.batterySize){
            this.RemainingElectricity = 0;
            System.out.println("Electricity Overload!");
        }
        kiloWattPerHour *= this.batteryConsumption;
        this.RemainingRange += kiloWattPerHour;
    }

    public float[] getBatteryStatus(){
        float[] Output = new float[2];
        Output[0] = this.RemainingRange/this.batteryConsumption;
        Output[1] = this.batterySize;
        if(this.RemainingElectricity!=0){
            return Output;
        }
        Output[0] = this.RemainingElectricity;
        return Output;
    }


    @Override
    public float getRemainingRange() {
        return this.RemainingRange;
    }

    @Override
    public void drive(float dist) {
        this.RemainingRange -= dist;
        this.RemainingElectricity = this.RemainingRange/this.batteryConsumption;
        if(this.RemainingElectricity<0){
            this.RemainingElectricity = 0;
            System.out.println("Charge depleted!");
        }

    }
}
