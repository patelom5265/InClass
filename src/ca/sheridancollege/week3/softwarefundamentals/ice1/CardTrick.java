/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Sivagama
 * @modifier OMKUMAR PATEL student ID:- 991609063
 */
public class CardTrick
{

   public static int getRandomNumber (int min, int max)
   {
      Random r = new Random();
      return r.nextInt((max - min) + 1) + min;
   }

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         int ran = getRandomNumber(0, 3);
         int ranCard = getRandomNumber(1, 13);
         c.setValue(ranCard);
         c.setSuit(Card.SUITS[ran]);
         magicHand[i] = c;
         //c.setValue(insert call to random number generator here)
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
      }

      //insert code to ask the user for Card value and suit, create their card
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number from 1-13");
      int userCard = sc.nextInt();
      System.out.println("Enter ");
      System.out.println("0)Hearts");
      System.out.println("1)Diamonds");
      System.out.println("2)Spades");
      System.out.println("3)Clubs");
      System.out.println("Enter your choice");
      int userSuit = sc.nextInt();
      Card usrCard = new Card();
      usrCard.setSuit(Card.SUITS[userSuit]);
      usrCard.setValue(userCard);
      // and search magicHand here
      boolean isPresent = false;
      for (int i = 0; i < 7; i++) {
         if ((magicHand[i].getSuit() == usrCard.getSuit()) && (magicHand[i].getValue() == usrCard.getValue())) {

            isPresent = true;

         }
      }
      //Then report the result here
      if (isPresent) {
         System.out.println("Your card " + usrCard.getValue() + "of" + usrCard.getSuit() + "is present in magic hand");
      }
      else {
         System.out.println("Your card is not present in the magic hand");
      }
      Card luckyCard=new Card();
      luckyCard.setSuit("Spades");
      luckyCard.setValue(6);
   }
   
}
