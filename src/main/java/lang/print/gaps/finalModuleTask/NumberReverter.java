package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void main(String[] args) {
        NumberReverter nr = new NumberReverter();
        nr.revert(489);
    }

    public void revert(int number) {
        String numberStr = Integer.toString(number);
        String reversedStr = new StringBuilder(numberStr).reverse().toString();
        int reversedNumber = Integer.parseInt(reversedStr);
        System.out.println(reversedNumber);
    }
}