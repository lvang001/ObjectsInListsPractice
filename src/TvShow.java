public class TvShow {
    private String name;
    private int number;
    private String genre;

    public TvShow(String name, int number, String genre) {
        this.name = name;
        this.number = number;
        this.genre = genre;
    }
    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return String return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString() {
        return("Name: " + getName() + " number of episodes is " + getNumber() + " Genre: " + getGenre());
    }
}
