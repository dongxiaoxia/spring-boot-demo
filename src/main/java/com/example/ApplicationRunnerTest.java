package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by dongxiaoxia on 2016/8/9.
 */
@Component
public class ApplicationRunnerTest implements CommandLineRunner {
    @Override
    public void run(String... agrs) throws Exception {
        //DO something
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        for (String arg:agrs){
            System.out.println(arg);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
