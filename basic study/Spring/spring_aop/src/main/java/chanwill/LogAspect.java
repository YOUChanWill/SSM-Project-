package chanwill;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Arrays;

@Component
@Aspect // 将当前组件标识为切面
public class LogAspect {

    // 公共的切入点表达式
    @Pointcut("execution(* chanwill.CalculatorPureImpl.*(..))")
    public void pointCut(){}

    // 设置前置方法 execution(public int chanwill.CalculatorPureImpl.add(int ,int))
    @Before("pointCut()")
    public void BeforeAdviceMethod(JoinPoint joinPoint){

        // 获取连接点所对应方法的方法名
        Signature signature = joinPoint.getSignature();

        // 获取连接点所对应方法的参数
        Object[] args = joinPoint.getArgs();

        System.out.println("Logger-->前置通知，方法名：" + signature.getName() + " 参数：" + Arrays.toString(args));
    }

}
