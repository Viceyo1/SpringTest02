import com.itheima.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserAplication {

    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        UserDao userDao =(UserDao) cxt.getBean("userDao");
        userDao.save();
    }


}
