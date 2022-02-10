package com.cricket.client;

import com.cricket.model.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(path = "game")
public interface GameClient {

    @PostMapping("/createMatch")
    public Game startGame(@RequestBody PreGameDetails preGameDetails);

    @PutMapping("/addScore")
    public Game addScore(Runs run);

    @PutMapping("/addScoreForExtras")
    public Game addScoreForExtras(ExtraType extra, Runs run);

    @PutMapping("/batsmanDismissed")
    public Game batsmanDismissed(Dismissal dismissalType, Runs run, String catcherName);

    @PutMapping("/undo")
    public Game undoSelected();

    @PutMapping("/addNextBatsman")
    public Game nextBatsman(Player player);

    @PutMapping("/addNextBowler")
    public Game nextBowler(Player player);

    @PutMapping("/startSecondInnings")
    public Game startSecondInnings(int target);

    @PutMapping("/finishGame")
    public void finishGame();
}
