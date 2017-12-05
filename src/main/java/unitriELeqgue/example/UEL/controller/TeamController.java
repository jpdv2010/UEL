package unitriELeqgue.example.UEL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import unitriELeqgue.example.UEL.model.Competitor;
import unitriELeqgue.example.UEL.model.Team;
import unitriELeqgue.example.UEL.repository.TeamRepository;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/time")
public class TeamController {
    @Autowired
    TeamRepository teams;

    @RequestMapping("/cs")
    public ModelAndView teamsCS(){
        ModelAndView mv=new ModelAndView("teampagecs");
        List<Team> teamList=teams.findAll();
        List<Team> csTeamList=new ArrayList<>();
        for(Team team : teamList){
            if(Objects.equals(team.getGame(), "CS: Global Ofensive"))
                csTeamList.add(team);
        }
        mv.addObject("teamList",csTeamList);
        return mv;
    }
    @RequestMapping("/lol")
    public ModelAndView teamsLOL(){
        ModelAndView mv=new ModelAndView("teampagelol");
        List<Team> teamList=teams.findAll();
        List<Team> lolTeamList=new ArrayList<>();
        for(Team team : teamList){
            if(Objects.equals(team.getGame(), "League of Legends"))
                lolTeamList.add(team);
        }
        mv.addObject("teamList",lolTeamList);
        return mv;
    }

    @RequestMapping
    public ModelAndView create(@Valid Team team, BindingResult bindingResult){
        ModelAndView mv=new ModelAndView("teampage");
        if(bindingResult.hasErrors()){
            Competitor competitor=new Competitor();
            competitor.setNickname("..");
            mv.addObject("captain",competitor);
            mv.setViewName("teaminsc");
            return mv;
        }
        teams.save(team);
        mv.addObject("mensagem","salvo com sucesso!");
        List<Team> teamList=teams.findAll();
        mv.addObject("teamList",teamList);
        return mv;
    }

}
