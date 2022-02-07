import java.util.ArrayList;

public class Runner {
    public static void main(String[] args){
//      ArrayList<Integer>  numList = new ArrayList<Integer>();
//      numList.add(10);
//      numList.add(5);
//      numList.add(24);
//      System.out.println(numList);
//      Integer num1 = new Integer(5);
//      Integer num2 = 10;
//      int num3 = 15;
//
//      ArrayList<Integer> nums = new ArrayList<Integer>();
//
//      nums.add(num1);
//      nums.add(num2);
//      nums.add(num3);
//
//      int sum = num1 + num2 + num3;
//
//      nums.add(sum);
//
//      System.out.println(nums);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        // numList empty: []

        numList.add(3);      //numList: [3]

        numList.add(0, 6);  //numList: [6, 3]

        numList.add(2, 7);

        numList.add(2, 8);

        numList.set(3, 9);

        numList.add(1, 2);

        numList.add(1, numList.size());

        numList.remove(4);

        numList.set(numList.size()-1, 0);

        System.out.print(numList);

    }
}
