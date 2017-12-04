package CreationalPatterns.Prototype;

/**
 * Created by dvsta on 05.12.2017.
 */
public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    public void setPrototype(Human human) {
        this.human = human;
    }

    public Human makeCopy(){
        return (Human)human.copy();
    }
}
