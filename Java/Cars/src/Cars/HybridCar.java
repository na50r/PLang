package Cars;

public class HybridCar extends Car {
    private boolean switchElectric;
    private boolean switchCombustion;

    private float CombustionEngine;

    private float ElectricEngine;

    private CombustionCar CombCar;
    private ElectricCar ElecCar;


    public HybridCar(float GasCapacity, float GasPer100KM, float BatterySize, float BatteryRangeKM) {
        this.CombCar = new CombustionCar(GasCapacity, GasPer100KM);
        this.ElecCar = new ElectricCar(BatterySize, BatteryRangeKM);
        this.switchElectric = true;
        this.switchCombustion = false;
        this.CombustionEngine = (float) (GasCapacity/(GasPer100KM*0.01));
        this.ElectricEngine = BatteryRangeKM;
    }

    public void setSwitchElectric(){
        this.switchElectric = true;
        this.switchCombustion = false;
    }

    public void setSwitchCombustion(){
        this.switchElectric = false;
        this.switchCombustion = true;
    }

    @Override
    public float getRemainingRange() {
        return this.CombCar.getRemainingRange()+this.ElecCar.getRemainingRange();
    }

    public void fuel(float FuelContent){
        this.CombCar.fuel(FuelContent);
        this.CombustionEngine += this.CombCar.getRemainingRange();
    }

    //Multiple Inheritance not supported, so we have to re-implement some methods
    public void charge(float kiloWattHour){
        this.ElecCar.charge(kiloWattHour);
        this.ElectricEngine = this.ElecCar.getRemainingRange();
    }

    public float[] getBatteryStatus(){
        return this.ElecCar.getBatteryStatus();
    }

    public float[] getGasTankStatus(){
        return this.CombCar.getGasTankStatus();
    }

    @Override
    public void drive(float dist) {
        if(this.switchElectric){
            if(this.ElectricEngine >= dist){
                this.ElecCar.drive(dist);
                this.ElectricEngine -= dist;
            }
            else{
                this.ElecCar.drive(this.ElectricEngine);
                float newDist = dist - this.ElectricEngine;
                this.ElectricEngine = 0;
                this.CombCar.drive(dist);
                this.CombustionEngine -= newDist;
                this.switchElectric = false;
                this.switchCombustion = true;
            }
        }
        else if(this.switchCombustion){
            if(this.CombustionEngine >= dist){
                this.CombCar.drive(dist);
                this.CombustionEngine -= dist;
            }
            else{
                this.CombCar.drive(this.CombustionEngine);
                float newDist = dist - this.CombustionEngine;
                this.CombustionEngine = 0;
                this.ElecCar.drive(newDist);
                this.ElectricEngine -= newDist;
                this.switchElectric = true;
                this.switchCombustion = false;
            }
        }
    }
}
