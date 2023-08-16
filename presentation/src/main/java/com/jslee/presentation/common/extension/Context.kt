package com.jslee.presentation.common.extension

import android.content.Context
import android.widget.Toast

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/16
 */
fun Context.showToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()