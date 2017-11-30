enum HuluAttribute//��«������
{
    RED("�ϴ�","��ɫ",1), ORANGE("�϶�", "��ɫ",2), YELLOW("����", "��ɫ",3), GREEN("����","��ɫ",4),
    CYAN("����","��ɫ",5), BLUE("����", "��ɫ", 6), PURPLE("����", "��ɫ", 7);
    private String NoName; //��X
    private String ColorName; //��ɫ
    private int index; //���
    private HuluAttribute(String NoName, String ColorName, int index) //���캯��
    {
        this.NoName = NoName;
        this.ColorName = ColorName;
        this.index = index;
    }
    public  String getNoName()
    {
        return NoName;
    }
    public String getColorName()
    {
        return  ColorName;
    }
    public int getIndex() {return index;}
}
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
    Huluwa(int index, HuluAttribute huluAttribute)
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