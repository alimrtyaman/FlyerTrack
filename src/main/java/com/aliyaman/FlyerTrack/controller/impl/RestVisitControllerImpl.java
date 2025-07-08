package com.aliyaman.FlyerTrack.controller.impl;

import com.aliyaman.FlyerTrack.controller.IRestVisitController;
import com.aliyaman.FlyerTrack.dto.VisitRequestDto;
import com.aliyaman.FlyerTrack.dto.VisitResponseDto;
import com.aliyaman.FlyerTrack.models.User;
import com.aliyaman.FlyerTrack.service.IVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/visit")
public class RestVisitControllerImpl implements IRestVisitController {


    private final IVisitService visitService;

    @Autowired
    public RestVisitControllerImpl(IVisitService visitService) {
        this.visitService = visitService;
    }

    //i will change the methond pramater user to userId before that i have to implement Jwt service

    @PostMapping
    @Override
    public VisitResponseDto addVisit(@RequestBody VisitRequestDto requestDto, User user) {
        return visitService.addVisit(requestDto, user);
    }

    @GetMapping("/{userId}")
    @Override
    public List<VisitResponseDto> getUserVisit(Long userId) {
        return visitService.getUserVisit(userId);
    }
}
