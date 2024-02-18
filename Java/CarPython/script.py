#!/usr/bin/env python3

# The purpose of this file is illustrating the class usages. This script
# is irrelevant for the grading and you can freely change its contents.

from combustion_car import CombustionCar
from electric_car import ElectricCar
from hybrid_car import HybridCar



print("Comb")
C = CombustionCar(40.0,8.0)
C.drive(10.0)
print(C.get_gas_tank_status())
C.fuel(0.5)
print(C.get_gas_tank_status())

print("\nElec")
E = ElectricCar(25.0, 500.0)
E.drive(10.0)
print(E.get_battery_status())
E.charge(0.4)
print(E.get_battery_status())
print("")

Hyb = HybridCar(40.0, 8.0, 25.0, 500.0)
Hyb.drive(10.0)
print(Hyb.get_battery_status())
Hyb.charge(0.4)
print(Hyb.get_battery_status())
Hyb.switch_to_combustion()
Hyb.drive(10.0);
print(Hyb.get_gas_tank_status())
Hyb.fuel(0.5)
print(Hyb.get_gas_tank_status())

