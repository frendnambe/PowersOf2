import java.util.Arrays;

public class Program {

    public static int[] Sqr2(int n)
    {
        int result = 0;
        int[] array = new int[n + 1];
        for (int i = 0; i <= n; i++)
        {
            array[i] = (int)Math.pow(2,i);
        }
        return array;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(Sqr2(2)));
    }
}
