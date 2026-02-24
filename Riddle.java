public class Riddle
{
    // write 2 instance variables for Riddle's question and answer: private type
    // variableName;
    private String question;
    private String answer;

    // constructor
    public Riddle(String initQuestion, String initAnswer)
    {
        // set the instance variables to the init parameter variables
        question=initQuestion;
        answer=initAnswer;
    }

    // Print riddle question
    public void printQuestion()
    {
        // print out the riddle question with System.out.println
        System.out.println(question);
    }

    // Print riddle answer
    public void printAnswer()
    {
        // print out the riddle answer with System.out.println
        System.out.println(answer);
    }

    // main method for testing
    public static void main(String[] args)
    {
        // call the Riddle constructor to create 2 new Riddle objects
        // with the arguments for the riddle question and answer.
        Riddle r1 = new Riddle("Why did the chicken cross the playground?","To get to the other slide!");
        Riddle r2 = new Riddle("Why did the mackerel cross the fishground?","To swim at the other slide!");
        // call the riddle objects' printQuestion() and printAnswer methods
        r1.printQuestion();
        r1.printAnswer();
        r2.printQuestion();
        r2.printAnswer();
    }
}

