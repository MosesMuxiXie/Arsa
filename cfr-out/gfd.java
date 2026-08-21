/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class gfd
extends Record {
    private final int a;
    private final @Nullable a b;
    private final @Nullable yh c;
    private final @Nullable String d;
    private static final yh e = yh.c("chat.tag.system");
    private static final yh f = yh.c("chat.tag.system_single_player");
    private static final yh g = yh.c("chat.tag.not_secure");
    private static final yh h = yh.c("chat.tag.modified");
    private static final yh i = yh.c("chat.tag.error");
    private static final int j = 0xD0D0D0;
    private static final int k = 0x606060;
    private static final gfd l = new gfd(0xD0D0D0, null, e, "System");
    private static final gfd m = new gfd(0xD0D0D0, null, f, "System");
    private static final gfd n = new gfd(0xD0D0D0, null, g, "Not Secure");
    private static final gfd o = new gfd(0xFF5555, null, i, "Chat Error");

    public gfd(int $$0, @Nullable a $$1, @Nullable yh $$2, @Nullable String $$3) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
    }

    public static gfd a() {
        return l;
    }

    public static gfd b() {
        return m;
    }

    public static gfd c() {
        return n;
    }

    public static gfd a(String $$0) {
        yw $$1 = yh.b($$0).a(l.h);
        yw $$2 = yh.i().b(h).b(yg.u).b($$1);
        return new gfd(0x606060, gfd$a.a, $$2, "Modified");
    }

    public static gfd d() {
        return o;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gfd.class, "indicatorColor;icon;text;logTag", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gfd.class, "indicatorColor;icon;text;logTag", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gfd.class, "indicatorColor;icon;text;logTag", "a", "b", "c", "d"}, this, $$0);
    }

    public int e() {
        return this.a;
    }

    public @Nullable a f() {
        return this.b;
    }

    public @Nullable yh g() {
        return this.c;
    }

    public @Nullable String h() {
        return this.d;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(amo.b("icon/chat_modified"), 9, 9);
        public final amo b;
        public final int c;
        public final int d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(amo $$0, int $$1, int $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public void a(gir $$0, int $$1, int $$2) {
            $$0.a(hpa.at, this.b, $$1, $$2, this.c, this.d);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a};
        }

        static {
            e = gfd$a.a();
        }
    }
}

