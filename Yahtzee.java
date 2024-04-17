import java.awt.*;
import javax.swing.*;

public class Yahtzee {
    static int rolls = 0;
    private JFrame frame = new JFrame("Yahtzee");
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();    
    JButton button4 = new JButton();    
    JButton button5 = new JButton();
    JButton rollDice = new JButton(   "Roll dice!"   );
    JButton getOne = new JButton(   "One:"   );
    JButton setOne = new JButton();   
    JButton getThreeofKind = new JButton(   "Three of a kind:"   );
    JButton setThreeofKind = new JButton();
    JButton getTwo = new JButton(   "Two:"   );
    JButton setTwo = new JButton();
    JButton getFourofKind = new JButton(   "Four of a kind:"   );
    JButton setFourofKind = new JButton(); 
    JButton getThree = new JButton(   "Three:"   );
    JButton setThree = new JButton(); 
    JButton getFullHouse = new JButton(   "Full House:"   );
    JButton setFullHouse = new JButton(); 
    JButton getFour = new JButton(   "Four:"   );
    JButton setFour = new JButton(); 
    JButton getStraight = new JButton(   "Straight:"   );
    JButton setStraight = new JButton(); 
    JButton getFive = new JButton(   "Five:"   );
    JButton setFive = new JButton(); 
    JButton getFullStraight = new JButton(   "Full Straight:"   );
    JButton setFullStraight = new JButton(); 
    JButton getSix = new JButton(   "Six:"   );
    JButton setSix = new JButton(); 
    JButton getYahtzee = new JButton(   "Yahtzee:"   );
    JButton setYahtzee = new JButton();
    JButton getTotal = new JButton(   "Total:"   );
    JButton setTotal = new JButton(); 
    JButton getChance = new JButton(   "Chance:"   );
    JButton setChance = new JButton(); 
    JButton newGame = new JButton(   "New Game"   );

