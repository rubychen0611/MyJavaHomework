package Huluwa.Sorter;

import Huluwa.Creature.Huluwa;
import Huluwa.Queue.Queue;
import Huluwa.Space.Position;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AutoSorter implements Sorter
{
    public AutoSorter() {}
    @Override
    public void sort (Queue queue)
    {
        ArrayList<Position> positions = queue.getPositions();
        ArrayList<Huluwa> huluwas = new ArrayList<Huluwa>(7);
        for(Position pos: positions)
        {
            huluwas.add((Huluwa)pos.getHolder());
            pos.getHolder().leavePosition();
        }
        Collections.sort(huluwas, new Comparator<Huluwa>() {
            @Override
            public int compare(Huluwa o1, Huluwa o2) {
                if (o1.biggerThan(o2))
                    return 1;
                else return -1;
            }
        });
        for(int i = 0; i < huluwas.size(); i++)
        {
            huluwas.get(i).setPosition(positions.get(i));
        }

    }
}