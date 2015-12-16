/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import java.util.List;

/**
 * The Cat model.
 */
public class Cat extends Pet {
    /**
     * The color property.
     */
    private String color;

    /**
     * The hates property.
     */
    private List<Dog> hates;

    /**
     * Get the color value.
     *
     * @return the color value
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Set the color value.
     *
     * @param color the color value to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get the hates value.
     *
     * @return the hates value
     */
    public List<Dog> getHates() {
        return this.hates;
    }

    /**
     * Set the hates value.
     *
     * @param hates the hates value to set
     */
    public void setHates(List<Dog> hates) {
        this.hates = hates;
    }

}
