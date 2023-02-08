import chanwill.Calculator;
import chanwill.CalculatorPureImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

    @Test
    public void testAOPByAnnotation(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        Calculator bean = context.getBean(Calculator.class);
        bean.add(1,2);


    }
}
