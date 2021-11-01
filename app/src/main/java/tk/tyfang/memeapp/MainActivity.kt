package tk.tyfang.memeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList = mutableListOf(
            todo("clean the house", false),
            todo("buy some milk", false),
            todo("fix the car", false),
        )


        val adapter = adapter(todoList);
        val rvTodo = findViewById<RecyclerView>(R.id.rvTodo);
        rvTodo.adapter = adapter;
        rvTodo.layoutManager = LinearLayoutManager(this)

        val btnTodo = findViewById<Button>(R.id.btnTodo)
        val etTodo = findViewById<EditText>(R.id.etTodo)

        btnTodo.setOnClickListener{
            val title = etTodo.text.toString()
            val todo = todo(title, false)
            todoList.add(todo)

            adapter.notifyItemInserted(todoList.size - 1)


        }
    }

}