/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import CustomerModel.CustomerModel;
import dto.CustomerDto;
import java.sql.SQLException;

/**
 *
 * @author vinod
 */
public class CustomerController {
    private final CustomerModel customerModel=new CustomerModel();
    
    public void save(CustomerDto dto) throws SQLException, ClassNotFoundException{
        customerModel.saveCustomer(dto);
    }
}
