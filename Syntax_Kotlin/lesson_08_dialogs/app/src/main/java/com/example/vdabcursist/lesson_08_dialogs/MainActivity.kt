package com.example.vdabcursist.lesson_08_dialogs

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import javax.xml.transform.Result

class MainActivity : AppCompatActivity() {

    var progressBarStatus =0
    var rate =0

    lateinit var slider:SeekBar
    lateinit var value:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_download_ID.setOnClickListener{view -> Thread (Runnable{
            while (progressBarStatus <100){
                try {
                    rate +=10
                    Thread.sleep(500)
                }
                catch (e: InterruptedException){
                    e.printStackTrace()
                }
                progressBarStatus = rate
                progressBar_ID.progress = progressBarStatus
            }
            progressBar_ID.setVisibility(ProgressBar.INVISIBLE)
        }).start()

        }

        slider=seekBar_ID
        value=result_ID
        slider.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value.text="Release thumb to select .." + progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                value.text="Tracking Started ....." + slider.progress
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                value.text="Thank you for selecting " + slider.progress
            }
        })

    }

    fun save (view: View){
        val SaveAlert = AlertDialog.Builder(this)
        SaveAlert.setTitle("Save")
        SaveAlert.setMessage("Are you sure you want to save changes?")
        SaveAlert.setPositiveButton("Yes"){
            dialogInterface, i: Int -> Toast.makeText(applicationContext, "Saved", Toast.LENGTH_LONG).show()
        }
        SaveAlert.setNegativeButton("No"){
            dialogInterface: DialogInterface, i: Int -> Toast.makeText(applicationContext, "Not Saved", Toast.LENGTH_LONG).show()
        }
        SaveAlert.setNeutralButton("Remind me later "){
            dialogInterface, i: Int -> Toast.makeText(applicationContext, "Remind me later", Toast.LENGTH_LONG).show()
        }
        SaveAlert.show()
    }

    fun setDate(view: View){
        val c = Calendar.getInstance()
        val day = c.get(Calendar.DAY_OF_MONTH)
        val month = c.get(Calendar.MONTH)
        val year = c.get(Calendar.YEAR)

        val DatePD = DatePickerDialog(this, android.R.style.ThemeOverlay, DatePickerDialog.OnDateSetListener{DatePicker, Year, Month, Day -> dateText_ID.text="$Day/ ${Month+1} /$Year"}, year, month, day)

        DatePD.show()
    }

    fun setTime (view: View){
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val min = c.get(Calendar.MINUTE)
        val timePD = TimePickerDialog(this, TimePickerDialog.OnTimeSetListener{TimePicker, hourOfDay, minute -> timeText_ID.text="$hourOfDay : $minute"}, hour, min, true)

        timePD.show()
    }
}
