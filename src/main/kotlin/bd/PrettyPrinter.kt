package bd

import org.jooq.ExecuteContext
import org.jooq.conf.Settings
import org.jooq.impl.DSL
import org.jooq.impl.DefaultExecuteListener
import org.jooq.tools.StringUtils

class PrettyPrinter : DefaultExecuteListener() {

    /**
     * Hook into the query execution lifecycle before executing queries
     */
    override fun executeStart(ctx: ExecuteContext?) {

        // Create a new DSLContext for logging rendering purposes
        // This DSLContext doesn't need a connection, only the SQLDialect...
        val create = DSL.using(ctx!!.configuration().dialect(),

                // ... and the flag for pretty-printing
                Settings().withRenderFormatted(true))

        // If we're executing a query
        if (ctx.query() != null) {
            println(create.renderInlined(ctx.query()))
        } else if (ctx.routine() != null) {
            println(create.renderInlined(ctx.routine()))
        } else if (!StringUtils.isBlank(ctx.sql())) {
            println(ctx.sql())
        }// If we're executing anything else (e.g. plain SQL)
        // If we're executing a routine
    }
}