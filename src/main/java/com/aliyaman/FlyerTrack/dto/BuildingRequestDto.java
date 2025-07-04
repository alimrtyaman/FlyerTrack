package com.aliyaman.FlyerTrack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuildingRequestDto {

    private String address;

    private Double latitude;

    private Double longitude;
}
