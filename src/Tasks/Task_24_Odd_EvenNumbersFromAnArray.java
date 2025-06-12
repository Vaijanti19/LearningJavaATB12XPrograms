package Tasks;

public class Task_24_Odd_EvenNumbersFromAnArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,10,144,76,69};
        int even = 0;
        int odd = 0;
        int totaleven = 0;
        int totalodd = 0;

        for(int i=0;i<num.length;i++){
            if(num[i]%2 == 0){
                even=num[i];
                totaleven=totaleven+1;
                System.out.println(even + ": is an Even number");
            }else{
                odd=num[i];
                totalodd=totalodd+1;
                System.out.println(odd + ": is an Odd number");
            }
        }System.out.println("Total Even Numbers: "+ totaleven);
        System.out.println("Total Odd Numbers: "+ totalodd);

    }
}
