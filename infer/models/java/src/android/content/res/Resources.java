/*
* Copyright (c) 2013- Facebook.
* All rights reserved.
*/

package android.content.res;

import android.util.AttributeSet;

import com.facebook.infer.models.InferUndefined;


public class Resources {


    public final class Theme {
        public TypedArray obtainStyledAttributes(int[] attrs) {
            return new TypedArray(null, attrs, attrs, 1);
        }

        public TypedArray obtainStyledAttributes(int resid, int[] attrs)
                throws NotFoundException {
            if (InferUndefined.boolean_undefined()) {
                throw new NotFoundException();
            }
            return new TypedArray(null, attrs, attrs, 1);
        }

        public TypedArray obtainStyledAttributes(AttributeSet set,
                                                 int[] attrs, int defStyleAttr, int defStyleRes) {
            return new TypedArray(null, attrs, attrs, 1);
        }

    }

    public static class NotFoundException extends RuntimeException {
        public NotFoundException() {
        }

        public NotFoundException(String name) {
            super(name);
        }
    }

    public TypedArray obtainAttributes(AttributeSet set, int[] attrs) {
        return new TypedArray(null, attrs, attrs, 1);
    }

}