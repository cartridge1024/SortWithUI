import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Stroke;
import javax.swing.JPanel;

public class MyDrawPanel extends JPanel{
    private Image bufferedImage;
    public void paint(Graphics g){
        super.paint(g);
        this.draw(g); 
    }

    public void draw(Graphics gh){
        Graphics2D g = (Graphics2D) gh;
        int x = this.getWidth();
        int y = this.getHeight();
        int x_center = x/2;
        int y_center = y/2;
        g.setColor(Color.darkGray);
        g.drawString("Bulle_sort",20,y_center-10);
        for(int i=0; i<Bubble_sort.Aux_array.length;i++){
            g.fillRect(20+i*10,y_center-20-Bubble_sort.Aux_array[i]*6,5,Bubble_sort.Aux_array[i]*6);
        } 
        g.drawString("Select_sort",20,y-10);
        for(int i=0; i<Select_sort.Aux_array.length;i++){
            g.fillRect(20+i*10,y-20-Select_sort.Aux_array[i]*6,5,Select_sort.Aux_array[i]*6);
        }  
        g.drawString("Quick_Sort",x_center+20,y_center-10);
        for(int i=0; i<Quick_Sort.Aux_array.length;i++){
            g.fillRect(x_center+20+i*10,y_center-20-Quick_Sort.Aux_array[i]*6,5,Quick_Sort.Aux_array[i]*6);
        }
        g.drawString("Shell_Sort",x_center+20,y-10);
        for(int i=0; i<Shell_Sort.Aux_array.length;i++){
            g.fillRect(x_center+20+i*10,y-20-Shell_Sort.Aux_array[i]*6,5,Shell_Sort.Aux_array[i]*6);
        }
        //设置画笔的属性（此处为设置虚线）详细参数信息见：http://blog.csdn.net/li_tengfei/article/details/6098093
        Stroke dash = new BasicStroke(2.5f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,3.5f,new float[]{10,5},0f);
        g.setStroke(dash);
        g.drawLine(0,this.getHeight()/2,this.getWidth(),this.getHeight()/2);
        g.drawLine(this.getWidth()/2,0,this.getWidth()/2,this.getHeight());
    }
    /* 使用双缓冲方式清除闪烁*/
    public void update(Graphics g){
        if(bufferedImage == null){
            bufferedImage = this.createImage(this.getWidth(),this.getHeight());
        }
        Graphics gBuffer = bufferedImage.getGraphics();
        if(gBuffer != null){
            paint(gBuffer); 
        }else{
            paint(g);
        }
        gBuffer.dispose();
        g.drawImage(bufferedImage,0,0,null);
    }
}
