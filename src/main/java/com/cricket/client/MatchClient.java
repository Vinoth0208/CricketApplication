package com.cricket.client;

import com.cricket.model.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(path = "match")
public interface MatchClient {

    @PostMapping("/preMatchDetails")
    public Match startMatch(Match preMatchDetails);

    @PutMapping("/addScore")
    public Match addScore(Runs run);

    @PutMapping("/addScoreForExtras")
    public Match addScoreForExtras(ExtraType extra, Runs run);

    @PutMapping("/batsmanDismissed")
    public Match batsmanDismissed(Dismissal dismissalType, Runs run, String catcherName);

    @PutMapping("/undo")
    public Match undoSelected();

    @PutMapping("/addNextBatsman")
    public Match nextBatsman(Player player);

    @PutMapping("/addNextBowler")
    public Match nextBowler(Player player);

    @PutMapping("/startSecondInnings")
    public Match startSecondInnings(int target);

    @PutMapping("/finishMatch")
    public void finishMatch();
}
