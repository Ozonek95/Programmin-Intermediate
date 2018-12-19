package carssaloncopy.carssalon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientService {
    Client client;
    List<Car> carList = new ArrayList<>();
    AvailablePartsReturner availablePartsReturner = new AvailablePartsReturner();
    Car car1 = new CarImp(10000);
    Car car2 = new CarImp(20000);
    Car car3 = new CarImp(30000);
    Car car4 = new CarImp(40000);
    Car car5 = new CarImp(50000);
    Car carPicked = null;

    public ClientService() {
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }



    public void setClient(Client client) {
        this.client = client;
        availablePartsReturner.setClient(client);
    }

    public List<Car> carsInMoneyRange() {
        double clientMoney = client.getMoneyToSpend();
        List<Car> availableCars = new ArrayList<>();
        carList.stream().filter(c -> c.getPrice() < clientMoney).forEach(availableCars::add);
        return availableCars;
    }

    public void pickCar() {
        Scanner scanner = new Scanner(System.in);
        List<Car> availableCars = carsInMoneyRange();
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println((i + 1) + ". " + availableCars.get(i));
        }
        if(carPicked!=null){
            client.setMoneyToSpend(client.getMoneyToSpend()+carPicked.getPrice());
        }
        carPicked = availableCars.get(scanner.nextInt() - 1);
        availablePartsReturner.setCarPicked(carPicked);
        client.setMoneyToSpend(client.getMoneyToSpend() - carPicked.getPrice());
        pickColor();
    }

    public void pickColor(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick Color,  press 0 to step back.");
        List<CarColor> colors = availablePartsReturner.availableColor();
        for (int i = 0; i < colors.size(); i++) {
            System.out.println((i+1)+". "+colors.get(i));
        }

        int choice = scanner.nextInt();
        if(choice==0){
            pickCar();
        }
        CarColor color = colors.get(choice-1);

        client.setMoneyToSpend(client.getMoneyToSpend()+carPicked.getColor().getPrice());
        carPicked.setColor(color);
        client.setMoneyToSpend(client.getMoneyToSpend()-carPicked.getColor().getPrice());
        pickCarBodyType();

    }
    public void pickCarBodyType(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick Car Body,  press 0 to step back.");
        List<CarBody> carBodyTypes = availablePartsReturner.availableCarBodies();
        for (int i = 0; i < carBodyTypes.size(); i++) {
            System.out.println((i+1)+". "+carBodyTypes.get(i));
        }

        int choice = scanner.nextInt();
        if(choice==0){
            pickColor();
        }
        CarBody carBody = carBodyTypes.get(choice-1);

        client.setMoneyToSpend(client.getMoneyToSpend()+carPicked.getCarBody().getPrice());
        carPicked.setCarBody(carBody);
        client.setMoneyToSpend(client.getMoneyToSpend()-carPicked.getCarBody().getPrice());
        pickEngine();
    }

    public void pickEngine(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick engine, press 0 to step back.");
        List<Engine> carEngines = availablePartsReturner.availableEngines();
        for (int i = 0; i < carEngines.size(); i++) {
            System.out.println((i+1)+". "+carEngines.get(i));
        }

        int choice = scanner.nextInt();
        if(choice==0){
            pickCarBodyType();
        }
        Engine engine = carEngines.get(choice-1);

        client.setMoneyToSpend(client.getMoneyToSpend()+carPicked.getEngine().getPrice());
        carPicked.setEngine(engine);
        client.setMoneyToSpend(client.getMoneyToSpend()-carPicked.getEngine().getPrice());
        pickUpholstery();
    }

    public void pickUpholstery(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick upholstery, press 0 to step back.");
        List<Upholstery> upholsteries = availablePartsReturner.availableUpholstery();
        for (int i = 0; i < upholsteries.size(); i++) {
            System.out.println((i+1)+". "+upholsteries.get(i));
        }

        int choice = scanner.nextInt();
        if(choice==0){
           pickEngine();
        }
        Upholstery upholstery = upholsteries.get(choice-1);

        client.setMoneyToSpend(client.getMoneyToSpend()+carPicked.getUpholstery().getPrice());
        carPicked.setUpholstery(upholstery);
        client.setMoneyToSpend(client.getMoneyToSpend()-carPicked.getUpholstery().getPrice());
    }


    public void displayCar(){
        System.out.println(carPicked);
    }


}
