package fr.soat.androidarchikotlin.features.people_list

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import fr.soat.androidarchikotlin.R
import fr.soat.androidarchikotlin.data.model.SimplifiedPeople

class PeopleListAdapter : RecyclerView.Adapter<PeopleListAdapter.PeopleListViewHolder>() {

    val items : MutableList<SimplifiedPeople> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): PeopleListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.people_list_item, parent, false)
        return PeopleListViewHolder(v)
    }

    fun refresh (newItems: List<SimplifiedPeople>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: PeopleListViewHolder, position: Int) {
        val people = items[position]
        holder.idTextView.setText(people.id.toString())
        holder.nameTextView.setText(people.name)
    }

    class PeopleListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var idTextView: TextView = itemView.findViewById(R.id.people_item_id)
        var nameTextView: TextView = itemView.findViewById(R.id.people_item_name)
    }
}