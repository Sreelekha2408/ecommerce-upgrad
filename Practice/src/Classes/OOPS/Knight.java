package Classes.OOPS;

public class Knight implements SwordFighter{
    @Override
    public void escape() {
        System.out.println("Knight climbs the horse and flees");
    }

    @Override
    public void showWeapon() {
        System.out.println("Shows Sword");
    }

    @Override
    public void attack() {
        System.out.println("Knight stops the horse and attacks");
    }
}
