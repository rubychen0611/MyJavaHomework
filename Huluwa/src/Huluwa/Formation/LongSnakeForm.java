package Huluwa.Formation;
import Huluwa.Space.*;
import java.util.ArrayList;
public class LongSnakeForm extends Formation //长蛇形
{
    public LongSnakeForm(Space space)
    {
        length = 7;
        positions = new ArrayList<Position>(length);//new Position[length];
        for(int i = 0; i < length; i++)
        {
            positions.add(space.getPosition(2+i,2));
        }
    }
}