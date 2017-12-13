package bd

import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import test.generated.Tables
import test.generated.Tables.EMPLOYE_VIEW
import test.generated.tables.pojos.EmployeView
import java.sql.DriverManager
import java.sql.SQLException

internal object Logic {
    var create: DSLContext? = null
    var user: EmployeView? = null

    fun create(dbUser: String, dbPassword: String) {
        try {
            val url = "jdbc:postgresql://alhimik.me:5432/lab"
            val conn = DriverManager.getConnection(url, dbUser, dbPassword)
            create = DSL.using(conn, SQLDialect.POSTGRES_9_4)
            user = create!!.select().from(EMPLOYE_VIEW).where(EMPLOYE_VIEW.LOGIN.eq(dbUser)).fetchOne().into(EmployeView::class.java)
        } catch (e: SQLException) {
            create = null
        }
    }

    fun lock(elem: Lock, id: Long):Boolean = Logic.create!!
                .fetchOne("SELECT pg_try_advisory_lock(${elem.ordinal}, $id);")
                .into(Boolean::class.java)

    fun unlock(elem: Lock, id: Long) = create!!
            .execute("SELECT pg_advisory_unlock(${elem.ordinal}, $id)")
}
