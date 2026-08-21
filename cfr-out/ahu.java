/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.buffer.ByteBuf
 */
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ahu
implements aay<adb> {
    public static final aao<xq, ahu> a = aao.a(aam.h, ahu::b, ahu$a.b.a(aam.a()), ahu::e, ahu::new);
    private final int b;
    private final List<a> c;

    public ahu(int $$0, Collection<cio> $$1) {
        this.b = $$0;
        this.c = Lists.newArrayList();
        for (cio $$2 : $$1) {
            this.c.add(new a($$2.a(), $$2.b(), $$2.c()));
        }
    }

    private ahu(int $$0, List<a> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<ahu> a() {
        return ahz.bl;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public int b() {
        return this.b;
    }

    public List<a> e() {
        return this.c;
    }

    public static final class a
    extends Record {
        private final jd<cin> c;
        private final double d;
        private final Collection<ciq> e;
        public static final aao<ByteBuf, ciq> a = aao.a(amo.b, ciq::a, aam.m, ciq::b, ciq.a.e, ciq::c, ciq::new);
        public static final aao<xq, a> b = aao.a(cin.b, a::a, aam.m, a::b, a.a(aam.a(ArrayList::new)), a::c, a::new);

        public a(jd<cin> $$0, double $$1, Collection<ciq> $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "attribute;base;modifiers", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "attribute;base;modifiers", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "attribute;base;modifiers", "c", "d", "e"}, this, $$0);
        }

        public jd<cin> a() {
            return this.c;
        }

        public double b() {
            return this.d;
        }

        public Collection<ciq> c() {
            return this.e;
        }
    }
}

