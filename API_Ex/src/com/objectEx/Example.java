package com.objectEx;

public class Example {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            String str = null;
            for (int i = 0; i <= arr.length; i++) {
                if (i == arr.length) {
                    throw new ArrayIndexOutOfBoundsException();
                } else if (str == null) {
                    throw new NullPointerException();
                } else if (i == 2) {
                    throw new Exception("일부러 예외 발생");
                } else {
                    System.out.println("arr[" + i + "] = " + arr[i]);
                    System.out.println("str.length() = " + str.length());
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 초과 예외가 발생했습니다.");
        } catch (NullPointerException e) {
            System.out.println("널 포인터 예외가 발생했습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}
