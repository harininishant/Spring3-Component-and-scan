package com.example.Spring3.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class RedSox implements ITeam{
    @Value("${game.home.team}")
    private String name;
    @Value("${game.home.score}")
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
