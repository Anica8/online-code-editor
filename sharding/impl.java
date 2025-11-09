import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HeartbeatSharding {

    private static Connection db1Connection;
    private static Connection db2Connection;

    public static void main(String[] args) {
        
        init();

        int userId[]={90, 80, 70};

        for (int userId : userIds) {
            Connection conn = getShardConnection(userId);
        }

        closeConnections();
    }
    
    private static void init(){
        String url1="jdbc:mysql://localhost:3306/heartbeat_db1";
        String url2="jdbc:mysql://localhost:3306/heartbeat_db2";
        String user="";
        String pass="";

        db1Connection=DriverManager.getConnection(url1, user, pass);
        db2Connection=DriverManager.getConnection(url2, user, pass);
    }

    private static Connection getShardConnection(int userId){
        return (userId%2==0) ? db1Connection : db2Connection;
    }

    private static void closeConnections throws SQLException(Connection conn){
        if(db1Connection!=null) db1Connection.close();
        if(db2Connection!=null) db2Connection.close(); 
    } 
}
