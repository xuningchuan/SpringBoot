import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author xuningchuan
 * @Title: SpringBootAdminApplication
 * @Description:
 * @date 2019/7/8下午8:44
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@Configuration
//@ComponentScans()
public class SpringBootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }
}
