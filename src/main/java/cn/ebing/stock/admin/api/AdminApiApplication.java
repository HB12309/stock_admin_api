package cn.ebing.stock.admin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync
@EnableTransactionManagement
@SpringBootApplication
public class AdminApiApplication {

	public static void main(String[] args) {
		System.out.println("===== AdminApiApplication 准备启动 =====");
		SpringApplication.run(AdminApiApplication.class, args);
		System.out.println("===== AdminApiApplication 启动完成 =====");
	}

}
