/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerModel;

import db.DBConnection;
import dto.CustomerDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vinod
 */
public class CustomerModel {
    public void saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException{
        Connection connection=DBConnection.getInstance().getConnection();
        
        String sqlQuery="INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement pstm=connection.prepareStatement(sqlQuery);
       pstm.setString(1, dto.getCustID());
       pstm.setString(2, dto.getCustTitle());
       pstm.setString(3, dto.getCustName());
       pstm.setString(4, dto.getDOB());
       pstm.setDouble(5, dto.getSalary());
       pstm.setString(6, dto.getCustAddress());
       pstm.setString(7, dto.getCity());
       pstm.setString(8, dto.getProvince());
       pstm.setString(9, dto.getPostalCode());
       
       int rows =pstm.executeUpdate();
        
        if(rows>0){
          
            JOptionPane.showMessageDialog(null, "Customer Saved Sucsusfully");
        }
        else{
           
           JOptionPane.showMessageDialog(null, "Error!Customer not Saved!");
     
    }
}
}
