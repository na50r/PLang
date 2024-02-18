import Cars.CombustionCar;
import Cars.ElectricCar;
import Cars.HybridCar;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Comb");
        CombustionCar Car1 = new CombustionCar(40, 8);
        Car1.drive(10);
        System.out.println(Arrays.toString(Car1.getGasTankStatus()));
        Car1.fuel(0.5F);
        System.out.println(Arrays.toString(Car1.getGasTankStatus()));

        System.out.println("\nElec");
        ElectricCar Car2 = new ElectricCar(25, 500);
        Car2.drive(10);
        System.out.println(Arrays.toString(Car2.getBatteryStatus()));
        Car2.charge(0.4F);
        System.out.println(Arrays.toString(Car2.getBatteryStatus()));

        System.out.println("\nHybrid Cars.Car");
        HybridCar Car3 = new HybridCar(40, 8, 25, 500);
        Car3.drive(10);
        System.out.println(Arrays.toString(Car3.getBatteryStatus()));
        Car3.charge(0.4F);
        System.out.println(Arrays.toString(Car3.getBatteryStatus()));
        Car3.setSwitchCombustion();
        Car3.drive(10);
        System.out.println(Arrays.toString(Car3.getGasTankStatus()));
        Car3.fuel(0.5F);
        System.out.println(Arrays.toString(Car3.getGasTankStatus()));

    }
}