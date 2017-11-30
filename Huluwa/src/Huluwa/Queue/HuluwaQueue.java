package Huluwa.Queue;
import Huluwa.Creature.*;
import Huluwa.Space.*;
import java.util.ArrayList;
import java.util.Collections;

public class HuluwaQueue extends Queue<Huluwa>
{
    Space space;
    public HuluwaQueue()
    {
        num = 7;
        creatures = new Huluwa[num];//new Creature[num];
        int i;
        for (i = 0; i < num; i++)
        {
            HuluAttribute huluAttribute;
            switch (i+1)
            {
                case 1: huluAttribute = HuluAttribute.RED; break;
                case 2: huluAttribute = HuluAttribute.ORANGE; break;
                case 3: huluAttribute = HuluAttribute.YELLOW; break;
                case 4: huluAttribute = HuluAttribute.GREEN; break;
                case 5: huluAttribute = HuluAttribute.CYAN; break;
                case 6: huluAttribute = HuluAttribute.BLUE; break;
                case 7: huluAttribute = HuluAttribute.PURPLE; break;
                default: huluAttribute = null; assert(false);
            }
            creatures[i] = new Huluwa(i + 1, huluAttribute);
        }
    }


    public void LineUpRandomly() //任意站队
    {
        ArrayList<Integer> array = new ArrayList<Integer>(num);
        for(int i = 0; i < num; i++)
            array.add(i);
        Collections.shuffle(array);

        for(Creature hlw :creatures)
            hlw.leavePosition();

        for (int i = 0; i < num; i++)
            creatures[array.get(i)].setPosition(positions.get(i));
    }


}
