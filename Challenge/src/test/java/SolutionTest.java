import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testPrint(){
        Assert.assertEquals( "Rajesh",solution.print("Rajesh") );
    }

}