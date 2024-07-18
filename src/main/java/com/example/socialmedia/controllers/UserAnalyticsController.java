package com.example.socialmedia.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.socialmedia.entities.UserAnalytics;
import com.example.socialmedia.services.UserAnalyticsService;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/user-analytics")
public class UserAnalyticsController {

    private final UserAnalyticsService userAnalyticsService;

    @Autowired
    public UserAnalyticsController(UserAnalyticsService userAnalyticsService) {
        this.userAnalyticsService = userAnalyticsService;
    }

    @GetMapping
    public ResponseEntity<List<UserAnalytics>> getAllUserAnalytics() {
        List<UserAnalytics> userAnalyticsList = userAnalyticsService.getAllUserAnalytics();
        return new ResponseEntity<>(userAnalyticsList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserAnalytics> getUserAnalyticsById(@PathVariable("id") Long id) {
        UserAnalytics userAnalytics = userAnalyticsService.getUserAnalyticsById(id);
        return new ResponseEntity<>(userAnalytics, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserAnalytics> createUserAnalytics(@RequestBody UserAnalytics userAnalytics) {
        UserAnalytics createdUserAnalytics = userAnalyticsService.createUserAnalytics(userAnalytics);
        return new ResponseEntity<>(createdUserAnalytics, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserAnalytics> updateUserAnalytics(
            @PathVariable("id") Long id,
            @RequestBody UserAnalytics userAnalyticsDetails
    ) {
        UserAnalytics updatedUserAnalytics = userAnalyticsService.updateUserAnalytics(id, userAnalyticsDetails);
        return new ResponseEntity<>(updatedUserAnalytics, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserAnalytics(@PathVariable("id") Long id) {
        userAnalyticsService.deleteUserAnalytics(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

