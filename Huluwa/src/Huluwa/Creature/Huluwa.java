package Huluwa.Creature;
import Huluwa.Sorter.Comparable;

public class Huluwa extends Creature implements Comparable
{
    private HuluAttribute huluAttribute;
    private int index;

    public HuluAttribute getAttribute()
    {
        return this.huluAttribute;
    }
    public int getIndex()
    {
        return this.index;
    }
    public Huluwa(int index, HuluAttribute huluAttribute)
    {
        super();
        this.species = Species.HULUWA;
        this.index = index;
        this.huluAttribute = huluAttribute;
    }
    @Override
    public void report()
    {
        System.out.print(this.toString());
    }
    @Override
    public String toString()
    {
        return huluAttribute.getNoName();
    }
    @Override
    public boolean biggerThan(Comparable brother)
    {
        if (brother instanceof Huluwa)
        {
            return (this.index > ((Huluwa) brother).getIndex());
        }
        else return false;
    }
}