package by.bsuir.oop.lab.t12;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public void setLanguage(String language){
        this.language = language;
    }

    public String getLanguage(){
        return language;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        if (!super.equals(obj)) {
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        return level == programmerBook.level
                && (language == programmerBook.language || language != null && language.equals(programmerBook.getLanguage()));
    }

    @Override
    public int hashCode(){
        int result = super.hashCode();
        result = 31 * result + level;
        result = 31 * result + ((language == null) ? 0 : language.hashCode());
        return result;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result = result + ", Language: " + ((language == null) ? "none" : language) + ", Level: " + level;
        return result;
    }
}
