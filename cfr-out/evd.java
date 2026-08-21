/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;

public interface evd {
    default public bgr a(is $$0) {
        return this.a($$0.u(), $$0.v(), $$0.w());
    }

    default public bgr a(amo $$0) {
        return this.a($$0.toString());
    }

    public bgr a(String var1);

    public bgr a(long var1);

    public bgr a(int var1, int var2, int var3);

    @VisibleForTesting
    public void a(StringBuilder var1);
}

