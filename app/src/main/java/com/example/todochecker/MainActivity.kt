package com.example.todochecker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val texts = arrayOf(
        "abc ", "bcda"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listView = ListView(this)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)





        // simple_list_item_1 は、 もともと用意されている定義済みのレイアウトファイルのID
        val arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, texts
        )

        listView.setAdapter(arrayAdapter)



    }

    /*fun findAllArticles(): List<Article> {
        var conn: Connection? = null
        var statement: Statement? = null
        var resultSet: ResultSet? = null

        val articleListBuilder = ImmutableArrayListBuilder<Article>()

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/sample")
            statement = conn?.createStatement()
            resultSet = statement?.executeQuery("select * from articles")
            while(resultSet?.next() ?: false) {
                articleListBuilder.add(Article(
                    resultSet!!.getLong(1),
                    resultSet!!.getString(2)!!,
                    resultSet!!.getString(3) ?: "",
                    resultSet!!.getString(4)!!
                ))
            }
        } finally {
            resultSet?.close()
            statement?.close()
            conn?.close()
        }

        return articleListBuilder.build()
    }*/

    override fun onClick(v: View?) {
        val intent = Intent(this@MainActivity,toadd::class.java)
        startActivity(intent)
    }
}
