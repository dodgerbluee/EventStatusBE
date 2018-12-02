package com.dodgerbluee.eventstatusbe.factory;

import com.dodgerbluee.eventstatusbe.model.Player;
import com.dodgerbluee.eventstatusbe.request.PlayerRequest;

public class PlayerFactory {

    public Player createPlayer(PlayerRequest playerRequest) {
        return new Player(playerRequest.getFirstName(), playerRequest.getLastName(), playerRequest.getPhoneNumber(),
                playerRequest.getJerseyNumber(), playerRequest.getEmail());
    }
}
