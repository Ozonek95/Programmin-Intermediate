package carssalon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClientService {
    private Client client;
    private List<Car> carList = Arrays.asList(
            new CarImp(10000),
            new CarImp(20000),
            new CarImp(30000),
            new CarImp(40000),
            new CarImp(50000));

    private AvailablePartsReturner availablePartsReturner;
    private Car carPicked = null;

    public ClientService(Client client) {
        this.client = client;
        availablePartsReturner = new AvailablePartsReturner(this.client);
    }


    public void setClient(Client client) {
        this.client = client;
    }

    private List<Car> carsInMoneyRange() {
        double clientMoney = client.getMoneyToSpend();
        List<Car> availableCars = new ArrayList<>();
        carList.stream().filter(c -> c.getPrice() < clientMoney).forEach(availableCars::add);
        return availableCars;
    }

    private void pickCar() {
        Scanner scanner = new Scanner(System.in);
        List<Car> availableCars = carsInMoneyRange();
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println((i + 1) + ". " + availableCars.get(i));
        }
        if (carPicked != null) {
            client.setMoneyToSpend(client.getMoneyToSpend() + carPicked.getPrice());
        }
        carPicked = availableCars.get(scanner.nextInt() - 1);
        availablePartsReturner.setCarPicked(carPicked);
        client.setMoneyToSpend(client.getMoneyToSpend() - carPicked.getPrice());
        pickColor();
    }

    private void pickColor() {

        clientMoney();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick Color,  press 0 to step back.");
        List<CarColors> colors = availablePartsReturner.availableColor();
        for (int i = 0; i < colors.size(); i++) {
            System.out.println((i + 1) + ". " + colors.get(i));
        }

        int choice = scanner.nextInt();
        if (choice == 0) {
            pickCar();
        }
        CarColors color = colors.get(choice - 1);

        client.setMoneyToSpend(client.getMoneyToSpend() + carPicked.getColor().getPrice());
        carPicked.setColor(color);
        client.setMoneyToSpend(client.getMoneyToSpend() - carPicked.getColor().getPrice());
        pickCarBodyType();

    }

    private void pickCarBodyType() {
        clientMoney();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick Car Body,  press 0 to step back.");
        List<CarBodyType> carBodyTypes = availablePartsReturner.availableCarBodies();
        for (int i = 0; i < carBodyTypes.size(); i++) {
            System.out.println((i + 1) + ". " + carBodyTypes.get(i));
        }

        int choice = scanner.nextInt();
        if (choice == 0) {
            pickColor();
        }
        CarBodyType carBody = carBodyTypes.get(choice - 1);

        client.setMoneyToSpend(client.getMoneyToSpend() + carPicked.getCarBody().getPrice());
        carPicked.setCarBody(carBody);
        client.setMoneyToSpend(client.getMoneyToSpend() - carPicked.getCarBody().getPrice());
        pickEngine();
    }

    private void pickEngine() {
        clientMoney();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick engine, press 0 to step back.");
        List<CarEngine> carEngines = availablePartsReturner.availableEngines();
        for (int i = 0; i < carEngines.size(); i++) {
            System.out.println((i + 1) + ". " + carEngines.get(i));
        }

        int choice = scanner.nextInt();
        if (choice == 0) {
            pickCarBodyType();
        }
        CarEngine engine = carEngines.get(choice - 1);

        client.setMoneyToSpend(client.getMoneyToSpend() + carPicked.getEngine().getPrice());
        carPicked.setEngine(engine);
        client.setMoneyToSpend(client.getMoneyToSpend() - carPicked.getEngine().getPrice());
        pickUpholstery();
    }

    private void pickUpholstery() {
        clientMoney();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick upholstery, press 0 to step back.");
        List<CarUpholstery> upholsteries = availablePartsReturner.availableUpholstery();
        for (int i = 0; i < upholsteries.size(); i++) {
            System.out.println((i + 1) + ". " + upholsteries.get(i));
        }

        int choice = scanner.nextInt();
        if (choice == 0) {
            pickEngine();
        }
        CarUpholstery upholstery = upholsteries.get(choice - 1);

        client.setMoneyToSpend(client.getMoneyToSpend() + carPicked.getUpholstery().getPrice());
        carPicked.setUpholstery(upholstery);
        client.setMoneyToSpend(client.getMoneyToSpend() - carPicked.getUpholstery().getPrice());
        displayCar();
        System.out.println(client.getMoneyToSpend());
    }


    public void displayCar() {
        System.out.println(carPicked);
    }

    public void  start(){
        pickCar();
    }

    public void clientMoney()
    {
        System.out.println(client.getMoneyToSpend());
    }

}
