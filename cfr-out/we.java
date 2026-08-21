/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public class we
implements wd {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 8;
    private static final int c = 64;
    private static final int d = 128;
    private static final l e = l.l;
    private static final l f = l.k;
    private static final l g = l.g;
    private static final l h = l.m;
    private static final Pattern i = Pattern.compile("[A-Za-z0-9._+-]+");
    private static final String j = "[";
    private static final String k = "]";
    private static final String l = ";";
    private static final String m = " ";
    private static final String n = "{";
    private static final String o = "}";
    private static final String p = "\n";
    private static final String q = ": ";
    private static final String r = String.valueOf(',');
    private static final String s = r + "\n";
    private static final String t = r + " ";
    private static final yh u = yh.b("<...>").a(l.h);
    private static final yh v = yh.b("b").a(h);
    private static final yh w = yh.b("s").a(h);
    private static final yh x = yh.b("I").a(h);
    private static final yh y = yh.b("L").a(h);
    private static final yh z = yh.b("f").a(h);
    private static final yh A = yh.b("d").a(h);
    private static final yh B = yh.b("B").a(h);
    private final String C;
    private int D;
    private int E;
    private final yw F = yh.i();

    public we(String $$0) {
        this.C = $$0;
    }

    public yh a(vz $$0) {
        $$0.a(this);
        return this.F;
    }

    @Override
    public void a(vx $$0) {
        String $$1 = vx.b($$0.k());
        String $$2 = $$1.substring(0, 1);
        yw $$3 = yh.b($$1.substring(1, $$1.length() - 1)).a(f);
        this.F.f($$2).b($$3).f($$2);
    }

    @Override
    public void a(ux $$0) {
        this.F.b(yh.b(String.valueOf($$0.n())).a(g)).b(v);
    }

    @Override
    public void a(vs $$0) {
        this.F.b(yh.b(String.valueOf($$0.n())).a(g)).b(w);
    }

    @Override
    public void a(ve $$0) {
        this.F.b(yh.b(String.valueOf($$0.n())).a(g));
    }

    @Override
    public void a(vh $$0) {
        this.F.b(yh.b(String.valueOf($$0.n())).a(g)).b(y);
    }

    @Override
    public void a(vc $$0) {
        this.F.b(yh.b(String.valueOf($$0.n())).a(g)).b(z);
    }

    @Override
    public void a(va $$0) {
        this.F.b(yh.b(String.valueOf($$0.n())).a(g)).b(A);
    }

    @Override
    public void a(uw $$0) {
        this.F.f(j).b(B).f(l);
        byte[] $$1 = $$0.e();
        for (int $$2 = 0; $$2 < $$1.length && $$2 < 128; ++$$2) {
            yw $$3 = yh.b(String.valueOf($$1[$$2])).a(g);
            this.F.f(m).b($$3).b(B);
            if ($$2 == $$1.length - 1) continue;
            this.F.f(r);
        }
        if ($$1.length > 128) {
            this.F.b(u);
        }
        this.F.f(k);
    }

    @Override
    public void a(vd $$0) {
        this.F.f(j).b(x).f(l);
        int[] $$1 = $$0.g();
        for (int $$2 = 0; $$2 < $$1.length && $$2 < 128; ++$$2) {
            this.F.f(m).b(yh.b(String.valueOf($$1[$$2])).a(g));
            if ($$2 == $$1.length - 1) continue;
            this.F.f(r);
        }
        if ($$1.length > 128) {
            this.F.b(u);
        }
        this.F.f(k);
    }

    @Override
    public void a(vg $$0) {
        this.F.f(j).b(y).f(l);
        long[] $$1 = $$0.g();
        for (int $$2 = 0; $$2 < $$1.length && $$2 < 128; ++$$2) {
            yw $$3 = yh.b(String.valueOf($$1[$$2])).a(g);
            this.F.f(m).b($$3).b(y);
            if ($$2 == $$1.length - 1) continue;
            this.F.f(r);
        }
        if ($$1.length > 128) {
            this.F.b(u);
        }
        this.F.f(k);
    }

    private static boolean b(vf $$0) {
        if ($$0.size() >= 8) {
            return false;
        }
        for (vz $$1 : $$0) {
            if ($$1 instanceof vp) continue;
            return true;
        }
        return false;
    }

    @Override
    public void a(vf $$0) {
        if ($$0.isEmpty()) {
            this.F.f("[]");
            return;
        }
        if (this.E >= 64) {
            this.F.f(j).b(u).f(k);
            return;
        }
        if (!we.b($$0)) {
            this.F.f(j);
            for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
                if ($$1 != 0) {
                    this.F.f(t);
                }
                this.a($$0.c($$1), false);
            }
            this.F.f(k);
            return;
        }
        this.F.f(j);
        if (!this.C.isEmpty()) {
            this.F.f(p);
        }
        String $$2 = Strings.repeat((String)this.C, (int)(this.D + 1));
        for (int $$3 = 0; $$3 < $$0.size() && $$3 < 128; ++$$3) {
            this.F.f($$2);
            this.a($$0.c($$3), true);
            if ($$3 == $$0.size() - 1) continue;
            this.F.f(this.C.isEmpty() ? t : s);
        }
        if ($$0.size() > 128) {
            this.F.f($$2).b(u);
        }
        if (!this.C.isEmpty()) {
            this.F.f(p + Strings.repeat((String)this.C, (int)this.D));
        }
        this.F.f(k);
    }

    @Override
    public void a(uz $$0) {
        if ($$0.j()) {
            this.F.f("{}");
            return;
        }
        if (this.E >= 64) {
            this.F.f(n).b(u).f(o);
            return;
        }
        this.F.f(n);
        Collection<String> $$1 = $$0.e();
        if (a.isDebugEnabled()) {
            ArrayList $$2 = Lists.newArrayList($$0.e());
            Collections.sort($$2);
            $$1 = $$2;
        }
        if (!this.C.isEmpty()) {
            this.F.f(p);
        }
        String $$3 = Strings.repeat((String)this.C, (int)(this.D + 1));
        Iterator<String> $$4 = $$1.iterator();
        while ($$4.hasNext()) {
            String $$5 = $$4.next();
            this.F.f($$3).b(we.a($$5)).f(q);
            this.a($$0.a($$5), true);
            if (!$$4.hasNext()) continue;
            this.F.f(this.C.isEmpty() ? t : s);
        }
        if (!this.C.isEmpty()) {
            this.F.f(p + Strings.repeat((String)this.C, (int)this.D));
        }
        this.F.f(o);
    }

    private void a(vz $$0, boolean $$1) {
        if ($$1) {
            ++this.D;
        }
        ++this.E;
        try {
            $$0.a(this);
        }
        finally {
            if ($$1) {
                --this.D;
            }
            --this.E;
        }
    }

    protected static yh a(String $$0) {
        if (i.matcher($$0).matches()) {
            return yh.b($$0).a(e);
        }
        String $$1 = vx.b($$0);
        String $$2 = $$1.substring(0, 1);
        yw $$3 = yh.b($$1.substring(1, $$1.length() - 1)).a(e);
        return yh.b($$2).b($$3).f($$2);
    }

    @Override
    public void a(vb $$0) {
    }
}

