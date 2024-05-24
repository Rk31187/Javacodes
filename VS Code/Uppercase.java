public class Uppercase{
    public static void main(String[]args){
        String a="RAMAKRISHNA";
        char b[]=a.toCharArray();
        int size=b.length;
        for(int i=0;i<=b.length;i--){
            if(i!=size){
                b[i]=(char) (b[i]+32);
                System.out.println(a);
                System.out.println(b);
            }
        }


    }
}