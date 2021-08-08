public class InverseNumber {

    public static void main(String[] args) {

        int n = 28346751;

        int ans = inverseNumber(n);

        System.out.println(ans);

    }

    public static int inverseNumber(int n){

        int res = 0;
        int op = 1;

        while(n > 0){

            int rem = n % 10;
            res += (op * (int)Math.pow(10 , rem -1));

            n /= 10;
            op++;

        }

        return res;

    }

}
