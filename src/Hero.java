public class Hero {

    String name;
    int age;
    String type;

    public Hero(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public static void title() {
        System.out.println("==================");
        System.out.println(" SYSTEM OF HEROES");
        System.out.println("==================");
    }

    public void attack() {
        String atk;

        switch (type) {
            case "wizard" -> atk = "magic";
            case "warrior" -> atk = "sword";
            case "monk" -> atk = "martial arts";
            case "ninja" -> atk = "shuriken";
            default -> atk = "arm";
        }
        System.out.printf("The %s attacked using a %s.\n", type, atk);
    }
}
