public class solution{
    public static double myPow(double x , int n ){
        long power  = n;
        double ans = 1;
        if(power < 0){
            x = 1/x;
            power = -power;
        }

        for(long i = 0 ; i < power; i ++){
            if(power % 2 == 1){
                ans = ans * x;
            }

            x = x * x;
            power = power/2;
        }

        return ans;
    }

    public static void main(String[] args) {
        
    }
}