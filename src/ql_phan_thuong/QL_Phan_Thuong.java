/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ql_phan_thuong;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author PV
 */
public class QL_Phan_Thuong {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Login login = new Login();
        login.setVisible(true);
        login.setResizable(false);
        login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
