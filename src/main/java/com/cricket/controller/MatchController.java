package com.cricket.controller;

import com.cricket.client.MatchClient;
import com.cricket.model.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController implements MatchClient {

    @Override
    public Match startMatch(Match preMatchDetails) {
        return null;
    }

    @Override
    public Match addScore(Runs run) {
        return null;
    }

    @Override
    public Match addScoreForExtras(ExtraType extra, Runs run) {
        return null;
    }

    @Override
    public Match batsmanDismissed(Dismissal dismissalType, Runs run, String catcherName) {
        return null;
    }

    @Override
    public Match undoSelected() {
        return null;
    }

    @Override
    public Match nextBatsman(Player player) {
        return null;
    }

    @Override
    public Match nextBowler(Player player) {
        return null;
    }

    @Override
    public Match startSecondInnings(int target) {
        return null;
    }

    @Override
    public void finishMatch() {

    }
}
