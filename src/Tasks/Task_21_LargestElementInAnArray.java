package Tasks;

public class Task_21_LargestElementInAnArray {
    public static void main(String[] args) {
        int [] scores = {11,89,109,66,9,103,34};
        int max = 0;

        for(int i=0;i<scores.length;i++){
            if(scores[i] > max){
                max=scores[i];

            }
        } System.out.println("Max number is:" + max);
    }
}
