import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;
import service.UserService;

import java.util.List;

/**
 * @author zhangzhidong
 * @create: 2019-02-17 23:51
 */
public class SpringJDBCTest {

    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("bean.xml");
        UserService userSerivce = (UserService) act.getBean("userService");
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setSex("男");
        userSerivce.save(user);

        List<User> users = userSerivce.getUsers();
        System.out.println("+++++++++++++得到所有User");
        for (User user1 : users) {
            System.out.println(user1.getId() + " " + user1.getName() + " " + user1.getAge() + " " + user1.getSex());
        }

    }
}
