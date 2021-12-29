/*
 * This file is generated by jOOQ.
 */
package com.imjava.dbshow.db;


import com.imjava.dbshow.db.tables.Metrics;
import com.imjava.dbshow.db.tables.records.MetricsRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>dbshow</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<MetricsRecord, Integer> IDENTITY_METRICS = Identities0.IDENTITY_METRICS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<MetricsRecord> KEY_METRICS_PRIMARY = UniqueKeys0.KEY_METRICS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<MetricsRecord, Integer> IDENTITY_METRICS = Internal.createIdentity(Metrics.METRICS, Metrics.METRICS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<MetricsRecord> KEY_METRICS_PRIMARY = Internal.createUniqueKey(Metrics.METRICS, "KEY_metrics_PRIMARY", Metrics.METRICS.ID);
    }
}