package HomeWork10.CustomString;

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
}
