import com.itheima.dao.OrderDao;
import com.itheima.factory.OrderFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderAplication {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao)cxt.getBean("orderDao");
        orderDao.save();

    }
}
