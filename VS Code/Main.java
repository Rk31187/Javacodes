
public class Main{
    public static void main (String []args){
        char ch= 'A';
        int i =ch;
        System.out.println("ASCII value of " + ch +" is :"+ i);
        char  CapitalChar='A';
        char smallChar='a';
        for (i='A';i<='Z';i++){
        System.out.println(CapitalChar +" : "+ i);
        CapitalChar++;
        }
        for(i='a';i<='z';i++){
            System.out.println(smallChar +" : "+i);
            smallChar++;
        }
    }
}