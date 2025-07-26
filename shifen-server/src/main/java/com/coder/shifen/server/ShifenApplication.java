package com.coder.shifen.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SuppressWarnings("SpringComponentScan") // 忽略 IDEA 无法识别 ${shifen.info.base-package}
@SpringBootApplication(scanBasePackages = {"${shifen.info.base-package}.server", "${shifen.info.base-package}.module"})
public class ShifenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShifenApplication.class, args);
    }

}
