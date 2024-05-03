package assignment6.decorator;

public class GameCharacterApplication {
    public static void main(String[] args) {
        GameCharacter character = new BaseGameCharacter();
        System.out.println("Base game character: ");
        character.useSpecialAbility();
        System.out.println("Adding vampire abilities... ");
        character = new VampireAbilitiesDecorator(character);
        System.out.println("Or may be a mermaid?.. ");
        character = new MermaidAbilitiesDecorator(character);
        System.out.println("No, wolfman is better, so...");
        character = new WolfmanAbilitiesDecorator(character);

        System.out.println("So my final special abilities are... ");
        character.useSpecialAbility();
    }
}
