package assignment6_decorator;

public class MermaidAbilitiesDecorator extends GameCharacterDecorator {
    public MermaidAbilitiesDecorator(GameCharacter character) {
        super(character);
        addSpecialAbility();
    }

    private void addSpecialAbility() {
        super.specialAbility = "turn into mermaid, breathe under the water";
        System.out.println("Now you can turn into mermaid, " +
                "breathe under the water and find yourself some fish friends :>");
    }
    @Override
    public void useSpecialAbility() {
        super.useSpecialAbility();
    }
}
