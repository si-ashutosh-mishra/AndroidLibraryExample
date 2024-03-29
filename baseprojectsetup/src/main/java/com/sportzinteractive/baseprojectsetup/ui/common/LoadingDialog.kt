package com.sportzinteractive.baseprojectsetup.ui.common


import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.WindowManager
import com.sportzinteractive.baseprojectsetup.R

class LoadingDialog(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        applyStyleOnAlertDialog()
    }

    init {
        setContentView(R.layout.dialog_loader)
        setCancelable(false)
        setCanceledOnTouchOutside(false)
    }

    fun show(show: Boolean) {
        if (show && !isShowing) {
            show()
        } else {
            super.dismiss()
        }
    }

    private fun applyStyleOnAlertDialog() {
        window?.let { window ->
            window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
            window.setDimAmount(0.4f);
            window.setWindowAnimations(R.style.DialogWindowAnimation)
            window.setBackgroundDrawableResource(R.drawable.bg_transparent)
        }
    }

}