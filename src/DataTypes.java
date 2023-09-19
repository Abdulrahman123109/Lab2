import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {
        long sum = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            sum += x;
        }
        return sum;
    }
}
