package com.cricket.service;

import com.cricket.model.Game;
import com.cricket.model.PreGameDetails;

public interface GameService {
    Game createGame(PreGameDetails preGameDetails);
}
