package cn.githink.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class DpAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(DpAuthApplication.class, args);
    }

}
