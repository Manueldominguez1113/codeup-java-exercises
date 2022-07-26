public class empty {
//in an array of numbers, return an array of booleans determining whether the number[i]=(i+1)*x, where x is: left <= x => right;

    static int[] arrayy = new int[5];
    static boolean[] answer = new boolean[5];
    static int left = 1;
    static int right =3;


    public static void main(String[] args) {

        arrayy[0]=8;
        arrayy[1]=5;
        arrayy[2]=6;
        arrayy[3]=16;
        arrayy[4]=5;


        for(int i=0 ; i<arrayy.length; i++){
            answer[i]=false;
            for (int x=left; x<=right;x++){
                if ((i + 1) * x == arrayy[i]) {
                    answer[i] = true;
                    break;
                }
            }

        }



    }
}
