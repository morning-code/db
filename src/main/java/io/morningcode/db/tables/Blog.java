/*
 * This file is generated by jOOQ.
 */
package io.morningcode.db.tables;


import io.morningcode.db.Indexes;
import io.morningcode.db.Keys;
import io.morningcode.db.MorningCode;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Blog extends TableImpl<Record> {

    private static final long serialVersionUID = 1226844298;

    /**
     * The reference instance of <code>morning_code.blog</code>
     */
    public static final Blog BLOG = new Blog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>morning_code.blog.id</code>.
     */
    public final TableField<Record, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>morning_code.blog.title</code>.
     */
    public final TableField<Record, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>morning_code.blog.detail</code>.
     */
    public final TableField<Record, String> DETAIL = createField(DSL.name("detail"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>morning_code.blog.created_at</code>.
     */
    public final TableField<Record, Timestamp> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>morning_code.blog.created_by</code>.
     */
    public final TableField<Record, String> CREATED_BY = createField(DSL.name("created_by"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.inline("otajisan", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>morning_code.blog.updated_at</code>.
     */
    public final TableField<Record, Timestamp> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>morning_code.blog.updated_by</code>.
     */
    public final TableField<Record, String> UPDATED_BY = createField(DSL.name("updated_by"), org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.inline("otajisan", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>morning_code.blog</code> table reference
     */
    public Blog() {
        this(DSL.name("blog"), null);
    }

    /**
     * Create an aliased <code>morning_code.blog</code> table reference
     */
    public Blog(String alias) {
        this(DSL.name(alias), BLOG);
    }

    /**
     * Create an aliased <code>morning_code.blog</code> table reference
     */
    public Blog(Name alias) {
        this(alias, BLOG);
    }

    private Blog(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Blog(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Blog(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, BLOG);
    }

    @Override
    public Schema getSchema() {
        return MorningCode.MORNING_CODE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BLOG_PRIMARY);
    }

    @Override
    public Identity<Record, Long> getIdentity() {
        return Keys.IDENTITY_BLOG;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.KEY_BLOG_PRIMARY;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_BLOG_PRIMARY);
    }

    @Override
    public Blog as(String alias) {
        return new Blog(DSL.name(alias), this);
    }

    @Override
    public Blog as(Name alias) {
        return new Blog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Blog rename(String name) {
        return new Blog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Blog rename(Name name) {
        return new Blog(name, null);
    }
}