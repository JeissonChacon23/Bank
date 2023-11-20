package co.bank.dao;

import co.bank.model.User;
import co.bank.util.Conection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private final Conection conection;
    private static final String LOGIN_SQL ="SELECT * FROM users WHERE id = ?, pass = ?);";

    public UserDao(Conection conection) {
        this.conection = conection;
    }

    public void logIn(User user) throws SQLException {
        try{
            PreparedStatement preparedStatement = conection.setPreparedStatement(LOGIN_SQL);
            preparedStatement.setInt(2, user.getId());
            preparedStatement.setString(4, user.getEmail());
            conection.execute();
        }catch (SQLException e){
        }
    }
}
