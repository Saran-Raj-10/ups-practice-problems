public class Genericclass {
    public static <T> void printarr(T[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer intarr[] = {10,20,30,40};
        String strarr[] = {"A","B","C"};
        printarr(intarr);
        printarr(strarr);
    }
}
