import com.itheima.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class ManegeOtherBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource bean = ctx.getBean(DataSource.class);
        System.out.println(bean);
    }
}
