import java.util.Arrays;

public class Practice228 {

    // HOW TO ITERATE THROUGH ARRAYS

    // //TODO: 👩🏼‍💻 Let's create a method (sumAll) that returns the sum of all integers in an int array (nums)
    // example: array of ints:[5, 2, 3, 1] // returns: 11

    // // // PSEUDOCODE
    // 1. create a method (nums)
    // // what's the method signature? --> public static
    // // what data type (if any) is being returned from this method --> int
    //
    // 2. create an array of ints
    // // 2a. What's the length of our array? --> (5)
    // // 2b. Where does this array go? --> in sumAll method

    // 3. Assign values to the array
    // // how are we going to initialize the arrat of ints?
    // // // array literal {}
    // // // array declaration new int[]

    // 4. iterate through our elements in the array
    // // where does the iteration live? --> inside of the sumAll()
    // // how do you want to iterate?
    // // // traditional FOR loop
    // // // ** enhanced for

    // 5. create a variable to store the sum
    // // where does this variable live? --> in sumAll() --> before (outside) loop
    // // what's this variable's type (int)
    // // what's this variable's starting point?

    // 6. add logic that will add each element to itself?
    // where does this logic live?
    // int sum;
    // // [1,5,3,2]
    //  //  ** sum variable = sum + index of element **
    // // 1st iteration: sum = 0 -> sum = 0 + 1 // sum = 1;
    // // 2nd iteration: sum = 1 -> sum = 1 + 5 // sum = 6;

    // 7. return the sum;
    // // where does this return statement live? --> in sumAll() after (outside) loop

    // 8. call the method
    // // where and how do we call the method --> in PSVM
    // // sout the result of the sumAll method


    public static void main(String[] args) {
    int[] warmup= {2,5,8,1,2};
    int[] oddEven = new int[2];
    int odd = 0;
    int even=  0;
    for (int num : warmup){
        if(num %2 ==0){
            even += num;
        } else{
            odd+= num;
        }
    }
    oddEven[0]= odd;
    oddEven[1]= even;
        System.out.println("should be 6,12");
        System.out.println(Arrays.toString(oddEven));


        // System.out.println(sumAll());
    }
    public static int sumAll(){
        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] =5;
        numbers[2] =3;
        numbers[3] =2;
        int total=0;
        for(int number:numbers){
            total+= number;
        }
        return total;

    }














}
