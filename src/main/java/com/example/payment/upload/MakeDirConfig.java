package com.example.payment.upload;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;

@Component
public class MakeDirConfig {

    @PostConstruct
    public void mkdir() {
        File file = new File("excel");
        if (!file.exists()){
            file.mkdir();
        }
    }
}
