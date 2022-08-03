public class pairingStrings {
    public static void main(String[] args) {
        String[] answer= solution("abc");
        String sol= "abc";
        System.out.println((double)sol.length()/2);
        System.out.println((int)Math.ceil((sol.length()/2)+0.5));
    for(String pair: answer){
        System.out.println(pair);
    }
    }


    public static String[] solution(String s) {
        //Write your code here

        System.out.println();
        String[] answer=new String[(int)Math.ceil((s.length()/2)+0.5)];
        int index=0;
        for(int i=0;i<s.length();i++){
        if(i+1<s.length()){
            answer[index]= ""+s.charAt(i)+s.charAt(i+1);
            index++;
        }
        if(i+1==s.length()){
            answer[index]= s.charAt(i)+"_";
        }

        }

        return answer;
    }
}