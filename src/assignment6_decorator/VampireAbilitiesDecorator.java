package assignment6_decorator;

public class VampireAbilitiesDecorator extends GameCharacterDecorator {
    public VampireAbilitiesDecorator(GameCharacter character) {
        super(character);
        addSpecialAbility();
    }

    private void addSpecialAbility() {
        super.specialAbility = "drinking a blood and fear of sun";
        System.out.println("Now you have great tooth for drinking a blood (not only from your friends brain), white glass skin and fear of sun ;)");
    }
    @Override
    public void useSpecialAbility() {
        super.useSpecialAbility();
    }
}
