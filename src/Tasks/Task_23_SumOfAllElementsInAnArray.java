package Tasks;

public class Task_23_SumOfAllElementsInAnArray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,10,-5};
        int sum = 0;

        for(int i=0;i<=num.length-1;i++){
            sum=sum+num[i];
        }
        System.out.println("Sum of all elements in the array is: "+ sum);
    }
}
