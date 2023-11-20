package co.bank.util;

import lombok.Setter;
import java.sql.*;

@Setter
public class Conection {
    private Connection con = null;
    private static Conection db;
    private PreparedStatement preparedStatement;
    //private static Conexion db;
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String dbName = "Bank";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String id = "12345";
    private static final String password;

    static {
        password = "F12345";
    }

    public Conection(){
        try{
            Class.forName(driver).newInstance();
            con = (Connection) DriverManager.getConnection(url + dbName, id, password);
        }catch(InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }catch(Exception e){
            //Todo auto-generated catch block
            e.printStackTrace();
        }
    }
    public void closeConnection(){
        try{
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static Conection getConexion(){
        if (db == null){
            db = new Conection();
        }
        return db;
    }
    public ResultSet query() throws SQLException{
        ResultSet res = preparedStatement.executeQuery();
        return res;
    }
    public int execute() throws SQLException{
        int result = preparedStatement.executeUpdate();
        return result;
    }
    public PreparedStatement setPreparedStatement(String sql) throws SQLException{
        this.preparedStatement = con.prepareStatement(sql);
        return this.preparedStatement;
    }
}
