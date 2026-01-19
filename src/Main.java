public class Main {
    public static void main(String[] args) {
        Hero.title();

        Hero[] heroes = {
                new Hero("Holly", 23, "wizard"),
                new Hero("Way", 34, "warrior"),
                new Hero("Poo", 47, "monk"),
                new Hero("Lynn", 52, "ninja"),
                new Hero("Klow", 30, "archer")
        };

        for (int i = 0; i < heroes.length; i++) {
            System.out.println("-> Hero " + (i + 1) + ": " + heroes[i].name);
            System.out.print("Result: ");
            heroes[i].attack();
        }
    }
}
