/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomerModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dto.ItemDto;
import db.DBConnection;

/**
 *
 * @author vinod
 */
public class ItemModel {
    public ArrayList<ItemDto> getAll() throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Item";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        ResultSet rst = statement.executeQuery();
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        
        while(rst.next()){
            ItemDto itemDto = new ItemDto();
            itemDto.setItemCode(rst.getString("ItemCode"));
            itemDto.setDescription(rst.getString("Description"));
            itemDto.setPackSize(rst.getString("PackSize"));
            itemDto.setUnitPrice(rst.getDouble("UnitPrice"));
            itemDto.setQoh(rst.getInt("QtyOnHand"));
            
            itemDtos.add(itemDto);
        }
        return itemDtos;
    }
}
