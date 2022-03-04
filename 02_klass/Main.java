// main -- enter


public class Main {
    public static void main(String[] args) {
        Human one = new Human("Mihkel", 55, 189, true);
        Human two = new Human("muhkel", 22, 150, true);


        System.out.println(one);
        System.out.println(two);

        one.sayHello();
        two.sayHello();

    }
}
