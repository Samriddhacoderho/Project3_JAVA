public class Complex {
    public static void main(String[] args) {
        int even_sum=0;
        int odd_sum=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                even_sum=even_sum+i;
            }
            else{
                 odd_sum=odd_sum+i;
            }
        }
        if(even_sum>odd_sum){
            System.out.println("Even sum is greater and the value is "+even_sum);
        }
        else{
            System.out.println("odd sum is greater "+odd_sum);
        }
    }
}

