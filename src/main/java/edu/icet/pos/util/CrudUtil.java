package edu.icet.pos.util;

import edu.icet.pos.db.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUtil {

    public static <T> T execute(String sql,Object... args) throws SQLException, ClassNotFoundException {
        PreparedStatement psTM = DBConnection.getInstance().getConnection().prepareStatement(sql);

        for (int i = 0; i < args.length; i++) {
            psTM.setObject((i+1),args[i]);
        }

        if (sql.startsWith("SELECT") || sql.startsWith("select")) {
            return (T) psTM.executeQuery();
        }

        return (T)(Boolean)(psTM.executeUpdate()>0);

    }
}
