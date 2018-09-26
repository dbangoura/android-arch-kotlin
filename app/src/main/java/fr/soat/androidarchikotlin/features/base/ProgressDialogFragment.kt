package fr.soat.androidarchikotlin.features.base

import android.app.Dialog
import android.app.ProgressDialog
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.WindowManager
import fr.soat.androidarchikotlin.R


class ProgressDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val progressDialog = ProgressDialog(activity)

        try {
            progressDialog.show()
        } catch (e: WindowManager.BadTokenException) {

        }

        progressDialog.setCancelable(false)
        progressDialog.window!!.setBackgroundDrawable(ColorDrawable(android.graphics.Color.TRANSPARENT))
        progressDialog.setContentView(R.layout.progress_dialog)

        return progressDialog
    }

    companion object {

        val TAG = "ProgressDialogFragment"

        fun newInstance(): ProgressDialogFragment {
            return ProgressDialogFragment()
        }
    }
}