    public Yahtzee(){
        /*Create Window*/
        frame.setSize(400,350);

        Font numbers = new Font("Arial", Font.BOLD, 20);
        Font total = new Font("Arial",Font.PLAIN, 9);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        /*make button 1*/
        frame.add(button1);
        button1.setPreferredSize(new Dimension(50, 50));
        button1.setBackground(Color.white);
        button1.setFont(numbers); 

        /*make button 2*/
        frame.add(button2);
        button2.setPreferredSize(new Dimension(50, 50));
        button2.setBackground(Color.white);   
        button2.setFont(numbers);         

        /*make button 3*/
        frame.add(button3);
        button3.setPreferredSize(new Dimension(50, 50));
        button3.setBackground(Color.white);
        button3.setFont(numbers);         

        /*make button 4*/
        frame.add(button4);
        button4.setPreferredSize(new Dimension(50, 50));
        button4.setBackground(Color.white); 
        button4.setFont(numbers);         

        /*make button 5*/
        frame.add(button5);
        button5.setPreferredSize(new Dimension(50, 50));
        button5.setBackground(Color.white); 
        button5.setFont(numbers);         

        /*make button rollDice*/        
        frame.add(rollDice);
        rollDice.setPreferredSize(new Dimension(345, 30));
        rollDice.setBackground(Color.white);

        /*make button One*/ 
        frame.add(getOne);
        getOne.setPreferredSize(new Dimension(80, 20));
        getOne.setBackground(Color.white); 

        frame.add(setOne);
        setOne.setPreferredSize(new Dimension(50, 20));
        setOne.setBackground(Color.white);
        setOne.setEnabled(false);

        /*make button 3 of a kind*/ 
        frame.add(getThreeofKind);
        getThreeofKind.setPreferredSize(new Dimension(150, 20));
        getThreeofKind.setBackground(Color.white); 

        frame.add(setThreeofKind);
        setThreeofKind.setPreferredSize(new Dimension(50, 20));
        setThreeofKind.setBackground(Color.white);
        setThreeofKind.setEnabled(false);

        /*make button Two*/ 
        frame.add(getTwo);
        getTwo.setPreferredSize(new Dimension(80, 20));
        getTwo.setBackground(Color.white);

        frame.add(setTwo);
        setTwo.setPreferredSize(new Dimension(50, 20));
        setTwo.setBackground(Color.white);
        setTwo.setEnabled(false);

        /*make button 4 of a kind*/ 
        frame.add(getFourofKind);
        getFourofKind.setPreferredSize(new Dimension(150, 20));
        getFourofKind.setBackground(Color.white); 

        frame.add(setFourofKind);
        setFourofKind.setPreferredSize(new Dimension(50, 20));
        setFourofKind.setBackground(Color.white);
        setFourofKind.setEnabled(false);

        /*make button Three*/ 
        frame.add(getThree);
        getThree.setPreferredSize(new Dimension(80, 20));
        getThree.setBackground(Color.white);

        frame.add(setThree);
        setThree.setPreferredSize(new Dimension(50, 20));
        setThree.setBackground(Color.white);
        setThree.setEnabled(false);

        /*make button full house*/ 
        frame.add(getFullHouse);
        getFullHouse.setPreferredSize(new Dimension(150, 20));
        getFullHouse.setBackground(Color.white);

        frame.add(setFullHouse);
        setFullHouse.setPreferredSize(new Dimension(50, 20));
        setFullHouse.setBackground(Color.white);
        setFullHouse.setEnabled(false);

        /*make button four*/ 
        frame.add(getFour);
        getFour.setPreferredSize(new Dimension(80, 20));
        getFour.setBackground(Color.white);

        frame.add(setFour);
        setFour.setPreferredSize(new Dimension(50, 20));
        setFour.setBackground(Color.white);
        setFour.setEnabled(false);

        /*make button Straight*/ 
        frame.add(getStraight);
        getStraight.setPreferredSize(new Dimension(150, 20));
        getStraight.setBackground(Color.white);

        frame.add(setStraight);
        setStraight.setPreferredSize(new Dimension(50, 20));
        setStraight.setBackground(Color.white);
        setStraight.setEnabled(false);

        /*make button five*/ 
        frame.add(getFive);
        getFive.setPreferredSize(new Dimension(80, 20));
        getFive.setBackground(Color.white);

        frame.add(setFive);
        setFive.setPreferredSize(new Dimension(50, 20));
        setFive.setBackground(Color.white);
        setFive.setEnabled(false);

        /*make button Straight*/ 
        frame.add(getFullStraight);
        getFullStraight.setPreferredSize(new Dimension(150, 20));
        getFullStraight.setBackground(Color.white);

        frame.add(setFullStraight);
        setFullStraight.setPreferredSize(new Dimension(50, 20));
        setFullStraight.setBackground(Color.white);
        setFullStraight.setEnabled(false);

        /*make button six*/ 
        frame.add(getSix);
        getSix.setPreferredSize(new Dimension(80, 20));
        getSix.setBackground(Color.white);

        frame.add(setSix);
        setSix.setPreferredSize(new Dimension(50, 20));
        setSix.setBackground(Color.white);
        setSix.setEnabled(false);

        /*make button Straight*/ 

        frame.add(getYahtzee);
        getYahtzee.setPreferredSize(new Dimension(150, 20));
        getYahtzee.setBackground(Color.white);
        frame.add(setYahtzee);
        setYahtzee.setPreferredSize(new Dimension(50, 20));
        setYahtzee.setBackground(Color.white);
        setYahtzee.setEnabled(false);

        /*make button Total*/        
        frame.add(getTotal);
        getTotal.setPreferredSize(new Dimension(80, 20));
        getTotal.setBackground(Color.white);          

        frame.add(setTotal);
        setTotal.setPreferredSize(new Dimension(50, 20));
        setTotal.setBackground(Color.white);
        setTotal.setFont(total); 
        setTotal.setEnabled(false);            

        /*make button chance*/ 
        frame.add(getChance);
        getChance.setPreferredSize(new Dimension(150, 20));
        getChance.setBackground(Color.white); 

        frame.add(setChance);
        setChance.setPreferredSize(new Dimension(50, 20));
        setChance.setBackground(Color.white);
        setChance.setEnabled(false);        

        /*make button newgame*/
        frame.add(newGame);
        newGame.setPreferredSize(new Dimension(345, 30));
        newGame.setBackground(Color.white);


        /*Add The Action Listener To The Buttons*/
        button1.addActionListener(
                e -> {
                    if (button1.getBackground() != Color.GRAY && !button1.getText().isEmpty()){
                        button1.setBackground(Color.GRAY);
                    } else {
                        button1.setBackground(Color.white);
                    }
                }
        );

        button2.addActionListener(
                e -> {
                    if (button2.getBackground() != Color.GRAY && !button2.getText().isEmpty()){
                        button2.setBackground(Color.gray);
                    } else {
                        button2.setBackground(Color.white);
                    }
                }
        );

        button3.addActionListener(
                e -> {
                    if (button3.getBackground() != Color.GRAY && !button3.getText().isEmpty()){
                        button3.setBackground(Color.gray);
                    } else {
                        button3.setBackground(Color.white);
                    }
                }
        );

        button4.addActionListener(
                e -> {
                    if (button4.getBackground() != Color.GRAY && !button4.getText().isEmpty()){
                        button4.setBackground(Color.gray);
                    } else {
                        button4.setBackground(Color.white);
                    }
                }
        );

        button5.addActionListener(
                e -> {
                    if (button5.getBackground() != Color.GRAY && !button5.getText().isEmpty()){
                        button5.setBackground(Color.gray);
                    } else {
                        button5.setBackground(Color.white);
                    }
                }
        );

        rollDice.addActionListener(
                e -> {
                    if (rolls < 3){
                        if (button1.getBackground() != Color.GRAY){
                            button1.setText(getDice());
                        }
                        if (button2.getBackground() != Color.GRAY){
                            button2.setText(getDice());
                        }
                        if (button3.getBackground() != Color.GRAY){
                            button3.setText(getDice());
                        }
                        if (button4.getBackground() != Color.GRAY){
                            button4.setText(getDice());
                        }
                        if (button5.getBackground() != Color.GRAY){
                            button5.setText(getDice());
                        }
                        rolls++;
                    }
                }
        );
        getOne.addActionListener(
                e -> {
                    setOne.setText(getPointsNumbers(1));
                    getOne.setEnabled(false);
                    clearDice();
                }
        );
        getTwo.addActionListener(
                e -> {
                    setTwo.setText(getPointsNumbers(2));
                    getTwo.setEnabled(false);
                    clearDice();
                }
        );
        getThree.addActionListener(
                e -> {
                    setThree.setText(getPointsNumbers(3));
                    getThree.setEnabled(false);
                    clearDice();
                }
        );
        getFour.addActionListener(
                e -> {
                    setFour.setText(getPointsNumbers(4));
                    getFour.setEnabled(false);
                    clearDice();
                }
        );
        getFive.addActionListener(
                e -> {
                    setFive.setText(getPointsNumbers(5));
                    getFive.setEnabled(false);
                    clearDice();
                }
        );
        getSix.addActionListener(
                e -> {
                    setSix.setText(getPointsNumbers(6));
                    getSix.setEnabled(false);
                    clearDice();
                }
        );
        getThreeofKind.addActionListener(
                e -> {
                    setThreeofKind.setText(getThreeofKind());
                    //getThreeofKind.setEnabled(false);
                    clearDice();
                }
        );
        getFourofKind.addActionListener(
                e -> {
                    setFourofKind.setText(getFourofKind());
                    getFourofKind.setEnabled(false);
                    clearDice();
                }
        );
        getFullHouse.addActionListener(
                e -> {
                    setFullHouse.setText(getFullHouse());
                    getFullHouse.setEnabled(false);
                    clearDice();
                }
        );
        getStraight.addActionListener(
                e -> {
                    setStraight.setText(getStraight());
                    getStraight.setEnabled(false);
                    clearDice();
                }
        );
        getFullStraight.addActionListener(
                e -> {
                    setFullStraight.setText(getFullStraight());
                    getFullStraight.setEnabled(false);
                    clearDice();
                }
        );
        getYahtzee.addActionListener(
                e -> {
                    setYahtzee.setText(getYahtzee());
                    getYahtzee.setEnabled(false);
                    clearDice();
                }
        );
        getChance.addActionListener(
                e -> {
                    setChance.setText(getPoints());
                    getChance.setEnabled(false);
                    clearDice();
                }
        );

        newGame.addActionListener(
                e -> {
                    frame.setVisible(false);
                    new Yahtzee();
                }
        );

    }

