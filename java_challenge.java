class java_challenge{

    public static void main(String args[]){

        /* System.out.println(quadraticEquation(1, 2, -3));
        System.out.println(quadraticEquation(2, -7, 3));
        System.out.println(quadraticEquation(1, -12, -28)); */

        /* System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97)); */
    }

    public static int quadraticEquation(int a, int b, int c){
        return (int) (-b + Math.sqrt((double) (b*b - 4 * a * c))) / (2 * a);
    }

    public static boolean checkPerfect(int num){
        int sum = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }
}