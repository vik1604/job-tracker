package com.vikas.job.tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

        @GetMapping("/api/health")
        public String health() {
            return "Job Tracker API is running";
        }

}
