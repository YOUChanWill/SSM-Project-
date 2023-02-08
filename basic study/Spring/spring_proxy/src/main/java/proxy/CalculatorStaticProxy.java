package proxy;

public class CalculatorStaticProxy  implements Calculator{

    private CalculatorImpl target;

    public CalculatorStaticProxy(CalculatorImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {

        int result = 0;
        try {
            System.out.println("方法：add:" + i + "," + j);
            result = target.add(i,j);
            System.out.println("方法：add,结果:" + result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("方法：sub:" + i + "," + j);
        int result = target.sub(i,j);
        System.out.println("方法：sub,结果:" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("方法：mul:" + i + "," + j);
        int result = target.mul(i,j);
        System.out.println("方法：mul,结果:" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("方法：div:" + i + "," + j);
        int result = target.div(i,j);
        System.out.println("方法：div,结果:" + result);
        return result;
    }
}
