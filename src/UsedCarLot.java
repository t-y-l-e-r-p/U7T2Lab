import java.util.ArrayList;
/**
THis class represents a car lot
 @author Tyler Pang

*/
public class UsedCarLot {
    /** The list of cars **/
    private ArrayList<Car> inventory;
   /** Instantiates the list of cars**/
    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }

    /** Adds a car object*
     *
     * @param car car object
     */
    public void addCar(Car car){
        inventory.add(car);
    }

    /** Returns the Arraylist of the cars
     *
     * @return the arraylist
     */
    public ArrayList<Car> getInventory(){
        return inventory;
    }

    /** swaps the position of 2 cars
     *
     * @param a The position of car 1
     * @param b The position of car 2
     * @return true if the swap was sucessful and false if it was not.
     */
    public boolean swap(int a, int b){
        if(b>= a){
            if(b+1 >inventory.size()){
                return false;
            }
            if(a < 0){
                return false;
            }
        }
        if(b < a){
            if(a+1 >inventory.size()){
                return false;
            }
            if(b < 0){
                return false;
            }
        }

            Car temp = inventory.get(a);
            Car temp1 = inventory.get(b);
            inventory.set(a, temp1);
            inventory.set(b, temp);
            return true;
    }
    /* Adds a Car to the inventory list at the index specified
    by indexToAdd; this method increases the size of inventory by 1
    PRECONDITION: 0 <= indexToAdd < inventory.size()
    DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
    like you did the other addCar method; also note that this method is void
*/

    /** adds a car object to a specific index
     * PRECONDITION:0 is less than or equal to indexToAdd is less than inventory.size()
     *
     * @param indexToAdd the index to put the new car object.
     * @param carToAdd the new car object
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd );
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */

    /**
     * Removes a car at a specific index.
     * <p>
     * PRECONDITION: indexOfCarToSell is less than inventory.size()
     *
     * @param indexOfCarToSell the index of which car to remove
     * @return the car that will be removed
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */

    /**
     * Removes a car and replaces it will a null
     * <p>
     * PRECONDITION: indexOfCarToSell is less than inventory.size()
     *
     * @param indexOfCarToSell the index of the car to be removed
     * @return the car that is removed
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car temp = null;
        Car temp1 = inventory.get(indexOfCarToSell);
        inventory.remove(indexOfCarToSell);
        inventory.add(indexOfCarToSell, temp);
        return temp1;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */

    /**
     * Moves cars to a specific index, and shifts all other cars in the list.
     * <p>
     * PRECONDITIONS: indexOfCarToMove is less than inventory.size()
     * destinationIndex is less than inventory.size()
     *
     * @param indexOfCarToMove The index of the car that is being moved
     * @param destinationIndex The index that the car will be moved too
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car move = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, move);
    }
    //System.out.println("Homework edit");

}
