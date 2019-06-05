import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao phan tu can xoa");
        int indexValue = scanner.nextInt();

        boolean status = false;

        for (int i = 0; i < arr.length; i++) {
            if (indexValue == arr[i]) {
                //in ra vi tri can xoa, tao mang moi xoa gia tri tai vi tri can xoa
                System.out.println("Vi tri cua phan tu can xoa la arr[" + i + "]");
                status = true;
                int[] newArr = removeElementFromArray(arr, i);

                //in ra mang moi sau khi xoa
                System.out.println("Mang moi sau khi xoa co cac phan tu");
                for (int value : newArr) {
                    System.out.print(value);
                    System.out.print("\t");
                }
                break;
            }
        }

        if (!status) {
            System.out.println("Khong co phan tu muon xoa trong mang");
        }
    }

    public static int[] removeElementFromArray(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int k = index; k < newArr.length; k++) {
            newArr[k] = arr[k+1];
        }
        return newArr;
    }
}
