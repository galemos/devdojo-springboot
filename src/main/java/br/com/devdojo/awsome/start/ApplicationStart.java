package br.com.devdojo.awsome.start;
/*
 * Created by Gabriel Lemos on 13/06/2018.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "br.com.devdojo.awsome.endpoint")
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
