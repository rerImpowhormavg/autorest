/**
 */

package petstore.models;


/**
 * The Tag model.
 */
public class Tag {
    /**
     * The id property.
     */
    private Long id;

    /**
     * The name property.
     */
    private String name;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public Long id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the Tag object itself.
     */
    public Tag withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the Tag object itself.
     */
    public Tag withName(String name) {
        this.name = name;
        return this;
    }

}
