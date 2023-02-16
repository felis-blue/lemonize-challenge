package model;

/**
 * The yarn data model
 */
public class Yarn {

    private final String id;
    private final String name;
    private final String color;
    private final int size;

    public Yarn(String id, String name, String color, int size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

}
