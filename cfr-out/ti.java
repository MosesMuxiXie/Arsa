/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ti {
    public static final ti a = new ti();
    private static final Logger b = LogUtils.getLogger();
    private final Collection<ta> c = Lists.newCopyOnWriteArrayList();
    private @Nullable tf d;
    private a e = ti$a.a;

    private ti() {
    }

    public void a(ta $$0) {
        this.c.add($$0);
    }

    public void a() {
        if (this.e != ti$a.a) {
            this.e = ti$a.c;
            return;
        }
        this.c.clear();
        if (this.d != null) {
            this.d.c();
            this.d = null;
        }
    }

    public void a(tf $$0) {
        if (this.d != null) {
            bhs.b("The runner was already set in GameTestTicker");
        }
        this.d = $$0;
    }

    public void b() {
        if (this.d == null) {
            return;
        }
        this.e = ti$a.b;
        this.c.forEach($$0 -> $$0.a(this.d));
        this.c.removeIf(ta::k);
        a $$02 = this.e;
        this.e = ti$a.a;
        if ($$02 == ti$a.c) {
            this.a();
        }
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = ti$a.a();
        }
    }
}

