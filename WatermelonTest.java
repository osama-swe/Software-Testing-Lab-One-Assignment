import static org.junit.Assert.*;
import org.junit.Test;


public class WatermelonTest {


    @Test
    public void test(){
        Watermelon w = new Watermelon();
        int[] arr = {0,1,2,3,6,99,100,101};
        for (int i = 0; i < 7; i++) {
            if(arr[i]<1||arr[i]>100){
                assertEquals("Input out of Boundaries",w.solve(arr[i]));
                continue;
            }
            if (arr[i] > 3 && arr[i]%2==0)
                assertEquals("YES", w.solve(arr[i])) ;
            else assertEquals("NO", w.solve(arr[i])) ;
        }

    }

}
