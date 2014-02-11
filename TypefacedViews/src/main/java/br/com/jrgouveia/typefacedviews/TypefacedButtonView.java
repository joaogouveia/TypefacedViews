package br.com.jrgouveia.typefacedviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import br.com.jrgouveia.typefacedviews.utils.UtilTypeface;


public class TypefacedButtonView extends Button {

    public TypefacedButtonView(Context context) {
        super(context);
    }

    public TypefacedButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            UtilTypeface.setTypeface(attrs, this);
        }
    }

    public TypefacedButtonView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (!isInEditMode()) {
            UtilTypeface.setTypeface(attrs, this);
        }
    }

}
