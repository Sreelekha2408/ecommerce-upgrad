package Classes.OOPS;

public class Ninja implements SwordFighter{
    @Override
    public void escape() {
        System.out.println("Ninja gets into forest and flees");
    }

    @Override
    public void showWeapon() {
        System.out.println("Shows Katana");
    }

    @Override
    public void attack() {
        System.out.println("Ninja steps forward and attacks");
    }
}
