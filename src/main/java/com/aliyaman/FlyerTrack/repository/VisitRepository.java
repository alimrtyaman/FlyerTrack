package com.aliyaman.FlyerTrack.repository;

import com.aliyaman.FlyerTrack.dto.VisitResponseDto;
import com.aliyaman.FlyerTrack.models.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitRepository extends JpaRepository<Visit , Long> {

    List<Visit> findVisitsByUserId(Long userId);
}
