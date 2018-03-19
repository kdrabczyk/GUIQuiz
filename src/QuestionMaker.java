import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class QuestionMaker {
    ArrayList<Question> list1 = new ArrayList();
    Question quest0 = new Question();
    Question quest1 = new Question();
    Question quest2 = new Question();
    Question quest3 = new Question();
    Question quest4 = new Question();
    Question quest5 = new Question();
    Question quest6 = new Question();
    Question quest7 = new Question();
    Question quest8 = new Question();
    Question quest9 = new Question();
    Question quest10= new Question();
    int line= 0;

    public void makeQuestion() {
        try {
            Scanner s = new Scanner(new File("Questions.txt"));
            while (s.hasNextLine()) {
                skipLines(s, line);
                String lineFromTxt = s.nextLine();
                String[] new1 = lineFromTxt.split("/");
                if (line == 0) {
                    quest0.question = new1[0];
                    quest0.answer1 = new1[1];
                    quest0.answer2 = new1[2];
                    quest0.answer3 = new1[3];
                    quest0.answer4 = new1[4];
                    quest0.correct = new1[5];
                    line = line + 1;
                    break;
                } else if (line == 1) {
                    quest1.question = new1[0];
                    quest1.answer1 = new1[1];
                    quest1.answer2 = new1[2];
                    quest1.answer3 = new1[3];
                    quest1.answer4 = new1[4];
                    quest1.correct = new1[5];
                    line = line + 1;
                    break;

                } else if (line == 2) {
                    quest2.question = new1[0];
                    quest2.answer1 = new1[1];
                    quest2.answer2 = new1[2];
                    quest2.answer3 = new1[3];
                    quest2.answer4 = new1[4];
                    quest2.correct = new1[5];
                    line = line + 1;
                    break;

                } else if (line == 3) {
                    quest3.question = new1[0];
                    quest3.answer1 = new1[1];
                    quest3.answer2 = new1[2];
                    quest3.answer3 = new1[3];
                    quest3.answer4 = new1[4];
                    quest3.correct = new1[5];
                    line = line + 1;
                    break;
                } else if (line == 4) {
                    quest4.question = new1[0];
                    quest4.answer1 = new1[1];
                    quest4.answer2 = new1[2];
                    quest4.answer3 = new1[3];
                    quest4.answer4 = new1[4];
                    quest4.correct = new1[5];
                    line = line + 1;
                    break;
                } else if (line == 5) {
                    quest5.question = new1[0];
                    quest5.answer1 = new1[1];
                    quest5.answer2 = new1[2];
                    quest5.answer3 = new1[3];
                    quest5.answer4 = new1[4];
                    quest5.correct = new1[5];
                    line = line + 1;
                    break;
                } else if (line == 6) {
                    quest6.question = new1[0];
                    quest6.answer1 = new1[1];
                    quest6.answer2 = new1[2];
                    quest6.answer3 = new1[3];
                    quest6.answer4 = new1[4];
                    quest6.correct = new1[5];
                    line = line + 1;
                    break;
                } else if (line == 7) {
                    quest7.question = new1[0];
                    quest7.answer1 = new1[1];
                    quest7.answer2 = new1[2];
                    quest7.answer3 = new1[3];
                    quest7.answer4 = new1[4];
                    quest7.correct = new1[5];
                    line = line + 1;
                    break;
                }else if (line == 8) {
                    quest8.question = new1[0];
                    quest8.answer1 = new1[1];
                    quest8.answer2 = new1[2];
                    quest8.answer3 = new1[3];
                    quest8.answer4 = new1[4];
                    quest8.correct = new1[5];
                    line = line + 1;
                    break;
                } else if (line == 9) {
                    quest9.question = new1[0];
                    quest9.answer1 = new1[1];
                    quest9.answer2 = new1[2];
                    quest9.answer3 = new1[3];
                    quest9.answer4 = new1[4];
                    quest9.correct = new1[5];
                    line = line + 1;
                    break;
                } else if (line == 10) {
                quest10.question = new1[0];
                quest10.answer1 = new1[1];
                quest10.answer2 = new1[2];
                quest10.answer3 = new1[3];
                quest10.answer4 = new1[4];
                quest10.correct = new1[5];
                line = line + 1;
                break;
            }

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.print("something went wrong");
        }

        list1.add(quest0);
        list1.add(quest1);
        list1.add(quest2);
        list1.add(quest3);
        list1.add(quest4);
        list1.add(quest5);
        list1.add(quest6);
        list1.add(quest7);
        list1.add(quest8);
        list1.add(quest9);
        list1.add(quest10);
    }

    public static void skipLines(Scanner s, int lineNum) {
        for (int i = 0; i < lineNum; i++) {
            if (s.hasNextLine()) s.nextLine();
        }
    }
}