public class Hero {

    String name;
    int age;
    String type;

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
