/*
 * This file is generated by jOOQ.
 */
package com.imjava.dbshow.db.tables.records;


import com.imjava.dbshow.db.tables.Metrics;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MetricsRecord extends UpdatableRecordImpl<MetricsRecord> implements Record2<String, Integer> {

    private static final long serialVersionUID = -393541807;

    /**
     * Setter for <code>dbshow.metrics.metric_type</code>.
     */
    public void setMetricType(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>dbshow.metrics.metric_type</code>.
     */
    public String getMetricType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dbshow.metrics.id</code>.
     */
    public void setId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>dbshow.metrics.id</code>.
     */
    public Integer getId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Metrics.METRICS.METRIC_TYPE;
    }

    @Override
    public Field<Integer> field2() {
        return Metrics.METRICS.ID;
    }

    @Override
    public String component1() {
        return getMetricType();
    }

    @Override
    public Integer component2() {
        return getId();
    }

    @Override
    public String value1() {
        return getMetricType();
    }

    @Override
    public Integer value2() {
        return getId();
    }

    @Override
    public MetricsRecord value1(String value) {
        setMetricType(value);
        return this;
    }

    @Override
    public MetricsRecord value2(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MetricsRecord values(String value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MetricsRecord
     */
    public MetricsRecord() {
        super(Metrics.METRICS);
    }

    /**
     * Create a detached, initialised MetricsRecord
     */
    public MetricsRecord(String metricType, Integer id) {
        super(Metrics.METRICS);

        set(0, metricType);
        set(1, id);
    }
}
