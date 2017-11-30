import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public interface Sorter //排序器接口
{
    public void sort(Queue queue);
}
class BubbleSorter implements Sorter //冒泡排序器
{
    @Override
    public void sort (Queue queue)
    {
        ArrayList<Position> positions = queue.getPositions();
        int i, j;
        for (i = 0; i < positions.size() - 1; i++)
        {
            for (j = 0; j < positions.size() - 1 - i; j++)
            {
                 if (((Comparable)(positions.get(j).getHolder())).biggerThan((Comparable)(positions.get(j+1).getHolder())) )
                {
                    queue.Swap(positions.get(j), positions.get(j+1));// 位于位置j和位置j+1的两个生物交换位置
                }
            }
        }
    }
}

class QuickSorter implements Sorter  //快速排序器
{
    private ArrayList<Position> positions;
    private Queue queue;
    @Override
    public void sort(Queue queue)
    {
        positions = queue.getPositions();
        this.queue = queue;
        QuickSort(0, positions.size() - 1);
    }
    private void QuickSort( int left, int right) //快速排序
    {
        if(left < right)
        {
            int pivotpos = Partition(left, right);
            QuickSort(left, pivotpos - 1);
            QuickSort(pivotpos+1, right);
        }
    }
    private int Partition(int low, int high)
    {
        int pivotpos = low;
        Creature pivot =  positions.get(low).getHolder();
        int i;
        for(i = low + 1; i <= high; i++)
        {
            if (((Comparable)(pivot)).biggerThan((Comparable)(positions.get(i).getHolder())) )
            {
                pivotpos++;
                if(pivotpos != i)
                {
                    queue.Swap(positions.get(i), positions.get(pivotpos));// 位于位置i和位置pivotpos的两个生物交换位置
                }
            }
        }
        if(pivotpos != low)
        {
            queue.Swap(positions.get(low), positions.get(pivotpos));// 位于位置low和位置pivotpos的两个生物交换位置
        }
        return pivotpos;
    }
}

class AutoSorter implements Sorter
{
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
