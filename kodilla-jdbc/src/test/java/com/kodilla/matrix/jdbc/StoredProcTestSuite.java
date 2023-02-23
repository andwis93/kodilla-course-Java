package com.kodilla.matrix.jdbc;

import org.junit.jupiter.api.Test;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StoredProcTestSuite {
    DbManager dbManager = DbManager.getInstance();

    @Test
    void testUpdateVipLevels() throws SQLException {
        // Given
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        // When
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement2.execute(sqlProcedureCall);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement2.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }

    @Test
    void testUpdateBestsellers() throws SQLException {
        //Given
        String sqlUpdateBooks = "UPDATE BOOKS SET BESTSELLER=false";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdateBooks);

        //When
        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        statement2.execute(sqlProcedureCall);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY_BS FROM BOOKS WHERE BESTSELLER=true";
        ResultSet rs = statement2.executeQuery(sqlCheckTable);

        //Then
        int howManyBS = -1;
        if (rs.next()) {
            howManyBS = rs.getInt("HOW_MANY_BS");
        }
        assertNotEquals(0, howManyBS);
        rs.close();
        statement.close();
        statement2.close();
    }
}
