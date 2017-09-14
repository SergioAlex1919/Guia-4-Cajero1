/*
Clase para consultar clave en base de datos
 */
package Graficos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static net.ucanaccess.converters.Functions.string;

/**
 *
 * @author sergio.diazr
 */
public class consulta {
   // Objeto COnectar a la Base de datos
    Conectar con = new Conectar();
    
 // Variables de conexión para validación   
 Connection conect = null;
    Statement st = null;
    ResultSet rs= null;
    String query;
    
    public boolean verificar(String user,String pwr) 
    {
    int sw=0;
     //query = "selec nombre_usuario, clave_usuario FROM Usuarios where nombre_usuario = "+user+" and clave_usuario = "+pwr+"";
    query = "SELECT * from Cajero_1 where Nombre = '"+user+"' and Clave= '"+pwr+"'";
    try{
    conect = con.conectado();
    st = conect.createStatement();
    rs=st.executeQuery(query);  
    
    while (rs.next()){
        if (rs.getString (1)==null)
            sw=0; 
        else
            sw=1;
        
            }
                }
    catch(SQLException e)
    {
    JOptionPane.showMessageDialog(null, " Error Sql" +e);
    }
       
    if(sw==1) return true;
    else return false;
      
   }
    
    
}
 



    






 /*public String mostrar_Saldo ()
 {
        String nom=null;
        String identi=null;
    try{
     query = "SELECT * from Cajero_1 where Nombre = "+nom+" and Identificacion = "+identi+" ";
    
    conect = con.conectado();
    st = conect.createStatement();
    rs=st.executeQuery(query);  
    
    if (rs.next()){
  String saldo;     
saldo = rs.getString("Valor_Saldo");
return saldo;
    }
    
              }
    catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error grave: " + e.getMessage());
 }
*/
  
    
   

