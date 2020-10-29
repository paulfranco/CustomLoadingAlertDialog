package co.paulfran.customloadingalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loadingDialog = LoadingDialog(this)

        button.setOnClickListener {
            loadingDialog.startLoadingDialog()
            val handler = Handler()
            handler.postDelayed({
                loadingDialog.dismissDialog()
            }, 3000)

        }

    }
}