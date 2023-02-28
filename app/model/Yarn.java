package model;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

/**
 * The yarn data model
 */
public class Yarn {

    /** an assortment of example yarn, "database simulation" */
    private static Map<String, Yarn> map = Map.of(
            "1", new Yarn("1", "Catania", "blue", 50),
            "2", new Yarn("2", "Catania", "red", 50),
            "3", new Yarn("3", "Regia", "uni", 100),
            "4", new Yarn("4", "Regia", "striped", 100),
            "5", new Yarn("5", "Whirl", "ocean breeze", 200),
            "6", new Yarn("6", "Whirl", "moccha time", 200),
            "7", new Yarn("7", "Whirl", "blueberry muffin", 200));

    /**
     * Get a list of all yarn data
     *
     * @return a Collection of Yarn
     */
    public static Collection<Yarn> getAll() {
        return Yarn.map.values();
    }

    /**
     * Get the yarn data for the given id
     *
     * @param id
     *           the id of the yarn data to be returned
     * @return on Optional containing the Yarn with the given id, or empty if
     *         no such Yarn exists
     */
    public static Optional<Yarn> getById(final String id) {
        return Optional.ofNullable(Yarn.map.get(id));
    }

    private final String id;
    private final String name;
    private final String color;
    private final int size;

    public Yarn(final String id, final String name, final String color, final int size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getSize() {
        return this.size;
    }

}
