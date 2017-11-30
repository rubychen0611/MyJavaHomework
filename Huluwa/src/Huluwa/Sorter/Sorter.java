package Huluwa.Sorter;
import Huluwa.Creature.*;
import Huluwa.Queue.*;
import Huluwa.Space.Position;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public interface Sorter //排序器接口
{
    public void sort(Queue queue);
}
@SuppressWarnings("unused")
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
@SuppressWarnings("unused")
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

