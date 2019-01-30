/*CSCI 1100 - Project - November 28, 2017
This program is a math game for elementary students.
<Sarah Thompson><Kirsten Richard><Gillean Smith>*/

import java.util.Scanner;
import java.util.Random;
   public class MathMagicians{
      public static void main(String[]args){
         Scanner kb = new Scanner (System.in);
         
         System.out.print("Please enter your name: ");
         String name = kb.nextLine();
         
         System.out.print("Please enter your grade (1-4): ");
         int grade = kb.nextInt();
         
         System.out.println();
         System.out.println("There are four types of questions.");
         
         greeting(name);
         int selection = kb.nextInt();
         userChoice(grade, selection);
         
         //calling the grades by selection of the user
         if(grade == 1)
            grade1(selection);
         else if(grade == 2)
            grade2(selection);
         else if(grade == 3)
            grade3(selection);
         else
            grade4(selection);
         
 
      }
      
      
      public static void greeting(String name){
         Scanner kb = new Scanner (System.in);
         System.out.println("Enter 1 to solve addition and subtraction equations.");
         System.out.println("Enter 2 to solve multiplication and division equations.");
         System.out.println("Enter 3 to guess the operator to solve equations.");
         System.out.println("Enter 4 to solve word problems.");
         System.out.println("Enter 5 to quit.");
         System.out.print("\nHi " + name + "! Please select a type of question by entering a number: ");
      }
      
      
      //this method introduces the questions for the user 
      public static void userChoice(int grade, int selection){
         if(selection == 1){
            System.out.println("\nGood! You have chosen to solve addition and subtraction equations for Grade " + grade + " level. ");
            System.out.print("There are 10 questions to solve in this round:");
         }
         else if (selection == 2){
            System.out.println("\nGood! You have chosen to solve multiplication and division equations for Grade " + grade + " level. ");
            System.out.print("There are 10 questions to solve in this round:");
         }
         else if (selection == 3){
            System.out.println("\nGood! You have chosen to guess the operator to solve equations for Grade " + grade + " level. ");
            System.out.print("There are 10 questions to solve in this round:");
         }
         else if (selection == 4){
            System.out.println("\nGood! You have chosen to solve word for Grade " + grade + " level. ");
            System.out.print("There are 3 questions to solve in this round:");
         }
         else
            System.out.println("\nGOODBYE!");
         }
      
      
      //Here is the start of grade 1   
      public static void grade1(int selection){
         Scanner kb = new Scanner (System.in);
         Random random = new Random();
         
         while(true){
            if(selection == 1){

               int coins = 0;
               System.out.println();
               //for loop for addition questions
               for(int i=0; i<5; i++){
                  int random1 = random.nextInt(5); //use the random class, which generates a number from 0 to 5
                  int random2 = random.nextInt(5);
                  System.out.print("\nWhat is " + random1 + " + " + random2 + " = ");
                  int answer = kb.nextInt();
                  if(answer == random1 + random2){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
               }
               //for loop for subtration questions
               for(int i=0; i<5; i++){
                  int random1 = random.nextInt(5);
                  int random2 = random.nextInt(5);
                  System.out.print("\nWhat is " + random1 + " - " + random2 + " = ");
                  int answer = kb.nextInt();
                  if(answer == random1 - random2){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
               }
               System.out.println("\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
               
               }
           
         
         
         
            if(selection == 2){
               int coins=0;
               
               System.out.print("\n\nWhat is 2 * 3 = ");
               int answer1 = kb.nextInt();
               if(answer1 == 6){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
            
               System.out.print("\n\nWhat is 5 * 1 = ");
               int answer2 = kb.nextInt();
               if(answer2 == 5){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
               
               System.out.print("\n\nWhat is 4 * 2 = ");
               int answer3 = kb.nextInt();
               if(answer3 == 8){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
            
               System.out.print("\n\nWhat is 3 * 3 = ");
               int answer4 = kb.nextInt();
               if(answer4 == 9){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
               
               System.out.print("\n\nWhat is 1 * 7 = ");
               int answer5 = kb.nextInt();
               if(answer5 == 7){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
                  
               System.out.print("\n\nWhat is 9 / 3 = ");
               int answer6 = kb.nextInt();
               if(answer6 == 3){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
                
               System.out.print("\n\nWhat is 4 / 2 = ");
               int answer7 = kb.nextInt();
               if(answer7 == 2){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                 System.out.println("Sorry that is incorrect :(");
               
               System.out.print("\n\nWhat is 5 / 1 = ");
               int answer8 = kb.nextInt();
               if(answer8 == 5){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
                
               System.out.print("\n\nWhat is 10 / 5 = ");
               int answer9 = kb.nextInt();
               if(answer9 == 2){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
               
               System.out.print("\n\nWhat is 1 / 1 = ");
               int answer10 = kb.nextInt();
               if(answer10 == 1){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
                  
               System.out.println("\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
            }
            
            
            if(selection == 3){
               int coins = 0;
               System.out.print("\n\nGuess the operator: 5 _ 5 = 25 ");
               String operator1 = kb.next();
               if (operator1.equals("*")){
                  System.out.println("Perfect! You win 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
               
               System.out.print("\nGuess the operator: 9 _ 3 = 3 ");
               String operator2 = kb.next();
               if (operator2.equals("/")){
                  System.out.println("Perfect! You win 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 4 _ 5 = 9 ");
               String operator3 = kb.next();
               if (operator3.equals("+")){
                  System.out.println("Perfect! You win 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
      
               System.out.print("\nGuess the operator: 2 _ 1 = 1 ");
               String operator4 = kb.next();
               if (operator4.equals("-")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }   
               else { 
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 3 _ 2 = 5 ");
               String operator5 = kb.next();
               if (operator5.equals("+")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 10 _ 2 = 5 ");
               String operator6 = kb.next();
               if (operator6.equals("/")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 7 _ 3 = 21 ");
               String operator7 = kb.next();
               if (operator7.equals("*")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 6 _ 8 = 14 ");
               String operator8 = kb.next();
               if (operator8.equals("+")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 12 _ 6 = 6 ");
               String operator9 = kb.next();
               if (operator9.equals("-")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 3 _ 4 = 12 ");
               String operator10 = kb.next();
               if (operator10.equals("*")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :(");
               }
               System.out.println("\n\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
            }    
         
         
            if(selection == 4){
               int coins = 0;
               System.out.print("\n\n1. George and Frankie played basketball at lunch. George made 5 baskets and Frankie made 7 baskets.\n"+
               " How many baskets did George and Frankie make together? ");
               int answer1 = kb.nextInt();
               /*the next section of code uses nested if/else statements to figure out if the user has the correct answer,
               if they want a hint, and determines how many coins they won*/
               if (answer1 == 12){
                  System.out.println("Perfect! You won 10 coins!");
                  coins += 10;
               }
               else if(answer1!=12){
                  System.out.println("Sorry that was wrong :(");
                  System.out.print("Would you like a hint? (yes or no): ");
                  String hint1 = kb.next();
               
               
                  if(hint1.equals("yes")){
                     System.out.println("1. Hint: 5 + 7 = ? ");
                     System.out.print("Try again: ");
                     int tryAgain1 = kb.nextInt();
                     
                     if (tryAgain1 == 12){
                        System.out.print("Great! You won 5 coins!");
                        coins += 5;
                     }
                     else
                        System.out.println("Try next question.");
                  }
                  else
                     System.out.println("Try next question.");
               }
               else 
                  System.out.println("Try next question.");
   
                 
               System.out.print("\n\n2. Jenny has 8 apples, then Tommy took 3 of his apples. How many apples does Jenny have now? ");
               int answer2 = kb.nextInt();
      
               if (answer2 == 5){
                  System.out.println("Perfect! You won 10 coins!");
                  coins += 10;
               }
               else if(answer2 != 5){
                  System.out.println("Sorry that was wrong :(");
                  System.out.print("Would you like a hint? (yes or no): ");
                  String hint2 = kb.next();
            
                  if(hint2.equals("yes")){
                     System.out.println("1. Hint: 8 - 3 = ? ");
                     System.out.print("Try again: ");
                     int tryAgain2 = kb.nextInt();
                     
                     if (tryAgain2 == 5){
                        System.out.print("Great! You won 5 coins!");
                        coins += 5;
                     }
                     else
                        System.out.println("Try next question.");
                  }
                  else
                     System.out.println("Try next question.");
               }
               else 
                  System.out.println("Try next question.");
               
            
               System.out.print("\n\n3. Every time Ashley goes to her grandmother, her grandmother gives her 3 candies.\n" +
               "Ashley went to her grandmother's 3 times this week. How many candies did Ashley get this week? ");
               int answer3 = kb.nextInt();
   
               if (answer3 == 9){
                  System.out.println("Perfect! You won 10 coins!");
                  coins += 10;
               }
               else if(answer3 !=9){
                  System.out.println("Sorry that was wrong :(");
                  System.out.print("Would you like a hint? (yes or no): ");
                  String hint3 = kb.next();
               
            
                  if(hint3.equals("yes")){
                     System.out.println("3. Hint: 3 * 3 = ? ");
                     System.out.print("Try again: ");
                     int tryAgain3 = kb.nextInt();
                     
                     if (tryAgain3 == 9){
                        System.out.print("Great! You won 5 coins!");
                        coins += 5;
                     }
                  }
               }
               System.out.println("\n\nExcellent you have completed this round! YOU WON " + coins  + " COINS!"); 
            }
               
            System.out.print("\nDo you want to play again? (yes or no) ");
            String replay = kb.next();
            
            if(replay.equals("no"))
               break;
         }
         System.out.println("\nGOODBYE!");
      }
      
      //Here is the start of grade 2!
      public static void grade2(int selection){
         Scanner kb = new Scanner (System.in);
         Random random = new Random();
         
         //use of while loop to repeat code if user wants to play again
         while(true){
            if(selection == 1){
               int coins = 0;
               System.out.println();
               for(int i=0; i<5; i++){
                  int random1 = random.nextInt(10);
                  int random2 = random.nextInt(10);
                  System.out.print("\nWhat is " + random1 + " + " + random2 + " = ");
                  int answer = kb.nextInt();
                  if(answer == random1 + random2){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
               }
               for(int i=0; i<5; i++){
                  int random1 = random.nextInt(10);
                  int random2 = random.nextInt(10);
                  System.out.print("\nWhat is " + random1 + " - " + random2 + " = ");
                  int answer = kb.nextInt();
                  if(answer == random1 - random2){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
               }
               System.out.println("\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
            }
            
         
            if(selection == 2){
               int coins=0;
            
               System.out.print("\n\nWhat is 6 x 3 = ");
               int answer1 = kb.nextInt();
               if(answer1 == 18){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;//everytime user gets answer correct, 5 coins are added to the total so it can be printed out at the end of the round
               }
               else
                  System.out.println("Sorry that is incorrect :(");
               
               System.out.print("\n\nWhat is 4 x 3 = ");
               int answer2 = kb.nextInt();
               if(answer2 == 12){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
               
               System.out.print("\n\nWhat is 8 x 2 = ");
               int answer3 = kb.nextInt();
               if(answer3 == 16){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
               
               System.out.print("\n\nWhat is 9 x 2 = ");
               int answer4 = kb.nextInt();
               if(answer4 == 18){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
            
               System.out.print("\n\nWhat is 8 x 4 = ");
               int answer5 = kb.nextInt();
               if(answer5 == 32){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
                  
               System.out.print("\n\nWhat is 12 / 3 = ");
               int answer6 = kb.nextInt();
               if(answer6 == 4){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
                
               System.out.print("\n\nWhat is 16 / 4 = ");
               int answer7 = kb.nextInt();
               if(answer7 == 4){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                 System.out.println("Sorry that is incorrect :(");
               
               System.out.print("\n\nWhat is 18 / 2 = ");
               int answer8 = kb.nextInt();
               if(answer8 == 9){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
                
               System.out.print("\n\nWhat is 20 / 5 = ");
               int answer9 = kb.nextInt();
               if(answer9 == 4){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
               
               System.out.print("\n\nWhat is 22 / 11 = ");
               int answer10 = kb.nextInt();
               if(answer10 == 2){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else
                  System.out.println("Sorry that is incorrect :(");
                  
               System.out.println("\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
            }
            
            
            if(selection == 3){
               int coins = 0;
               System.out.print("\n\nGuess the operator: 8 _ 6 = 48 ");
               String operator1 = kb.next();
               if (operator1.equals("*")){
                  System.out.println("Perfect! You win 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
               
               System.out.print("\nGuess the operator: 20 _ 10 = 2 ");
               String operator2 = kb.next();
               if (operator2.equals("/")){
                  System.out.println("Perfect! You win 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 7 _ 8 = 15 ");
               String operator3 = kb.next();
               if (operator3.equals("+")){
                  System.out.println("Perfect! You win 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
      
               System.out.print("\nGuess the operator: 9 _ 4 = 5 ");
               String operator4 = kb.next();
               if (operator4.equals("-")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }   
               else { 
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 18 _ 2 = 20 ");
               String operator5 = kb.next();
               if (operator5.equals("+")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 21 _ 3 = 7 ");
               String operator6 = kb.next();
               if (operator6.equals("/")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }    
   
               System.out.print("\nGuess the operator: 36 _ 6 = 6 ");
               String operator7 = kb.next();
               if (operator7.equals("/")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 18 _ 2 = 36 ");
               String operator8 = kb.next();
               if (operator8.equals("*")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 18 _ 8 = 10 ");
               String operator9 = kb.next();
               if (operator9.equals("-")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :( Try next question.");
               }
   
               System.out.print("\nGuess the operator: 9 _ 5 = 45 ");
               String operator10 = kb.next();
               if (operator10.equals("*")){
                  System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
               }
               else {
                  System.out.println("Sorry that was wrong :(");
               }
               System.out.println("\n\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
            }  
         
         
            if(selection == 4){
               int coins = 0;
               System.out.print("\n\n1. Everyday, Benny walks 7 dogs. By the end of the week, how many dogs has Benny walked? ");
               int answer1 = kb.nextInt();
               if (answer1 == 49){
                  System.out.println("Perfect! You won 10 coins!");
                  coins += 10;
               }
               else if(answer1!=49){
                  System.out.println("Sorry that was wrong :(");
                  System.out.print("Would you like a hint? (yes or no): ");
                  String hint1 = kb.next();
               
               
                  if(hint1.equals("yes")){
                     System.out.println("1. Hint: 7 * 7 = ? ");
                     System.out.print("Try again: ");
                     int tryAgain1 = kb.nextInt();
                     
                     if (tryAgain1 == 49){
                        System.out.print("Great! You won 5 coins!");
                        coins += 5;
                     }
                     else
                        System.out.println("Try next question.");
                  }
                  else
                     System.out.println("Try next question.");
               }
               else 
                  System.out.println("Try next question.");
   
                 
               System.out.print("\n\n2. Between Narissa and Jack, there are 50 oranges to peel.\n"+
               " If Jack peels 31, how many does Narissa have to peel? ");
               int answer2 = kb.nextInt();
      
               if (answer2 == 19){
                  System.out.println("Perfect! You won 10 coins!");
                  coins += 10;
               }
               else if(answer2 != 19){
                  System.out.println("Sorry that was wrong :(");
                  System.out.print("Would you like a hint? (yes or no): ");
                  String hint2 = kb.next();
               
                  if(hint2.equals("yes")){
                     System.out.println("1. Hint: 50 - 31 = ? ");
                     System.out.print("Try again: ");
                     int tryAgain2 = kb.nextInt();
                     
                     if (tryAgain2 == 19){
                        System.out.print("Great! You won 5 coins!");
                        coins += 5;
                     }
                     else
                        System.out.println("Try next question.");
                  }
                  else
                     System.out.println("Try next question.");
               }
               else 
                  System.out.println("Try next question.");
               
               
               System.out.print("\n\n3. On Tuesday, it snowed 10 cm. The next day, it snowed double the amount of Tuesday's.\n"+
               " How much snow in total did it snow over the two days? ");
               int answer3 = kb.nextInt();
   
               if (answer3 == 30){
                  System.out.println("Perfect! You won 10 coins!");
                  coins += 10;
               }
               else if(answer3 !=30){
                  System.out.println("Sorry that was wrong :(");
                  System.out.print("Would you like a hint? (yes or no): ");
                  String hint3 = kb.next();
               
               
                  if(hint3.equals("yes")){
                     System.out.println("3. Hint: 10 + 20 = ? ");
                     System.out.print("Try again: ");
                     int tryAgain3 = kb.nextInt();
                     
                     if (tryAgain3 == 30){
                        System.out.print("Great! You won 5 coins!");
                        coins += 5;
                     }
                  }
               }
               System.out.println("\n\nExcellent you have completed this round! YOU WON " + coins  + " COINS!"); 
            }
            System.out.print("\nDo you want to play again? (yes or no) ");
            String replay = kb.next();
            
            if(replay.equals("no"))
               break;//no longer repeats the code if user no longer wishes to play again
         }
            System.out.println("\nGOODBYE!");
      }
    
      
 
      //Here is the start of grade 3!
      public static void grade3(int selection){
         Scanner kb = new Scanner (System.in);
         Random random = new Random();
            
            while(true){
               //this if statement is used if the user wants to do addition and subtraction questions
               if(selection == 1){
                  int coins = 0;
                  System.out.println();
                  for(int i=0; i<5; i++){
                     int random1 = random.nextInt(15);
                     int random2 = random.nextInt(15);
                     System.out.print("\nWhat is " + random1 + " + " + random2 + " = ");
                     int answer = kb.nextInt();
                     if(answer == random1 + random2){
                        System.out.println("Perfect! You won 5 coins!");
                        coins += 5;
                     }
                     else
                        System.out.println("Sorry that is incorrect :(");
                  }
                  for(int i=0; i<5; i++){
                     int random1 = random.nextInt(15);
                     int random2 = random.nextInt(15);
                     System.out.print("\nWhat is " + random1 + " - " + random2 + " = ");
                     int answer = kb.nextInt();
                     if(answer == random1 - random2){
                        System.out.println("Perfect! You won 5 coins!");
                        coins += 5;
                     }
                     else
                        System.out.println("Sorry that is incorrect :(");
                  }
                  System.out.println("\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
               }  
         
         
               //this if statement is used if the user wants to do multiplication and division questions
               if(selection == 2){
                  int coins=0;
            
                  System.out.print("\n\nWhat is 7 x 6 = ");
                  int answer1 = kb.nextInt();
                  if(answer1 == 42){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
               
                  System.out.print("\n\nWhat is 9 x 3 = ");
                  int answer2 = kb.nextInt();
                  if(answer2 == 27){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                  System.out.println("Sorry that is incorrect :(");
               
                  System.out.print("\n\nWhat is 6 x 9 = ");
                  int answer3 = kb.nextInt();
                  if(answer3 == 54){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
            
                  System.out.print("\n\nWhat is 11 x 4 = ");
                  int answer4 = kb.nextInt();
                  if(answer4 == 44){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
            
                  System.out.print("\n\nWhat is 8 x 10 = ");
                  int answer5 = kb.nextInt();
                  if(answer5 == 80){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
               
                  System.out.print("\n\nWhat is 40 / 5 = ");
                  int answer6 = kb.nextInt();
                  if(answer6 == 8){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
             
                  System.out.print("\n\nWhat is 30 / 3 = ");
                  int answer7 = kb.nextInt();
                  if(answer7 == 10){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
            
                  System.out.print("\n\nWhat is 28 / 4 = ");
                  int answer8 = kb.nextInt();
                  if(answer8 == 7){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
             
                  System.out.print("\n\nWhat is 60 / 5 = ");
                  int answer9 = kb.nextInt();
                  if(answer9 == 12){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
               
                  System.out.print("\n\nWhat is 88 / 8 = ");
                  int answer10 = kb.nextInt();
                  if(answer10 == 11){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
                  
                  System.out.println("\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
               }     
         
         
               //this if statement is used if the user wants to guess operators
               if(selection == 3){
                  int coins = 0;
                  System.out.print("\n\nGuess the operator: 9 _ 9 = 89 ");
                  String operator1 = kb.next();
                  if (operator1.equals("*")){
                     System.out.println("Perfect! You win 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
            
                  System.out.print("\nGuess the operator: 80 _ 10 = 8 ");
                  String operator2 = kb.next();
                  if (operator2.equals("/")){
                     System.out.println("Perfect! You win 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
   
                  System.out.print("\nGuess the operator: 35 _ 6 = 41 ");
                  String operator3 = kb.next();
                  if (operator3.equals("+")){
                     System.out.println("Perfect! You win 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
   
                  System.out.print("\nGuess the operator: 36 _ 4 = 31 ");
                  String operator4 = kb.next();
                  if (operator4.equals("-")){
                     System.out.println("Perfect! You won 5 coins!");
                  coins += 5;
                  }   
                  else { 
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
  
                  System.out.print("\nGuess the operator: 47 _ 2 = 49 ");
                  String operator5 = kb.next();
                  if (operator5.equals("+")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
   
                  System.out.print("\nGuess the operator: 56 _ 7 = 8 ");
                  String operator6 = kb.next();
                  if (operator6.equals("/")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
   
                  System.out.print("\nGuess the operator: 64 _ 8 = 8 ");
                  String operator7 = kb.next();
                     if (operator7.equals("/")){
                        System.out.println("Perfect! You won 5 coins!");
                        coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
   
                  System.out.print("\nGuess the operator: 7 _ 9 = 63 ");
                  String operator8 = kb.next();
                  if (operator8.equals("*")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
   
                  System.out.print("\nGuess the operator: 45 _ 6 = 39 ");
                  String operator9 = kb.next();
                  if (operator9.equals("-")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
  
                  System.out.print("\nGuess the operator: 7 _ 4 = 28 ");
                  String operator10 = kb.next();
                  if (operator10.equals("*")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :(");
                  }
                  System.out.println("\n\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
               }
         
         
            //this if statement is used if the user wants to complete word questions
            if(selection == 4){
               int coins = 0;
               System.out.print("\n\n1. Grannie Smith makes 25 apple pies every thanksgiving.\n"+
               "If there are 5 people that are celebrating thanksgiving with her, how many pies does each person get? ");
               int answer1 = kb.nextInt();
               if (answer1 == 5){
                  System.out.println("Perfect! You won 10 coins!");
                  coins += 10;
               }
               else if(answer1!=5){
                  System.out.println("Sorry that was wrong :(");
                  System.out.print("Would you like a hint? (yes or no): ");
                  String hint1 = kb.next();
                  
           
                  if(hint1.equals("yes")){
                     System.out.println("1. Hint: 25 / 5 = ? ");
                     System.out.print("Try again: ");
                     int tryAgain1 = kb.nextInt();
                     
                     if (tryAgain1 == 5){
                        System.out.print("Great! You won 5 coins!");
                        coins += 5;
                     }
                     else
                        System.out.println("Try next question.");
                     }
                  else
                     System.out.println("Try next question.");
               }  
               else 
                  System.out.println("Try next question.");

               
               System.out.print("\n\n2. At Sophie's school, there are a total of 32 kids in her class.\n" +
               "If there are 17 girls, how many boys are in her class? ");
               int answer2 = kb.nextInt();
    
               if (answer2 == 15){
                  System.out.println("Perfect! You won 10 coins!");
                  coins += 10;
               }
               else if(answer2 != 15){
                  System.out.println("Sorry that was wrong :(");
                  System.out.print("Would you like a hint? (yes or no): ");
                  String hint2 = kb.next();
                  
                  if(hint2.equals("yes")){
                     System.out.println("1. Hint: 32 - 17 = ? ");
                     System.out.print("Try again: ");
                     int tryAgain2 = kb.nextInt();
                  
                     if (tryAgain2 == 15){
                        System.out.print("Great! You won 5 coins!");
                        coins += 5;
                     }
                     else
                        System.out.println("Try next question.");
                  }
                  else
                     System.out.println("Try next question.");
               }  
               else 
                  System.out.println("Try next question.");
               
            
               System.out.print("\n\n3. On an average day, Jimmy reads 2 books.\n" + 
               "If Jimmy kept reading the amount of books per day for the entire month of February, how many books did Jimmy read? ");
               int answer3 = kb.nextInt();
  
               if (answer3 == 56){
                  System.out.println("Perfect! You won 10 coins!");
                  coins += 10;
               }
               else if(answer3 !=56){
                  System.out.println("Sorry that was wrong :(");
                  System.out.print("Would you like a hint? (yes or no): ");
                  String hint3 = kb.next();
               
               
                  if(hint3.equals("yes")){
                     System.out.println("3. Hint: 2 * 28 = ? ");
                     System.out.print("Try again: ");
                     int tryAgain3 = kb.nextInt();
                        
                     if (tryAgain3 == 56){
                        System.out.print("Great! You won 5 coins!");
                        coins += 5;
                     }
                  }
               }
               System.out.println("\n\nExcellent you have completed this round! YOU WON " + coins  + " COINS!"); 
            }
            
            System.out.print("\nDo you want to play again? (yes or no) ");
            String replay = kb.next();
            
            if(replay.equals("no"))
               break;
         }
         System.out.println("\nGOODBYE!");
      }
               
      //Here is the start of grade 4!
      public static void grade4(int selection){
         Scanner kb = new Scanner (System.in);
         Random random = new Random();
            while(true){
               if(selection == 1){
                  int coins = 0;
                  System.out.println();
                  for(int i=0; i<5; i++){
                     int random1 = random.nextInt(100); //as the grades get higher, we incresed the random numbers
                     int random2 = random.nextInt(100);
                     System.out.print("\nWhat is " + random1 + " + " + random2 + " = ");
                     int answer = kb.nextInt();
                     if(answer == random1 + random2){
                        System.out.println("Perfect! You won 5 coins!");
                        coins += 5;
                     }
                     else
                        System.out.println("Sorry that is incorrect :(");
                  }
                  for(int i=0; i<5; i++){
                     int random1 = random.nextInt(100);
                     int random2 = random.nextInt(100);
                     System.out.print("\nWhat is " + random1 + " - " + random2 + " = ");
                     int answer = kb.nextInt();
                     if(answer == random1 - random2){
                        System.out.println("Perfect! You won 5 coins!");
                        coins += 5;
                     }
                     else
                        System.out.println("Sorry that is incorrect :(");
                  }
                  System.out.println("\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
               }
            
            
               if(selection == 2){
                  int coins=0;
               
                  System.out.print("\n\nWhat is 9 x 6 = ");
                  int answer1 = kb.nextInt();
                  if(answer1 == 54){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
               
                  System.out.print("\n\nWhat is 12 x 4 = ");
                  int answer2 = kb.nextInt();
                  if(answer2 == 48){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
                  
                  System.out.print("\n\nWhat is 13 x 3 = ");
                  int answer3 = kb.nextInt();
                  if(answer3 == 39){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
                  
                  System.out.print("\n\nWhat is 4 x 14 = ");
                  int answer4 = kb.nextInt();
                  if(answer4 == 56){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
                  
                  System.out.print("\n\nWhat is 8 x 12 = ");
                  int answer5 = kb.nextInt();
                  if(answer5 == 96){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
                  
                  System.out.print("\n\nWhat is 78 / 3 = ");
                  int answer6 = kb.nextInt();
                  if(answer6 == 26){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
                   
                  System.out.print("\n\nWhat is 68 / 2 = ");
                  int answer7 = kb.nextInt();
                  if(answer7 == 34){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
               
                  System.out.print("\n\nWhat is 55 / 11 = ");
                  int answer8 = kb.nextInt();
                  if(answer8 == 5){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
                
                  System.out.print("\n\nWhat is 82 / 2 = ");
                  int answer9 = kb.nextInt();
                  if(answer9 == 41){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
                  
                  System.out.print("\n\nWhat is 96 / 6 = ");
                  int answer10 = kb.nextInt();
                  if(answer10 == 16){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else
                     System.out.println("Sorry that is incorrect :(");
                     
                  System.out.println("\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
               }  
            
            
               if(selection == 3){//here is where you left off!
                  int coins = 0;
                  System.out.print("\n\nGuess the operator: 11 _ 9 = 99 ");
                  String operator1 = kb.next();
                  if (operator1.equals("*")){
                     System.out.println("Perfect! You win 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
                  
                  System.out.print("\nGuess the operator: 8 _ 12 = 96 ");
                  String operator2 = kb.next();
                  if (operator2.equals("*")){
                     System.out.println("Perfect! You win 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
      
                  System.out.print("\nGuess the operator: 13 _ 6 = 78 ");
                  String operator3 = kb.next();
                  if (operator3.equals("*")){
                     System.out.println("Perfect! You win 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
         
                  System.out.print("\nGuess the operator: 67 _ 9 = 76 ");
                  String operator4 = kb.next();
                  if (operator4.equals("+")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }   
                  else { 
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
      
                  System.out.print("\nGuess the operator: 86 _ 54 = 32 ");
                  String operator5 = kb.next();
                  if (operator5.equals("-")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
      
                  System.out.print("\nGuess the operator: 69 _ 3 = 23 ");
                  String operator6 = kb.next();
                  if (operator6.equals("/")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
      
                  System.out.print("\nGuess the operator: 56 _ 8 = 7 ");
                  String operator7 = kb.next();
                  if (operator7.equals("/")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
      
                  System.out.print("\nGuess the operator: 14 _ 5 = 70 ");
                  String operator8 = kb.next();
                  if (operator8.equals("*")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
      
                  System.out.print("\nGuess the operator: 94 _ 32 = 62 ");
                  String operator9 = kb.next();
                  if (operator9.equals("-")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :( Try next question.");
                  }
      
                  System.out.print("\nGuess the operator: 8 _ 12 = 96 ");
                  String operator10 = kb.next();
                  if (operator10.equals("*")){
                     System.out.println("Perfect! You won 5 coins!");
                     coins += 5;
                  }
                  else {
                     System.out.println("Sorry that was wrong :(");
                  }
                  System.out.println("\n\nExcellent you have completed this round! YOU WON " + coins  + " COINS!");
               }  
            
               //in the grade 4 section, we used arrays for our word problems
               if(selection == 4){
                  int coins = 0;
                  String [] arrayNames = {"Tim", "John", "Hannah", "Jonas", "Jimmy", "Frank", "Jessie", "Nick", "Gina"};
                  System.out.println("\n");
                  for (int i = 0; i<arrayNames.length; i++){
                     System.out.print(arrayNames[i] + " ");
                  }
                  System.out.print("\n1. Using the list of names above, how many of the names start with the letter J? ");
                  int answer1 = kb.nextInt();
                  if (answer1 == 4){
                     System.out.println("Perfect! You won 10 coins!");
                     coins += 10;
                  }
                  else if(answer1!=4){
                     System.out.println("Sorry that was wrong :(");
                     System.out.print("Would you like a hint? (yes or no): ");
                     String hint1 = kb.next();
                  
                  
                     if(hint1.equals("yes")){
                        System.out.println("1. Hint: John, Jonas, Jimmy, and Jessie all start with the letter J");
                        System.out.print("Try again: ");
                        int tryAgain1 = kb.nextInt();
                        
                        if (tryAgain1 == 4){
                           System.out.print("Great! You won 5 coins!");
                           coins += 5;
                        }
                        else
                           System.out.println("Try next question.");
                     }
                     else
                        System.out.println("Try next question.");
                  }
                  else 
                     System.out.println("Try next question.");
      
      
                  int [] arraySum = {4, 2, 7, 10, 21, 13, 8};
                  System.out.println("\n");
                  for (int i = 0; i <arraySum.length; i++){
                     System.out.print(arraySum[i]+ " ");
                  }     
                  System.out.print("\n2. Using the list of numbers above, what is the sum of all the numbers? ");
                  int answer2 = kb.nextInt();
         
                  if (answer2 == 65){
                     System.out.println("Perfect! You won 10 coins!");
                     coins += 10;
                  }
                  else if(answer2 != 65){
                     System.out.println("Sorry that was wrong :(");
                     System.out.print("Would you like a hint? (yes or no): ");
                     String hint2 = kb.next();
                  
                     if(hint2.equals("yes")){
                        System.out.println("1. Hint: 4 + 2 + 7 + 10 + 21 + 13 + 8 = ? ");
                        System.out.print("Try again: ");
                        int tryAgain2 = kb.nextInt();
                        
                        if (tryAgain2 == 65){
                           System.out.print("Great! You won 5 coins!");
                           coins += 5;
                        }
                        else
                           System.out.println("Try next question.");
                     }
                     else
                        System.out.println("Try next question.");
                  }
                  else 
                     System.out.println("Try next question.");
                  
                  
                  int [] arraySubtract = {100, 41, 23, 32, 4};
                  System.out.println("\n");
                  for (int i = 0; i<arraySubtract.length; i++){
                     System.out.print(arraySubtract[i]+ " ");
                  }
                  System.out.print("\n3. Using the numbers listed above, what is leftover from the first number subtract the sum of the rest of the numbers? ");
                  int answer3 = kb.nextInt();
      
                  if (answer3 == 0){
                     System.out.println("Perfect! You won 10 coins!");
                     coins += 10;
                  }
                  else if(answer3 !=0){
                     System.out.println("Sorry that was wrong :(");
                     System.out.print("Would you like a hint? (yes or no): ");
                     String hint3 = kb.next();
                  
                  
                     if(hint3.equals("yes")){
                        System.out.println("3. Hint: 100 - (41 + 23 + 32 + 4) = ? ");
                        System.out.print("Try again: ");
                        int tryAgain3 = kb.nextInt();
                        
                        if (tryAgain3 == 0){
                           System.out.print("Great! You won 5 coins!");
                           coins += 5;
                        }
                     }
                  }
                  System.out.println("\n\nExcellent you have completed this round! YOU WON " + coins  + " COINS!"); 
               }
               System.out.print("\nDo you want to play again? (yes or no) ");
               String replay = kb.next();
                  
               if(replay.equals("no"))
                  break;
            }
            System.out.println("\nGOODBYE!");
      }
   }
   
