public class Practice {
    public static void main(String[] args) {
        int counteven=0;
        int countodd=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                counteven=counteven+1;
            }
            else{
                countodd= countodd+1;
            }
        }
        System.out.println("There are "+ counteven+" even numbers between 1 and 10");
        System.out.println("There are "+ countodd+" odd numbers between 1 and 10");

    }
}
