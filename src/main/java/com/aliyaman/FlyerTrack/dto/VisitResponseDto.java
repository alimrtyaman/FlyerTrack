package com.aliyaman.FlyerTrack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitResponseDto {

    private String address;

    private Long buildingId;

    private Integer numberOfCard;


}
