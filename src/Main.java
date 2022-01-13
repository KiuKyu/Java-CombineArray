public class Main {
    public static void main(String[] args) {
//        Khởi tạo 2 mảng với kích thước cho trước
        int size1 = 15, size2 = 10;
        int[] arr1 = new int [size1];
        int[] arr2 = new int [size2];
//        Khởi tạo mảng thứ 3 với kích thước = tổng của 2 mảng cũ
        int[] arr3 = new int [size1 + size2];
//        Sử dụng vòng lặp để nhập giá trị cho các mảng = math.random
        for (int i = 0; i < size1; i++) {
            arr1[i] = (int) (Math.floor(Math.random() * 100 + 1));
        }
        for (int k = 0; k < size2; k++) {
            arr2[k] = (int) (Math.floor(Math.random() * 100 + 1));
        }
//        Nhập vào mảng 3 những element của mảng 1
        for (int j = 0; j < size1; j++) {
            arr3[j] = arr1[j];
        }
//        Nhập vào mảng 3 những element của mảng 2
        for (int x = 0; x < size2; x++) {
            arr3[size1 + x] = arr2[x];
        }
//        In ra mảng 3
        for (int c = 0; c < arr3.length; c++) {
            System.out.print(arr3[c] + ", ");
        }
    }
}
