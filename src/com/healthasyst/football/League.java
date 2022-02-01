package com.healthasyst.football;

public class League {

	public static void main(String[] args) {
		Player player1=new Player();
		player1.playerName="raina";
		
		Player player2=new Player();
		player2.playerName="dhoni";

		Player player3=new Player();
		player3.playerName="john";
		
		Player[] team1Players=new Player[3];
		team1Players[0]=player1;
		team1Players[1]=player2;
		team1Players[2]=player3;
		
		Team team1=new Team();
		team1.teamName="CSK";
		team1.playerArray=team1Players;
		
		
		Player player4=new Player();
		player4.playerName="kohli";
		
		Player player5=new Player();
		player5.playerName="ABD";

		Player player6=new Player();
		player6.playerName="chahal";
		
		Player[] team2Players=new Player[3];
		team2Players[0]=player4;
		team2Players[1]=player5;
		team2Players[2]=player6;
		
		Team team2=new Team();
		team2.teamName="RCB";
		team2.playerArray2=team2Players;
		
		
		System.out.println("Team 1 Name: "+team1.teamName);
		System.out.println("Team 1 Players names are");
		
		for(Player t1 : team1.playerArray)
		{
			System.out.println(t1.playerName);
		}
		

		System.out.println("Team 2 Name: "+team2.teamName);
		System.out.println("Team 2 Players names are");
		
		for(Player t2 : team2.playerArray2)
		{
			System.out.println(t2.playerName);
		}

	}

}
