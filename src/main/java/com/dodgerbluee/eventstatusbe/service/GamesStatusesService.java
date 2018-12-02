package com.dodgerbluee.eventstatusbe.service;

import com.dodgerbluee.eventstatusbe.model.GamesStatuses;
import com.dodgerbluee.eventstatusbe.repository.GamesStatusesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GamesStatusesService {

    @Autowired
    private GamesStatusesRepository gamesStatusesRepository;

    public List<GamesStatuses> getAll() {
        List<GamesStatuses> gamesStatusesList = new ArrayList<>();
        gamesStatusesRepository.findAll().forEach(gamesStatusesList::add);
        return gamesStatusesList;
    }
}