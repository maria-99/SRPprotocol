public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        Server server = new Server();
        Connection connection = new Connection(server, client);

        connection.registration();
        connection.authentication();

    }

}
