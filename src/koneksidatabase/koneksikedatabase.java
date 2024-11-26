/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksidatabase;

/**
 *
 * @author Asus
 */
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.sql.DriverManager;

public class koneksikedatabase {
    private String userid = “root”;
    private String password = “”;
//silahkan digant url-nya, tapi tergantung nama databasenya
//formatnya: “jdbc:tipeDatabase://server:port/namaDatabase”
    String url = “jdbc:mysql://localhost:3306/mahasiswadb”;
}
