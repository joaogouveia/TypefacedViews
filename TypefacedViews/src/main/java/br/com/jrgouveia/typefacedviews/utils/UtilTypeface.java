package br.com.jrgouveia.typefacedviews.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import br.com.jrgouveia.typefacedviews.R;


public class UtilTypeface {

    public static Map<String, Typeface> typefaceCache = new HashMap<String, Typeface>();

    public static void setTypeface(AttributeSet attrs, TextView textView) {
        Context context = textView.getContext();

        TypedArray values = context.obtainStyledAttributes(attrs, R.styleable.TypefacedTextView);
        String typefaceName = values.getString(R.styleable.TypefacedTextView_typeface);

        if (typefaceCache.containsKey(typefaceName)) {
            textView.setTypeface(typefaceCache.get(typefaceName));
        } else {
            Typeface typeface;
            try {
                typeface = Typeface.createFromAsset(textView.getContext().getAssets(), typefaceName);
            } catch (Exception e) {
                Log.v(context.getString(R.string.app_name), String.format("fonte não encontrada", typefaceName));
                return;
            }

            typefaceCache.put(typefaceName, typeface);
            textView.setTypeface(typeface);
        }

    }

}
