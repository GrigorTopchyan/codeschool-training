package HomeWork10.CustomString;

import java.util.Arrays;
import java.util.Objects;

public final class CustomString {
    private final char[] character;

    public CustomString(char[] character) {
        this.character = character.clone();
    }

    public char charAt(int index){
       return character[index];
    }
    public boolean contains(String s){
        for (int i = 0; i <character.length ; i++) {
            if(character.equals(s)){ return true;}
        } return false;
    }
 public String toUpperCase(){

        for (int i = 0; i <character.length ; i++) {
            if (character[i]>96&&character[i]<123){
                character[i]= (char) (character[i]-32);
            } String.valueOf(character);
        } return  String.valueOf(character);

    }
    public int indexOf(int ch){
        int a = 0;
        for (int i = 0; i <character.length ; i++) {
            if(Objects.equals(character[i], character[ch])){
                a=i;break;
            }
        }
        return a;
    }
    public int lastIndexOf(int ch){
        int a = 0;
        for (int i = character.length-1; i == 0; i++) {
            if(Objects.equals(character[i], character[ch])){
                a=i;break;
            }
        }
        return a;

    }

}
