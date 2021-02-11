/*
 * Copyright 2021 NAFU_at
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package page.nafuchoco.soloservercore.database;

import org.bukkit.Location;

import java.util.Date;
import java.util.UUID;

public class InGamePlayerData extends PlayerData {
    private long latestMoveTime;

    public InGamePlayerData(UUID id, String playerName, Location location, Date lastJoined, UUID joinedTeam) {
        super(id, playerName, location, lastJoined, joinedTeam);
    }

    public InGamePlayerData(PlayerData playerData) {
        super(playerData.getId(), playerData.getPlayerName(), playerData.getSpawnLocationLocation(), playerData.getLastJoined(), playerData.getJoinedTeam());
    }

    public long getLatestMoveTime() {
        return latestMoveTime;
    }

    public void setLatestMoveTime(long latestMoveTime) {
        this.latestMoveTime = latestMoveTime;
    }
}
