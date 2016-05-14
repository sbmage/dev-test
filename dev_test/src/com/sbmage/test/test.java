package com.sbmage.test;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int i = 0;
        int j = 0;
         
        j = ++i; // 먼저 i값 증가후 j에 넣음
        System.out.println(j); 
         
        j = i++; // 먼저 j에 넣고 i값 증가
        System.out.println(j); 
         
         
        // for문에서는 전위형이나 후위형 증가값이 의미가 없다.
        // for(a; b; c;)
        // a의 값을 셋팅하고 b의 조건을 비교한 후 내부로직을 실행한 다음
        // c를 증가 시키기 때문이다.
        for (int a = 0; a < 10; a++) { 
            System.out.println("a = " + a);
        }
         
        for (int b = 0; b < 10; ++b) {
            System.out.println("b = " + b);
        }
         
        String[] arrays = {"a", "b", "c", "d"};
         
         
        i = 0;
        j = 0;
         
        // 가중 for문에서 i++, ++i를 사용할 수 있다.
        // 증가값은 같음.
        for (String s : arrays) {
            i++;
            System.out.println("i = " + i + ", s = " + s);
        }
         
        for (String s : arrays) {
            ++j;
            System.out.println("j = " + j + ", s = " + s);
        }
         
         
        i = 0;
        j = 0;
         
        // while문에서도 역시 전위형이나 차이가 있다.
        // 후위형은 먼저 비교후 값을 증가 시키기 때문에
        // 전위형 (1~9), 후위형 (1 ~ 10)이 찍힌다.
        while (++i < 10) {
            System.out.println("i = " + i);
        }
         
        while (j++ < 10) {
            System.out.println("j = " + j);
        }
         
         
         
        i = 0;
        j = 0;
         
        // do while문을 do 일때만 한번더 찍는 것을 제외하곤
        // while문과 동일한 결과가 나타난다. 
        do {
            System.out.println("i = " + i);
        } while (i++ < 10);
         
        do {
            System.out.println("j = " + j);
        } while (++j < 10);
         
         
         
        // 정리~!
        // i++(후위형)과 ++i(전위형)은 단독으로 쓰일때는
        // 동일한 결과값을 같지만, 다른 메서드나 변수와 같이 쓰일 경우
        // 값을 넣어준 후 증가(후위형), 값을 증가 후 넣어줌(전위형)
        // 처럼 사용 가능 하다.
        // end~!
         
    }
}
