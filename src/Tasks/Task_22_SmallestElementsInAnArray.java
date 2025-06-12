package Tasks;

public class Task_22_SmallestElementsInAnArray {
    public static void main(String[] args) {
        int [] scores = {999,-2,11,89,109,66,9,103,34,-1};
        int min = Integer.MAX_VALUE;
        //System.out.println(min);
        for(int i=0;i<scores.length;i++){
            if(scores[i] < min){
                min=scores[i];
            }
        } System.out.println("Min number is:" + min);

    }
}
