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

public class efz {
    private final dwo a;
    private final is b;
    private final dzf c;
    private eoh d;
    private final boolean e;
    private final List<is> f = Lists.newArrayList();

    public efz(dwo $$0, is $$1, eoh $$2) {
        this.a = $$0;
        this.b = $$1;
        this.d = $$2;
        this.c = (dzf)$$2.b();
        epl $$3 = $$2.c(this.c.c());
        this.e = this.c.b();
        this.a($$3);
    }

    public List<is> a() {
        return this.f;
    }

    private void a(epl $$0) {
        this.f.clear();
        switch ($$0) {
            case a: {
                this.f.add(this.b.f());
                this.f.add(this.b.g());
                break;
            }
            case b: {
                this.f.add(this.b.h());
                this.f.add(this.b.i());
                break;
            }
            case c: {
                this.f.add(this.b.h());
                this.f.add(this.b.i().d());
                break;
            }
            case d: {
                this.f.add(this.b.h().d());
                this.f.add(this.b.i());
                break;
            }
            case e: {
                this.f.add(this.b.f().d());
                this.f.add(this.b.g());
                break;
            }
            case f: {
                this.f.add(this.b.f());
                this.f.add(this.b.g().d());
                break;
            }
            case g: {
                this.f.add(this.b.i());
                this.f.add(this.b.g());
                break;
            }
            case h: {
                this.f.add(this.b.h());
                this.f.add(this.b.g());
                break;
            }
            case i: {
                this.f.add(this.b.h());
                this.f.add(this.b.f());
                break;
            }
            case j: {
                this.f.add(this.b.i());
                this.f.add(this.b.f());
            }
        }
    }

    private void d() {
        for (int $$0 = 0; $$0 < this.f.size(); ++$$0) {
            efz $$1 = this.b(this.f.get($$0));
            if ($$1 == null || !$$1.a(this)) {
                this.f.remove($$0--);
                continue;
            }
            this.f.set($$0, $$1.b);
        }
    }

    private boolean a(is $$0) {
        return dzf.a(this.a, $$0) || dzf.a(this.a, $$0.d()) || dzf.a(this.a, $$0.e());
    }

    private @Nullable efz b(is $$0) {
        is $$1 = $$0;
        eoh $$2 = this.a.a_($$1);
        if (dzf.h($$2)) {
            return new efz(this.a, $$1, $$2);
        }
        $$1 = $$0.d();
        $$2 = this.a.a_($$1);
        if (dzf.h($$2)) {
            return new efz(this.a, $$1, $$2);
        }
        $$1 = $$0.e();
        $$2 = this.a.a_($$1);
        if (dzf.h($$2)) {
            return new efz(this.a, $$1, $$2);
        }
        return null;
    }

    private boolean a(efz $$0) {
        return this.c($$0.b);
    }

    private boolean c(is $$0) {
        for (int $$1 = 0; $$1 < this.f.size(); ++$$1) {
            is $$2 = this.f.get($$1);
            if ($$2.u() != $$0.u() || $$2.w() != $$0.w()) continue;
            return true;
        }
        return false;
    }

    protected int b() {
        int $$0 = 0;
        for (iz $$1 : iz.c.a) {
            if (!this.a(this.b.a($$1))) continue;
            ++$$0;
        }
        return $$0;
    }

    private boolean b(efz $$0) {
        return this.a($$0) || this.f.size() != 2;
    }

    private void c(efz $$0) {
        this.f.add($$0.b);
        is $$1 = this.b.f();
        is $$2 = this.b.g();
        is $$3 = this.b.h();
        is $$4 = this.b.i();
        boolean $$5 = this.c($$1);
        boolean $$6 = this.c($$2);
        boolean $$7 = this.c($$3);
        boolean $$8 = this.c($$4);
        epl $$9 = null;
        if ($$5 || $$6) {
            $$9 = epl.a;
        }
        if ($$7 || $$8) {
            $$9 = epl.b;
        }
        if (!this.e) {
            if ($$6 && $$8 && !$$5 && !$$7) {
                $$9 = epl.g;
            }
            if ($$6 && $$7 && !$$5 && !$$8) {
                $$9 = epl.h;
            }
            if ($$5 && $$7 && !$$6 && !$$8) {
                $$9 = epl.i;
            }
            if ($$5 && $$8 && !$$6 && !$$7) {
                $$9 = epl.j;
            }
        }
        if ($$9 == epl.a) {
            if (dzf.a(this.a, $$1.d())) {
                $$9 = epl.e;
            }
            if (dzf.a(this.a, $$2.d())) {
                $$9 = epl.f;
            }
        }
        if ($$9 == epl.b) {
            if (dzf.a(this.a, $$4.d())) {
                $$9 = epl.c;
            }
            if (dzf.a(this.a, $$3.d())) {
                $$9 = epl.d;
            }
        }
        if ($$9 == null) {
            $$9 = epl.a;
        }
        this.d = (eoh)this.d.b(this.c.c(), $$9);
        this.a.a(this.b, this.d, 3);
    }

