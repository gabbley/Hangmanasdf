package com.example.gabbley.hangman;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.view.MenuItem;
        import android.widget.Button;
        import java.util.ArrayList;
       // import ...;

public class screenGame extends AppCompatActivity {


    final static int ALPHABET_LENGTH = 26;
    final static String ALPHABET_STR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final static int A_VALUE = 45;
    final static String strAnswer = "";
    public static String strDisplay = "";
    public static int hangman = 0;
    //final static Button letterChoices;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.content_screen_game);
                    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                    setSupportActionBar(toolbar);

                    //action listener for every letter button (maybe loop it?)
                    //ArrayList of buttons?

for (int i = 0; i<ALPHABET_LENGTH; i++) {
    final Button btn = (Button) findViewById(R.id.btnA);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            disableSingleButton(btn);
            checkLetter("A", btn);

        }
    });
}
        runGame();
        letterButtons = new ArrayList<Button>();

        //places buttons in ArrayList based on ID
        for(int id : BUTTON_IDS) {
            Button button = (Button)findViewById(id);
            letterButtons.add(button);

            //goes through ArrayList of buttons, sets unique OnClickListener
            for (final Button btn : letterButtons){
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        for (int i = 0; i<ALPHABET_LENGTH; i++){
                        checkLetter(ALPHABET_STR.substring(i, i+1), btn); //sends
                        disableSingleButton(btn);

                    }
                }
            });

        }
            //resets buttons
            final Button btnReset = (Button) findViewById(R.id.buttonReset);
            btnReset.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick (View view){
                    startActivity(new Intent(screenGame.this, screenStart.class));
                    btnEnable(letterButtons);

                }
            });
        }


    }


    public void enableSingleButton(Button b){
        b.setEnabled(true);

    }

    public void disableSingleButton(Button b){
        b.setEnabled(false);

    }

    //assigns each button an on click listener
    public void assignButtons(Button b){
        for(int id : BUTTON_IDS) {
            final Button button = (Button)findViewById(id);
            letterButtons.add(button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    for (int i = 0; i<ALPHABET_LENGTH; i++) {
                       // checkLetter(A_VALUE + i, button);
                    }

                }
            });
        }
            //goes through button array list, assigns each one
           /* for (int i = 0; i<ALPHABET_LENGTH; i++) {
                final Button btn = (Button) findViewById(R.id.btn(i));
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        checkLetter("A", btn);

                    }
                });
            }*/

    }

    //places each button into an array based on ID number
    private ArrayList<Button> letterButtons;
    private static final int[] BUTTON_IDS = {
            R.id.btnA,
            R.id.btnB,
            R.id.btnC,
            R.id.btnD,
            R.id.btnE,
            R.id.btnF,
            R.id.btnG,
            R.id.btnH,
            R.id.btnI,
            R.id.btnJ,
            R.id.btnK,
            R.id.btnL,
            R.id.btnM,
            R.id.btnN,
            R.id.btnO,
            R.id.btnP,
            R.id.btnQ,
            R.id.btnR,
            R.id.btnS,
            R.id.btnT,
            R.id.btnU,
            R.id.btnV,
            R.id.btnW,
            R.id.btnX,
            R.id.btnY,
            R.id.btnZ,

    };


    //checks if letter is contained, executed with every clicked button
    public static void checkLetter(String ltr, Button b){
    //run everytime a user clicks a letter button
        boolean found=false;
        for(int i=0; i<strAnswer.length(); i++){
            //check if the letter is the same as the character in answer string at
            if(ltr.equals(strAnswer.substring(i,i+1))){
                //update display
                found=true;
                strDisplay=strDisplay.substring(0, i*2)+ strAnswer.substring(i,i+1)+strDisplay.substring((i*2)+1);
                //TEXTVIEW>SETTEXT() CHANGE THE STRING DISPLAYYYYYYYYYYED
            }
        }
        if(found=false)
            hangman++;

    }

    //disables button sent in
    /*public static void btnDisable(Button b){
        b.setEnabled(false);
    }*/

    public static void btnDisable(ArrayList<Button> buttons){
        for (int i = 0; i<buttons.size(); i++){
            buttons.get(i).setEnabled(false);
        }

    }

    //enables button sent in
    public static void btnEnable(ArrayList<Button> buttons){
        for (int i = 0; i<buttons.size(); i++){
            buttons.get(i).setEnabled(true);
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void runGame() {

        int hangman = 0;

//put string answer into a stringdisplay
        strDisplay = "";
        for (int i = 0; i < strAnswer.length(); i++) {
            strDisplay += "_ ";
        }


    /*
    if the hangman variable increases (increases with each miss/wrong letter)
    an image is added

        ImageView man = new ImageView();

    switch (hangman) {
            case 1:
                man.setImageResource(R.id."hangman1.jpg");
                break;
            case 2:
                man.setImageResource(R.id."hangman2.jpg");
                break;
            case 3:
                man.setImageResource(R.id."hangman3.jpg");
                break;
            case 4:
                man.setImageResource(R.id."hangman4.jpg");
                break;
            case 5:
                man.setImageResource(R.id."hangman5.jpg");
                break;
            case 6:
                man.setImageResource(R.id."hangman6.jpg");
                break;
            default:
                man.setImageResource(R.id."hangman0.jpg");
                break;

        }*/
//PUT THE DISPLAY STRING IN A TEXTBOX


//UPDATE THE IMAGE DISPLAYED FOR HANGMAN
        //IMAGEVIEW>SETIMAGERESOURCE(R>DRAWABLE.IMAGENAEM)
        //imagename="hangman" +(String)hangman;

//PS should modulariza and check if win.lose
        checkIfWin();
        checkIfLose();

    }

//checkIfWin method
    public void checkIfWin(){
        if(hangman>=6) {
            openScreenWin(); //open win screen
        }
    }

    //check to see if lost method
    public void checkIfLose(){
        boolean lost=true;
        for(int i=0; i<strDisplay.length(); i++){
            if(strDisplay.substring(i,i+1).equals("_"))
                lost=false;
        }
        if(lost)
            openScreenLose(); //open up lose screen
    }

//opens win screen
    public void openScreenWin() {
        startActivity(new Intent(screenGame.this, screenWin.class));
    }

    //opens lose screen
    public void openScreenLose(){
        startActivity(new Intent(screenGame.this, screenLose.class));
    }
}
