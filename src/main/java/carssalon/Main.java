package carssalon;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService(new Client(50000));

        clientService.start();
    }

}
