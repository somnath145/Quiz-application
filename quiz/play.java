import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class play extends JFrame implements ActionListener{

    JLabel question_number , question;
    String Questions[][] = new String[10][5];
    String Answers[][] = new String[10][2];
    String given_answer[][] = new String[10][1];
    JRadioButton op1 , op2 , op3 , op4 ;
    JButton submit , next , fifty;
    ButtonGroup bg;
    int timer=15;
    int qn=0;
    int total_score=0;
    int fifty_click =0;

    int answer_given=0;

    play(){

        setBounds(300, 80, 932, 700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i = new ImageIcon("D:\\Java\\quize\\icons\\quiz.jpg");
        JLabel image = new JLabel(i);
        image.setBounds(0, 0, 918, 250);
        add(image);

        question_number = new JLabel();
        question_number.setBounds(50, 260, 50, 60);
        question_number.setFont((new Font("Tahoma", Font.PLAIN, 20)));
        add(question_number);

        question = new JLabel();
        question.setBounds(75, 265, 782, 50);
        question.setFont((new Font("Tahoma", Font.PLAIN, 20)));
        add(question);

        op1 = new JRadioButton();
        op1.setBounds(100, 330, 400, 50);
        op1.setBackground(Color.LIGHT_GRAY);
        op1.setForeground(Color.BLACK);
        op1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(op1);

        op2 = new JRadioButton();
        op2.setBounds(100, 390, 400, 50);
        op2.setBackground(Color.LIGHT_GRAY);
        op2.setForeground(Color.BLACK);
        op2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(op2);

        op3 = new JRadioButton();
        op3.setBounds(100, 450, 400, 50);
        op3.setBackground(Color.LIGHT_GRAY);
        op3.setForeground(Color.BLACK);
        op3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(op3);

        op4 = new JRadioButton();
        op4.setBounds(100, 510, 400, 50);
        op4.setBackground(Color.LIGHT_GRAY);
        op4.setForeground(Color.BLACK);
        op4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(op4);

        bg = new ButtonGroup();
        bg.add(op1);
        bg.add(op2);
        bg.add(op3);
        bg.add(op4);

        fifty = new JButton("50-50");
        fifty.setBounds(650, 390, 150, 50);
        fifty.setForeground(Color.white);
        fifty.setBackground(Color.blue);
        fifty.setFont(new Font("Tahoma", Font.PLAIN, 20));
        fifty.addActionListener(this);
        add(fifty);

        next = new JButton("Next");
        next.setBounds(650, 450, 150, 50);
        next.setForeground(Color.white);
        next.setBackground(Color.blue);
        next.setFont(new Font("Tahoma", Font.PLAIN, 20));
        next.addActionListener(this);
        add(next);

        submit = new JButton("Submit");
        submit.setBounds(650, 510, 150, 50);
        submit.setForeground(Color.white);
        submit.setBackground(Color.blue);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

        Questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        Questions[0][1] = "JVM";
        Questions[0][2] = "JDB";
        Questions[0][3] = "JDK";
        Questions[0][4] = "JRE";

        Questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        Questions[1][1] = "int";
        Questions[1][2] = "Object";
        Questions[1][3] = "long";
        Questions[1][4] = "void";

        Questions[2][0] = "Which package contains the Random class?";
        Questions[2][1] = "java.util package";
        Questions[2][2] = "java.lang package";
        Questions[2][3] = "java.awt package";
        Questions[2][4] = "java.io package";

        Questions[3][0] = "An interface with no fields or methods is known as?";
        Questions[3][1] = "Runnable Interface";
        Questions[3][2] = "Abstract Interface";
        Questions[3][3] = "Marker Interface";
        Questions[3][4] = "CharSequence Interface";

        Questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        Questions[4][1] = "Stack";
        Questions[4][2] = "String memory";
        Questions[4][3] = "Random storage space";
        Questions[4][4] = "Heap memory";

        Questions[5][0] = "Which of the following is a marker interface?";
        Questions[5][1] = "Runnable interface";
        Questions[5][2] = "Remote interface";
        Questions[5][3] = "Readable interface";
        Questions[5][4] = "Result interface";

        Questions[6][0] = "Which keyword is used for accessing the features of a package?";
        Questions[6][1] = "import";
        Questions[6][2] = "package";
        Questions[6][3] = "extends";
        Questions[6][4] = "export";

        Questions[7][0] = "In java, jar stands for?";
        Questions[7][1] = "Java Archive Runner";
        Questions[7][2] = "Java Archive";
        Questions[7][3] = "Java Application Resource";
        Questions[7][4] = "Java Application Runner";

        Questions[8][0] = "Which of the following is a mutable class in java?";
        Questions[8][1] = "java.lang.StringBuilder";
        Questions[8][2] = "java.lang.Short";
        Questions[8][3] = "java.lang.Byte";
        Questions[8][4] = "java.lang.String";

        Questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        Questions[9][1] = "Bytecode is executed by JVM";
        Questions[9][2] = "The applet makes the Java code secure and portable";
        Questions[9][3] = "Use of exception handling";
        Questions[9][4] = "Dynamic binding between objects";	
        
        Answers[0][1] = "JDB";
        Answers[1][1] = "int";
        Answers[2][1] = "java.util package";
        Answers[3][1] = "Marker Interface";
        Answers[4][1] = "Heap memory";
        Answers[5][1] = "Remote interface";
        Answers[6][1] = "import";
        Answers[7][1] = "Java Archive";
        Answers[8][1] = "java.lang.StringBuilder";
        Answers[9][1] = "Bytecode is executed by JVM";
        
        start(qn);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==next){
            repaint();
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);

            
            if(bg.getSelection()==null){
                given_answer[qn][0]="";
            }
            else{
                given_answer[qn][0]=bg.getSelection().getActionCommand();
            }

            if(qn==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(fifty_click==3){fifty.setEnabled(false);}
           
            qn=qn+1;
            start(qn);
            timer=15; 
        }

        else if(e.getSource()== submit){
            
            if(bg.getSelection()==null){
                given_answer[qn][0]="";
            }
            else{
                given_answer[qn][0]=bg.getSelection().getActionCommand();
            }

            for(int i =0 ; i< given_answer.length;i++){
                if(given_answer[i][0].equals(Answers[i][1])){
                    total_score +=10;
                }
            }

            new score(total_score);
            setVisible(false);

        } 
        else{
            if(fifty_click<3){
                if(qn==0 || qn==5 || qn==7){
                    op1.setEnabled(false);
                    op3.setEnabled(false);
                }
                if(qn==1 || qn==2 || qn==9 || qn==8 || qn==6){
                    op2.setEnabled(false);
                    op4.setEnabled(false);
                }
                if(qn==3 || qn==4){
                    op1.setEnabled(false);
                    op2.setEnabled(false);
                }
                if(qn==4){
                    op1.setEnabled(false);
                    op2.setEnabled(false);
                }
            }
            fifty_click = fifty_click+1;
            
        }       
    }

    public void paint(Graphics g){
        super.paint(g);

        String t = "Timer : " + timer + " sec.";
        g.setFont(new Font("Tahoma", Font.BOLD, 20));
        g.setColor(Color.RED);

        if(timer>0){
            g.drawString(t, 650, 380);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }

        time_up();

    }

    public void time_up(){
        if(timer==0){
            if(bg.getSelection()==null){
                given_answer[qn][0]="";
            }
            else{
                given_answer[qn][0]=bg.getSelection().getActionCommand();
            }
           
            if(qn<9){
                if(qn==8){
                    next.setEnabled(false);
                    submit.setEnabled(true);
                }
                if(fifty_click==3){fifty.setEnabled(false);}
                op1.setEnabled(true);
                op2.setEnabled(true);
                op3.setEnabled(true);
                op4.setEnabled(true);
                qn=qn+1;
                start(qn);
                timer=15;
            }
            if(qn==9){
                if(bg.getSelection()==null){
                    given_answer[qn][0]="";
                }
                else{
                    given_answer[qn][0]=bg.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i< given_answer.length;i++){
                    if(given_answer[i][0].equals(Answers[i][1])){
                        total_score +=10;
                    }
                }
    
                new score(total_score);
                setVisible(false);
            }
        }
    }

    public void start(int count){
        question_number.setText(""+(count+1)+".");
        question.setText(Questions[count][0]);

        op1.setText(Questions[count][1]);
        op1.setActionCommand(Questions[count][1]);

        op2.setText(Questions[count][2]);
        op2.setActionCommand(Questions[count][2]);

        op3.setText(Questions[count][3]);
        op3.setActionCommand(Questions[count][3]);

        op4.setText(Questions[count][4]);
        op4.setActionCommand(Questions[count][4]);

        bg.clearSelection();
    }
    public static void main(String[] args) {
        new play();
    }
}
