/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerModel;

import db.DBConnection;
import dto.CustomerDto;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author vinod
 */
public class CustomerModel {
    
    
    public List<CustomerDto> getAllCustomers() throws SQLException, ClassNotFoundException{
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="SELECT * FROM customer";
        PreparedStatement statement =connection.prepareStatement(sql);
        
        List<CustomerDto> customerDtos= new ArrayList<>();
        
        ResultSet result=statement.executeQuery();
        
        while(result.next()){
            CustomerDto dto=new CustomerDto();
            
            dto.setCustID(result.getString("CustId"));
            dto.setCustTitle(result.getString("CustTitle"));
            dto.setCustName(result.getString("CustName"));
            dto.setDOB(result.getString("DOB"));
            dto.setSalary(result.getDouble("salary"));
            dto.setCustAddress(result.getString("CustAddress"));
            dto.setCity(result.getString("City"));
            dto.setProvince(result.getString("Province"));
            dto.setPostalCode(result.getString("PostalCode"));
           
            customerDtos.add(dto);
        }
      return customerDtos;
    }
    
    public CustomerDto getCustomer(String custId) throws SQLException, ClassNotFoundException{
        Connection connection=DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, custId);
        
        ResultSet rst = statement.executeQuery();
        
        if(rst.next()){
            CustomerDto dto = new CustomerDto();
            dto.setCustID(rst.getString("CustId"));
            dto.setCustTitle(rst.getString("CustTitle"));
            dto.setCustName(rst.getString("CustName"));
            dto.setDOB(rst.getString("DOB"));
            dto.setSalary(rst.getDouble("salary"));
            dto.setCustAddress(rst.getString("CustAddress"));
            dto.setCity(rst.getString("City"));
            dto.setProvince(rst.getString("Province"));
            dto.setPostalCode(rst.getString("PostalCode"));
            
            return dto;
        }
        return null;
    }
    
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
    
    public String delete(String id) throws SQLException, ClassNotFoundException{
        Connection connection=DBConnection.getInstance().getConnection(); 
        String sql = "DELETE FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, id);
        
        int affectedRows = statement.executeUpdate();
        return affectedRows > 0 ? "Success" : "Fail";
    }
}
