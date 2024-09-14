/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import CustomerModel.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;
import dto.ItemDto;

/**
 *
 * @author vinod
 */
public class ItemController {
    private final ItemModel ITEM_MODEL=new ItemModel();
    
    public ArrayList<ItemDto> getAllItems() throws SQLException, ClassNotFoundException{
        ArrayList<ItemDto> itemDtos = ITEM_MODEL.getAll();
        return itemDtos;
    }
    
    public ItemDto searchItem(String itemCode) throws SQLException, ClassNotFoundException{
        ItemDto dto = ITEM_MODEL.getItem(itemCode);
        return dto;
    }
    
    public String saveItem(ItemDto itemDto) throws SQLException, ClassNotFoundException{
        String resp = ITEM_MODEL.save(itemDto);
        return resp;
    }
    
    public String updateItem(ItemDto itemDto) throws SQLException, ClassNotFoundException{
        String resp = ITEM_MODEL.update(itemDto);
        return resp;
    }
}
