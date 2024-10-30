package exampleTwo;

public class DocumentCharacter implements ILetter{
    private char character;
    private String fontType;
    private int size;

    DocumentCharacter(char character, String fontType, int size){
        this.character = character;
        this.fontType = fontType;
        this.size = size;

    }

    //only getter methods

    public char getCharacter() {
        return character;
    }

    public String getFontType() {
        return fontType;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void display(int row, int column) {

        //display the character of particular font and size
        //at given location
        System.out.println("displaying " + character + " in position " + row + " " + column);
    }

}
