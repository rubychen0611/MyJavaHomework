public class Position //����λ����
{
    private int x, y;
    private Creature holder; //λ�õ�ռ����
    private boolean empty; //λ���Ƿ�Ϊ��
    public Position(int x, int y)
    {
        super();
        this.x = x;
        this.y = y;
        empty = true;
    }
    public boolean ifEmpty()
    {
        return empty;
    }
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public void setHolder(Creature holder) //����λ��
    {
        this.holder = holder;
        empty = false;
    }
    public Creature out() //��λ���뿪
    {
        Creature holder = this.holder;
        this.holder = null;
        empty = true;
        return holder;
    }
    public Creature getHolder() //��õ�ǰ��ɫ������
    {
        return this.holder;
    }
}