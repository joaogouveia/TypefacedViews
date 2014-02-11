package br.com.jrgouveia.typefacedviews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import br.com.jrgouveia.typefacedviews.utils.UtilTypeface;

public class TypefacedEditTextView extends EditText {

    public TypefacedEditTextView(Context context) {
	super(context);
    }

    public TypefacedEditTextView(Context context, AttributeSet attrs) {
	super(context, attrs);

	if (!isInEditMode()) {
	    UtilTypeface.setTypeface(attrs, this);
	}
    }

    public TypefacedEditTextView(Context context, AttributeSet attrs, int defStyle) {
	super(context, attrs, defStyle);

	if (!isInEditMode()) {
	    UtilTypeface.setTypeface(attrs, this);
	}
    }

}
