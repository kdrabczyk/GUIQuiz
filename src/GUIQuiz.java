import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;

public class GUIQuiz {

    int hit = 0;
    static int missed= 0;
    int tries= 0;
    int arrayNum= 0;

    public static void main (String []args){
        GUIQuiz quiz= new GUIQuiz();
        QuestionMaker questionMaker= new QuestionMaker();
        for(int l= 0; l<11; l++){
            questionMaker.makeQuestion();
        }

        System.out.println(questionMaker.quest10.question);

        JFrame frame = new JFrame("Quiz");
        JPanel panel = new JPanel(); // JPanel
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        JLabel label = new JLabel(questionMaker.list1.get(quiz.arrayNum).question); //JLabel
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton button1 = new JButton(); // button1
        button1.setText(questionMaker.list1.get(quiz.arrayNum).answer1);
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);



        JButton button2 = new JButton(); // button2
        button2.setText(questionMaker.list1.get(quiz.arrayNum).answer2);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);



        JButton button3 = new JButton();   // button 3
        button3.setText(questionMaker.list1.get(quiz.arrayNum).answer3);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);




        JButton button4 = new JButton();    // button 4
        button4.setText(questionMaker.list1.get(quiz.arrayNum).answer4);
        button4.setAlignmentX(Component.CENTER_ALIGNMENT);



        JLabel label2 = new JLabel("Your score is "+ quiz.hit); //Score
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(label); // adding to panel
        panel.add(button1,Component.CENTER_ALIGNMENT);
        panel.add(button2,Component.CENTER_ALIGNMENT);
        panel.add(button3,Component.CENTER_ALIGNMENT);
        panel.add(button4,Component.CENTER_ALIGNMENT);
        panel.add(label2, Component.CENTER_ALIGNMENT);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answer1= "a";
                if(answer1.equals(questionMaker.list1.get(quiz.arrayNum).correct)){
                    quiz.hit++;
                    quiz.tries++;
                    System.out.println("hits " +quiz.hit);
                    System.out.println("missed " +quiz.missed);
                    System.out.println("tries " + quiz.tries);
                    quiz.arrayNum++;
                }else{
                    quiz.missed++;
                    quiz.tries++;
                    System.out.println("hits " +quiz.hit);
                    System.out.println("missed " +quiz.missed);
                    System.out.println("tries " + quiz.tries);
                    quiz.arrayNum++;
                }
                if(quiz.tries> 10){
                    frame.dispose();
                }
                label.setText(questionMaker.list1.get(quiz.arrayNum).question);
                button1.setText(questionMaker.list1.get(quiz.arrayNum).answer1);
                button2.setText(questionMaker.list1.get(quiz.arrayNum).answer2);
                button3.setText(questionMaker.list1.get(quiz.arrayNum).answer3);
                button4.setText(questionMaker.list1.get(quiz.arrayNum).answer4);
                label2.setText("Your score is "+ quiz.hit+"/"+quiz.tries);
                frame.repaint();
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answer1= "b";
                if(answer1.equals(questionMaker.list1.get(quiz.arrayNum).correct)){
                    quiz.hit++;
                    quiz.tries++;
                    System.out.println("hits " +quiz.hit);
                    System.out.println("missed " +quiz.missed);
                    System.out.println("tries " + quiz.tries);
                    quiz.arrayNum++;
                }else{
                    missed++;
                    quiz.tries++;
                    System.out.println("hits " +quiz.hit);
                    System.out.println("missed " +quiz.missed);
                    System.out.println("tries " + quiz.tries);
                    quiz.arrayNum++;
                }
                if(quiz.tries> 10){
                    frame.dispose();
                }
                label.setText(questionMaker.list1.get(quiz.arrayNum).question);
                button1.setText(questionMaker.list1.get(quiz.arrayNum).answer1);
                button2.setText(questionMaker.list1.get(quiz.arrayNum).answer2);
                button3.setText(questionMaker.list1.get(quiz.arrayNum).answer3);
                button4.setText(questionMaker.list1.get(quiz.arrayNum).answer4);
                label2.setText("Your score is "+ quiz.hit+"/"+quiz.tries);
                frame.repaint();
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answer1= "c";
                if(answer1.equals(questionMaker.list1.get(quiz.arrayNum).correct)){
                    quiz.hit++;
                    quiz.tries++;
                    System.out.println("hits " +quiz.hit);
                    System.out.println("missed " +quiz.missed);
                    System.out.println("tries " + quiz.tries);
                    quiz.arrayNum++;
                }else{
                    missed++;
                    quiz.tries++;
                    System.out.println("hits " +quiz.hit);
                    System.out.println("missed " +quiz.missed);
                    System.out.println("tries " + quiz.tries);
                    quiz.arrayNum++;
                }
                if(quiz.tries> 10){
                    frame.dispose();
                }
                label.setText(questionMaker.list1.get(quiz.arrayNum).question);
                button1.setText(questionMaker.list1.get(quiz.arrayNum).answer1);
                button2.setText(questionMaker.list1.get(quiz.arrayNum).answer2);
                button3.setText(questionMaker.list1.get(quiz.arrayNum).answer3);
                button4.setText(questionMaker.list1.get(quiz.arrayNum).answer4);
                label2.setText("Your score is "+ quiz.hit+"/"+quiz.tries);
                frame.repaint();
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answer1= "d";
                if(answer1.equals(questionMaker.list1.get(quiz.arrayNum).correct)){
                    quiz.hit++;
                    quiz.tries++;
                    System.out.println("hits " +quiz.hit);
                    System.out.println("missed " +quiz.missed);
                    System.out.println("tries " + quiz.tries);
                    quiz.arrayNum++;
                }else{
                    missed++;
                    quiz.tries++;
                    System.out.println("hits " +quiz.hit);
                    System.out.println("missed " +quiz.missed);
                    System.out.println("tries " + quiz.tries);
                    quiz.arrayNum++;
                }
                if(quiz.tries> 10){
                    frame.dispose();
                }
                label.setText(questionMaker.list1.get(quiz.arrayNum).question);
                button1.setText(questionMaker.list1.get(quiz.arrayNum).answer1);
                button2.setText(questionMaker.list1.get(quiz.arrayNum).answer2);
                button3.setText(questionMaker.list1.get(quiz.arrayNum).answer3);
                button4.setText(questionMaker.list1.get(quiz.arrayNum).answer4);
                label2.setText("Your score is "+ quiz.hit+"/"+quiz.tries);
                frame.repaint();
            }
        });

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
        });


    }



}
