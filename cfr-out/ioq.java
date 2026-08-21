/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.hash.HashCode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class ioq {
    private final ion a;
    final ioo b;
    private final iop c;
    private final Runnable d;
    private c e;
    final List<e> f = new ArrayList<e>();

    public ioq(ion $$0, ioo $$1, iop $$2, Runnable $$3, c $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }

    void f() {
        this.d.run();
    }

    private void b(UUID $$0) {
        for (e $$1 : this.f) {
            if (!$$1.a.equals($$0)) continue;
            $$1.a(ioq$d.f);
        }
    }

    public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
        if (this.e == ioq$c.c) {
            this.b.a($$0, ioo.a.a);
            return;
        }
        this.a($$0, new e($$0, $$1, $$2));
    }

    /*
     * WARNING - void declaration
     */
    public void a(UUID $$0, Path $$1) {
        void $$4;
        if (this.e == ioq$c.c) {
            this.b.a($$0, ioo.a.a);
            return;
        }
        try {
            URL $$2 = $$1.toUri().toURL();
        }
        catch (MalformedURLException $$3) {
            throw new IllegalStateException("Can't convert path to URL " + String.valueOf($$1), $$3);
        }
        e $$5 = new e($$0, (URL)$$4, null);
        $$5.f = ioq$b.c;
        $$5.d = $$1;
        this.a($$0, $$5);
    }

    private void a(UUID $$0, e $$1) {
        this.b($$0);
        this.f.add($$1);
        if (this.e == ioq$c.b) {
            this.a($$1);
        }
        this.f();
    }

    private void a(e $$0) {
        this.b.a($$0.a, ioo.b.a);
        $$0.h = true;
    }

    private @Nullable e c(UUID $$0) {
        for (e $$1 : this.f) {
            if ($$1.a() || !$$1.a.equals($$0)) continue;
            return $$1;
        }
        return null;
    }

    public void a(UUID $$0) {
        e $$1 = this.c($$0);
        if ($$1 != null) {
            $$1.a(ioq$d.e);
            this.f();
        }
    }

    public void a() {
        for (e $$0 : this.f) {
            $$0.a(ioq$d.e);
        }
        this.f();
    }

    public void b() {
        this.e = ioq$c.b;
        for (e $$0 : this.f) {
            if ($$0.h || $$0.a()) continue;
            this.a($$0);
        }
        this.f();
    }

    public void c() {
        this.e = ioq$c.c;
        for (e $$0 : this.f) {
            if ($$0.h) continue;
            $$0.a(ioq$d.c);
        }
        this.f();
    }

    public void d() {
        this.e = ioq$c.a;
    }

    public void e() {
        boolean $$0 = this.h();
        if (!$$0) {
            this.i();
        }
        this.g();
    }

    private void g() {
        this.f.removeIf($$0 -> {
            if ($$0.g != ioq$a.a) {
                return false;
            }
            if ($$0.e != null) {
                ioo.a $$1 = $$0.e.g;
                if ($$1 != null) {
                    this.b.a($$0.a, $$1);
                }
                return true;
            }
            return false;
        });
    }

    private void a(Collection<e> $$0, azg.b $$1) {
        if (!$$1.b().isEmpty()) {
            for (e $$2 : this.f) {
                if ($$2.g == ioq$a.c) continue;
                if ($$1.b().contains($$2.a)) {
                    $$2.a(ioq$d.a);
                    continue;
                }
                $$2.a(ioq$d.d);
            }
        }
        for (e $$3 : $$0) {
            Path $$4 = $$1.a().get($$3.a);
            if ($$4 == null) continue;
            $$3.f = ioq$b.c;
            $$3.d = $$4;
            if ($$3.a()) continue;
            this.b.a($$3.a, ioo.b.b);
        }
        this.f();
    }

    private boolean h() {
        ArrayList<e> $$0 = new ArrayList<e>();
        boolean $$12 = false;
        for (e $$2 : this.f) {
            if ($$2.a() || !$$2.h) continue;
            if ($$2.f != ioq$b.c) {
                $$12 = true;
            }
            if ($$2.f != ioq$b.a) continue;
            $$2.f = ioq$b.b;
            $$0.add($$2);
        }
        if (!$$0.isEmpty()) {
            HashMap<UUID, azg.c> $$3 = new HashMap<UUID, azg.c>();
            for (e $$4 : $$0) {
                $$3.put($$4.a, new azg.c($$4.b, $$4.c));
            }
            this.a.a($$3, (azg.b $$1) -> this.a((Collection<e>)$$0, (azg.b)$$1));
        }
        return $$12;
    }

    private void i() {
        boolean $$0 = false;
        final ArrayList<e> $$1 = new ArrayList<e>();
        final ArrayList<e> $$2 = new ArrayList<e>();
        for (e $$3 : this.f) {
            boolean $$4;
            if ($$3.g == ioq$a.b) {
                return;
            }
            boolean bl2 = $$4 = $$3.h && $$3.f == ioq$b.c && !$$3.a();
            if ($$4 && $$3.g == ioq$a.a) {
                $$1.add($$3);
                $$0 = true;
            }
            if ($$3.g != ioq$a.c) continue;
            if (!$$4) {
                $$0 = true;
                $$2.add($$3);
                continue;
            }
            $$1.add($$3);
        }
        if ($$0) {
            for (e $$5 : $$1) {
                if ($$5.g == ioq$a.c) continue;
                $$5.g = ioq$a.b;
            }
            for (e $$6 : $$2) {
                $$6.g = ioq$a.b;
            }
            this.c.scheduleReload(new iop.a(){

                @Override
                public void a() {
                    for (e $$0 : $$1) {
                        $$0.g = ioq$a.c;
                        if ($$0.e != null) continue;
                        ioq.this.b.a($$0.a, ioo.a.b);
                    }
                    for (e $$12 : $$2) {
                        $$12.g = ioq$a.a;
                    }
                    ioq.this.f();
                }

                @Override
                public void a(boolean $$0) {
                    if (!$$0) {
                        $$1.clear();
                        for (e $$12 : ioq.this.f) {
                            switch ($$12.g.ordinal()) {
                                case 2: {
                                    $$1.add($$12);
                                    break;
                                }
                                case 1: {
                                    $$12.g = ioq$a.a;
                                    $$12.a(ioq$d.b);
                                    break;
                                }
                                case 0: {
                                    $$12.a(ioq$d.d);
                                }
                            }
                        }
                        ioq.this.f();
                    } else {
                        for (e $$22 : ioq.this.f) {
                            if ($$22.g != ioq$a.b) continue;
                            $$22.g = ioq$a.a;
                        }
                    }
                }

                @Override
                public List<iop.b> b() {
                    return $$1.stream().map($$0 -> new iop.b($$0.a, $$0.d)).toList();
                }
            });
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = ioq$c.a();
        }
    }

    static class e {
        final UUID a;
        final URL b;
        final @Nullable HashCode c;
        @Nullable Path d;
        @Nullable d e;
        b f = ioq$b.a;
        a g = ioq$a.a;
        boolean h;

        e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(d $$0) {
            if (this.e == null) {
                this.e = $$0;
            }
        }

        public boolean a() {
            return this.e != null;
        }
    }

    static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d(ioo.a.d);
        public static final /* enum */ d b = new d(ioo.a.e);
        public static final /* enum */ d c = new d(ioo.a.a);
        public static final /* enum */ d d = new d(ioo.a.c);
        public static final /* enum */ d e = new d(null);
        public static final /* enum */ d f = new d(null);
        final @Nullable ioo.a g;
        private static final /* synthetic */ d[] h;

        public static d[] values() {
            return (d[])h.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(ioo.a $$0) {
            this.g = $$0;
        }

        private static /* synthetic */ d[] a() {
            return new d[]{a, b, c, d, e, f};
        }

        static {
            h = ioq$d.a();
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = ioq$b.a();
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
            d = ioq$a.a();
        }
    }
}

