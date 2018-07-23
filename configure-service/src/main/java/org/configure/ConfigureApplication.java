package org.configure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * config配置
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigureApplication 
{
    public static void main( String[] args ) {
    	  SpringApplication.run(ConfigureApplication.class, args);
    }
}
