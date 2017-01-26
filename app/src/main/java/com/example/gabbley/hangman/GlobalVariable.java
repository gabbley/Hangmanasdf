package com.example.gabbley.hangman;

import android.app.Application;
import java.util.ArrayList;
/**
 * Created by baniquedg on 12/19/2016.
 */
public class GlobalVariable extends Application {
//getters
    ArrayList<String> mainGuessWord = new ArrayList<String>();
     ArrayList<String> lettersUsed= new ArrayList<String>();
    ArrayList<String> showLetters= new ArrayList<String>();
    ArrayList<String> wordChoiceDad= new ArrayList<String>();
    ArrayList<String> wordChoiceSon= new ArrayList<String>();


    public ArrayList<String> getLettersUsed(){
        return lettersUsed;
    }

    public ArrayList<String> getShowLetters(){
        return showLetters;
    }

    public ArrayList<String> getWordChoiceDad(){
        return wordChoiceDad;
    }

    public ArrayList<String> getWordChoiceSon(){
        return wordChoiceSon;
    }



    /*wordChoiceDad.add("YOU ARE ADOPTED");
    wordChoiceDad.add("YOUR MOTHER IS A PRETTY LADY");
    wordChoiceDad.add("HI HUNGRY IM DAD");
    wordChoiceDad.add("IM PROUD OF YOU");
    wordChoiceSon.add("LOVE YOU DAD");
    wordChoiceSon.add("IT'S NOT A STAGE DAD");
    wordChoiceSon.add("DAD WHY DID MOM LEAVE");
    wordChoiceSon.add("DAD I'M LEAVING TO LIVE WITH MOM");*/
}
