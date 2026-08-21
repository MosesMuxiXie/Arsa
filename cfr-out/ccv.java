/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public interface ccv
extends cct,
cid,
Iterable<dlt> {
    public static final float s_ = 4.0f;

    public int b();

    public boolean c();

    public dlt a(int var1);

    public dlt a(int var1, int var2);

    public dlt b(int var1);

    public void a(int var1, dlt var2);

    default public int ap_() {
        return 99;
    }

    default public int f_(dlt $$0) {
        return Math.min(this.ap_(), $$0.k());
    }

    public void e();

    public boolean a(ddm var1);

    default public void a(cgd $$0) {
    }

    default public void b(cgd $$0) {
    }

    default public List<cgd> am_() {
        return List.of();
    }

    default public boolean b(int $$0, dlt $$1) {
        return true;
    }

    default public boolean a(ccv $$0, int $$1, dlt $$2) {
        return true;
    }

    default public int a_(dlp $$0) {
        int $$1 = 0;
        for (dlt $$2 : this) {
            if (!$$2.h().equals($$0)) continue;
            $$1 += $$2.N();
        }
        return $$1;
    }

    default public boolean a(Set<dlp> $$0) {
        return this.a_((dlt $$1) -> !$$1.f() && $$0.contains($$1.h()));
    }

    default public boolean a_(Predicate<dlt> $$0) {
        for (dlt $$1 : this) {
            if (!$$0.test($$1)) continue;
            return true;
        }
        return false;
    }

    public static boolean a(elb $$0, ddm $$1) {
        return ccv.a($$0, $$1, 4.0f);
    }

    public static boolean a(elb $$0, ddm $$1, float $$2) {
        dwo $$3 = $$0.j();
        is $$4 = $$0.aD_();
        if ($$3 == null) {
            return false;
        }
        if ($$3.c_($$4) != $$0) {
            return false;
        }
        return $$1.a($$4, (double)$$2);
    }

    @Override
    default public @Nullable cic a_(final int $$0) {
        if ($$0 < 0 || $$0 >= this.b()) {
            return null;
        }
        return new cic(){

            @Override
            public dlt a() {
                return ccv.this.a($$0);
            }

            @Override
            public boolean a(dlt $$02) {
                ccv.this.a($$0, $$02);
                return true;
            }
        };
    }

    @Override
    default public Iterator<dlt> iterator() {
        return new a(this);
    }

    public static class a
    implements Iterator<dlt> {
        private final ccv a;
        private int b;
        private final int c;

        public a(ccv $$0) {
            this.a = $$0;
            this.c = $$0.b();
        }

        @Override
        public boolean hasNext() {
            return this.b < this.c;
        }

        public dlt a() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            return this.a.a(this.b++);
        }

        @Override
        public /* synthetic */ Object next() {
            return this.a();
        }
    }
}

