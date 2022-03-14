//冒泡排序
/*
public class test {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 7, 1, 2, 9, 8, 0, 5};
        int i = 0;
        for (i = 0; i < arr.length - 1; i++) {
            int j = 0;
            for (j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

        }
        for(i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
*/
/*二维数组的使用，实例；*/
/*
public class test {
    public static void main(String[] args) {
        //声明一个二维数组
        int[][] arr;
        //给二维数组分配动态空间
        arr = new int[3][];//在堆上开辟3个空间，来存放一维数组的数组名/地址
        for(int i = 0;i < arr.length;i++){
            //为一维数组开辟空间
            arr[i] = new int[i + 1];
            //给二维数组赋值
            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = i + 1;
            }
        }
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}*/
//打印杨辉三角
/*
public class test {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for(int i = 0;i < arr.length;i++) {
            arr[i] = new int[i + 2];
            arr[i][0] = 1;
            arr[i][arr[i].length - 1] = 0;
            if (i > 0) {
                for (int j = 1; j < arr[i].length - 1; j++) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length - 1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/
//4.已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如:
//列：【14，40，50，60】——》【14，40，45，50，60】
//妈的写的太菜了
//算法写的不好
/*
public class test {
    public static void main(String[] args){
        int ret = 1;
        int[] arr1 = {14, 40, 50, 60};
        int[] arr2 = new int[arr1.length + 1];
        int j = 0;
        int i = 0;
        for(i = 0;i < arr2.length;i++){
            if(arr1[j] > ret){
                arr2[i] = ret;
                break;
            }else{
                arr2[i] = arr1[j];
                    j++;
                    if(j == arr1.length){
                        break;
                    }
            }
        }
        int n = i + 1;
        if(j != arr1.length) {
            for (n = i + 1; n < arr2.length; n++) {
                arr2[n] = arr1[j];
                j++;
            }
        }else{
            arr2[n] = ret;
        }
        arr1 = arr2;
        for(i = 0;i < arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
*/
