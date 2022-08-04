public class pairingStrings {
    public static void main(String[] args) {
        String[] answer= solution("abcdefg");
        String sol= "abc";

    for(String pair: answer){
        System.out.println(pair);
    }
    }


    public static String[] solution(String s) {
        //Write your code here
        String[] answer;
       // System.out.println();
        if(s.length()%2==0) { //if even
             answer = new String[s.length() / 2];
        } else { // if odd
             answer = new String[(s.length()+1)/2];
        }

        int index=0;
        for(int i=0;i<s.length();i++){
        if(i+1<s.length()){
            answer[index]= ""+s.charAt(i)+s.charAt(i+1);
            index++;
            i++; // to skip the next one
        }
        if(s.length()%2==1 &&i==s.length()-1){ //if odd amount of letters, @last iteration
            answer[index]= s.charAt(i)+"_";
        }


        }

        return answer;
    }
}