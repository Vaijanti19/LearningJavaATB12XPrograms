package Test_05_July;

    public class Pair<T, U> {
        private T first;
        private U second;

        // Constructor
        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        // Getter methods
        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }

        // Display method
        public void display() {
            System.out.println("First: " + first + ", Second: " + second);
        }

        // Main method to test the Pair class
        public static void main(String[] args) {
            Pair<String, Integer> pair = new Pair<>("Test", 100);
            pair.display();  // Output: First: Test, Second: 100
        }
    }

