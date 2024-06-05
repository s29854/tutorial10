import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Car bmw1 = new Car("bmw1", 2001);
        Car bmw2 = new Car("bmw2", 2002);
        Car bmw3 = new Car("bmw3", 2003);
        Car bmw4 = new Car("bmw4", 2004);
        Car bmw5 = new Car("bmw5", 2005);
        Car bmw6 = new Car("bmw6", 2006);
        Car bmw7 = new Car("bmw7", 2007);
        Car bmw8 = new Car("bmw8", 2008);
        Car bmw9 = new Car("bmw9", 2009);
        Car bmw10 = new Car("bmw10", 2010);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(bmw1);
        cars.add(bmw2);
        cars.add(bmw3);
        cars.add(bmw4);
        cars.add(bmw5);
        cars.add(bmw6);
        cars.add(bmw7);
        cars.add(bmw8);
        cars.add(bmw9);
        cars.add(bmw10);
        Collections.sort(cars);
        for(Car car: cars){
            System.out.println(car.getModelName()+" "+car.getYearOfProduction());
        }
        
    }
}
