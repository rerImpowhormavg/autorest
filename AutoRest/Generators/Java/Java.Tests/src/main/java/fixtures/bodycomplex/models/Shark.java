/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The Shark model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "fishtype")
@JsonTypeName("shark")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "sawshark", value = Sawshark.class),
    @JsonSubTypes.Type(name = "goblin", value = Goblinshark.class),
    @JsonSubTypes.Type(name = "cookiecuttershark", value = Cookiecuttershark.class)
})
public class Shark extends Fish {
    /**
     * The age property.
     */
    private Integer age;

    /**
     * The birthday property.
     */
    @JsonProperty(required = true)
    private DateTime birthday;

    /**
     * Get the age value.
     *
     * @return the age value
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * Set the age value.
     *
     * @param age the age value to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Get the birthday value.
     *
     * @return the birthday value
     */
    public DateTime getBirthday() {
        return this.birthday;
    }

    /**
     * Set the birthday value.
     *
     * @param birthday the birthday value to set
     */
    public void setBirthday(DateTime birthday) {
        this.birthday = birthday;
    }

}
