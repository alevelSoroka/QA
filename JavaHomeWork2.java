public class JavaHomeWork2 {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 5, 6};
        System.out.print(nums1[0] + ";");
        System.out.print(nums1[1] + ";");
        System.out.print(nums1[2] + ";");
        System.out.print(nums1[3] + ";");
        System.out.println();

        String str1 = new String("Мама мыла раму.");
        char[] array = str1.toCharArray();
        System.out.println(array);


        String str2 = "Я хочу переносы строк";
        String newStr2 = str2.replace(" ", "/");
        System.out.println(newStr2);

        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myList[0] = 4;
        myList[1] = 5;
        myList[2] = 3;
        myList[3] = 8;
        myList[4] = 22;
        myList[5] = 13;
        myList[6] = 23;
        myList[7] = 54;
        myList[8] = 76;
        myList[9] = 78;
        System.out.println(myList[5]);

        double[] db = {1.2, 3.3, 4.8, 7.9, 63.12};
        System.out.println(db[4]);

        byte by = -5;
        int num = 777;
        long lng = -963;
        int i = (int) lng;

        int[] Arr = new int[3];
        Arr[0] = by;
        Arr[1] = num;
        Arr[2] = i;
        System.out.println(Arr[0]);
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);

        int[][] num1 = {{45, 33, 27}, {4, 75, 774}};
        System.out.print(num1[0][0]);
        System.out.print(" ");
        System.out.print(num1[0][1]);
        System.out.print(" ");
        System.out.println(num1[0][2]);
        System.out.print(num1[1][0]);
        System.out.print(" ");
        System.out.print(num1[1][1]);
        System.out.print(" ");
        System.out.println(num1[1][2]);


        String str5 = new String("Hello, world!");

        System.out.println(str5.charAt(0));
        System.out.println(str5.charAt(str5.length() - 1));

        int start = 7;
        int end = 12;
        char[] dst = new char[end - start];
        str5.getChars(start, end, dst, 0);
        System.out.println(dst);
        System.out.println(str5.charAt(str5.length() - 2));


    }
}
