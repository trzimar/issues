package com.bugs.cucumber;

import java.util.Map;

import io.cucumber.datatable.DataTableType;

import org.junit.Test;

public class DataTableTypeTest {

    /**
     * Fails to compile with Eclipse Photon IDE:
     * https://bugs.eclipse.org/bugs/show_bug.cgi?id=538192
     */
    @Test
    public void dataTableTypeTableEntryTransformerTest() {
        new DataTableType(Integer.class, (Map<String, String> row) -> new Integer(0));
    }
}