    public String getPointsNumbers(int number){
        int score = 0;
        int[] dice = {1, 2, 3, 4, 5};
        dice[0] = Integer.parseInt(button1.getText()); //value die 1 to 5
        dice[1] = Integer.parseInt(button2.getText());  
        dice[2] = Integer.parseInt(button3.getText());        
        dice[3] = Integer.parseInt(button4.getText());
        dice[4] = Integer.parseInt(button5.getText());
        for (int i = 0;i < dice.length;i++){
            if (dice[i] == number){
                score = score + dice[i];
            }
        }
        return Integer.toString(score);
    }

    public String getPoints(){
        int die1 = Integer.parseInt(button1.getText()); //value die 1 to 5
        int die2 = Integer.parseInt(button2.getText());  
        int die3 = Integer.parseInt(button3.getText());        
        int die4 = Integer.parseInt(button4.getText());
        int die5 = Integer.parseInt(button5.getText());
        int chance = die1+die2+die3+die4+die5;
        return Integer.toString(chance);

    }

    public static void main(String[] args){
        new Yahtzee();
    }

    private static String getDice(){
        int rand = (int) Math.floor(Math.random()*6)+1;
        return Integer.toString(rand);
    }

    private String getThreeofKind(){
        int count = 0;
        int score = 0;
        int[] dice = {1, 2, 3, 4, 5};
        dice[0] = Integer.parseInt(button1.getText()); //value die 1 to 5
        dice[1] = Integer.parseInt(button2.getText());  
        dice[2] = Integer.parseInt(button3.getText());        
        dice[3] = Integer.parseInt(button4.getText());
        dice[4] = Integer.parseInt(button5.getText());
        for (int n = 0;n < dice.length;n++){

            for (int i = 0;i < dice.length;i++){
                if (dice[n] == dice [i]){
                    count++;   
                }
            }
            score = score + dice[n];
        }
        if (count == 11 || count == 13 || count == 17 || count == 25){
            return Integer.toString(score);
        } else {
            return "0";
        }
    }

    private String getFourofKind(){
        int count = 0;
        int score = 0;
        int[] dice = {1, 2, 3, 4, 5};
        dice[0] = Integer.parseInt(button1.getText()); //value die 1 to 5
        dice[1] = Integer.parseInt(button2.getText());  
        dice[2] = Integer.parseInt(button3.getText());        
        dice[3] = Integer.parseInt(button4.getText());
        dice[4] = Integer.parseInt(button5.getText());
        for (int n = 0;n < dice.length;n++){
            for (int i = 0;i < dice.length;i++){
                if (dice[n] == dice [i]){
                    count++;   
                }
            }
            score = score + dice[n];
        }
        if (count == 17 || count == 25){
            return Integer.toString(score);
        } else {
            return "0";
        }
    }

    private String getFullHouse(){
        int count = 0;
        int[] dice = {1, 2, 3, 4, 5};
        dice[0] = Integer.parseInt(button1.getText()); //value die 1 to 5
        dice[1] = Integer.parseInt(button2.getText());  
        dice[2] = Integer.parseInt(button3.getText());        
        dice[3] = Integer.parseInt(button4.getText());
        dice[4] = Integer.parseInt(button5.getText());
        for (int n = 0;n < dice.length;n++){

            for (int i = 0;i < dice.length;i++){
                if (dice[n] == dice [i]){
                    count++;   
                }
            }

        }
        if (count == 13){
            return "25";
        } else {
            return "0";
        }
    }

