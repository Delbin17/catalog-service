// package com.example.catalog.service;
//
// import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
//
// import com.github.dockerjava.api.model.ContainerConfig;
// import io.restassured.RestAssured;
// import java.awt.*;
// import org.junit.jupiter.api.BeforeEach;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.web.server.LocalServerPort;
// import org.springframework.context.annotation.Import;
//
// @SpringBootTest(webEnvironment = RANDOM_PORT)
// @Import(ContainerConfig.class)
// public abstract class AbstractIT {
//  @LocalServerPort int port;
//
//  @BeforeEach
//  void setUp() {
//      RestAssured.port = port;
//  }
// }
