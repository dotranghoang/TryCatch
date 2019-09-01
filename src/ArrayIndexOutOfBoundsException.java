import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer[] arr = creatRandom();
        System.out.println("Nhập chỉ số của 1 phần tử trong mảng (0-99): ");
        int index = scanner.nextInt();


        try {
            System.out.println("Giá trị của phần tử có chỉ số " + index + " là: "+ arr[index] );
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
        
    }
    public static Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách số phần tử của mảng: ");
        for (int i = 0 ; i < 100 ; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
            if(i == 99)
                System.out.println("");
        }
        return arr;
    }
}
