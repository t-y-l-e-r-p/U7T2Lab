import java.util.ArrayList;
import java.util.Arrays;
public class testCarLot {
    public static void main(String[] args){
        Car[] cars = {new Car("Honda", 25000), new Car("Tesla" , 20), new Car("Toyota", 30)};
        ArrayList<Car> cars1 = new
        ArrayList<Car>(Arrays.asList(cars));
        System.out.println(cars1);
    }
}
