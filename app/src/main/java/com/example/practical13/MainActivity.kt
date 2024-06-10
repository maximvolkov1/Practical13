package com.example.practical13

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)
        val popupMenu = androidx.appcompat.widget.PopupMenu(this, imageView)
        popupMenu.inflate(R.menu.popupmenu)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu1 -> {
                    textView.text = "Нажат пункт меню PopupMenu 1"
                    true
                }
                R.id.menu2 -> {
                    textView.text = "Нажат пункт меню PopupMenu 2"
                    true
                }
                R.id.menu3 -> {
                    textView.text = "Нажат пункт меню PopupMenu 3"
                    true
                }
                else -> false
            }
        }
        imageView.setOnClickListener {
            popupMenu.show()
        }
        val popupMenu2 = androidx.appcompat.widget.PopupMenu(this, button)
        popupMenu.inflate(R.menu.popupmenu2)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.red -> {
                    textView.background = ColorDrawable(Color.RED)
                    textView.text = "Вы выбрали красный цвет"
                    true
                }
                R.id.yellow -> {
                    textView.background = ColorDrawable(Color.YELLOW)
                    textView.text = "Вы выбрали желтый цвет"
                    true
                }
                R.id.green -> {
                    textView.background = ColorDrawable(Color.GREEN)
                    textView.text = "Вы выбрали зеленый цвет"
                    true
                }
            }
            false
            }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            popupMenu2.setForceShowIcon(true)
        }
        button.setOnClickListener {
            popupMenu2.show()
        }
        val popupMenu3 = androidx.appcompat.widget.PopupMenu(this, button)
        popupMenu.inflate(R.menu.popupmenu3)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu1 -> {
                    textView.text = "Нажат пункт меню PopupMenu 1"
                    true
                }
                R.id.menu2 -> {
                    textView.text = "Нажат пункт меню PopupMenu 2"
                    true
                }
                R.id.menu3 -> {
                    textView.text = "Нажат пункт меню PopupMenu 3"
                    true
                }
                R.id.small_text -> {
                    textView.textSize = 12f
                    true
                }
                R.id.medium_text -> {
                    textView.textSize = 24f
                    true
                }
                R.id.large_text -> {
                    textView.textSize = 32f
                    true
                }
                else -> false
            }
        }
        button.setOnClickListener {
            popupMenu.show()
        }
    }
}