package tk.tyfang.memeapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

 class adapter(
    var todos:List<todo>
): RecyclerView.Adapter<adapter.TodoViewHolder>() {
    inner class TodoViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView)

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
         return TodoViewHolder(view);
     }

     override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.itemView.apply {
          holder.itemView.findViewById<TextView>(R.id.tvTitle).text = todos[position].title;
          holder.itemView.findViewById<CheckBox>(R.id.cbDone).isChecked = todos[position].isChecked;
        }

     }
    //used for telling the size of the list
     override fun getItemCount(): Int {
       return  todos.size
     }
 }