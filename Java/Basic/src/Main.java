class Main {
    public static int add(int a, int b){
        return a+b;
    }

    public static void program1(){
        String name = "Jason";
        String newName = name + " Kek";
        System.out.println(name);
        double c = 20;

        final int ab = add(12, 24);
        System.out.println(ab);
        System.out.println(newName);
        final int ab2 = add(12, (int)c);
        System.out.println(ab2);
    }

    public static void main(String[] args) {
        Mob bob = new Mob("Bob", 100);
        Knight alice = new Knight("Alice", 200);
        System.out.println(alice.weapon);
        System.out.println(bob.weapon);
    }
}