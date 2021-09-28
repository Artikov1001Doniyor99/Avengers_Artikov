package adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modul_5_lesson3_1.R
import kotlinx.android.synthetic.main.item_contact.view.*
import models.Contact

class ContactAdapter(var contactList:List<Contact>) : RecyclerView.Adapter<ContactAdapter.MyViewHolder>() {




    inner class MyViewHolder(var itemView: View): RecyclerView.ViewHolder(itemView){
        fun onBind(contact: Contact){
            itemView.image.setImageResource(contact.image)
            itemView.name.text = contact.name
            itemView.view.text = contact.view
            itemView.date.text = contact.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_contact,parent,false)
        val myViewHolder = MyViewHolder(itemView)
        return myViewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val contact = contactList[position]
        holder.onBind(contact)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}