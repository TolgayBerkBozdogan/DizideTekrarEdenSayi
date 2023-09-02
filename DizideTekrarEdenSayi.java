public class DizideTekrarEdenSayi {
    public static void main(String[] args) {
        /*
        int[] numbers = {12,45,696,964,65432,25,25,74,99,8632,24,24,25};
        for (int i=0; i<numbers.length-1; i++){
            if(numbers[i] == numbers[i+1] ){
                System.out.println("Ardışık tekrar eden sayı : "+numbers[i]);
            }
        }
         */

        int[] numbers = {12,45,696,964,65432,26,26,74,99,8632,24,24,25};
        for (int i=0; i<numbers.length-1; i++){
            if(numbers[i]%2==0)
                if(numbers[i] == numbers[i+1]){
                System.out.println("Ardışık tekrar eden çift sayı : "+numbers[i]);
            }
        }






    }
}
