/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class ap {
    private final ad a;
    private final @Nullable ap b;
    private final @Nullable ap c;
    private final int d;
    private final List<ap> e = Lists.newArrayList();
    private ap f;
    private @Nullable ap g;
    private int h;
    private float i;
    private float j;
    private float k;
    private float l;

    public ap(ad $$0, @Nullable ap $$1, @Nullable ap $$2, int $$3, int $$4) {
        if ($$0.a().c().isEmpty()) {
            throw new IllegalArgumentException("Can't position an invisible advancement!");
        }
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.f = this;
        this.h = $$4;
        this.i = -1.0f;
        ap $$5 = null;
        for (ad $$6 : $$0.e()) {
            $$5 = this.a($$6, $$5);
        }
    }

    private @Nullable ap a(ad $$0, @Nullable ap $$1) {
        if ($$0.a().c().isPresent()) {
            $$1 = new ap($$0, this, $$1, this.e.size() + 1, this.h + 1);
            this.e.add($$1);
        } else {
            for (ad $$2 : $$0.e()) {
                $$1 = this.a($$2, $$1);
            }
        }
        return $$1;
    }

    private void a() {
        if (this.e.isEmpty()) {
            this.i = this.c != null ? this.c.i + 1.0f : 0.0f;
            return;
        }
        ap $$0 = null;
        for (ap $$1 : this.e) {
            $$1.a();
            $$0 = $$1.a($$0 == null ? $$1 : $$0);
        }
        this.b();
        float $$2 = (this.e.get((int)0).i + this.e.get((int)(this.e.size() - 1)).i) / 2.0f;
        if (this.c != null) {
            this.i = this.c.i + 1.0f;
            this.j = this.i - $$2;
        } else {
            this.i = $$2;
        }
    }

    private float a(float $$0, int $$1, float $$2) {
        this.i += $$0;
        this.h = $$1;
        if (this.i < $$2) {
            $$2 = this.i;
        }
        for (ap $$3 : this.e) {
            $$2 = $$3.a($$0 + this.j, $$1 + 1, $$2);
        }
        return $$2;
    }

    private void a(float $$0) {
        this.i += $$0;
        for (ap $$1 : this.e) {
            $$1.a($$0);
        }
    }

    private void b() {
        float $$0 = 0.0f;
        float $$1 = 0.0f;
        for (int $$2 = this.e.size() - 1; $$2 >= 0; --$$2) {
            ap $$3 = this.e.get($$2);
            $$3.i += $$0;
            $$3.j += $$0;
            $$0 += $$3.l + ($$1 += $$3.k);
        }
    }

    private @Nullable ap c() {
        if (this.g != null) {
            return this.g;
        }
        if (!this.e.isEmpty()) {
            return this.e.get(0);
        }
        return null;
    }

    private @Nullable ap d() {
        if (this.g != null) {
            return this.g;
        }
        if (!this.e.isEmpty()) {
            return this.e.get(this.e.size() - 1);
        }
        return null;
    }

    private ap a(ap $$0) {
        if (this.c == null) {
            return $$0;
        }
        ap $$1 = this;
        ap $$2 = this;
        ap $$3 = this.c;
        ap $$4 = this.b.e.get(0);
        float $$5 = this.j;
        float $$6 = this.j;
        float $$7 = $$3.j;
        float $$8 = $$4.j;
        while ($$3.d() != null && $$1.c() != null) {
            $$3 = $$3.d();
            $$1 = $$1.c();
            $$4 = $$4.c();
            $$2 = $$2.d();
            $$2.f = this;
            float $$9 = $$3.i + $$7 - ($$1.i + $$5) + 1.0f;
            if ($$9 > 0.0f) {
                $$3.a(this, $$0).a(this, $$9);
                $$5 += $$9;
                $$6 += $$9;
            }
            $$7 += $$3.j;
            $$5 += $$1.j;
            $$8 += $$4.j;
            $$6 += $$2.j;
        }
        if ($$3.d() != null && $$2.d() == null) {
            $$2.g = $$3.d();
            $$2.j += $$7 - $$6;
        } else {
            if ($$1.c() != null && $$4.c() == null) {
                $$4.g = $$1.c();
                $$4.j += $$5 - $$8;
            }
            $$0 = this;
        }
        return $$0;
    }

    private void a(ap $$0, float $$1) {
        float $$2 = $$0.d - this.d;
        if ($$2 != 0.0f) {
            $$0.k -= $$1 / $$2;
            this.k += $$1 / $$2;
        }
        $$0.l += $$1;
        $$0.i += $$1;
        $$0.j += $$1;
    }

    private ap a(ap $$0, ap $$1) {
        if (this.f != null && $$0.b.e.contains(this.f)) {
            return this.f;
        }
        return $$1;
    }

    private void e() {
        this.a.a().c().ifPresent($$0 -> $$0.a(this.h, this.i));
        if (!this.e.isEmpty()) {
            for (ap $$02 : this.e) {
                $$02.e();
            }
        }
    }

    public static void a(ad $$0) {
        if ($$0.a().c().isEmpty()) {
            throw new IllegalArgumentException("Can't position children of an invisible root!");
        }
        ap $$1 = new ap($$0, null, null, 1, 0);
        $$1.a();
        float $$2 = $$1.a(0.0f, 0, $$1.i);
        if ($$2 < 0.0f) {
            $$1.a(-$$2);
        }
        $$1.e();
    }
}

