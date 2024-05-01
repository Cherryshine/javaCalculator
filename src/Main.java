import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        char op;
        int result = 0;
        List<Integer> resultsList = new ArrayList<>(); // 연산 결과를 저장할 리스트

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = sc.nextInt();

            System.out.print("연산부호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    resultsList.add(result); // 결과를 리스트에 추가
                    System.out.println(result);
                    break;
                case '-':
                    result = num1 - num2;
                    resultsList.add(result);
                    System.out.println(result);
                    break;
                case '*':
                    result = num1 * num2;
                    resultsList.add(result);
                    System.out.println(result);
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        System.out.println("0으로 나눌 수 없습니다.");
                    resultsList.add(result);
                    System.out.println(result);
                    break;
                case 'r': // "remove" 입력 시 가장 먼저 저장된 결과 삭제
                    if (!resultsList.isEmpty()) {
                        int removedResult = resultsList.remove(0);
                        System.out.println("삭제된 결과: " + removedResult);
                    } else {
                        System.out.println("저장된 결과가 없습니다.");
                    }
                    break;
                default:
                    System.out.println("올바른 연산 부호를 입력하세요. (+, -, *, /)");
                    break;
            }
        }
    }
}
