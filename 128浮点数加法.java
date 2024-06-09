import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个浮点数：");
        String num1Str = scanner.nextLine();
        System.out.println("请输入第二个浮点数：");
        String num2Str = scanner.nextLine();

        // 验证输入字符串是否合法（这里简单检查是否仅包含数字和小数点）
        if (!num1Str.matches("-?\\d+(\\.\\d+)?") || !num2Str.matches("-?\\d+(\\.\\d+)?")) {
            System.out.println("输入不合法，请确保输入的是有效的浮点数。");
            return;
        }

        // 将字符串转换为BigDecimal进行计算
        BigDecimal num1 = new BigDecimal(num1Str);
        BigDecimal num2 = new BigDecimal(num2Str);

        // 计算两个数的和
        BigDecimal sum = num1.add(num2);

        System.out.println("两数之和为：" + sum);
    }
}