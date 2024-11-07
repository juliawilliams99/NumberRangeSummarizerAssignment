package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Julia Williams
// NumberRangeSummarizerAssignment for Impact.com 2024
// Class of interface implementation

public class NumberRangeSummarizerImplementation implements NumberRangeSummarizer {

    @Override
    public Collection<Integer> collect(String input) 
    {
        String[] numbersArray = input.split(",");
        Collection<Integer> result = new ArrayList<>();

        // for each number in numbersArray, parse to int and add to result collection
        for(String num : numbersArray)
        {
            result.add(Integer.parseInt(num)); //assuming input only contains numbers
        }

        // need to sort list from smallest to biggest number (if input was random and not in order), so made a List to sort in sequence
        List<Integer> sortedResult = new ArrayList<>(result);
        Collections.sort(sortedResult);
        return sortedResult;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) 
    {
        List<Integer> sortedResult = new ArrayList<>(input); // take input collection and convert to list, then sort
        Collections.sort(sortedResult);
        String result = ""; // end result to output

        int first = sortedResult.get(0); // the first number in sequence
        int last = sortedResult.get(0); // the last number in sequence, set to first number till changed
        
        //start from 2nd number in list, loop through till 2nd last number
        for (int i = 1; i < sortedResult.size(); i++)
        {
            int n = sortedResult.get(i); // the number that is being evaluated and checked

            //if sequence
            if (n == last + 1) {
                last = n; // extend the range of sequence to current number n
            } else // if no sequence (or if sequence is done)
            {
                //if there was no sequence
                if (first == last) {
                    result = result + last + ", ";
                } else // if there was a sequence 
                {
                    result = result + first + "-" + last + ", ";
                }

                //reset first and last number to be n
                first = n;
                last = n;
            }
        }
        
        // add the last number without the ending ", "
        if (first == last) //if there was no sequence
        {
            result = result + last;
        }
        else // if there was a sequence 
        {
            result = result + first + "-" + last;
        }
        
        return result; // change
    }

}
