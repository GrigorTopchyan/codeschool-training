package edu.training.codeschool.myownstring;

public class MyString {
    private char[] characters;

    public MyString() {
    }

    public MyString(char[] characters) {
        this.characters = characters;
    }

    public char[] getCharacters() {
        return characters;
    }

    public void setCharacters(char[] characters) {
        this.characters = characters;
    }

    public char charAt(int index) {
        if (index<0 || index > Integer.MAX_VALUE){
      return 0;
        }
        char ch = (char)index;
        return ch;
    }
    public boolean contains(String s){
       return true;
            }
        }
