 abstract public class Queue //�����ࣺĳ�������
{
    public int num; //�������� ��������static �������м̳��඼Ϊ��ֵͬ��
    public Creature []creatures; //�����е���������
    Position []positions; //����ռ�ݵ�λ�õ����ù��ɵ�����
    Formation form; //��ʾ���е�ǰ���εĶ���

    public Position[] getPositions()
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
        positions = form.positions;
        for(Creature cr :creatures) //���������뿪��ǰλ��
        {
            cr.leavePosition();
        }
        for(int i = 0; i < num; i ++)
        {
            creatures[i].setPosition(positions[i]);
        }
    }
}

