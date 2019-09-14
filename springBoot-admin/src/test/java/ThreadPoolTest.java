import com.xuningchuan.demo.SpringBootAdminApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xuningchuan
 * @Title: ThreadPoolTest
 * @Description:
 * @date 2019/8/3下午12:22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootAdminApplication.class)
public class ThreadPoolTest {

//    @Autowired
//    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Test
    public void ThreadPoolTest(){
        Runnable runnable = () -> {
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

                System.out.println("当前线程" + Thread.currentThread().getName());


        };
        for(int i = 0; i < 9; i++){
            new Thread(runnable).start();
           }


//        new Thread(() -> {
//            for(int i = 0; i < 9; i++){
//                System.out.println("当前线程"+Thread.currentThread().getName() + i);
//
//            }
//        }).start();

    }
}
