import org.junit.Test;
import proxy.Calculator;
import proxy.CalculatorImpl;
import proxy.CalculatorStaticProxy;
import proxy.ProxyFactory;

public class ProxyTest {
    @Test
    public void Static(){
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1,2);
    }

    @Test
    public void Proxy(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.div(1,0);
    }
}
