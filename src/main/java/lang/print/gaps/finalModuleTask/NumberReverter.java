package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        System.out.printf("%d%d%d\n", number % 10, number % 100 / 10, number / 100 );
    }
}
