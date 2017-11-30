package Huluwa.Formation;

import Huluwa.Space.Position;
import Huluwa.Space.Space;

import java.util.ArrayList;

public class MoonForm extends Formation //偃月形
{
    public MoonForm(Space space)
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