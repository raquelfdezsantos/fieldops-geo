package com.fieldops.geo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class PostgisIntegrationTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void postgisIsAvailable() {
        String version = jdbcTemplate.queryForObject(
                "SELECT PostGIS_Version()",
                String.class
        );

        assertThat(version).isNotBlank();
    }
}