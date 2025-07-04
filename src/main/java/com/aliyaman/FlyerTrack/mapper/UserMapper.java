package com.aliyaman.FlyerTrack.mapper;

import com.aliyaman.FlyerTrack.dto.UserDto;
import com.aliyaman.FlyerTrack.models.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserDto toDto(User user);
}
