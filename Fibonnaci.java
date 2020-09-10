class Fibonacci {

    public static void main(String[] args) {

        int i = 1, n = Integer.parseInt(args[0]), t1 = 1, t2 = 2;
        System.out.print("First " + n + " terms: ");

        while (i <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
    }
}
