public class Animal {
    private String name;
    private boolean isDog;

    Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    Animal() {}

    Animal (String name) {
        this.name = name;
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
     * @return boolean return the isDog
     */
    public boolean isIsDog() {
        return isDog;
    }

    /**
     * @param isDog the isDog to set
     */
    public void setIsDog(boolean isDog) {
        this.isDog = isDog;
    }

    public String toString() {
        return ("Animals name: " + getName() + " is it a dog? true or false: " + isIsDog());
        
    }

}
