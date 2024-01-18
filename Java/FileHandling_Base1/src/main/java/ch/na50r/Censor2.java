package ch.na50r;


public class Censor2 {
    String[] curses;
    String bleep;
    String[] words;

    public Censor2(String[] curses, String bleep, String[] words) {
        this.curses = curses;
        this.bleep = bleep;
        this.words = words;
    }

    public String[] Filter() {
        int n = this.words.length;
        for (int i = 0; i<n; i++){
            for(String curse : this.curses){
                this.words[i] = this.words[i].replace(curse, this.bleep);
            }
        }
        return this.words;
   }
}