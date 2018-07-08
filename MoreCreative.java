

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Rajdeep Sarkar
 */
public class MoreCreative {
    JFrame frame;
    Color first;
    
    
    class draw extends JPanel{
        public void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D)g;
            g2.setPaint(Color.white);
            g2.fillRect(0, 0, 1500, 750);
            
            int red = (int)(Math.random()*225);
            int green = (int)(Math.random()*225);
            int blue = (int)(Math.random()*225);
            first = new Color(red,green,blue);
            red = (int)(Math.random()*225);
            green = (int)(Math.random()*225);
            blue = (int)(Math.random()*225);
            Color sec = new Color(red, green, blue);
            GradientPaint gt = new GradientPaint(0,0,first,1500,750,sec);
            g2.setPaint(gt);
            g2.fillRect(0, 0, 1500, 750);
            
        }
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw dr = new draw();
        frame.getContentPane().add(dr);
        frame.setSize(1500, 750);
        frame.setVisible(true);
        for(int i=0; i<100; i++){
            dr.repaint();
            try{
                Thread.sleep(200);
            }catch(Exception ex){}
        }
    }

    public static void main(String[] args) {
        MoreCreative gui = new MoreCreative();
        gui.go();
    }
    
}
