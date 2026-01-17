public class Main {
    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.name = "Anny";
        hero1.age = 230;
        hero1.type = "wizard";
        hero1.attack();

        Hero hero2 = new Hero();
        hero2.name = "Blomm";
        hero2.age = 198;
        hero2.type = "ninja";
        hero2.attack();
    }
}
