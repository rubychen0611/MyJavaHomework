package Huluwa.Formation;

import Huluwa.Space.Position;
import Huluwa.Space.Space;

import java.util.ArrayList;

public class SwordForm extends Formation //锋矢形
{
    public SwordForm(Space space)
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