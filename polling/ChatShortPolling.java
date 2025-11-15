// ChatShortPolling.java
import java.util.Random;

class Server {
    private Random ping=new Random();
    private int dataVersion=0;

    public String getUpdate(int lastVersion){
        if(ping.nextInt(5)==0){
            dataVersion++;
            return "New version"+ dataVersion;
        }
        return null;
    }
}

public class ChatShortPolling {
    public static void main(String[] args) throws InterruptedException {
        Server serv=new Server();
        int lastversion=0;

        System.out.println("Client started short polling...");

        while(true){
            String update=serv.getUpdate(lastversion);

            if(update!=null){
                lastversion++;
                System.out.println(update);
            }else{
                System.out.println("No new version available");
            }
        Thread.sleep(2000);

        }
    }
}
