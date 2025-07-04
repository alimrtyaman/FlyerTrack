package com.aliyaman.FlyerTrack.service.impl;

import com.aliyaman.FlyerTrack.dto.BuildingDto;
import com.aliyaman.FlyerTrack.dto.BuildingRequestDto;
import com.aliyaman.FlyerTrack.mapper.BuildingMapper;
import com.aliyaman.FlyerTrack.models.Building;
import com.aliyaman.FlyerTrack.repository.BuildingRepository;
import com.aliyaman.FlyerTrack.service.IBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuldingServiceImpl implements IBuildingService {

    private final BuildingRepository buildingRepository;
    private final BuildingMapper mapper;

    @Autowired
    public BuldingServiceImpl(BuildingRepository buildingRepository, BuildingMapper mapper) {
        this.buildingRepository = buildingRepository;
        this.mapper = mapper;
    }


    @Override
    public BuildingDto saveBuilding(BuildingRequestDto requestDto) {
        Building building = new Building();
        building.setAddress(requestDto.getAddress());
        building.setLatitude(requestDto.getLatitude());
        building.setLongitude(requestDto.getLongitude());
        buildingRepository.save(building);
        return mapper.toDto(building);
    }

    @Override
    public List<BuildingDto> getAllBuildings() {
       return buildingRepository.findAll().stream()
               .map(mapper::toDto)
               .collect(Collectors.toList());
    }

    
}
