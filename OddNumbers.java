public class EvenNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0; 
        System.out.println("Even numbers:");

        
        for (int num : numbers) {
            if (num % 2 == 0) { 
                System.out.println(num); 
                evenCount++; 
            }
        }

        System.out.println("Count of even numbers: " + evenCount);
    }
}
