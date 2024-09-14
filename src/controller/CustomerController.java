/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import CustomerModel.CustomerModel;
import dto.CustomerDto;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author vinod
 */
public class CustomerController {
    private final CustomerModel customerModel=new CustomerModel();
    
    public  List<CustomerDto> getAll() throws SQLException, ClassNotFoundException{
         List<CustomerDto> customerDtos = customerModel.getAllCustomers();
         return customerDtos;
    }
    
    public CustomerDto searchCustomer(String customerCode) throws SQLException, ClassNotFoundException{
        CustomerDto dto = customerModel.getCustomer(customerCode);
        return dto;
    }
    
    public void save(CustomerDto dto) throws SQLException, ClassNotFoundException{
        customerModel.saveCustomer(dto);
    }
    
    public String deleteCustomer(String id) throws SQLException, ClassNotFoundException{
      String result= customerModel.delete(id);
      return result;
    }
    
    public String updateCustomer(CustomerDto custDto) throws SQLException, ClassNotFoundException{
        String resp = customerModel.update(custDto);
        return resp;
    }
}
