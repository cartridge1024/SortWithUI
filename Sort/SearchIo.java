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
    //绘制图形界面
    public void go(){
        //创建框
        frame = new JFrame("this is sort tu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //创建左右两个面板
        JPanel panel_north= new JPanel();
        //设置面板背景色
        panel_north.setBackground(new Color(136,136,136));
 
        //创建相应功能的按钮
        JButton button_start= new JButton("开始");
        JButton button_random= new JButton("随机");
        JButton button_against = new JButton("逆序");
        JButton button_right = new JButton("正序");

        //为按钮注册监听
        button_start.addActionListener(new Button_start());
        button_random.addActionListener(new Button_random());
        button_against.addActionListener(new Button_against());
        button_right.addActionListener(new Button_right());

        //讲创建的按钮添加到相应的面板上
        panel_north.add(button_against);
        panel_north.add(button_right);
        panel_north.add(button_random);
        panel_north.add(button_start);

        //创建绘图用的画布
        drawPanel = new MyDrawPanel();
        drawPanel.setBackground(new Color(136,136,136));

        //将画布和面板添加到Frame上
        frame.add(BorderLayout.NORTH,panel_north); 
        frame.add(BorderLayout.CENTER,drawPanel);

        //设置Frame的大小和属性
        frame.setSize(950,720);
        WindowUtils.displayOnDesktopCenter(frame);
        frame.setVisible(true);
    }

    //按钮button_start_east的监听器（内部类的形式实现）
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
