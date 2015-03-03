package io.crate.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

@SpringBootApplication
public class CrateApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

	public static void main(String[] args) {
        SpringApplication.run(CrateApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
//        Assert.notNull(userService);
    	userService.doStuff();
    }

}