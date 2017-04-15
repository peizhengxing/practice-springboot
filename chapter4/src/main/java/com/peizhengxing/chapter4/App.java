package com.peizhengxing.chapter4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
	private static final Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        log.info( "Hello World!" );
        SpringApplication.run(App.class, args);
        
    }
}
