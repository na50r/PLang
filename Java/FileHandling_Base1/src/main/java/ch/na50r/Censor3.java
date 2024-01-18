package ch.na50r;

import java.util.Arrays;

public class Censor3 {
    String[] curses;
    String[] words;

    public Censor3(String[] curses, String[] words) {
        this.curses = curses;
        this.words = words;
    }

    private static String bleepGenerator(int length){
        String[] base = {"$", "#", "!", "%"};
        String[] out = new String[length];
        for(int i = 0; i<length; i++){
            out[i] = base[i%base.length];
        }
        return String.join("", out);

    }

    public String[] Filter() {
        int n = this.words.length;
        for (int i = 0; i<n; i++){
            for(String curse : this.curses){
                this.words[i] = this.words[i].replace(curse, bleepGenerator(curse.length()));
            }
        }
        return this.words;
    }




}
