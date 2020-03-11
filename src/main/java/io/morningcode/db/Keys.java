/*
 * This file is generated by jOOQ.
 */
package io.morningcode.db;


import io.morningcode.db.tables.Blog;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.Record;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>morning_code</code> schema.
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

    public static final Identity<Record, Long> IDENTITY_BLOG = Identities0.IDENTITY_BLOG;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<Record> KEY_BLOG_PRIMARY = UniqueKeys0.KEY_BLOG_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<Record, Long> IDENTITY_BLOG = Internal.createIdentity(Blog.BLOG, Blog.BLOG.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<Record> KEY_BLOG_PRIMARY = Internal.createUniqueKey(Blog.BLOG, "KEY_blog_PRIMARY", Blog.BLOG.ID);
    }
}
