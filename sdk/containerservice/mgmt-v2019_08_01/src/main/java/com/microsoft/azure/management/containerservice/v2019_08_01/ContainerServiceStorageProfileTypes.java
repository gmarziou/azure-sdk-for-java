/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContainerServiceStorageProfileTypes.
 */
public final class ContainerServiceStorageProfileTypes extends ExpandableStringEnum<ContainerServiceStorageProfileTypes> {
    /** Static value StorageAccount for ContainerServiceStorageProfileTypes. */
    public static final ContainerServiceStorageProfileTypes STORAGE_ACCOUNT = fromString("StorageAccount");

    /** Static value ManagedDisks for ContainerServiceStorageProfileTypes. */
    public static final ContainerServiceStorageProfileTypes MANAGED_DISKS = fromString("ManagedDisks");

    /**
     * Creates or finds a ContainerServiceStorageProfileTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding ContainerServiceStorageProfileTypes
     */
    @JsonCreator
    public static ContainerServiceStorageProfileTypes fromString(String name) {
        return fromString(name, ContainerServiceStorageProfileTypes.class);
    }

    /**
     * @return known ContainerServiceStorageProfileTypes values
     */
    public static Collection<ContainerServiceStorageProfileTypes> values() {
        return values(ContainerServiceStorageProfileTypes.class);
    }
}
