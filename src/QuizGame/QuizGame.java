package QuizGame;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question question1 = new Question("Gold is the symbol for which chemical element?", new String[]{"A)Ag ", "B)Au " , "C)Fe " , "D)Pb "} ,
                "B)" , 2);
        Question question2 = new Question("What is the name given to the fourth group of elements?" ,
                new String[]{"A)Metal ", "B)Nitrogen " , "C)Carbon " , "D)Oxygen "} , "C)", 1);
        Question question3 = new Question(" The formula CO2 corresponds to which chemical compound? " ,
                new String[]{"A)Carbon dioxide ", "B)Carbon monoxide " , "C)Hydrogen dioxide " , "D)Nitrogen monoxide "} , "A)" , 3);
        Question []questions = {question1,question2,question3};

        int totalPoint = 0;
        for (Question question : questions){
            System.out.println("Question: " + question.getquestionText());
            for (String option : question.getOptions()){
                System.out.println(option);
            }
            System.out.println("Enter your answer: ");
            String result = sc.nextLine();
            if (result.equals(question.getcorrectAnswer())){
                System.out.println("Correct.");
                totalPoint+= question.getPoint();
            } else {
                System.out.println("Wrong.Correct answer: " + question.getcorrectAnswer());
            }
        }
        System.out.println("Total score:" +totalPoint);
    }
}