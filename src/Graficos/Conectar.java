/*
 * Actividad 2 de Guia 4
* Sergio Diaz
*9 de Septimebre de 2017
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sergio.diazr
 */
public class Conectar {
  Connection conect = null;
  
  // Método de conexión a la base de datos:
  
  public Connection conectado(){
      
      try{
      Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    
      //Conexión a la Base de datos en la ruta del equipo: C:\\Users\\sergio.diazr\\Documents\\Cajero1.accdb
      
      conect = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\sergio.diazr\\Documents\\Cajero1.accdb", "root", "");
      //JOptionPane.showMessageDialog(null, "conexion_correcta" );
  }
  catch(HeadlessException | ClassNotFoundException | SQLException e){
     //JOptionPane.showMessageDialog(null, "conexion incorrecta"+e);   
  }    
      
      return conect;
  
  }
  
  }
          
  

