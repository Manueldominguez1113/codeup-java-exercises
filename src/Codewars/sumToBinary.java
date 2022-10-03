package Codewars;

public class sumToBinary {
    public static void main(String[] args) {
    String answer= binaryAddition(0,2);
        System.out.println(answer);
    }


    public static String binaryAddition(int a, int b){
        //your code here
        int sum=a+b;
        int remainder;
        StringBuilder answer = new StringBuilder();

        do {
            remainder = sum % 2;
            sum=sum/2;
            answer.append(remainder);

        }
        while(sum > 0 );


        return answer.reverse().toString();
    }
}
