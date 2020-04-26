package edu.codeschool.training.innerClasses;

import java.util.Arrays;

public final class CustomString {
    private final char[] characters;

    public CustomString(char[] characters) {
        this.characters = Arrays.copyOf(characters, characters.length);
    }

    public char charAt(int index) {
        if ((index < 0) || (index >= characters.length)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return characters[index];
    }

    public boolean contains(char s) {
        for (int i = 0; i < characters.length; i++) {
            if (characters.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public CustomString toUpperCase() {
        CustomString customString = new CustomString(characters);
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] > 96 && characters[i] < 123) {
                characters[i] -= 32;
            }

        }
        return customString;
    }


}
