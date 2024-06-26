package com.example.ckoframesandroid.ui.extension

import android.content.Context
import com.example.ckoframesandroid.ui.utils.PromptUtils
import com.example.ckoframesandroid.ui.utils.PromptUtils.neutralButton


fun Context.showAlertDialog(title: String, message: String) {
    PromptUtils.alertDialog(this) {
        setTitle(title)
        setMessage(message)
        neutralButton {
            it.dismiss()
        }
    }.show()
}