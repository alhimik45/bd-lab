package bd

import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import java.sql.DriverManager
import java.sql.SQLException

internal class Logic private constructor(val create: DSLContext) {

    companion object {
        var inst: Logic? = null

        fun create(dbUser: String, dbPassword: String) {
            inst = try {
                val url = "jdbc:postgresql://alhimik.me:5432/lab"
                val conn = DriverManager.getConnection(url, dbUser, dbPassword)
                val create = DSL.using(conn, SQLDialect.POSTGRES_9_4)
                Logic(create)
            } catch (e: SQLException) {
                null
            }
        }
    }
}
