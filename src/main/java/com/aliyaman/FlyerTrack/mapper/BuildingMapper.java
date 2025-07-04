package com.aliyaman.FlyerTrack.mapper;

import com.aliyaman.FlyerTrack.dto.BuildingDto;
import com.aliyaman.FlyerTrack.models.Building;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BuildingMapper {

    BuildingDto toDto(Building building);
}
