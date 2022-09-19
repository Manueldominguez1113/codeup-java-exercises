package Codewars;

public class xsAndOs {
    public static void main(String[] args) {
        System.out.println(getXO("XxxXoOoO"));
    }

    public static boolean getXO (String str) {

        // Good Luck!!
        int x=0;
        int o=0;

        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)== 'x' || str.charAt(i)== 'X' ){
                x++;
            }
            if(str.charAt(i)== 'o' || str.charAt(i)== 'O' ){
                o++;
            }
        }
        return o==x;
}

}
