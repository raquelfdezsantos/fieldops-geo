package com.fieldops.geo;

import org.springframework.boot.SpringApplication;

public class TestFieldOpsGeoApplication {

    public static void main(String[] args) {
        SpringApplication.from(FieldOpsGeoApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
