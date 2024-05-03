package assignment6.decorator;

public abstract class GameCharacterDecorator implements GameCharacter {
    protected GameCharacter character;
    protected String specialAbility;
    public GameCharacterDecorator(GameCharacter character){
        this.character = character;
    }

    public void useSpecialAbility() {
        System.out.println(specialAbility);;
    }
}
