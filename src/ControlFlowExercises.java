public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i =5;
//        while(i <15){
//            System.out.println(i);
//            i++;

//        int i =0;
//        do {
//            i+=2;
//            System.out.println(i);
//        } while (i<100);

//        int i =100;
//        do {
//            i-=5;
//            System.out.println(i);
//        } while (i>-10);

        int i =2;
        do {
            i*=i;
            System.out.println(i);
        } while (i<60000); // wont run corrently once passes 1million. 60k works better.

    }
}
