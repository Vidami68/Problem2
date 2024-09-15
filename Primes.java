public class Primes
{
    public static void main(String[] args) {
        int nValues = 50;

        outerLoop:
        for (int i = 2; i <= nValues; i++) 
        {
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0) 
                    continue outerLoop; // Jumps to the "outerLoop" label if a divisor is found.              
           }
            
            System.out.println(i); // This command is only executed for numbers that do not have a divisor.
        }
    }
}