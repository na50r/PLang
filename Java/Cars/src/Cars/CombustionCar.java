package Cars;

public class CombustionCar extends Car{
    private float GasCap;
    private float GasPer100Km;

    private float RemainingGas;

    private float RemainingRange;

    public CombustionCar(float GasCapacity, float GasPer100km){
        this.GasCap = GasCapacity;
        this.GasPer100Km = (float) (GasPer100km*0.01);
        this.RemainingRange = (float) (GasCapacity/(GasPer100km*0.01));
        this.RemainingGas = this.RemainingRange * this.GasPer100Km;
    }

    @Override
    public float getRemainingRange() {
        return this.RemainingRange;
    }

    public float[] getGasTankStatus(){
        float[] gasStatus = new float[2];
        gasStatus[0] = this.RemainingGas;
        gasStatus[1] = this.GasCap;
        return gasStatus;
    }

    public void fuel(float FuelContent){
        FuelContent = FuelContent/this.GasPer100Km;
        this.RemainingRange+=FuelContent;
        this.RemainingGas = this.RemainingRange*this.GasPer100Km;
        if(this.RemainingGas > this.GasCap){
            this.RemainingGas = 0;
            System.out.println("Gas Overload!");
        }
    }


    @Override
    public void drive(float dist) {
        this.RemainingRange -= dist;
        this.RemainingGas = this.RemainingRange*this.GasPer100Km;
        if(this.RemainingGas < 0){
            this.RemainingGas = 0;
            System.out.println("Fuel depleted!");
        }
    }
}
