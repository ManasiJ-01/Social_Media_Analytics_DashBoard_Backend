package com.example.socialmedia.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.socialmedia.entities.UserAnalytics;
import com.example.socialmedia.repositories.UserAnalyticsRepository;

@Service
public class UserAnalyticsService {

    private final UserAnalyticsRepository userAnalyticsRepository;

    @Autowired
    public UserAnalyticsService(UserAnalyticsRepository userAnalyticsRepository) {
        this.userAnalyticsRepository = userAnalyticsRepository;
    }

    public List<UserAnalytics> getAllUserAnalytics() {
        return userAnalyticsRepository.findAll();
    }

    public UserAnalytics getUserAnalyticsById(Long id) {
        return userAnalyticsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("UserAnalytics not found with id: " + id));
    }

    public UserAnalytics createUserAnalytics(UserAnalytics userAnalytics) {
        return userAnalyticsRepository.save(userAnalytics);
    }

    public UserAnalytics updateUserAnalytics(Long id, UserAnalytics userAnalyticsDetails) {
        UserAnalytics userAnalytics = getUserAnalyticsById(id);
        
      
        
        return userAnalyticsRepository.save(userAnalytics);
    }

    public void deleteUserAnalytics(Long id) {
        userAnalyticsRepository.deleteById(id);
    }
}


