import static org.junit.jupiter.api.Assertions.*;

import Utlities.Database;
import org.junit.jupiter.api.*;

import javax.xml.crypto.Data;
import java.sql.SQLException;

public class Tests {
    //Test 1 - Connecting to the database
    @Test
    public void connectDB() throws SQLException {
        Database test = new Database();

    }
    //Test 2 - Reading data from the database
    @Test
    public void ReadData() throws SQLException {
        Database test = new Database();
        test.ReadFrom();
    }
    //Test 3 - Writing data to the database
    @Test
    public void WriteData() throws SQLException {
        Database test = new Database();
        test.Writeto();
    }
    //Test 4 - Sending data over network
    @Test
    public void SendOverNetwork(){

    }
    //Test 5 - Recieving data over network
    @Test
    public void RecieveFromNetwork(){

    }
}
