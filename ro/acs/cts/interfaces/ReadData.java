package ro.acs.cts.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface ReadData {
    void readData(Connection connection) throws SQLException;
}
