package com.qt.sso;
/**
 * 
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangdaoq
 *
 * 2018年8月28日 下午2:02:24
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SSOClient2Application {
	
	@GetMapping("/user")
	public Authentication user(Authentication user){
		return user;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SSOClient2Application.class, args);
	}

}
