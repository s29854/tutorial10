public class Car implements Comparable<Car>{
    private String modelName;
    private int yearOfProduction;

    public Car(String modelName, int yearOfProduction) {
        this.modelName=modelName;
        this.yearOfProduction=yearOfProduction;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public int compareTo(Car car) {
        if(yearOfProduction==car.getYearOfProduction())
            return 0;
        else if(yearOfProduction>car.getYearOfProduction())
            return 1;
        else
            return -1;
    }
}
