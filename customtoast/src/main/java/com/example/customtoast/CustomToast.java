package com.example.customtoast;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.TextView;

public class CustomToast {


    public static void show(Context context, String message) {
        // Create a TextView to hold the message
        TextView textView = new TextView(context);
        textView.setText(message);
        textView.setTextColor(Color.WHITE);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        textView.setGravity(Gravity.CENTER);
        textView.setPadding(dpToPx(context, 16), dpToPx(context, 16), dpToPx(context, 16), dpToPx(context, 16));
        textView.setBackgroundResource(R.drawable.custom_toast_background); // Set background drawable

        // Create a Toast and set the TextView as its view
        android.widget.Toast toast = new android.widget.Toast(context);
        toast.setDuration(android.widget.Toast.LENGTH_SHORT);
        toast.setView(textView);

        // Show the toast
        toast.show();
    }

    // Utility method to convert dp to pixels
    private static int dpToPx(Context context, int dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }


}
