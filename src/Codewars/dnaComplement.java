package Codewars;

public class dnaComplement {
     public static void main(String[] args) {
            System.out.println(makeComplement("AAAAAA"));
            System.out.println(makeComplement("ATCGAA"));
        }


        public static String makeComplement(String dna) {
            //Your code
            StringBuilder com= new StringBuilder(dna.length());

            for (int i = 0; i < dna.length(); i++) {
                switch (dna.charAt(i)) {
                    case('a'):{
                        com.append('t');
                        break;
                    }
                    case('A'):{
                        com.append('T');
                        break;
                    }
                    case('t'):{
                        com.append('a');
                        break;
                    }
                    case('T'):{
                        com.append('A');
                        break;
                    }
                    case('c'):{
                        com.append('g');
                        break;
                    }
                    case('C'):{
                        com.append('G');
                        break;
                    }
                    case('g'):{
                        com.append('c');
                        break;
                    }
                    case('G'):{
                        com.append('C');
                        break;
                    }
                }

            }
            return String.valueOf(com);
        }

    }


