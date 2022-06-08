package self_PracticeCustomMethods;



public class MentorGroupAnimalTask {
    public static void main(String[] args) {
        System.out.println(allowedToBring("elephant","grass"));
    }

        public static boolean allowedToBring(String animal, String dish) {


            boolean result = false;
            char startAnimalChar;
            char endAnimalChar;

            startAnimalChar = animal.charAt(0);
            endAnimalChar = animal.charAt(animal.length() - 1);

            if (dish.startsWith("" + startAnimalChar) &&  dish.endsWith("" + endAnimalChar)) {
                result = true;
            } else {
                result = false;
            }

            return result;
        }

    }

