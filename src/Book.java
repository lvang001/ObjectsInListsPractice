public class Book {
    private String title;
    private int number;
    private int year;

    Book(String title, int number,int year) {
        this.title = title;
        this.number = number;
        this.year = year;
    }

    Book(String title) {
        this.title = title;
    }

    Book(String title, int number) {
        this.title = title;
        this.number = number;
    }

    Book() {
        
    }
    

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
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
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return("name: " + getTitle() + "pages: " + getNumber() + ", " + getYear());
    }

}
