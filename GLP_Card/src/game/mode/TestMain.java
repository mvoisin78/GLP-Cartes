package game.mode;

import game.card.Card;
import game.card.Draw;
import game.player.Hand;
import game.player.HumanPlayer;
import game.player.Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestMain {
    
    public static void main(String[] args) {
        
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Card> playedCard = new ArrayList<>();
        Player p1 = new HumanPlayer("J1");
        Player p2 = new HumanPlayer("J2");
        Player p3 = new HumanPlayer("J3");
        Player p4 = new HumanPlayer("J4");
        Player p5 = new HumanPlayer("J5");
        int nbrOfPlayers = 15;
        Draw draw = new Draw();
        draw.init();
        Game game = new Game(draw);
        
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nbr de joueur? : ");
            int str = sc.nextInt();
        
            switch (str) {
            case 2: 
                players.add(p1);
                players.add(p2);
                nbrOfPlayers = 2;
                break;
            case 3:
                players.add(p1);
                players.add(p2);
                players.add(p3);
                nbrOfPlayers = 3;
                break;
            case 4: 
                players.add(p1);
                players.add(p2);
                players.add(p3);
                players.add(p4);
                nbrOfPlayers = 4;
                break;
            case 5:
                players.add(p1);
                players.add(p2);
                players.add(p3);
                players.add(p4);
                players.add(p5);
                nbrOfPlayers = 5;
                break;
            default:
                System.err.println("erreur");
                break;
            }
        }while(nbrOfPlayers == 15);
        
        game.start(players);
        
        Iterator<Player> pIterator = players.iterator();
        while(pIterator.hasNext()) {
            Player currentPlayer = pIterator.next();
            Hand currentPlayerHand = currentPlayer.getHand();
            System.out.println("--------------------------------------");
            for(int index=0; index< currentPlayerHand.getSizeHand();index++) {
                System.out.println(index + "-" + currentPlayerHand.getCardHand(index).getValue());
            }
        }
        System.out.println("Cb de cartes?");
        int str = sc.nextInt();
        switch (str){
        case 1:
            System.out.println("Quelle carte?");
            str = sc.nextInt();
            playedCard.add(p1.getHand().getCardHand(str));
            break;
        case 2:
            System.out.println("1ere carte?");
            str = sc.nextInt();
            playedCard.add(p1.getHand().getCardHand(str));
            System.out.println("2eme carte?");
            str = sc.nextInt();
            playedCard.add(p1.getHand().getCardHand(str));
            break;
        case 3:
            System.out.println("1ere carte?");
            str = sc.nextInt();
            playedCard.add(p1.getHand().getCardHand(str));
            System.out.println("2eme carte?");
            str = sc.nextInt();
            playedCard.add(p1.getHand().getCardHand(str));
            System.out.println("3eme carte?");
            str = sc.nextInt();
            playedCard.add(p1.getHand().getCardHand(str));
            break;
        }
        int mode = game.detectGameMode(playedCard);
		switch(mode){
			case 0:
				System.out.println("Mode de jeu: Simple");
				break;
			case 1:
				System.out.println("Mode de jeu: Double");
				break;
			case 2:
				System.out.println("Mode de jeu: Série de deux cartes");
				break;
			case 3:
				System.out.println("Mode de jeu: Triple");
				break;
			case 4:
				System.out.println("Mode de jeu: Série de trois cartes");
				break;
			case 5:
				System.out.println("Série de quatres cartes");
				break;
			case 6:
				System.out.println("Série de cinq cartes");
				break;
		}
        sc.close();
    }

}

