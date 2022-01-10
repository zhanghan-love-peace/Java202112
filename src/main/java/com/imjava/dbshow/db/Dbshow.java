/*
 * This file is generated by jOOQ.
 */
package com.imjava.dbshow.db;


import com.imjava.dbshow.db.tables.Data;
import com.imjava.dbshow.db.tables.FirstIndex;
import com.imjava.dbshow.db.tables.SecondIndex;
import com.imjava.dbshow.db.tables.ThirdIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Dbshow extends SchemaImpl {

    private static final long serialVersionUID = 1127355979;

    /**
     * The reference instance of <code>dbshow</code>
     */
    public static final Dbshow DBSHOW = new Dbshow();

    /**
     * The table <code>dbshow.data</code>.
     */
    public final Data DATA = com.imjava.dbshow.db.tables.Data.DATA;

    /**
     * 一级指标
     */
    public final FirstIndex FIRST_INDEX = com.imjava.dbshow.db.tables.FirstIndex.FIRST_INDEX;

    /**
     * 二级指标
     */
    public final SecondIndex SECOND_INDEX = com.imjava.dbshow.db.tables.SecondIndex.SECOND_INDEX;

    /**
     * 三级指标
     */
    public final ThirdIndex THIRD_INDEX = com.imjava.dbshow.db.tables.ThirdIndex.THIRD_INDEX;

    /**
     * No further instances allowed
     */
    private Dbshow() {
        super("dbshow", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Data.DATA,
            FirstIndex.FIRST_INDEX,
            SecondIndex.SECOND_INDEX,
            ThirdIndex.THIRD_INDEX);
    }
}
