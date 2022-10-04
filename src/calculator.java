public class calculator {
    public static void main(String[] args) {
        calculator calc = new calculator();
        Integer result = calc.add(10, 30, 40 );
        System.out.println("result of add is "+ result);


    }

    public Integer add (Integer arg1, Integer arg2){
        Integer result = arg1 + arg2;
        return result;
    }

    public Integer add (Integer arg1, Integer arg2, Integer arg3){
        Integer result = arg1 + arg2 + arg3;
        return result;
    }

}


