/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 */
import com.mojang.datafixers.DataFixUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public interface xa {
    public static final xa a = new xa(){

        public String toString() {
            return "<empty>";
        }

        @Override
        public boolean a(dlt $$0, wz.a $$1) {
            return $$0.f();
        }
    };
    public static final aao<xq, xa> b = aam.a(xa$a.c).a((? super V $$0) -> (xa)DataFixUtils.orElse((Optional)$$0, (Object)a), (? super O $$0) -> {
        Optional<Object> optional;
        if ($$0 instanceof a) {
            a $$1 = (a)$$0;
            optional = Optional.of($$1);
        } else {
            optional = Optional.empty();
        }
        return optional;
    });

    public boolean a(dlt var1, wz.a var2);

    public static xa b(dlt $$0, wz.a $$1) {
        if ($$0.f()) {
            return a;
        }
        return new a($$0.i(), $$0.N(), wz.a($$0.d(), $$1));
    }

    public static final class a
    extends Record
    implements xa {
        private final jd<dlp> d;
        private final int e;
        private final wz f;
        public static final aao<xq, a> c = aao.a(aam.b(mj.R), a::a, aam.h, a::b, wz.a, a::c, a::new);

        public a(jd<dlp> $$0, int $$1, wz $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
        }

        @Override
        public boolean a(dlt $$0, wz.a $$1) {
            if (this.e != $$0.N()) {
                return false;
            }
            if (!this.d.equals($$0.i())) {
                return false;
            }
            return this.f.b($$0.d(), $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "item;count;components", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "item;count;components", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "item;count;components", "d", "e", "f"}, this, $$0);
        }

        public jd<dlp> a() {
            return this.d;
        }

        public int b() {
            return this.e;
        }

        public wz c() {
            return this.f;
        }
    }
}

