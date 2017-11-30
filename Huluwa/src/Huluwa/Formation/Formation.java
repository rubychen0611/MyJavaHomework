package Huluwa.Formation;
import Huluwa.Space.*;
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

