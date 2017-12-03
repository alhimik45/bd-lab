package bd

import javafx.application.Application
import org.jooq.SQLDialect
import org.jooq.impl.DSL

import test.generated.Tables
import java.sql.DriverManager


class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val userName = "postgres"
            val password = ""
            val url = "jdbc:postgresql://alhimik.me:5432/lab"

            try {
                val conn = DriverManager.getConnection(url, userName, password)
                val create = DSL.using(conn, SQLDialect.POSTGRES)
                val result = create.select().from(Tables.LICENSE_PLATE_VIEW).fetch()
                for (r in result) {
                    println("Номер: " + r.getValue(Tables.LICENSE_PLATE_VIEW.LICENSE_PLATE) + " Ключ: " + r.getValue(Tables.LICENSE_PLATE_VIEW.LICENSEPLATE_PK))
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
    }
}