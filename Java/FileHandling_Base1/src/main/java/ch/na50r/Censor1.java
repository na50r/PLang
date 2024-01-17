package ch.na50r;
public class Censor1 {
    String curse;
    String bleep;
    String[] words;
    public Censor1(String curse, String bleep, String[] words){
        this.curse = curse;
        this.bleep = bleep;
        this.words = words;
    }

    public String[] Filter(){
        int n = this.words.length;
        for(int i = 0; i<n; i++){
            if(this.words[i].toLowerCase().contains(this.curse.toLowerCase())){
                String replacement = this.words[i].toLowerCase().replace(this.curse.toLowerCase(), this.bleep);
                this.words[i] = replacement;
            }
        }
        return this.words;
    }
}
