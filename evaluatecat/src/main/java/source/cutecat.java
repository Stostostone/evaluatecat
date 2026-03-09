package main.java.source;

import javax.swing.*;
import java.awt.*;

//这是一个小猫评分器
//version 1.0
public class cutecat extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        int width = getWidth();
        int height = getHeight();
        Image img = new ImageIcon("cutecat.jpg").getImage();
        g.drawImage(img,0,0,width,height,null);
    }
    //打印小猫图片

    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1920,1080);
        window.setContentPane(new cutecat());
        window.setVisible(true);
        evaluatecat evaluatecat = new evaluatecat();
    }
}
