package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {// 为任意类设置动态代理类

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        ClassLoader classLoader = this.getClass().getClassLoader();// 生成类加载器

        Class<?>[] interfaces = target.getClass().getInterfaces();// 获取目标对象实现的所有接口的class对象

        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 代理对象，要执行的方法，要执行方法的参数列表
                Object result = null;
                try {
                    // 目标代码执行前输出
                    System.out.println("方法：" + method.getName() + ",参数：" + Arrays.toString(args));

                    result = method.invoke(target, args);
                    // 目标代码执行后输出
                    System.out.println("方法：" + method.getName() + ",结果：" + result);

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("方法：" + method.getName() + ",异常：" + e);
                } finally {
                    System.out.println("方法：" + method.getName() + ",执行完毕");
                }
                return result;
            }
        };

        return Proxy.newProxyInstance(classLoader,interfaces,h);
    }

}
