package day19_Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        
int[] numbers={100,20,500,40,-10,30};

int max = numbers[0];//assume first element is the max number
        for (int i = 1; i < numbers.length; i++) {// i: 1,2,3,4,5
            if(numbers[i]>max){//compares the element with current maximum number
                max=numbers[i];// replace the current maximum number
            }
        }
        System.out.println("max = " + max);


    }
}
