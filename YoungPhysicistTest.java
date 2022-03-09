import static org.junit.Assert.*;
import org.junit.Test;

public class YoungPhysicistTest {
    @Test
    public void test(){
        YoungPhysicist y = new YoungPhysicist();

        int[][][] forces = {{{4,1,7},{-2,4,-1},{1,-5,-3}} ,  {{3,-1,7},{-5,2,-4},{2,-1,-3}}};

        for (int i = 0; i < 2; i++) {
            if (    forces[i][0][0] + forces[i][1][0]+ forces[i][2][0] == 0 &&
                    forces[i][0][1] + forces[i][1][1]+ forces[i][2][1] == 0 &&
                    forces[i][0][2] + forces[i][1][2]+ forces[i][2][2] == 0)
                assertEquals("YES", y.solve(3, forces[i])) ;

            else assertEquals("NO", y.solve(3, forces[i])) ;
        }
    }
}
