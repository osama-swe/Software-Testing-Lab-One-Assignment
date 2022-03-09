public class Watermelon {

    public String solve(int n) {
        if (n<1 || n>100) return "Input out of Boundaries";
        if (n > 3 && n%2==0)
            return "YES";
        return "NO";
    }
}
