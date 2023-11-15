package com.example.demo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.Callable;
@Data
public class Java1 implements Callable {
    @Autowired
    Spring1 SPRING1;

    @Override
    public Object call() throws Exception {
        return SPRING1;
    }
}
