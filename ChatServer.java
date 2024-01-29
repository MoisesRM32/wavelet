import java.io.IOException;
import java.net.URI;



class JoesChatServer implements URLHandler {
    
    String JoeServerText = "JOES CHAT SERVER :)";
    

    public String handleRequest(URI url){
        if (url.getPath().equals("/")){
            return JoeServerText;

        }else if (url.getPath().equals("/add-message?s= %d &user= %s")){

            return String.format("s=%d, user=%s") + "/n";
        }
        return "404 Not Found";
    }

    class ChatServer{
        public static void main(String[] args) throws IOException{
            if (args.length == 0){
                System.out.println("Input port number.");
                return;
            }
        
            int port = Integer.parseInt(args[0]);

            Server.start(port, new JoesChatServer());


        
    }

}
}
