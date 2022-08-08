

public class Program {



        public static void main(String[] args) {

            long number = 600851475143L;

            for (int counter = 2; counter <= Math.sqrt(number); counter++) {

                if (number % counter == 0) {

                    number = number / counter;

                    counter--;

                }

            }

            if (number >= 2)

                System.out.println("Largest Prime Factor :" + number);

        }

    }


