package carssaloncopy.carssalon;

import java.util.ArrayList;
import java.util.List;

public class AvailablePartsReturner {
    private Client client;
    private Car carPicked;

    public void setClient(Client client) {
        this.client = client;
    }

    public void setCarPicked(Car carPicked) {
        this.carPicked = carPicked;
    }

    public List<CarColor> availableColor(){
        double moneyToSpendIfChangeColour = client.getMoneyToSpend()+carPicked.getColor().getPrice();
        CarColors[] colors = CarColors.values();
        List<CarColor> availableColors = new ArrayList<>();
        for (CarColors color : colors) {
            if (moneyToSpendIfChangeColour > color.getPrice()) {
                availableColors.add(color);
            }
        }
        return availableColors;
    }

    public List<Upholstery> availableUpholstery(){
        double moneyToSpendIfCHangeUpholstery = client.getMoneyToSpend()+carPicked.getUpholstery().getPrice();
        List<Upholstery> upholsteries = new ArrayList<>();
        CarUpholstery[] upholsteries1 = CarUpholstery.values();
        for (int i = 0; i < upholsteries1.length; i++) {
            if(moneyToSpendIfCHangeUpholstery>upholsteries1[i].getPrice()){
                upholsteries.add(upholsteries1[i]);
            }
        }
        return upholsteries;
    }

    public List<CarBody> availableCarBodies(){
        double moneyToSpendIfChangeCarBody = client.getMoneyToSpend() + carPicked.getCarBody().getPrice();
        List<CarBody> availableCarBodies = new ArrayList<>();
        CarBodyType[] carBodyTypes = CarBodyType.values();
        for (int i = 0; i < carBodyTypes.length; i++) {
            if(moneyToSpendIfChangeCarBody>carBodyTypes[i].getPrice()){
                availableCarBodies.add(carBodyTypes[i]);
            }
        }
        return availableCarBodies;
    }

    public List<Engine> availableEngines(){
        double moneyToSpendIfChangeEngine = client.getMoneyToSpend() + carPicked.getEngine().getPrice();
        List<Engine> availableEngines = new ArrayList<>();
        CarEngine[] carEngines = CarEngine.values();
        for (int i = 0; i < carEngines.length; i++) {
            if(moneyToSpendIfChangeEngine>carEngines[i].getPrice()){
                availableEngines.add(carEngines[i]);
            }
        }
        return availableEngines;
    }

}
