/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class eoc {
    public static final int a = 12;
    private final dwo b;
    private final is c;
    private final boolean d;
    private final is e;
    private final iz f;
    private final List<is> g = Lists.newArrayList();
    private final List<is> h = Lists.newArrayList();
    private final iz i;

    public eoc(dwo $$0, is $$1, iz $$2, boolean $$3) {
        this.b = $$0;
        this.c = $$1;
        this.i = $$2;
        this.d = $$3;
        if ($$3) {
            this.f = $$2;
            this.e = $$1.a($$2);
        } else {
            this.f = $$2.g();
            this.e = $$1.a($$2, 2);
        }
    }

    public boolean a() {
        this.g.clear();
        this.h.clear();
        eoh $$0 = this.b.a_(this.e);
        if (!eny.a($$0, this.b, this.e, this.f, false, this.i)) {
            if (this.d && $$0.r() == flg.b) {
                this.h.add(this.e);
                return true;
            }
            return false;
        }
        if (!this.a(this.e, this.f)) {
            return false;
        }
        for (int $$1 = 0; $$1 < this.g.size(); ++$$1) {
            is $$2 = this.g.get($$1);
            if (!eoc.a(this.b.a_($$2)) || this.a($$2)) continue;
            return false;
        }
        return true;
    }

    private static boolean a(eoh $$0) {
        return $$0.a(dzs.iN) || $$0.a(dzs.qg);
    }

    private static boolean a(eoh $$0, eoh $$1) {
        if ($$0.a(dzs.qg) && $$1.a(dzs.iN)) {
            return false;
        }
        if ($$0.a(dzs.iN) && $$1.a(dzs.qg)) {
            return false;
        }
        return eoc.a($$0) || eoc.a($$1);
    }

    private boolean a(is $$0, iz $$1) {
        eoh $$2 = this.b.a_($$0);
        if ($$2.l()) {
            return true;
        }
        if (!eny.a($$2, this.b, $$0, this.f, false, $$1)) {
            return true;
        }
        if ($$0.equals(this.c)) {
            return true;
        }
        if (this.g.contains($$0)) {
            return true;
        }
        int $$3 = 1;
        if ($$3 + this.g.size() > 12) {
            return false;
        }
        while (eoc.a($$2)) {
            is $$4 = $$0.a(this.f.g(), $$3);
            eoh $$5 = $$2;
            $$2 = this.b.a_($$4);
            if ($$2.l() || !eoc.a($$5, $$2) || !eny.a($$2, this.b, $$4, this.f, false, this.f.g()) || $$4.equals(this.c)) break;
            if (++$$3 + this.g.size() <= 12) continue;
            return false;
        }
        int $$6 = 0;
        for (int $$7 = $$3 - 1; $$7 >= 0; --$$7) {
            this.g.add($$0.a(this.f.g(), $$7));
            ++$$6;
        }
        int $$8 = 1;
        while (true) {
            is $$9;
            int $$10;
            if (($$10 = this.g.indexOf($$9 = $$0.a(this.f, $$8))) > -1) {
                this.a($$6, $$10);
                for (int $$11 = 0; $$11 <= $$10 + $$6; ++$$11) {
                    is $$12 = this.g.get($$11);
                    if (!eoc.a(this.b.a_($$12)) || this.a($$12)) continue;
                    return false;
                }
                return true;
            }
            $$2 = this.b.a_($$9);
            if ($$2.l()) {
                return true;
            }
            if (!eny.a($$2, this.b, $$9, this.f, true, this.f) || $$9.equals(this.c)) {
                return false;
            }
            if ($$2.r() == flg.b) {
                this.h.add($$9);
                return true;
            }
            if (this.g.size() >= 12) {
                return false;
            }
            this.g.add($$9);
            ++$$6;
            ++$$8;
        }
    }

    private void a(int $$0, int $$1) {
        ArrayList $$2 = Lists.newArrayList();
        ArrayList $$3 = Lists.newArrayList();
        ArrayList $$4 = Lists.newArrayList();
        $$2.addAll(this.g.subList(0, $$1));
        $$3.addAll(this.g.subList(this.g.size() - $$0, this.g.size()));
        $$4.addAll(this.g.subList($$1, this.g.size() - $$0));
        this.g.clear();
        this.g.addAll($$2);
        this.g.addAll($$3);
        this.g.addAll($$4);
    }

    private boolean a(is $$0) {
        eoh $$1 = this.b.a_($$0);
        for (iz $$2 : iz.values()) {
            is $$3;
            eoh $$4;
            if ($$2.o() == this.f.o() || !eoc.a($$4 = this.b.a_($$3 = $$0.a($$2)), $$1) || this.a($$3, $$2)) continue;
            return false;
        }
        return true;
    }

    public iz b() {
        return this.f;
    }

    public List<is> c() {
        return this.g;
    }

    public List<is> d() {
        return this.h;
    }
}

