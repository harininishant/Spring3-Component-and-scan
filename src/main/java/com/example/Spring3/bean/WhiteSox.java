package com.example.Spring3.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component // this passes the value on its own
public class WhiteSox implements ITeam{
    @Value("${game.away.team}")
    private String name;
    @Value("${game.away.score}")
    private int score;

    @Override
    public String getTeamName() {
        return name;
    }

    @Override
    public int getTeamScore() {
        return score;
    }
}
