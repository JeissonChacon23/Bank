package co.bank.dao;

import co.bank.model.Bill;
import co.bank.util.Conection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BillDao {
    private final Conection conection;
    private static final String REGISTER_MOVEMENT ="INSERT INTO users (id, username, pass, email) VALUES (?, ?, ?, ?);";

    public BillDao(Conection conection) {
        this.conection = conection;
    }

    public void register(Bill expense) throws SQLException {
        try{
            PreparedStatement preparedStatement = conection.setPreparedStatement(REGISTER_MOVEMENT);
            preparedStatement.setString(2, expense.getObservation());
            preparedStatement.setString(5, expense.getType());
            preparedStatement.setString(4, expense.getValue());
            conection.execute();
        }catch (SQLException e){
        }
    }
}
