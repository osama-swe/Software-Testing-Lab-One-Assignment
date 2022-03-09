public class YoungPhysicist {
    public String solve(int n, int[][] forces) {

        int x=0, y=0, z=0;
        for (int i = 0; i < n; i++) {
                x += forces[i][0];
                y += forces[i][1];
                z += forces[i][2];
        }
        if (x==0 && y==0 && z==0) return "YES";
        return "NO";
    }
}
