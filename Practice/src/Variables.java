public class Variables {
    static boolean isPrime(int n){
        boolean result;
        int c=0;
        for(int i=1; i<=n; i++) {
            if(n%i ==0) {
                c++;
            }
        }
        if(c==2){
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        boolean res = isPrime(2);
        System.out.println(res);
    }
}
