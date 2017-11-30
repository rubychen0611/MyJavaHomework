package Huluwa.Creature;

public class Minion extends Creature //小喽啰类
{
    int index;
    public Minion(int index)
    {
        super();
        this.index = index;
        this.species = Species.MINION;
    }
    public void report()
    {
        System.out.print("🐜");
    }
}
