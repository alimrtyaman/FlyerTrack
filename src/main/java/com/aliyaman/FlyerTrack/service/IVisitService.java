package com.aliyaman.FlyerTrack.service;

import com.aliyaman.FlyerTrack.dto.VisitRequestDto;
import com.aliyaman.FlyerTrack.dto.VisitResponseDto;
import com.aliyaman.FlyerTrack.models.User;

import java.util.List;

public interface IVisitService {

    public VisitResponseDto addVisit(VisitRequestDto requestDto , User user);

    public List<VisitResponseDto> getUserVisit(Long userId);
}
