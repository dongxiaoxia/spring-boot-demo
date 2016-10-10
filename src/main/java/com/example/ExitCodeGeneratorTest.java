package com.example;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * Created by dongxiaoxia on 2016/8/9.
 */
@Component
public class ExitCodeGeneratorTest implements ExitCodeGenerator {
    @Override
    public int getExitCode() {
        System.out.println("++++++++++call ExitCodeGeneratorTest+++++++++++++");
        return 0;
    }
}
