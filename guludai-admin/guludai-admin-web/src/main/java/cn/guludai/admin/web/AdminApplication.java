/**
 * 上海谨微数据服务有限公司
 */
package cn.guludai.admin.web;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import cn.guludai.container.web.main.WebApplication;

/**
 * @author gaopeng
 */
@EnableDiscoveryClient
@ComponentScan("cn.guludai.admin")
public class AdminApplication extends WebApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
}
