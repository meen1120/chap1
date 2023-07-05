package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {
        /* 값을 직접 연산하여 출력 할 수 있다.
        * 이 때, 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다*/

        /* 1. 숫자와 숫자의 연산
        *  1-1 정수와 정수의 연산*/
        System.out.println("==== 정수와 정수의 연산====");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10); // 정수끼리 나누면 나머지는 생략
        System.out.println(123 % 10); // % mod(나머지를 구하는 연산자)

        /* 1-2 실수와 실수의 연산 */
        System.out.println("==== 실수와 실수의 연산====");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0); /*약간의 오차가 생긴다
                                        부동 소수점
                                        지수부 가수부
                                        정확한 실수 표현 x */

        /* 1-3. 정수와 실수의 연산 */
        System.out.println("==== 실수와 정수의 연산====");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);
        // 정수 -> 실수로 변경, 실수와 실수의 연산

        // 2. 문자와 문자의 연산     컴퓨터는 문자를 숫자로 인식
        System.out.println("==== 문자와 문자의 연산====");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        // 2-2 문자와 정수의 연산
        System.out.println("==== 문자와 정수의 연산====");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        // 2-3 문자와 실수의 연산
        System.out.println("==== 문자와 실수의 연산====");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        // 3. 문자열의 연산
        // 3-1. 문자열과 문자열의 연산(이어붙이기)
        System.out.println("==== 문자열과 문자열의 연산====");
        System.out.println("hello" + "world");
        //System.out.println("hello" - "world"); //에러 발생
        //System.out.println("hello" * "world"); //에러 발생
        //System.out.println("hello" / "world"); //에러 발생
        //System.out.println("hello" % "world"); //에러 발생

        // 3-2. 문자열과 다른 형태의 값 연산
        System.out.println("==== 문자열과 다른 형태의 값의 연산====");
        System.out.println("Hello World" + 11);
        System.out.println("Hello World" + 0.1);
        System.out.println("Hello World" + 'a');
        System.out.println("Hello World" + true);

        /* 숫자로 된 문자열 형태의 값은 '+' 연산의 결과가 문자열 합치기 결과가 되는것엦 주의 */
        System.out.println("123" + "456");



        /* 4. 논리값 연산*/
        // 4-1. 논리값과 논리값의 연산

        // 4-2. 논리값과 정수의 연산

        // 4-3. 논리값과 실수의 연산

        // 4-4. 논리값과 문자의 연산

        // 4-5. 논리값과 문자열의 연산
        System.out.println(true + "a"); //문자열 합치기 됨
        //System.out.println(true - "a"); //에러 발생
        //System.out.println(true * "a"); //에러 발생
        //System.out.println(true / "a"); //에러 발생
        //System.out.println(true % "a"); //에러 발생
        //논리값은 문자열 '+'(합치기) 외에는 모든 연산자 사용이 불가능

    }

}
