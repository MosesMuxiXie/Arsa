/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class gka {
    private static final Logger b = LogUtils.getLogger();
    public static final int a = Integer.MAX_VALUE;
    private static final int c = 2;
    private final gio d;
    private final List<a> e = Lists.newArrayList();
    private String f;
    private int g;
    private int h;
    private boolean i;
    private int j = Integer.MAX_VALUE;
    private int k = Integer.MAX_VALUE;
    private final int l;
    private Consumer<String> m = $$0 -> {};
    private Runnable n = () -> {};

    public gka(gio $$02, int $$1) {
        this.d = $$02;
        this.l = $$1;
        this.a("");
    }

    public int a() {
        return this.j;
    }

    public void a(int $$0) {
        if ($$0 < 0) {
            throw new IllegalArgumentException("Character limit cannot be negative");
        }
        this.j = $$0;
    }

    public void b(int $$0) {
        if ($$0 < 0) {
            throw new IllegalArgumentException("Character limit cannot be negative");
        }
        this.k = $$0;
    }

    public boolean b() {
        return this.j != Integer.MAX_VALUE;
    }

    public boolean c() {
        return this.k != Integer.MAX_VALUE;
    }

    public void a(Consumer<String> $$0) {
        this.m = $$0;
    }

    public void a(Runnable $$0) {
        this.n = $$0;
    }

    public void a(String $$0) {
        this.a($$0, false);
    }

    public void a(String $$0, boolean $$1) {
        String $$2 = this.c($$0);
        if (!$$1 && this.e($$2)) {
            return;
        }
        this.f = $$2;
        this.h = this.g = this.f.length();
        this.p();
    }

    public String d() {
        return this.f;
    }

    public void b(String $$0) {
        if ($$0.isEmpty() && !this.k()) {
            return;
        }
        String $$1 = this.d(bhi.a($$0, true));
        a $$2 = this.f();
        String $$3 = new StringBuilder(this.f).replace($$2.a, $$2.b, $$1).toString();
        if (this.e($$3)) {
            return;
        }
        this.f = $$3;
        this.h = this.g = $$2.a + $$1.length();
        this.p();
    }

    public void c(int $$0) {
        if (!this.k()) {
            this.h = bgj.a(this.g + $$0, 0, this.f.length());
        }
        this.b("");
    }

    public int e() {
        return this.g;
    }

    public void a(boolean $$0) {
        this.i = $$0;
    }

    public a f() {
        return new a(Math.min(this.h, this.g), Math.max(this.h, this.g));
    }

    public int g() {
        return this.e.size();
    }

    public int h() {
        for (int $$0 = 0; $$0 < this.e.size(); ++$$0) {
            a $$1 = this.e.get($$0);
            if (this.g < $$1.a || this.g > $$1.b) continue;
            return $$0;
        }
        return -1;
    }

    public a d(int $$0) {
        return this.e.get(bgj.a($$0, 0, this.e.size() - 1));
    }

    public void a(gkt $$0, int $$1) {
        switch ($$0) {
            case a: {
                this.g = $$1;
                break;
            }
            case b: {
                this.g += $$1;
                break;
            }
            case c: {
                this.g = this.f.length() + $$1;
            }
        }
        this.g = bgj.a(this.g, 0, this.f.length());
        this.n.run();
        if (!this.i) {
            this.h = this.g;
        }
    }

    public void e(int $$0) {
        if ($$0 == 0) {
            return;
        }
        int $$1 = this.d.b(this.f.substring(this.o().a, this.g)) + 2;
        a $$2 = this.f($$0);
        int $$3 = this.d.a(this.f.substring($$2.a, $$2.b), $$1).length();
        this.a(gkt.a, $$2.a + $$3);
    }

    public void a(double $$0, double $$1) {
        int $$2 = bgj.c($$0);
        int $$3 = bgj.c($$1 / (double)this.d.b);
        a $$4 = this.e.get(bgj.a($$3, 0, this.e.size() - 1));
        int $$5 = this.d.a(this.f.substring($$4.a, $$4.b), $$2).length();
        this.a(gkt.a, $$4.a + $$5);
    }

    public void i() {
        a $$0 = this.m();
        this.a(gkt.a, $$0.a);
        this.a(true);
        this.a(gkt.a, $$0.b);
    }

    public boolean a(gzb $$0) {
        this.i = $$0.m();
        if ($$0.p()) {
            this.g = this.f.length();
            this.h = 0;
            return true;
        }
        if ($$0.q()) {
            gfj.V().o.a(this.l());
            return true;
        }
        if ($$0.r()) {
            this.b(gfj.V().o.a());
            return true;
        }
        if ($$0.s()) {
            gfj.V().o.a(this.l());
            this.b("");
            return true;
        }
        switch ($$0.t()) {
            case 263: {
                if ($$0.o()) {
                    a $$1 = this.m();
                    this.a(gkt.a, $$1.a);
                } else {
                    this.a(gkt.b, -1);
                }
                return true;
            }
            case 262: {
                if ($$0.o()) {
                    a $$2 = this.n();
                    this.a(gkt.a, $$2.a);
                } else {
                    this.a(gkt.b, 1);
                }
                return true;
            }
            case 265: {
                if (!$$0.o()) {
                    this.e(-1);
                }
                return true;
            }
            case 264: {
                if (!$$0.o()) {
                    this.e(1);
                }
                return true;
            }
            case 266: {
                this.a(gkt.a, 0);
                return true;
            }
            case 267: {
                this.a(gkt.c, 0);
                return true;
            }
            case 268: {
                if ($$0.o()) {
                    this.a(gkt.a, 0);
                } else {
                    this.a(gkt.a, this.o().a);
                }
                return true;
            }
            case 269: {
                if ($$0.o()) {
                    this.a(gkt.c, 0);
                } else {
                    this.a(gkt.a, this.o().b);
                }
                return true;
            }
            case 259: {
                if ($$0.o()) {
                    a $$3 = this.m();
                    this.c($$3.a - this.g);
                } else {
                    this.c(-1);
                }
                return true;
            }
            case 261: {
                if ($$0.o()) {
                    a $$4 = this.n();
                    this.c($$4.a - this.g);
                } else {
                    this.c(1);
                }
                return true;
            }
            case 257: 
            case 335: {
                this.b("\n");
                return true;
            }
        }
        return false;
    }

    public Iterable<a> j() {
        return this.e;
    }

    public boolean k() {
        return this.h != this.g;
    }

    @VisibleForTesting
    public String l() {
        a $$0 = this.f();
        return this.f.substring($$0.a, $$0.b);
    }

    private a o() {
        return this.f(0);
    }

    private a f(int $$0) {
        int $$1 = this.h();
        if ($$1 < 0) {
            b.error("Cursor is not within text (cursor = {}, length = {})", (Object)this.g, (Object)this.f.length());
            return this.e.getLast();
        }
        return this.e.get(bgj.a($$1 + $$0, 0, this.e.size() - 1));
    }

    @VisibleForTesting
    public a m() {
        int $$0;
        if (this.f.isEmpty()) {
            return gka$a.c;
        }
        for ($$0 = bgj.a(this.g, 0, this.f.length() - 1); $$0 > 0 && Character.isWhitespace(this.f.charAt($$0 - 1)); --$$0) {
        }
        while ($$0 > 0 && !Character.isWhitespace(this.f.charAt($$0 - 1))) {
            --$$0;
        }
        return new a($$0, this.g($$0));
    }

    @VisibleForTesting
    public a n() {
        int $$0;
        if (this.f.isEmpty()) {
            return gka$a.c;
        }
        for ($$0 = bgj.a(this.g, 0, this.f.length() - 1); $$0 < this.f.length() && !Character.isWhitespace(this.f.charAt($$0)); ++$$0) {
        }
        while ($$0 < this.f.length() && Character.isWhitespace(this.f.charAt($$0))) {
            ++$$0;
        }
        return new a($$0, this.g($$0));
    }

    private int g(int $$0) {
        int $$1;
        for ($$1 = $$0; $$1 < this.f.length() && !Character.isWhitespace(this.f.charAt($$1)); ++$$1) {
        }
        return $$1;
    }

    private void p() {
        this.q();
        this.m.accept(this.f);
        this.n.run();
    }

    private void q() {
        this.e.clear();
        if (this.f.isEmpty()) {
            this.e.add(gka$a.c);
            return;
        }
        this.d.b().a(this.f, this.l, zf.a, false, ($$0, $$1, $$2) -> this.e.add(new a($$1, $$2)));
        if (this.f.charAt(this.f.length() - 1) == '\n') {
            this.e.add(new a(this.f.length(), this.f.length()));
        }
    }

    private String c(String $$0) {
        if (this.b()) {
            return bhi.a($$0, this.j, false);
        }
        return $$0;
    }

    private String d(String $$0) {
        String $$1 = $$0;
        if (this.b()) {
            int $$2 = this.j - this.f.length();
            $$1 = bhi.a($$0, $$2, false);
        }
        return $$1;
    }

    private boolean e(String $$0) {
        return this.c() && this.d.b().e($$0, this.l, zf.a).size() + (bhi.d($$0) ? 1 : 0) > this.k;
    }

    protected static final class a
    extends Record {
        final int a;
        final int b;
        static final a c = new a(0, 0);

        protected a(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "beginIndex;endIndex", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "beginIndex;endIndex", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "beginIndex;endIndex", "a", "b"}, this, $$0);
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }
}

