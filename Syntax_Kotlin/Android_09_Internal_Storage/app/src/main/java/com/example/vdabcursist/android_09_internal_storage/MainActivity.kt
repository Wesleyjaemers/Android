package com.example.vdabcursist.android_09_internal_storage

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.FileOutputStream
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    var file = "hello_file"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_save_id.setOnClickListener{
            try {
                var fOut:FileOutputStream = openFileOutput(file, Context.MODE_PRIVATE)

                fOut.write(ptext_input_ID.text.toString().toByteArray(Charsets.UTF_8))
                fOut.close()
                Toast.makeText(this, "File saved", Toast.LENGTH_SHORT).show()
            }
            catch (e:Exception){
                e.printStackTrace()
            }
        }

        btn_load_id.setOnClickListener{
            try {
                val fin = openFileInput(file)
                var temp=""
                var bytes:ByteArray = fin.readBytes()

                for (byte in bytes){
                    temp+=byte.toChar()
                }
                tview_result_ID.setText(temp)
                Toast.makeText(this, "File Read", Toast.LENGTH_SHORT).show()
            }
            catch (e:Exception) {
                e.printStackTrace()
            }
            }
    }
}
