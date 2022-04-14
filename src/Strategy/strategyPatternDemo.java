package Strategy;

public class strategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationDivide());
        try {
            System.out.println("10 : 5 = " + context.executeStrategy(10,5));

        } catch (Exception e){
            System.out.println("Divisione per 0");
        }

    }

}
