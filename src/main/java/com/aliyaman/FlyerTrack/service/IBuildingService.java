package com.aliyaman.FlyerTrack.service;

import com.aliyaman.FlyerTrack.dto.BuildingDto;
import com.aliyaman.FlyerTrack.dto.BuildingRequestDto;

import java.util.List;

public interface IBuildingService {


    public BuildingDto saveBuilding(BuildingRequestDto requestDto);

    public List<BuildingDto> getAllBuildings();


}
