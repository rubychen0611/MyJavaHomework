import java.util.ArrayList;

abstract public class Queue<T extends Creature> //�����ࣺĳ�������
{
    protected int num; //�������� ��������static �������м̳��඼Ϊ��ֵͬ��
    protected T creatures[];//public Creature []creatures; �����е���������
    protected ArrayList<Position> positions; //Position []positions; ����ռ�ݵ�λ�õ����ù��ɵ�����
    protected Formation form; //��ʾ���е�ǰ���εĶ���

    public ArrayList<Position> getPositions()
    {
        return positions;
    }
    public void Swap(Position p1, Position p2) //λ��λ��p1��p2���������ｻ��λ��
    {
        Creature temp1 = p1.getHolder();
        Creature temp2 = p2.getHolder();
        temp1.leavePosition(); //�뿪λ��
        temp2.leavePosition(); //�뿪λ��
        temp1.setPosition(p2);
        temp2.setPosition(p1);
    }
    public void FormationChange(Formation form) //�任����
    {
        this.form = form;
        positions = form.getPositions();
        for(Creature cr :creatures) //���������뿪��ǰλ��
        {
            cr.leavePosition();
        }
        for(int i = 0; i < num; i ++)
        {
            creatures[i].setPosition(positions.get(i));
        }
    }
}

