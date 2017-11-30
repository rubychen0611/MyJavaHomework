import java.util.ArrayList;
public class Formation  //队形基类
{
    protected ArrayList<Position> positions = null; //队形所占有的位置数组
    protected int length;

    public ArrayList<Position> getPositions()
    {
        return positions;
    }

    public int getLength()
    {
        return length;
    }
}

class LongSnakeForm extends Formation //长蛇形
{
    LongSnakeForm(Space space)
    {
        length = 7;
        positions = new ArrayList<Position>(length);//new Position[length];
        for(int i = 0; i < length; i++)
        {
            positions.add(space.getPosition(2+i,2));
        }
    }
}

class MoonForm extends Formation //偃月形
{
    MoonForm(Space space)
    {
        length = 19;
        positions  = new ArrayList<Position>(length);
        positions.add(space.getPosition(5,6));
        positions.add(space.getPosition(4,6));
        positions.add(space.getPosition(6,6));
        int i, k = 3;
        for(i = 3; i <= 7; i++)
            positions.add( space.getPosition(i,7));
        for(i = 2; i <= 8; i++)
            positions.add(space.getPosition(i,8));
        positions.add(space.getPosition(2,9));
        positions.add(space.getPosition(8,9));
        positions.add(space.getPosition(1,10));
        positions.add(space.getPosition(9,10));
    }
}
class SwordForm extends Formation //锋矢形
{
    SwordForm(Space space)
    {
        length = 19;
        positions  = new ArrayList<Position>(length);
        int i, k = 0;
        for(i = 4; i <=10; i++)
            positions.add(space.getPosition(5,i));
        positions.add(space.getPosition(4,4));
        positions.add( space.getPosition(3,5));
        positions.add(space.getPosition(2,6));
        positions.add( space.getPosition(1,7));
        positions.add(space.getPosition(0,8));
        positions.add( space.getPosition(0,9));

        positions.add(space.getPosition(6,4));
        positions.add(space.getPosition(7,5));
        positions.add(space.getPosition(8,6));
        positions.add(space.getPosition(9,7));
        positions.add(space.getPosition(10,8));
        positions.add(space.getPosition(10,9));

    }
}
