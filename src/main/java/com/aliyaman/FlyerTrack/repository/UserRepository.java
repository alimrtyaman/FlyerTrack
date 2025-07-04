package com.aliyaman.FlyerTrack.repository;

import com.aliyaman.FlyerTrack.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
