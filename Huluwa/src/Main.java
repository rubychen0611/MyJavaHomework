public class Main
{
    public static void main(String[]args)
    {
        /*��ʼ��*/
        Space space = new Space();
        HuluwaQueue huluwaqueue = new HuluwaQueue(); //��«��
        ScorpionQueue scorpionqueue = new ScorpionQueue(); //Ы�Ӿ���ආ�
        Snake snake = new Snake(); //�߾�
        Oldman oldman = new Oldman(); //��үү
        /*��«���ȵ������վ��*/
        System.out.println("��«�����վ�ӣ�");
        huluwaqueue.FormationChange(new LongSnakeForm(space)); //��«��վ�ɳ�����
        huluwaqueue.LineUpRandomly();//��ʼ����
        space.Output();
        /*��«������*/
        new QuickSorter().sort(huluwaqueue);
        /*���ž���1*/
        System.out.println("(�����)���ž���1��");
        scorpionqueue.FormationChange(new MoonForm(space)); //Ы�Ӿ���ආ�վ��������
        snake.setPosition(space.getPosition(2,6)); //�߾���Ы�Ӿ�����
        oldman.setPosition(space.getPosition(5,1)); //��үү����«�޼���
        space.Output();
        System.out.println();
        /*���ž���2*/
        System.out.println("���ž���2��");
        snake.leavePosition(); //�߾��ó��ط�
        oldman.leavePosition(); //��үү�ó��ط�
        scorpionqueue.FormationChange(new SwordForm(space)); //Ы�Ӿ���ආ��任���γɷ�ʸ��
        snake.setPosition(space.getPosition(9,5)); //�߾���Ы�Ӿ�����
        oldman.setPosition(space.getPosition(7,0)); //��үү����«�޼���
        space.Output();

    }
}