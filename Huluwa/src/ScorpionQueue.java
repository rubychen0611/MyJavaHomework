public class ScorpionQueue extends Queue //Ы�Ӿ�����ආ�����
{
    ScorpionQueue()
    {
        num = 19;
        creatures = new Creature[num];
        creatures[0] = new Scorpion(); //Ы�Ӿ���ʼ��
        for(int i= 1 ; i < num  ; i++)
        {
            creatures[i] = new Minion(i); //Сආ���ʼ��
        }
    }
}
