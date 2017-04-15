package cn.chapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
//@EnableAutoConfiguration
//@Configuration
//@Import({
//	DispatcherServletAutoConfiguration.class,
//	EmbeddedServletContainerAutoConfiguration.class,
//	ErrorMvcAutoConfiguration.class,
//	HttpEncodingAutoConfiguration.class,
//	HttpMessageConvertersAutoConfiguration.class,
//	JacksonAutoConfiguration.class,
//	LocalDevToolsAutoConfiguration.class,
//	MultipartAutoConfiguration.class,
//	PropertyPlaceholderAutoConfiguration.class,
//	ServerPropertiesAutoConfiguration.class,
//	WebClientAutoConfiguration.RestTemplateConfiguration.class,
//	WebMvcAutoConfiguration.class
//})
public class Chapter5Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter5Application.class, args);
	}	
}
