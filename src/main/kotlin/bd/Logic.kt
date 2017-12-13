package bd

import javafx.scene.control.ComboBox
import javafx.scene.control.DatePicker
import javafx.scene.control.TextField
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.conf.Settings
import org.jooq.impl.DSL
import test.generated.Tables.EMPLOYE_VIEW
import test.generated.tables.pojos.EmployeView
import java.sql.Date
import java.sql.DriverManager
import java.sql.SQLException
import org.jooq.impl.DefaultExecuteListenerProvider
import org.jooq.impl.DefaultConfiguration



internal object Logic {
    var create: DSLContext? = null
    var user: EmployeView? = null

    fun create(dbUser: String, dbPassword: String) {
        try {
            val url = "jdbc:postgresql://alhimik.me:5432/lab"
            val conn = DriverManager.getConnection(url, dbUser, dbPassword)
            val configuration = DefaultConfiguration().set(conn).set(SQLDialect.POSTGRES_9_4)
            configuration.set(DefaultExecuteListenerProvider(PrettyPrinter()))

            // Create a DSLContext from the above configuration
            create = DSL.using(configuration)
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

    fun <T> comboCheckEmpty(name: String, t: ComboBox<T>): T {
        if (t.selectionModel.selectedItem == null) {
            Helpers.alert("$name должно быть выбрано")
            throw KekException()
        }
        return t.selectionModel.selectedItem
    }

    fun textCheckEmpty(name: String, t: TextField): String {
        if (t.text.isNullOrBlank()) {
            Helpers.alert("$name не может быть пустым")
            throw KekException()
        }
        return t.text!!
    }

    fun textCheckReg(name: String, pattern: String, cause: String, t: TextField): String {
        if (!t.text.matches(Regex(pattern))) {
            Helpers.alert("$name должно быть $cause")
            throw KekException()
        }
        return t.text!!
    }

    fun dateCheckEmpty(name: String, t: DatePicker): Date {
        if (t.value == null) {
            Helpers.alert("$name должно быть заполнено")
            throw KekException()
        }
        return Date.valueOf(t.value)
    }

    var sn: Boolean = false

}
