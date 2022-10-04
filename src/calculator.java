public class calculator {
    public static void main(String[] args) {
        System.out.println("division result is: "+ division(10, 5));
        System.out.println("multiply result is: "+ multiply(10, 5) );
        System.out.println("subtraction result is: " + subtraction(10, 5));
        System.out.println("result of add is "+ add(10, 5));
        System.out.println("modulus result is "+ modulus(10, 5));
    }

    public static Integer add (Integer arg1, Integer arg2){
        Integer result = arg1 + arg2;
        return result;
    }

    public static Integer add (Integer arg1, Integer arg2, Integer arg3){
        Integer result = arg1 + arg2 + arg3;
        return result;
    }

    public static Integer subtraction(int arg1, int arg2){
        int result = arg1 - arg2;
        return result;
    }

    public static int multiply(int arg1, int arg2){
        int result = arg1 * arg2;
        return result;
    }

    public static int division(int arg1, int arg2){
        int result = arg1 / arg2;
        return result;
    }

    public static int modulus(int arg1, int arg2){
        int result = arg1 % arg2;
        return result;
    }


}


