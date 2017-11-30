package Huluwa.Creature;

public class Snake extends Creature //生物：蛇精
{
    public Snake()
    {
        super();
        this.species = Species.SNAKE;
    }
    public void report()
    {
        System.out.print("🐍");
    }
}