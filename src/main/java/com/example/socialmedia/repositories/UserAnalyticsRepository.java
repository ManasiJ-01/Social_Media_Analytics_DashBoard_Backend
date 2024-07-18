package com.example.socialmedia.repositories;



import com.example.socialmedia.entities.UserAnalytics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnalyticsRepository extends JpaRepository<UserAnalytics, Long> {
}

