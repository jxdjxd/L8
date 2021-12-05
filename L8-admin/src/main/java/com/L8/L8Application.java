package com.L8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动入口
 *
 * @author jxd
 * @date 2021/12/5 20:54
 */
@SpringBootApplication()
public class L8Application {
    public static void main(String[] args) {
        SpringApplication.run(L8Application.class, args);
        System.out.println("(>‿◠)✌  L8启动成功   ᕙ( ＾‿ゝ＾ c)     \n" +
                " .....                     ___________            \n" +
                " |   |                    /           \\          \n" +
                " |   |                   /             \\         \n" +
                " |   |                  /               \\        \n" +
                " |   |                   --------------  \\       \n" +
                " |   |                 \\                //       \n" +
                " |   \\___________       \\             //        \n" +
                " |                |         \\          //        \n" +
                " .................|          -----------            ");
    }
}
