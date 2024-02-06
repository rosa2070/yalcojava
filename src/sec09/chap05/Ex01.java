package sec09.chap05;

import java.util.stream.IntStream;

public class Ex01 {
    public static void main(String[] args) {
        IntStream
                .range(1, 100)
                .filter(i -> i % 2 == 0)
                //  💡 아래의 중간과정을 하나하나 주석해제해 볼 것
                .skip(10)
                .limit(10)
                .map(i -> i * 10)
                .forEach(System.out::println);

        System.out.println("\n- - - - -\n");

        String str1 = "Hello World! Welcome to the world of Java~";

        str1.chars().forEach(System.out::println);


        System.out.println("\n- - - - -\n");

        char str1MaxChar = (char) str1.chars()
                .max() // OptionalInt 반환 - 이후 배울 것
                //.min() // 변경해 볼 것
                .getAsInt();


        //  사용되는 모든 알파벳 문자들을 정렬하여 프린트
        str1.chars()
                //.sorted()
                //.distinct()
                //.filter(i -> (i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z'))
                .forEach(i -> System.out.print((char) i));

        System.out.println("\n- - - - -\n");











    }
}
