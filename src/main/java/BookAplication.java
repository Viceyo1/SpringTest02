import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookAplication {

    /*
    -------------------------DI注入---------------------------------------------------------------
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService serviceDao = (BookService) ctx.getBean("bookService");
        serviceDao.save();



    }



}
