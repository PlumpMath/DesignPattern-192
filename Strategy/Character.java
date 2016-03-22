public abstract class Character {

    protected WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(final WeaponBehavior weapon) {
        this.weapon = weapon;
    }

}
