package br.com.jrgouveia.typefacedviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import br.com.jrgouveia.typefacedviews.utils.UtilTypeface;

public class TypefacedTextView extends TextView {

    public TypefacedTextView(Context context) {
	super(context);
    }

    public TypefacedTextView(Context context, AttributeSet attrs) {
	super(context, attrs);

	if (!isInEditMode()) {
	    UtilTypeface.setTypeface(attrs, this);
	}
    }

    public TypefacedTextView(Context context, AttributeSet attrs, int defStyle) {
	super(context, attrs, defStyle);

	if (!isInEditMode()) {
	    UtilTypeface.setTypeface(attrs, this);
	}
    }

}