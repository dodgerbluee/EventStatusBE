package com.dodgerbluee.eventstatusbe.controller;

import com.dodgerbluee.eventstatusbe.model.GamesStatuses;
import com.dodgerbluee.eventstatusbe.service.GamesStatusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gamesstatuses")
class GamesStatusesController {

    @Autowired
    private GamesStatusesService gamesStatusesService;

    @RequestMapping("/getall")
    List<GamesStatuses> getAll() {
        return gamesStatusesService.getAll();
    }
}
