package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="aabbbcccc";

        String result = ""; //check and the character hasn't been added to result add it.

        for (int i = 0; i < str.length(); i++){//i: index number of str

           char each = str.charAt(i);//
            System.out.println("each character: "+ each+" "+i+" result is "+result);
           if(!result.contains(""+ each)){//if string result doesn't contain the character of string str yet
               result+=each;//then we will add the character to string result.
               System.out.println("we added each character: "+ each+" result is = " +result);
           }

        }

        System.out.println(result);


    }
}
/*
3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */