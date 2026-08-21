/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
import com.google.common.base.MoreObjects;
import java.util.List;

public class gyt {
    public static final int a = -1;
    private final List<gyr> b;
    private final int c;

    public gyt(List<gyr> $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public gyr a(int $$0) {
        if ($$0 < 0 || $$0 >= this.b.size()) {
            return gyp.a;
        }
        return (gyr)MoreObjects.firstNonNull((Object)this.b.get($$0), (Object)gyp.a);
    }

    public int a() {
        return this.c;
    }
}

