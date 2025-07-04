package com.aliyaman.FlyerTrack.repository;

import com.aliyaman.FlyerTrack.models.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends JpaRepository<Visit , Long> {
}
