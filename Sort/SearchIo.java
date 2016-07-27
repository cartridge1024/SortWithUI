import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SearchIo {
    JFrame frame;
    static MyDrawPanel drawPanel;
    static int[] num = new int[40];

    public static void main(String args[]) {
        SearchIo gui = new SearchIo();
        gui.go();
    }
    //����ͼ�ν���
    public void go(){
        //������
        frame = new JFrame("this is sort tu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //���������������
        JPanel panel_north= new JPanel();
        //������屳��ɫ
        panel_north.setBackground(new Color(136,136,136));
 
        //������Ӧ���ܵİ�ť
        JButton button_start= new JButton("��ʼ");
        JButton button_random= new JButton("���");
        JButton button_against = new JButton("����");
        JButton button_right = new JButton("����");

        //Ϊ��ťע�����
        button_start.addActionListener(new Button_start());
        button_random.addActionListener(new Button_random());
        button_against.addActionListener(new Button_against());
        button_right.addActionListener(new Button_right());

        //�������İ�ť��ӵ���Ӧ�������
        panel_north.add(button_against);
        panel_north.add(button_right);
        panel_north.add(button_random);
        panel_north.add(button_start);

        //������ͼ�õĻ���
        drawPanel = new MyDrawPanel();
        drawPanel.setBackground(new Color(136,136,136));

        //�������������ӵ�Frame��
        frame.add(BorderLayout.NORTH,panel_north); 
        frame.add(BorderLayout.CENTER,drawPanel);

        //����Frame�Ĵ�С������
        frame.setSize(950,720);
        WindowUtils.displayOnDesktopCenter(frame);
        frame.setVisible(true);
    }

    //��ťbutton_start_east�ļ��������ڲ������ʽʵ�֣�
    class Button_start implements ActionListener{
        public void actionPerformed(ActionEvent event){
            new Thread(){
               public void run(){
               new Select_sort().Select(); 
               }
            }.start(); 
            new Thread(){ 
                public void run(){
                    new Bubble_sort().bull(); 
                }
            }.start();
            new Thread(){ 
                public void run(){
                    new Quick_Sort().quick_sort();
                }
            }.start();
            new Thread(){
                public void run(){
                    new Shell_Sort().shellSort();
                }
            }.start();
        }
    }

    class Button_random implements ActionListener{
        public void actionPerformed(ActionEvent event){
            for(int i = 0; i < num.length; i++){
                num[i] = (int)(Math.random()*50);
            }
            new Bubble_sort();
            new Select_sort();
            new Quick_Sort();
            new Shell_Sort();
            drawPanel.repaint();
        }
    }
    class Button_against implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(num.length < 10){
                for(int i = 0; i < num.length; i++){
                    num[i] = (int)(Math.random()*10);
                }
                
            }else if(num.length < 20){
                for(int i = 0; i < 10; i++){
                    num[i] = (int)(Math.random()*10+40);
                }
                for(int i = 10; i < num.length; i++){
                    num[i] = (int)(Math.random()*10+30);
                }
            }else if(num.length < 30){
                for(int i = 0; i < 10; i++){
                    num[i] = (int)(Math.random()*10+40);
                }
                for(int i = 10; i < 20; i++){
                    num[i] = (int)(Math.random()*10+30);
                }
                for(int i = 20; i < num.length; i++){
                    num[i] = (int)(Math.random()*10+20);
                }
            }else{
                for(int i = 0; i < 10; i++){
                    num[i] = (int)(Math.random()*10+40);
                }
                for(int i = 10; i < 20; i++){
                    num[i] = (int)(Math.random()*10+30);
                }
                for(int i = 20; i < num.length; i++){
                    num[i] = (int)(Math.random()*10+20);
                }
                for(int i = 30; i < num.length; i++){
                    num[i] = (int)(Math.random()*10+10);
                }
            }
            new Bubble_sort();
            new Select_sort();
            new Quick_Sort();
            new Shell_Sort();
            drawPanel.repaint();
        }
    }
    class Button_right implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(num.length < 10){
                for(int i = 0; i < num.length; i++){
                    num[i] = (int)(Math.random()*10+40);
                }
                
            }else if(num.length < 20){
                for(int i = 0; i < 10; i++){
                    num[i] = (int)(Math.random()*10+30);
                }
                for(int i = 10; i < num.length; i++){
                    num[i] = (int)(Math.random()*10+40);
                }
            }else if(num.length < 30){
                for(int i = 0; i < 10; i++){
                    num[i] = (int)(Math.random()*10+20);
                }
                for(int i = 10; i < 20; i++){
                    num[i] = (int)(Math.random()*10+30);
                }
                for(int i = 20; i < num.length; i++){
                    num[i] = (int)(Math.random()*10+40);
                }
            }else{
                for(int i = 0; i < 10; i++){
                    num[i] = (int)(Math.random()*10+10);
                }
                for(int i = 10; i < 20; i++){
                    num[i] = (int)(Math.random()*10+20);
                }
                for(int i = 20; i < num.length; i++){
                    num[i] = (int)(Math.random()*10+30);
                }
                for(int i = 30; i < num.length; i++){
                    num[i] = (int)(Math.random()*10+40);
                }
            }
            new Bubble_sort();
            new Select_sort();
            new Quick_Sort();
            new Shell_Sort();
            drawPanel.repaint();
        }
    }
}
