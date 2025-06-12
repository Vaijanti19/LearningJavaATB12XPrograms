package Tasks;

public class Task_19_SumOfAllEven_OddNumbers_In_Array {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int even = 0;
        int odd = 0;
        int sumeven = 0;
        int sumodd = 0;

        for(int i=0;i<num.length;i++){
            if(num[i]%2 == 0){
                even=num[i];
                System.out.println(even + ": is an Even number");
                sumeven=sumeven+num[i];
            }else{
                odd=num[i];
                System.out.println(odd + ": is an Odd number");
                sumodd=sumodd+num[i];
            }
        }
        System.out.println("Sum off all Even Numbers is: "+ sumeven);
        System.out.println("Sum off all Odd Numbers is: "+ sumodd);

    }
}
