package edu.macalester.comp124.stringtransformer;



/**
 * Created by Connor Valenti on 2/27/14.
 */
public class L33tMaker extends StringTransformer{
    public String transform(String s){
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'e': s = s.replace(s.charAt(i), '3');
                    break;
                case 'a': s = s.replace(s.charAt(i), '4');
                    break;
                case 'o': s = s.replace(s.charAt(i), '0');
                    break;
            }
        }
        return s;
    }

    public String toString(){
        return "L33t Maker";
    }
}
