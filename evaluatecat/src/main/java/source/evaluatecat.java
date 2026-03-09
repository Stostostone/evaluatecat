package main.java.source;

import javax.swing.*;

//这是小猫评分器互动部分
public class evaluatecat extends JPanel{
    private int n;
    private String type;
    private int m;

    public evaluatecat(){
        type = JOptionPane.showInputDialog("<html>"+
                "<h1>Is this cat cute?</h1>"+
                "</html>");
        if (type.equals("yes")||type.equals("Yes")){
            n = Integer.parseInt(JOptionPane.showInputDialog(
                    "<html>" +
                            "<h1>Give a score to this cute cat (^v^) </h1>"+
                            "</html>"));
        }
        else{
            n = Integer.parseInt(JOptionPane.showInputDialog("<html>" +
                    "<h1>Nooooo!,It is obviously cute!!!</h1>"+
                    "<p><h1>Please give a score to this cute cat (.\\ ^ /.) </h1></p>"+
                    "</html>"));
        }
        if (n<1000) {
            m = Integer.parseInt(JOptionPane.showInputDialog("<html>" +
                    "<h1>THis score is too low!! I can't accept it! I will give you last chance</h1>"+
                    "</html>"));
        }
        if (m<10000){
            JOptionPane.showMessageDialog(null,
                    "<html>"+
                            "<h1>OK I will punish you. Your score is too low.....</h1>"+
                            "<h1> :( </h1>"+
                            "</html>");
        }
        else{
            JOptionPane.showMessageDialog(null,"<html>" +
                    "<h1>Yeah~ you are a genius</h1>"+
                    "<p><h1> :) </h1></p>"+
                    "</html>");
        }
    }
/*
    //test
    public static void main(String[] args){
        evaluatecat evaluatecat = new evaluatecat();
    }
*/
}
