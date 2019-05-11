public class JavaHomeWork1 {
    public static void main(String[] args) {
        String name = "Serhii";
        int age = 178;
        float height = 72f;
        System.out.println("Личные данные, НЕ для коммерческого использования:");
        System.out.println("Имя = " + name + ", " + "Рост = " + age + ", " + "Вес = "
                + height + "\n");

        int a = 12;
        int b = 7;
        System.out.println("Значения переменных a и b ДО изменения:");
        System.out.println("a = " + a);
        System.out.println("b = " + b + "\n");
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Значение переменных a и b ПОСЛЕ изменения:");
        System.out.println("a = " + a);
        System.out.println("b = " + tmp);

        int j = 3;
        int k = 5;
        System.out.println("Значение переменных j и k ДО изменения:");
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        System.out.println("Значение переменных j и k ПОСЛЕ изменения:");
        j = j + k;
        k = j - k;
        j = j - k;
        System.out.println("j = " + j);
        System.out.println("k = " + k);




    }
}
