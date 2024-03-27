package co.develhope.APIMiddleware.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {

    @GetMapping("")
    public String returnDateTime() {
        String now = OffsetDateTime.now().toString();
        return now;
    }
}
