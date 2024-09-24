/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import CustomerModel.OrderModel;
import dto.OrderDto;

/**
 *
 * @author vinod
 */
public class OrderController {
    private OrderModel orderModel = new OrderModel();

    public String placeOrder(OrderDto orderDto) throws Exception{
        String resp = orderModel.placeOrder(orderDto);
        return resp;
    }
}
