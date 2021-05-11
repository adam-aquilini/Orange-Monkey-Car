import Utlities.Database;
import Utlities.Network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class Main {
    public Main() throws SQLException, IOException {
        Database database = new Database();
        ServerSocket serverSocket = new ServerSocket(12345);
        for (;;) {
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();

        }
    }
}
