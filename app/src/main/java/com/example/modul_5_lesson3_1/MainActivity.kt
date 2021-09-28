package com.example.modul_5_lesson3_1

import adapters.ContactAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_contact.*
import models.Contact

class MainActivity : AppCompatActivity() {

    lateinit var contactList:ArrayList<Contact>
    lateinit var contactAdapter:ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "RecyclerViewKotlinDemo"
        loadContacts()

        contactAdapter = ContactAdapter(contactList)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv.layoutManager = linearLayoutManager
        rv.adapter = contactAdapter

    }

    private fun loadContacts() {
        contactList = ArrayList()

            contactList.add(Contact(R.drawable.r1,"Avengers","View:500","Release Date: 16 Feb 2018"))
            contactList.add(Contact(R.drawable.r2,"Avengers:Age of Ultron","View:400","Release Date: 17 March 2018"))
            contactList.add(Contact(R.drawable.r3,"Iron man 3","View:550","Release Date: 17 April 2018"))
            contactList.add(Contact(R.drawable.r4,"Avengers:Infinity War","View:1500","Release Date: 15 Jan 2018"))


    }
}