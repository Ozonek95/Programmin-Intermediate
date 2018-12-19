package carssalon;

import java.util.ArrayList;
import java.util.List;

class AvailablePartsReturner {
    private Client client;
    private Car carPicked;

    AvailablePartsReturner(Client client) {
        this.client = client;
    }


    void setCarPicked(Car carPicked) {
        this.carPicked = carPicked;
    }

    List<CarColors> availableColor(){
        double moneyToSpendIfChangeColour = client.getMoneyToSpend()+carPicked.getColor().getPrice();
        CarColors[] colors = CarColors.values();
        List<CarColors> availableColors = new ArrayList<>();
        for (CarColors color : colors) {
            if (moneyToSpendIfChangeColour > color.getPrice()) {
                availableColors.add(color);
            }
        }
        return availableColors;
    }

    List<CarUpholstery> availableUpholstery(){
        double moneyToSpendIfCHangeUpholstery = client.getMoneyToSpend()+carPicked.getUpholstery().getPrice();
        List<CarUpholstery> upholsteries = new ArrayList<>();
        CarUpholstery[] upholsteries1 = CarUpholstery.values();
        for (CarUpholstery anUpholsteries1 : upholsteries1) {
            if (moneyToSpendIfCHangeUpholstery > anUpholsteries1.getPrice()) {
                upholsteries.add(anUpholsteries1);
            }
        }
        return upholsteries;
    }

    List<CarBodyType> availableCarBodies(){
        double moneyToSpendIfChangeCarBody = client.getMoneyToSpend() + carPicked.getCarBody().getPrice();
        List<CarBodyType> availableCarBodies = new ArrayList<>();
        CarBodyType[] carBodyTypes = CarBodyType.values();
        for (CarBodyType carBodyType : carBodyTypes) {
            if (moneyToSpendIfChangeCarBody > carBodyType.getPrice()) {
                availableCarBodies.add(carBodyType);
            }
        }
        return availableCarBodies;
    }

    List<CarEngine> availableEngines(){
        double moneyToSpendIfChangeEngine = client.getMoneyToSpend() + carPicked.getEngine().getPrice();
        List<CarEngine> availableEngines = new ArrayList<>();
        CarEngine[] carEngines = CarEngine.values();
        for (CarEngine carEngine : carEngines) {
            if (moneyToSpendIfChangeEngine > carEngine.getPrice()) {
                availableEngines.add(carEngine);
            }
        }
        return availableEngines;
    }

}
