package Huluwa.Queue;
import Huluwa.Creature.*;
public class ScorpionQueue extends Queue<Creature> //蝎子精及其喽啰阵型
{
    public ScorpionQueue()
    {
        num = 19;
        creatures = new Creature[num];
        creatures[0] = new Scorpion(); //蝎子精初始化
        for(int i= 1 ; i < num  ; i++)
        {
            creatures[i] = new Minion(i); //小喽啰初始化
        }
    }
}
