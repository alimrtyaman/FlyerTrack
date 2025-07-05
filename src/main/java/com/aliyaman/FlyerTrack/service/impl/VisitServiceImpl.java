package com.aliyaman.FlyerTrack.service.impl;

import com.aliyaman.FlyerTrack.dto.VisitRequestDto;
import com.aliyaman.FlyerTrack.dto.VisitResponseDto;
import com.aliyaman.FlyerTrack.mapper.VisitMapper;
import com.aliyaman.FlyerTrack.models.Building;
import com.aliyaman.FlyerTrack.models.User;
import com.aliyaman.FlyerTrack.models.Visit;
import com.aliyaman.FlyerTrack.repository.BuildingRepository;
import com.aliyaman.FlyerTrack.repository.VisitRepository;
import com.aliyaman.FlyerTrack.service.IVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VisitServiceImpl implements IVisitService {

    private final VisitRepository visitRepository;
    private final VisitMapper mapper;
    private final BuildingRepository buildingRepository;


    @Autowired
    public VisitServiceImpl(VisitRepository visitRepository, VisitMapper mapper, BuildingRepository buildingRepository) {
        this.visitRepository = visitRepository;
        this.mapper = mapper;
        this.buildingRepository = buildingRepository;
    }

    @Override
    public VisitResponseDto addVisit(VisitRequestDto requestDto , User user){
        Visit visit = new Visit();
        visit.setVisitTime(LocalDate.now());
        visit.setNumberOfCards(requestDto.getNumberOfCards());
        visit.setUser(user);
        Building building = buildingRepository.findById(requestDto.getBuildingId()).orElseThrow(
                () -> new IllegalArgumentException("Building not found")
        );
        visit.setBuilding(building);
        visitRepository.save(visit);
        return mapper.toDto(visit);
    }

    @Override
    public List<VisitResponseDto> getUserVisit(Long userId){
        return visitRepository.findVisitsByUserId(userId).stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }


}
