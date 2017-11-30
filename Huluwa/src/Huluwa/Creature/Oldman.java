package Huluwa.Creature;

public class Oldman extends Creature //生物：老爷爷
{
    public Oldman()
    {
        super();
        this.species = Species.OLDMAN;
    }
    public void report()
    {
        System.out.print("👴");
    }
}

