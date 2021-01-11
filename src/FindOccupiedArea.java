import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindOccupiedArea
{

    public Set<Integer> ReturnAreaToBeFilled(Set<Set<Integer>> fillAreas)
    {
        Set<Integer> returnvalue = new HashSet<Integer>();

        Set<Integer> Small = null;
        Set<Integer> Medium = null;
        Set<Integer> Large = null;

        for (Set<Integer> result: fillAreas)
        {
            Small = result;
            Medium = result;
            Large = result;
        }

        for (Set<Integer> nums: fillAreas)
        {
            if(nums.size() <= Small.size())
            {
                Small = nums;
            }
            else if (nums.size() <= Large.size())
            {
                Medium = nums;
            }
            else {
                Large = nums;
            }

        }

        if(Small.size() == Large.size()) // all are the same
        {

            returnvalue.add(999);
        }
        else if(Medium.size() == Large.size()) // only one
        {
            returnvalue = Small;


        }
        else // all are different
            {
                returnvalue = Small;
                returnvalue.addAll(Medium);
        }
        return returnvalue;
    }

}
