enum Species //����
{
    HULUWA, OLDMAN, SNAKE, SCORPION, MINION;
}
abstract public class Creature //�����ࣺ����
{
    public Species species; //����
    protected Position position; //λ��
    abstract public void report(); //������
    Creature()
    {
        position = null;
    }
    public Position getPosition()
    {
        return this.position;
    }
    public void setPosition(Position position) //����λ��
    {
        if(position.ifEmpty())
        {
            leavePosition();
            position.setHolder(this);
            this.position = position;
        }
        else assert(false);
    }
    public void leavePosition() //�뿪λ��
    {
        if(this.position != null)
        {
            (this.position).out();
            this.position = null;
        }

    }

}
class Oldman extends Creature //�����үү
{
    Oldman()
    {
        super();
        this.species = Species.OLDMAN;
    }
    public void report()
    {
        System.out.print("��үү");
    }
}

class Snake extends Creature //����߾�
{
    Snake()
    {
        super();
        this.species = Species.SNAKE;
    }
    public void report()
    {
        System.out.print("�߾�");
    }
}
