import random
class Mob:
    weaponValues = {"Axe": 5, "Sword": 9}

    def __init__(self, name, value):
        self.name = name
        self.value = value
        self.weapon = random.choice(list(self.weaponValues.keys()))

    def attack(self, other):
        other.value -= self.weaponValues[self.weapon]


class Knight(Mob):
    additional_weapon_values = {"Lance": 10, "Spear": 20}
    weaponValues = {**Mob.weaponValues, **additional_weapon_values}

    def __init__(self, name, value):
        super().__init__(name, value)
        self.attackPower = random.randint(10, 20)

    def attack(self, other):
        other.value -= self.attackPower * self.weaponValues[self.weapon]




Bob = Knight("Bob", 100)
Alice = Mob("Alice", 100)

print(Bob.weapon)
print(Bob.attackPower)

Alice.attack(Bob)
Bob.attack(Alice)

print(Bob.value)
print(Alice.value)
