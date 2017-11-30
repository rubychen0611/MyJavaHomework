public class Formation  //���λ���
{
    public Position []positions = null; //������ռ�е�λ������
    public int length;
}

class LongSnakeForm extends Formation //������
{
    LongSnakeForm(Space space)
    {
        length = 7;
        positions = new Position[length];
        for(int i = 0; i < length; i++)
        {
            positions[i] = space.getPosition(2+i,2);
        }
    }
}

class MoonForm extends Formation //������
{
    MoonForm(Space space)
    {
        length = 19;
        positions  = new Position[length];
        positions[0] = space.getPosition(5, 6);
        positions[1] = space.getPosition(4,6);
        positions[2] = space.getPosition(6,6);
        int i, k = 3;
        for(i = 3; i <= 7; i++)
            positions[k++] = space.getPosition(i,7);
        for(i = 2; i <= 8; i++)
            positions[k++] = space.getPosition(i, 8);
        positions[k++] = space.getPosition(2,9);
        positions[k++] = space.getPosition(8,9);
        positions[k++] = space.getPosition(1,10);
        positions[k++] = space.getPosition(9,10);
    }
}
class SwordForm extends Formation //��ʸ��
{
    SwordForm(Space space)
    {
        length = 19;
        positions = new Position[length];
        int i, k = 0;
        for(i = 4; i <=10; i++)
            positions[k++] = space.getPosition(5, i);
        positions[k++] = space.getPosition(4,4);
        positions[k++] = space.getPosition(3,5);
        positions[k++] = space.getPosition(2,6);
        positions[k++] = space.getPosition(1,7);
        positions[k++] = space.getPosition(0,8);
        positions[k++] = space.getPosition(0,9);

        positions[k++] = space.getPosition(6,4);
        positions[k++] = space.getPosition(7,5);
        positions[k++] = space.getPosition(8,6);
        positions[k++] = space.getPosition(9,7);
        positions[k++] = space.getPosition(10,8);
        positions[k++] = space.getPosition(10,9);

    }
}
