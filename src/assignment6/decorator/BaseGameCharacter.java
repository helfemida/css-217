package assignment6.decorator;

public class BaseGameCharacter implements GameCharacter {
    @Override
    public void useSpecialAbility() {
        System.out.println("Eating & sleeping to avoid hunger ;) yeah that's all...");
    }
}