    private String getStraight(){
        int count = 0;
        int[] dice = {1, 2, 3, 4, 5};
        dice[0] = Integer.parseInt(button1.getText()); //value die 1 to 5
        dice[1] = Integer.parseInt(button2.getText());  
        dice[2] = Integer.parseInt(button3.getText());        
        dice[3] = Integer.parseInt(button4.getText());
        dice[4] = Integer.parseInt(button5.getText());
        for (int n = 0;n < dice.length;n++){
            for (int i = 0;i < dice.length;i++){
                if (dice[n] == dice [i]){
                    count++;   
                }
            }
        }
        if (count == 7 || count == 5){
            return "30";
        } else {
            return "0";
        }
    }

    private String getFullStraight(){
        int count = 0;
        int score = 0;
        int[] dice = {1, 2, 3, 4, 5};
        dice[0] = Integer.parseInt(button1.getText()); //value die 1 to 5
        dice[1] = Integer.parseInt(button2.getText());  
        dice[2] = Integer.parseInt(button3.getText());        
        dice[3] = Integer.parseInt(button4.getText());
        dice[4] = Integer.parseInt(button5.getText());
        for (int n = 0;n < dice.length;n++){
            for (int i = 0;i < dice.length;i++){
                if (dice[n] == dice [i]){
                    count++;   
                }
            }
            score = score + dice[n];
        }  

        if (count == 5 && score == 15 || score == 20){
            return "40";
        } else {
            return "0";
        }
    }

    private String getYahtzee(){
        boolean yahtzee = false;
        int[] dice = {1, 2, 3, 4, 5};
        dice[0] = Integer.parseInt(button1.getText()); //value die 1 to 5
        dice[1] = Integer.parseInt(button2.getText());  
        dice[2] = Integer.parseInt(button3.getText());        
        dice[3] = Integer.parseInt(button4.getText());
        dice[4] = Integer.parseInt(button5.getText());
        int first = dice[0];
        for (int i = 0;i < dice.length;i++){
            yahtzee = dice[i] == first;
        }

        if (yahtzee){
            return "50";
        } else {
            return "0";
        }
    }

    private void clearDice(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button1.setBackground(Color.white);
        button2.setBackground(Color.white);
        button3.setBackground(Color.white);
        button4.setBackground(Color.white);
        button5.setBackground(Color.white);
        rolls = 0;

        int totalscore = 0;

        int[] total = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, };
        if (!setOne.getText().isEmpty()){
            total[0] = Integer.parseInt(setOne.getText());
        }
        if (!setTwo.getText().isEmpty()){
            total[1] = Integer.parseInt(setTwo.getText());
        }
        if (!setThree.getText().isEmpty()){
            total[2] = Integer.parseInt(setThree.getText());
        }
        if (!setFour.getText().isEmpty()){
            total[3] = Integer.parseInt(setFour.getText());
        }
        if (!setFive.getText().isEmpty()){
            total[4] = Integer.parseInt(setFive.getText());
        }
        if (!setSix.getText().isEmpty()){
            total[5] = Integer.parseInt(setSix.getText());
        }
        if (!setThreeofKind.getText().isEmpty()){
            total[6] = Integer.parseInt(setThreeofKind.getText());
        }
        if (!setFourofKind.getText().isEmpty()){
            total[7] = Integer.parseInt(setFourofKind.getText());
        }
        if (!setStraight.getText().isEmpty()){
            total[8] = Integer.parseInt(setStraight.getText());
        }
        if (!setFullStraight.getText().isEmpty()){
            total[9] = Integer.parseInt(setFullStraight.getText());
        }
        if (!setYahtzee.getText().isEmpty()){
            total[10] = Integer.parseInt(setYahtzee.getText());
        }
        if (!setChance.getText().isEmpty()){
            total[11] = Integer.parseInt(setChance.getText());
        }

        for (int i = 0;i < total.length;i++){
            totalscore = totalscore + total[i];
        }

        setTotal.setText(Integer.toString(totalscore));

    }

}

