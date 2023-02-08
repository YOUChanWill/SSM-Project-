import chanwill.controller.UserController;
import chanwill.dao.UserDao;
import chanwill.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotion {
    @Test
    public void Test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        UserController userController = context.getBean("controller", UserController.class);
        userController.saveUser();
    }

}
