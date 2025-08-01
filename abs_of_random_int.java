public class abs_of_random_int {
    public static void main(String[] args) {
        int random = (int)(Math.random() * (20 - -20 + 1)) - 20;


        System.out.printf("the number chosen from -20 to 20 was %d. The absolute value of this number is %d.", random, Math.abs(random));
    }
}
