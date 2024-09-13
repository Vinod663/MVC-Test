/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc.test;

import db.DBConnection;
import java.sql.SQLException;
import view.CustomerLayout;

/**
 *
 * @author vinod
 */
public class MVCTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBConnection.getInstance().getConnection();
        new CustomerLayout().setVisible(true);
    }
    
}
