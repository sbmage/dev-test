package com.sbmage.test;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int i = 0;
        int j = 0;
         
        j = ++i; // ���� i�� ������ j�� ����
        System.out.println(j); 
         
        j = i++; // ���� j�� �ְ� i�� ����
        System.out.println(j); 
         
         
        // for�������� �������̳� ������ �������� �ǹ̰� ����.
        // for(a; b; c;)
        // a�� ���� �����ϰ� b�� ������ ���� �� ���η����� ������ ����
        // c�� ���� ��Ű�� �����̴�.
        for (int a = 0; a < 10; a++) { 
            System.out.println("a = " + a);
        }
         
        for (int b = 0; b < 10; ++b) {
            System.out.println("b = " + b);
        }
         
        String[] arrays = {"a", "b", "c", "d"};
         
         
        i = 0;
        j = 0;
         
        // ���� for������ i++, ++i�� ����� �� �ִ�.
        // �������� ����.
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
         
        // while�������� ���� �������̳� ���̰� �ִ�.
        // �������� ���� ���� ���� ���� ��Ű�� ������
        // ������ (1~9), ������ (1 ~ 10)�� ������.
        while (++i < 10) {
            System.out.println("i = " + i);
        }
         
        while (j++ < 10) {
            System.out.println("j = " + j);
        }
         
         
         
        i = 0;
        j = 0;
         
        // do while���� do �϶��� �ѹ��� ��� ���� �����ϰ�
        // while���� ������ ����� ��Ÿ����. 
        do {
            System.out.println("i = " + i);
        } while (i++ < 10);
         
        do {
            System.out.println("j = " + j);
        } while (++j < 10);
         
         
         
        // ����~!
        // i++(������)�� ++i(������)�� �ܵ����� ���϶���
        // ������ ������� ������, �ٸ� �޼��峪 ������ ���� ���� ���
        // ���� �־��� �� ����(������), ���� ���� �� �־���(������)
        // ó�� ��� ���� �ϴ�.
        // end~!
         
    }
}
