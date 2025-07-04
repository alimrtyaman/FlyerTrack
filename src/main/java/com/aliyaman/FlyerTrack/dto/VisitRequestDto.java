package com.aliyaman.FlyerTrack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitRequestDto {

    private Long buildingId;

    private Integer numberOfCards;
}
