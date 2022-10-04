public class arrayDemo {

    public static void main(String[] args) {
        int [] arrayOfInteger = new int[]{5,6,7};
        int [] array = {2,4,6,8,10};
        int [] [] multiDimensionalArray= {
                {1,2},
                {3,4},
                {5,6}
        };
        System.out.println(array[1]);
        System.out.println(array[4]);
//        System.out.println(array[5]);
        System.out.println("size of first array: " +multiDimensionalArray[0].length);
        System.out.println(multiDimensionalArray[1][1]);
    }

}
