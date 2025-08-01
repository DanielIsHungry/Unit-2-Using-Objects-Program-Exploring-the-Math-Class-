public class sin_cos_tan_of_num {
    public static void main(String[] args) {
        double random = Math.random() * 91 - 90;

        System.out.printf("The chosen angle size is %f.%n", random);
        System.out.printf("Sine: %f%n", Math.sin(random));
        System.out.printf("Cosine: %f%n", Math.cos(random));
        System.out.printf("Tangent: %f%n", Math.tan(random));
    }
}
