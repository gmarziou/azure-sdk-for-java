/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OriginResourceState.
 */
public final class OriginResourceState extends ExpandableStringEnum<OriginResourceState> {
    /** Static value Creating for OriginResourceState. */
    public static final OriginResourceState CREATING = fromString("Creating");

    /** Static value Active for OriginResourceState. */
    public static final OriginResourceState ACTIVE = fromString("Active");

    /** Static value Deleting for OriginResourceState. */
    public static final OriginResourceState DELETING = fromString("Deleting");

    /**
     * Creates or finds a OriginResourceState from its string representation.
     * @param name a name to look for
     * @return the corresponding OriginResourceState
     */
    @JsonCreator
    public static OriginResourceState fromString(String name) {
        return fromString(name, OriginResourceState.class);
    }

    /**
     * @return known OriginResourceState values
     */
    public static Collection<OriginResourceState> values() {
        return values(OriginResourceState.class);
    }
}