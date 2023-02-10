/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class MessageDialog01 {

    
    public static void main(String[] args) {
        ImageIcon img=new ImageIcon("images.PNG");
        JOptionPane.showMessageDialog(null,"Wrong Password","Warning",JOptionPane.INFORMATION_MESSAGE,img);
       
    }
    
}
