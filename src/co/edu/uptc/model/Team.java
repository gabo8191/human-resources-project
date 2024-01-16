package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String nameTeam;
    private String areaTeam;
    private String idTeam;
    private TeamLeader leaderTeam;
    private List<Employee> membersTeam;

    public Team() {
        this.membersTeam = new ArrayList<>();
        this.leaderTeam = new TeamLeader();
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public TeamLeader getLeaderTeam() {
        return leaderTeam;
    }

    public void setLeaderTeam(TeamLeader leaderTeam) {
        this.leaderTeam = leaderTeam;
    }

    public List<Employee> getMembersTeam() {
        return membersTeam;
    }

    public void setMembersTeam(List<Employee> membersTeam) {
        this.membersTeam = membersTeam;
    }

    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getAreaTeam() {
        return areaTeam;
    }

    public void setAreaTeam(String areaTeam) {
        this.areaTeam = areaTeam;
    }

    @Override
    public String toString() {
        return "Team{" + "nameTeam=" + nameTeam + ", areaTeam=" + areaTeam + ", idTeam=" + idTeam + ", leaderTeam="
                + leaderTeam + ", membersTeam=" + membersTeam + '}';
    }

}
