package assignment6.decorator;

public class WolfmanAbilitiesDecorator extends GameCharacterDecorator {
    public WolfmanAbilitiesDecorator(GameCharacter character) {
        super(character);
        addSpecialAbility();
    }

    private void addSpecialAbility() {
        super.specialAbility = "fast, brave and strong as wolf, but howlig at the moon while having a fight :0 ";
        System.out.println("Now you are as brave, as strong as wolves, and now is the time to howl at the moon ;)");
    }
    @Override
    public void useSpecialAbility() {
        super.useSpecialAbility();
    }
}
