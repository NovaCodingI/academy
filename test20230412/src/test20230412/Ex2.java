package test20230412;

/*
[문항2]  로또 프로그램 만들기
1 ~ 45 사이의 수중 서로다른 숫자 6개를 추첨하는 프로그램을 작성하시오
    중복될경우 10점
    중복되지 않을경우 20점
*/

public class Ex2 {
	
    public static void main(String[] args) {
        int[] randomNumbers = new int[6];

        // 1부터 45까지의 수 중에서 서로 다른 6개의 숫자 추첨
        int count = 0;
        while (count < 6) {
            int randomNumber = (int) (Math.random() * 45) + 1;
            boolean duplicate = false;
            for (int i = 0; i < count; i++) {
                if (randomNumbers[i] == randomNumber) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                randomNumbers[count] = randomNumber;
                count++;
            }
        }
        
        // 추첨된 숫자 정렬 (선택 정렬)
        for (int i = 0; i < 6 - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < 6; j++) {
                if (randomNumbers[j] < randomNumbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = randomNumbers[i];
            randomNumbers[i] = randomNumbers[minIndex];
            randomNumbers[minIndex] = temp;
        }

        // 추첨된 숫자 출력
        System.out.print("이번주 로또 당첨번호 : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
    }
}
