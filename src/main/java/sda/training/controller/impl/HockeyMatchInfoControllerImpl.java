package sda.training.controller.impl;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/team_info")
public class HockeyMatchInfoControllerImpl {

    @GetMapping(value = "/get_info_playoff",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<String> getPlayOffTeamsNames(){
        return Collections
                .singletonList("Canada, Russia, Usa, Sweden, Finland, Czech Republic, France");
    }

    public List<String> getQuaterFinalTeamNamesPair(){
        return null;
    }

    @GetMapping(value = "/get_info_final",
            headers = {"Accept=application/json"})
    @ResponseBody
    public List<String> getQuaterFinalTeamNames(){
        return null;
    }

    @GetMapping(value = "/get_info_teams_participate",
            headers = {"Accept=application/json"})
    @ResponseBody
    public Long getCountOfTeamsParticipate(){
        return Long.valueOf(23/(0));
    }

    @GetMapping(value = "/get_info_current_year",
            headers = {"Accept=application/json"})
    @ResponseBody
    public Long getCurrentYear(){
        return 2018L;
    }

    @GetMapping(value = "/last_day_of_tournament",
            headers = {"Accept=application/json"})
    @ResponseBody
    public double getLastDayOfTheTourniment(){
        return Math.random();
    }



}
