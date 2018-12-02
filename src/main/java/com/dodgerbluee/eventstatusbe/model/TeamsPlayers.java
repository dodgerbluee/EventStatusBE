package com.dodgerbluee.eventstatusbe.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="teamsplayers")
@IdClass(TeamsPlayers_Keys.class)
public class TeamsPlayers implements Serializable {

    @Id
//    @ManyToOne(targetEntity = Team.class)
//    @PrimaryKeyJoinColumn(name = "TEAM_ID", referencedColumnName = "team_id")
    private long teamId;

    @Id
//    @ManyToOne(targetEntity = Player.class)
//    @PrimaryKeyJoinColumn(name = "PLAYER_ID", referencedColumnName = "player_id")
    private long playerId;

    public TeamsPlayers() {
    }

    public TeamsPlayers(long playerId, long teamId) {
        this.playerId = playerId;
        this.teamId = teamId;
    }

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }
}