    private boolean d(is $$0) {
        efz $$1 = this.b($$0);
        if ($$1 == null) {
            return false;
        }
        $$1.d();
        return $$1.b(this);
    }

    public efz a(boolean $$0, boolean $$1, epl $$2) {
        boolean $$17;
        boolean $$13;
        is $$3 = this.b.f();
        is $$4 = this.b.g();
        is $$5 = this.b.h();
        is $$6 = this.b.i();
        boolean $$7 = this.d($$3);
        boolean $$8 = this.d($$4);
        boolean $$9 = this.d($$5);
        boolean $$10 = this.d($$6);
        epl $$11 = null;
        boolean $$12 = $$7 || $$8;
        boolean bl2 = $$13 = $$9 || $$10;
        if ($$12 && !$$13) {
            $$11 = epl.a;
        }
        if ($$13 && !$$12) {
            $$11 = epl.b;
        }
        boolean $$14 = $$8 && $$10;
        boolean $$15 = $$8 && $$9;
        boolean $$16 = $$7 && $$10;
        boolean bl3 = $$17 = $$7 && $$9;
        if (!this.e) {
            if ($$14 && !$$7 && !$$9) {
                $$11 = epl.g;
            }
            if ($$15 && !$$7 && !$$10) {
                $$11 = epl.h;
            }
            if ($$17 && !$$8 && !$$10) {
                $$11 = epl.i;
            }
            if ($$16 && !$$8 && !$$9) {
                $$11 = epl.j;
            }
        }
        if ($$11 == null) {
            if ($$12 && $$13) {
                $$11 = $$2;
            } else if ($$12) {
                $$11 = epl.a;
            } else if ($$13) {
                $$11 = epl.b;
            }
            if (!this.e) {
                if ($$0) {
                    if ($$14) {
                        $$11 = epl.g;
                    }
                    if ($$15) {
                        $$11 = epl.h;
                    }
                    if ($$16) {
                        $$11 = epl.j;
                    }
                    if ($$17) {
                        $$11 = epl.i;
                    }
                } else {
                    if ($$17) {
                        $$11 = epl.i;
                    }
                    if ($$16) {
                        $$11 = epl.j;
                    }
                    if ($$15) {
                        $$11 = epl.h;
                    }
                    if ($$14) {
                        $$11 = epl.g;
                    }
                }
            }
        }
        if ($$11 == epl.a) {
            if (dzf.a(this.a, $$3.d())) {
                $$11 = epl.e;
            }
            if (dzf.a(this.a, $$4.d())) {
                $$11 = epl.f;
            }
        }
        if ($$11 == epl.b) {
            if (dzf.a(this.a, $$6.d())) {
                $$11 = epl.c;
            }
            if (dzf.a(this.a, $$5.d())) {
                $$11 = epl.d;
            }
        }
        if ($$11 == null) {
            $$11 = $$2;
        }
        this.a($$11);
        this.d = (eoh)this.d.b(this.c.c(), $$11);
        if ($$1 || this.a.a_(this.b) != this.d) {
            this.a.a(this.b, this.d, 3);
            for (int $$18 = 0; $$18 < this.f.size(); ++$$18) {
                efz $$19 = this.b(this.f.get($$18));
                if ($$19 == null) continue;
                $$19.d();
                if (!$$19.b(this)) continue;
                $$19.c(this);
            }
        }
        return this;
    }

    public eoh c() {
        return this.d;
    }
}

