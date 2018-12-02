package com.dodgerbluee.eventstatusbe.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

    @Entity
    @Table(name="gamesstatuses")
    @IdClass(GamesStatuses_Keys.class)
    public class GamesStatuses implements Serializable {

        @Id
        private long gameId;

        @Id
        private long playerId;

        public GamesStatuses() {
        }

        public GamesStatuses(long gameId, long playerId) {
            this.gameId = gameId;
            this.playerId = playerId;
        }

        public long getGameId() {
            return gameId;
        }

        public void setGameId(long gameId) {
            this.gameId = gameId;
        }

        public long getPlayerId() {
            return playerId;
        }

        public void setPlayerId(long playerId) {
            this.playerId = playerId;
        }
    }