package project;
import java.util.*;
class Q1{
	Scanner se=new Scanner(System.in);
	int score=0;
	int life_line=2;
	int audience_poll=1;
	int fifty_fifty=1;	
	String a="Maharastra";
	String b="India";
	String c="Delhi";
	String d="Andra pradesh";
	String e="Lifeline";
	String f="quit";
	public void Que1() {
	
		
		//int score=0;
		System.out.println("1.what is captil city of India.?");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("Enter your answer(a/b/c/d/e/f): ");
		char k=se.next().charAt(0);
		//if(k=='f') {
			//   System.out.println("you lost the quiz");
			  // System.exit(0);
			  
		   //}
			
	   if(k=='c')
	   {
		   System.out.println("correct Answer! Delhi is the captil of India.");
		System.out.println("-------You got one point--------");
		System.out.println("you earned 500 RS as reward"); 
		score++;
		     
		}
	   else if(k=='e') {
		   //if(life_line>0) {
			System.out.println("3)50/50");
			System.out.println("2)audiecnce_poll");
			System.out.println("<>choose the option<>");
			int op=se.nextInt();
			//fifty
 			if (op==3) {
 				//if(fifty_fifty>0) {
				life_line--;
				fifty_fifty--;
				System.out.println("a:"+a);
				System.out.println("c:"+c);
				System.out.println("<>choose the coorect option<>");
				char c1=se.next().charAt(0);
				if (c1=='c')
				{
					System.out.println("Correct Answer! Delhi is the captil of India. ");
					System.out.println("-----You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++; 
				}
			
					
		
				else {
					System.out.println("Wrong Answer! the correct answer is 'c: Delhi'.");
					System.exit(0);
			}
 			}

 			
		    System.out.println("-----fifty_fifty is exausted-----");
			if(op==2) {
				//if(audience_poll>0)
				audience_poll--;
				life_line--;
				System.out.println("a:18% \nb:12%\nc:60%\nd:10%\n");
				System.out.println("-------choose the correct option-------");
				char a1=se.next().charAt(0);
				if(a1=='c') 
				{
					System.out.println("Correct Answer! Delhi is the captil of India.");
					System.out.println("---You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++;
				}
				else
				{
					System.out.println("Wrong Answer! the correct answer is 'c: Delhi'.");
					System.exit(0);
					
				}
				
				System.out.println("----audience_poll is exausted-----");
				System.out.println("Your score is:"+score);
			
			
			}
 			}
	   
	   else
		{
			System.out.println("Wrong Answer! the correct answer is 'c: Delhi'.");
			System.exit(0);
			
		}
	      
			
		}
}
class Q2 extends Q1{
	String a="Java";
	String b="python";
	String c="c++";
	String d="Ruby";
	String e="Lifeline";
	String f="Quit";
	//Scanner se=new Scanner(System.in);
		
	public void Que2() {
		
		System.out.println(" 2.Which programming language is used to create Android apps?");
	
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("Enter your answer(a/b/c/d/e/f): ");
		char k=se.next().charAt(0);
		if(k=='f') {
			   System.out.println("you lost the quiz");
			   System.exit(0);
			  
		   }
			
		if(k=='a') {
       
			System.out.println("Correct Answer! java used to create Andriod apps");
			System.out.println("------You got one point------");
			System.out.println("you earned 500 RS as reward"); 
			score++; 
		}
		else if(k=='e') {
			//if(life_line>0) {
				System.out.println("3)50/50");
				System.out.println("2)audiecnce_poll");
				System.out.println("<>choose the option<>");
				int op=se.nextInt();
				//fifty
      			if (op==3) {
      				//if(fifty_fifty>0) {
					life_line--;
					fifty_fifty--;
					System.out.println("a:"+a);
					System.out.println("b:"+b);
					System.out.println("<>choose the coorect option<>");
					char c=se.next().charAt(0);
					if (c=='a')
					{
						System.out.println("Correct Answer! java used to create Andriod apps");
						System.out.println("-----You got one point----");
						System.out.println("you earned 500 RS as reward"); 
						score++; 
					}
				
						
			
					else {
						System.out.println("Wrong Answer! the correct answer is 'a: java'.");
				}
      			
					System.out.println("fifty_fifty is exausted");
				
      			//}
      			//}
				if(op==2) {
					//if(audience_poll>0) {

					audience_poll--;
					life_line--;
					System.out.println("a:70% \nb:10%\nc:15%\nd:5%\n");
					System.out.println("-------choose the corect option-------");
					char a1=se.next().charAt(0);
					if(a1=='a') 
					{
						System.out.println("Correct Answer! java used to create Andriod apps");
						System.out.println("---You got one point----");
						System.out.println("you earned 500 RS as reward"); 
						score++;
					}
					else
					{
						System.out.println("Wrong Answer! the correct answer is 'a: java'.");
						System.exit(0);
						
					}
					
					System.out.println("----audience_poll is exausted-----");
					System.out.println("Your score is:"+score);
				}
				//}
				
				
				}
		}
		else
		{
			System.out.println("Wrong Answer! the correct answer is 'a: java'.");
			System.exit(0);
			
		}
			
	}	
	}

class Q3 extends Q1 {
	String a="Ag";
	String b="Au";
	String c="Fe";
	String d="Ruby";
	String e="Lifeline";
	String f="Quit";
	public void Que3() {
		Scanner se=new Scanner(System.in);
		
		//int score=0;
		System.out.println("3.What is the chemical symbol for gold?");
	
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("Enter your answer(a/b/c/d/e/f): ");
		char k=se.next().charAt(0);
		if(k=='f') {
			   System.out.println("you lost the quiz");
			   System.exit(0);
			  
		   }
			
		if(k=='b')
		{
			
			System.out.println("Correct Answer! Au is the Symbol for gold");
			System.out.println("------You got one point---------");
			System.out.println("you earned 500 RS as reward"); 
		     score++;
		}
		else if(k=='e') {
			System.out.println("3)50/50");
			System.out.println("2)audiecnce_poll");
			System.out.println("<>choose the option<>");
			int op=se.nextInt();
			//fifty
  			if (op==3) {
				life_line--;
				fifty_fifty--;
				System.out.println("a:"+a);
				System.out.println("b:"+b);
				System.out.println("<>choose the correct option<>");
				char c=se.next().charAt(0);
				if (c=='b')
				{
					System.out.println("Correct Answer! Au is the Symbol for gold");
					System.out.println("-----You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++; 
				}
			
					
		
				else {
					System.out.println("Wrong Answer! the correct answer is 'b: Au'.");
			}
  			
				System.out.println("________fifty_fifty is exausted________");
			
  			}
			if(op==2) {
				audience_poll--;
				life_line--;
				System.out.println("a:20% \nb:50%\nc:19%\nd:11%\n");
				System.out.println("-------choose the corect option-------");
				char a1=se.next().charAt(0);
				if(a1=='b') 
				{
					System.out.println("Correct Answer! Au is the Symbol for gold");
					System.out.println("---You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++;
				}
				else
				{
					System.out.println("Wrong Answer! the correct answer is 'b: Au'.");
					System.exit(0);
					
				}
				
				System.out.println("----audience_poll is exausted-----");
				System.out.println("Your score is:"+score);
			}
			
			
			}
		else
		{
			System.out.println("Wrong Answer! the correct answer is 'b: Au'.");
			System.exit(0);
			
		}
			
	}
}
class Q4 extends Q1 {
	String a="Gt";
	String b="Rcb";
	String c="Mumbai";
	String d="Csk";
	String e="Lifeline";
	String f="Quit";
	public void Que4() {
		Scanner se=new Scanner(System.in);
		
		//int score=0;
		System.out.println("4.Which team won the ipl trophy in 2023?");
	
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("Enter your answer(a/b/c/d/e/f): ");
		char k=se.next().charAt(0);
		if(k=='f') {
			   System.out.println("you lost the quiz");
			   System.exit(0);
			  
		   }
			
		if(k=='d')
		{
			
			System.out.println("Correct Answer! Csk is the team won the Ipl trophy in 2023");
			System.out.println("------You got one point---------");
			System.out.println("you earned 500 RS as reward"); 
		     score++;
		}
		else if(k=='e') {
			System.out.println("3)50/50");
			System.out.println("2)audiecnce_poll");
			System.out.println("<>choose the option<>");
			int op=se.nextInt();
			//fifty
  			if (op==3) {
				life_line--;
				fifty_fifty--;
				System.out.println("a:"+a);
				System.out.println("d:"+d);
				System.out.println("<>choose the correct option<>");
				char c=se.next().charAt(0);
				if (c=='d')
				{
					System.out.println("Correct Answer! Csk is the team won the Ipl trophy in 2023");
					System.out.println("-----You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++; 
				}
			
					
		
				else {
					System.out.println("Wrong Answer! the correct answer is 'd: Csk'.");
					System.exit(0);
			}
  			
				System.out.println("________fifty_fifty is exausted________");
			
  			}
			if(op==2) {
				audience_poll--;
				life_line--;
				System.out.println("a:5% \nb:33.5%\nc:23.5%\nd:40%\n");
				System.out.println("-------choose the correct option-------");
				char a1=se.next().charAt(0);
				if(a1=='d') 
				{
					System.out.println("Correct Answer! Csk is the team won the Ipl trophy in 2023");
					System.out.println("---You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++;
				}
				else
				{
					System.out.println("Wrong Answer! the correct answer is 'd: Csk'.");
					System.exit(0);
					
				}
				
				System.out.println("----audience_poll is exausted-----");
				System.out.println("Your score is:"+score);
			}
			
			
			}	
		else
		{
			System.out.println("Wrong Answer! the correct answer is 'd: Csk'.");
			System.exit(0);
			
		}
			
		}
}
class Q5 extends Q1 {
	String a="William Word";
	String b="Willian Shakesphere";
	String c="Mark";
	String d="Charles";
	String e="Lifeline";
	String f="Quit";
	public void Que5() {
		Scanner se=new Scanner(System.in);
		
		//int score=0;
		System.out.println("5.who wrote the play 'Romeo and Juliet?'");
	
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("Enter your answer(a/b/c/d/e/f): ");
		char k=se.next().charAt(0);
		if(k=='f') {
			   System.out.println("you lost the quiz");
			   System.exit(0);
			  
		   }
			
		if(k=='b')
		{
			
			System.out.println("Correct Answer! Willian Shakesphere wrote the poem'Remeo and juliet'");
			System.out.println("------You got one point---------");
			System.out.println("you earned 500 RS as reward"); 
		     score++;
		}
		else if(k=='e') {
			System.out.println("3)50/50");
			System.out.println("2)audiecnce_poll");
			System.out.println("<>choose the option<>");
			int op=se.nextInt();
			//fifty
  			if (op==3) {
				life_line--;
				fifty_fifty--;
				System.out.println("a:"+a);
				System.out.println("b:"+b);
				System.out.println("<>choose the correct option<>");
				char c=se.next().charAt(0);
				if (c=='b')
				{
					System.out.println("Correct Answer!Willian Shakesphere wrote the poem'Remeo and juliet'");
					System.out.println("-----You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++; 
				}
			
					
		
				else {
					System.out.println("Wrong Answer! the correct answer is 'b: William Shakespere'.");
					System.exit(0);
			}
  			
				System.out.println("________fifty_fifty is exausted________");
			
  			}
			if(op==2) {
				audience_poll--;
				life_line--;
				System.out.println("a:15% \nb:45.5%\nc:35.5%\nd:24%\n");
				System.out.println("-------choose the corect option-------");
				char a1=se.next().charAt(0);
				if(a1=='b') 
				{
					System.out.println("Correct Answer! Willian Shakesphere wrote the poem'Remeo and juliet'");
					System.out.println("---You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++;
				}
				else
				{
					System.out.println("Wrong Answer! the correct answer is 'b: William Shakesphere'.");
					System.exit(0);
					
				}
				
				System.out.println("----audience_poll is exausted-----");
				System.out.println("Your score is:"+score);
			}
			
			
			}	
		else
		{
			System.out.println("Wrong Answer! the correct answer is 'b: William ShakeSphere'.");
			System.exit(0);
			
		}
			
		}
}
class Q6 extends Q1 {
	String a="Venus";
	String b="Earth";
	String c="Mars";
	String d="Saturn";
	String e="Lifeline";
	String f="Quit";
	public void Que6() {
		Scanner se=new Scanner(System.in);
		
		//int score=0;
		System.out.println("6.What is the only planet that rotates clockwise?");
	
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("Enter your answer(a/b/c/d/e/f): ");
		char k=se.next().charAt(0);
		if(k=='f') {
			   System.out.println("you lost the quiz");
			   System.exit(0);
			  
		   }
			
		if(k=='a')
		{
			
			System.out.println("Correct Answer! Venus is the only planet that rotates clockwise");
			System.out.println("------You got one point---------");
			System.out.println("you earned 500 RS as reward"); 
		     score++;
		}
		else if(k=='e') {
			System.out.println("3)50/50");
			System.out.println("2)audiecnce_poll");
			System.out.println("<>choose the option<>");
			int op=se.nextInt();
			//fifty
  			if (op==3) {
				life_line--;
				fifty_fifty--;
				System.out.println("a:"+a);
				System.out.println("b:"+b);
				System.out.println("<>choose the correct option<>");
				char c=se.next().charAt(0);
				if (c=='a')
				{
					System.out.println("Correct Answer! Venus is the only planet that rotates clockwise");
					System.out.println("-----You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++; 
				}
			
					
		
				else {
					System.out.println("Wrong Answer! the correct answer is 'a: Venus'.");
					System.exit(0);
			}
  			
				System.out.println("________fifty_fifty is exausted________");
			
  			}
			if(op==2) {
				audience_poll--;
				life_line--;
				System.out.println("a:45% \nb:25.5%\nc:25.5%\nd:4%\n");
				System.out.println("-------choose the corect option-------");
				char a1=se.next().charAt(0);
				if(a1=='a') 
				{
					System.out.println("Correct Answer! Venus is the only planet that rotates clockwise");
					System.out.println("---You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++;
				}
				else
				{
					System.out.println("Wrong Answer! the correct answer is 'a: Venus'.");
					System.exit(0);
					
				}
				
				System.out.println("----audience_poll is exausted-----");
				System.out.println("Your score is:"+score);
			}
			
			
			}	
		else
		{
			System.out.println("Wrong Answer! the correct answer is 'a: Venus'.");
			System.exit(0);
			
		}
			
		}
}
class Q7 extends Q1 {
	String a="O-negative";
	String b="AB-negative";
	String c="A-positive";
	String d="B-negative";
	String e="Lifeline";
	String f="Quit";
	public void Que7() {
		Scanner se=new Scanner(System.in);
		
		//int score=0;
		System.out.println("7.What is the rarest blood type in the world?");
	
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("Enter your answer(a/b/c/d/e/f): ");
		char k=se.next().charAt(0);
		if(k=='f') {
			   System.out.println("you lost the quiz");
			   System.exit(0);
			  
		   }
			
		if(k=='b')
		{
			
			System.out.println("Correct Answer! AB-negative is rare blood group in World");
			System.out.println("------You got one point---------");
			System.out.println("you earned 500 RS as reward"); 
		     score++;
		}
		else if(k=='e') {
			System.out.println("3)50/50");
			System.out.println("2)audiecnce_poll");
			System.out.println("<>choose the option<>");
			int op=se.nextInt();
			//fifty
  			if (op==3) {
				life_line--;
				fifty_fifty--;
				System.out.println("c:"+c);
				System.out.println("b:"+b);
				System.out.println("<>choose the correct option<>");
				char c=se.next().charAt(0);
				if (c=='b')
				{
					System.out.println("Correct Answer! AB-negative is rare blood group in World");
					System.out.println("-----You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++; 
				}
			
					
		
				else {
					System.out.println("Wrong Answer! the correct answer is 'b: Ab-negative'.");
					System.exit(0);
			}
  			
				System.out.println("________fifty_fifty is exausted________");
			
  			}
			if(op==2) {
				audience_poll--;
				life_line--;
				System.out.println("a:23% \nb:65.5%\nc:23.5%\nd:4%\n");
				System.out.println("-------choose the corect option-------");
				char a1=se.next().charAt(0);
				if(a1=='b') 
				{
					System.out.println("Correct Answer! AB-negative is rare blood group in World");
					System.out.println("---You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++;
				}
				else
				{
					System.out.println("Wrong Answer! the correct answer is 'b: AB-negative'.");
					System.exit(0);
					
				}
				
				System.out.println("----audience_poll is exausted-----");
				System.out.println("Your score is:"+score);
			}
			
			
			}	
		else
		{
			System.out.println("Wrong Answer! the correct answer is 'b: AB-negative'.");
			System.exit(0);
			
		}
			
		}
}
class Q8 extends Q1 {
	String a="Elephant";
	String b="Whale";
	String c="Tortoise";
	String d=" Greenland Shark";
	String e="Lifeline";
	String f="Quit";
	public void Que8() {
		Scanner se=new Scanner(System.in);
		
		//int score=0;
		System.out.println("8.Which animal is known to have the longest lifespan?");
	
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("Enter your answer(a/b/c/d/e/f): ");
		char k=se.next().charAt(0);
		if(k=='f') {
			   System.out.println("you lost the quiz");
			   System.exit(0);
			  
		   }
			
		if(k=='d')
		{
			
			System.out.println("Correct Answer! Greenland Shark has the longest lifespan");
			System.out.println("------You got one point---------");
			System.out.println("you earned 500 RS as reward"); 
		     score++;
		}
		else if(k=='e') {
			System.out.println("3)50/50");
			System.out.println("2)audiecnce_poll");
			System.out.println("<>choose the option<>");
			int op=se.nextInt();
			//fifty
  			if (op==3) {
				life_line--;
				fifty_fifty--;
				System.out.println("a:"+a);
				System.out.println("d:"+d);
				System.out.println("<>choose the correct option<>");
				char c=se.next().charAt(0);
				if (c=='d')
				{
					System.out.println("Correct Answer! Greenland Shark has the longest lifespan");
					System.out.println("-----You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++; 
				}
			
					
		
				else {
					System.out.println("Wrong Answer! the correct answer is 'd: Greenland Shark'.");
					System.exit(0);
			}
  			
				System.out.println("________fifty_fifty is exausted________");
			
  			}
			if(op==2) {
				audience_poll--;
				life_line--;
				System.out.println("a:28% \nb:5.5%\nc:23.5%\nd:45%\n");
				System.out.println("-------choose the corect option-------");
				char a1=se.next().charAt(0);
				if(a1=='d') 
				{
					System.out.println("Correct Answer! Greenland Shark has the longest lifespan");
					System.out.println("---You got one point----");
					System.out.println("you earned 500 RS as reward"); 
					score++;
				}
				else
				{
					System.out.println("Wrong Answer! the correct answer is 'd: Greenland Shark'.");
					System.exit(0);
					
				}
				
				System.out.println("----audience_poll is exausted-----");
				System.out.println("Your score is:"+score);
			}
			
			
			}	
		else
		{
			System.out.println("Wrong Answer! the correct answer is 'd: Greenland Shark'.");
			System.exit(0);
			
		}
			
		}
}

public class Quiz1 {

	public static void main(String[] args)  {
		//int score=0;
		Scanner se=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String s=se.nextLine();
		System.out.println("Enter Your age: ");
	    int s1=se.nextInt();
		System.out.println("Enter Male/Female: ");
		se.nextLine();
		String s3=se.nextLine();
		System.out.println("Enter email: ");
		String s4=se.nextLine();
		System.out.println("Enter your password: ");
		String s5=se.nextLine();
		
		System.out.println("are you ready to take up the quiz game --\nYes-true\nNo-false");
		boolean b=se.nextBoolean();
		if(b) {
			System.out.println("----------You are ready to start the quiz-----------");
		}
		else {
			System.out.println("-------------you cannot proceed further------------");
			System.exit(0);
		}
		System.out.println("Welcome to the Quiz App!");
        System.out.println("--------------------------------------------------");
        System.out.println("Quiz Details:");
        System.out.println("1. This is a general knowledge quiz.");
        System.out.println("2. There are 8 questions in total.");
        System.out.println("3. Each correct answer will earn you 1 point.");
        System.out.println("3. Each correct answer will earn you 500 RS as reward"); 
        System.out.println("4. You will have 30 seconds to answer each question.");
        System.out.println("5. At the end of the quiz, your total score will be displayed.");
        System.out.println("--------------------------------------------------");
        System.out.println("Good luck, and let's get started!\n");

		
		Q1 e1=new Q1();
		e1.Que1();
		Q2 e2=new Q2();
		e2.Que2();
		Q3 e3=new Q3();
		e3.Que3();
		Q4 e4=new Q4();
		e4.Que4();	
		Q5 e5=new Q5();
		e5.Que5();	
		Q6 e6=new Q6();
		e6.Que6();
		Q7 e7=new Q7();
		e7.Que7();	
		Q8 e8=new Q8();
		e8.Que8();	
	}

}
