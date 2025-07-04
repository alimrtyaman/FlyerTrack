package com.aliyaman.FlyerTrack.repository;

import com.aliyaman.FlyerTrack.models.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Building , Long> {
}
