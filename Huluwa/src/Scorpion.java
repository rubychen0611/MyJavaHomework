
public class Scorpion extends Creature //Ы�Ӿ���
{
    Scorpion()
    {
        super();this.species = Species.SCORPION;
    }
    public void report()
    {
        System.out.print("Ы�Ӿ�");
    }
}
class Minion extends Creature //Сආ���
{
    int index;
    Minion(int index)
    {
        super();
        this.index = index;
        this.species = Species.MINION;
    }
    public void report()
    {
        System.out.print("ආ�"+ index );
    }
}


