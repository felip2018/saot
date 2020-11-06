/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saot.reportesLogistica;

import com.saot.model.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MANDALA
 */
public class ProductoDAO {
    
    public List<Producto> listar() throws SQLException {
        List<Producto> lista = null;
        ResultSet rs;
        Connection cn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/saotv2?user=root&password=Salvadordal1");
            
            PreparedStatement st = cn.prepareStatement("SELECT id_material, nombre, cantidad FROM material");
            
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()){
                Producto pro = new Producto();
                pro.setId_material(rs.getInt("id_material"));
                pro.setNombre(rs.getString("nombre"));
                pro.setCantidad(rs.getInt("cantidad"));
                lista.add(pro);
            }
            rs.close();
        }catch (Exception e){
            //Lo que sea
        }finally {
            if (cn !=null){
                cn.close();
            }
        }
        return lista;
    }
    
}
