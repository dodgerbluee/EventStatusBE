package com.dodgerbluee.eventstatusbe.controller;

import com.dodgerbluee.eventstatusbe.request.GameRequest;
import com.dodgerbluee.eventstatusbe.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seasons")
class SeasonController {

    @Autowired
    private SeasonService seasonService;

    @PutMapping("/{seasonId}/addgame")
    void addGameToSeason(@PathVariable long seasonId, @RequestBody GameRequest gameRequest) throws Exception {
        seasonService.addGameToSeason(seasonId, gameRequest);
    }
}
