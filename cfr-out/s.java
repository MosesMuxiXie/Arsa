/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringEscapeUtils
 */
import org.apache.commons.lang3.StringEscapeUtils;

public class s
extends RuntimeException {
    public s(String $$0) {
        super(StringEscapeUtils.escapeJava((String)$$0));
    }

    public s(String $$0, Throwable $$1) {
        super(StringEscapeUtils.escapeJava((String)$$0), $$1);
    }
}

