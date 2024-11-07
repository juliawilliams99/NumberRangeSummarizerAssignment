package numberrangesummarizer;

import java.io.*;
import java.util.Collection;


// Julia Williams
// NumberRangeSummarizerAssignment for Impact.com 2024
// Class containing tests

public class NumberRangeSummarizerTests {
    public static void main(String args[]) throws IOException 
    {
        NumberRangeSummarizer summarizerTest = new NumberRangeSummarizerImplementation();
        
        // to type your own input - remove '//' from the start of the next 3 lines below, and change line 24 to take 'input'
        //BufferedReader inKb = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Input your number sequence, separated by a comma ',' :");
        //String input = inKb.readLine();

        String input1 = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        String input2 = "1,5,7,9,2,4";

        Collection<Integer> collectedNumbers = summarizerTest.collect(input1); //change this to input2, or input to try your own numbers
        System.out.println("The input collected numbers: " + collectedNumbers);

        String summarizedNumbers = summarizerTest.summarizeCollection(collectedNumbers);
        System.out.println("Summarized numbers: " + summarizedNumbers);
    }
}
