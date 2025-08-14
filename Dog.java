public class Dog {
    public String name;
    public int age;
    private int runCount; 

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.runCount = 0;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public void run() {
        runCount++;
        if (runCount % 2 != 0) {
            System.out.println(name + " is running!");
        } else {
            System.out.println(name + " is tired.");
        }
    }
}
