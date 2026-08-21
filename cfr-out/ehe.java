/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public interface ehe {
    public epp p(eoh var1);

    public eoh a(eoh var1, epp var2);

    public iz r(eoh var1);

    public boolean s(eoh var1);

    public int d();

    default public List<is> a(dwp $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        if (!this.s($$2)) {
            return List.of();
        }
        c $$3 = this.a($$0, $$1, this.r($$2));
        LinkedList<is> $$4 = new LinkedList<is>();
        $$4.add($$1);
        this.a($$3::a, epp.d, $$4::addFirst);
        this.a($$3::b, epp.b, $$4::addLast);
        return $$4;
    }

    private void a(IntFunction<b> $$0, epp $$1, Consumer<is> $$2) {
        for (int $$3 = 1; $$3 < this.d(); ++$$3) {
            b $$4 = $$0.apply($$3);
            if ($$4.a($$1)) {
                $$2.accept($$4.c());
            }
            if ($$4.b()) break;
        }
    }

    default public void a_(dwp $$0, is $$1, eoh $$2) {
        c $$3 = this.a($$0, $$1, this.r($$2));
        $$3.a().f();
        $$3.b().g();
    }

    default public void a(dwp $$0, is $$1, eoh $$2, eoh $$3) {
        if (!this.s($$2)) {
            return;
        }
        if (this.a($$2, $$3)) {
            return;
        }
        c $$4 = this.a($$0, $$1, this.r($$2));
        epp $$5 = epp.a;
        int $$6 = $$4.a().a() ? this.a($$0, $$4.a().c()).size() : 0;
        int $$7 = $$4.b().a() ? this.a($$0, $$4.b().c()).size() : 0;
        int $$8 = 1;
        if (this.a($$6, $$8)) {
            $$5 = $$5.e();
            $$4.a().d();
            $$8 += $$6;
        }
        if (this.a($$7, $$8)) {
            $$5 = $$5.d();
            $$4.b().e();
        }
        this.a($$0, $$1, $$5);
    }

    private boolean a(int $$0, int $$1) {
        return $$0 > 0 && $$1 + $$0 <= this.d();
    }

    private boolean a(eoh $$0, eoh $$1) {
        boolean $$2 = this.p($$0).a();
        boolean $$3 = this.s($$1) && this.p($$1).a();
        return $$2 || $$3;
    }

    private c a(dwp $$0, is $$1, iz $$2) {
        return new c(this, $$0, $$2, $$1, new HashMap<is, b>());
    }

    default public void a(dwp $$0, is $$1, epp $$2) {
        eoh $$3 = $$0.a_($$1);
        if (this.p($$3) != $$2) {
            $$0.a($$1, this.a($$3, $$2), 3);
        }
    }

    public record c(ehe a, dwp b, iz c, is d, Map<is, b> e) {
        private final ehe a;
        private final dwp b;
        private final iz c;
        private final is d;
        private final Map<is, b> e;

        private boolean a(eoh $$0) {
            return this.a.s($$0) && this.a.r($$0) == this.c;
        }

        private b a(is $$0) {
            eoh $$1 = this.b.a_($$0);
            epp $$2 = this.a($$1) ? this.a.p($$1) : null;
            return $$2 == null ? new a($$0) : new d(this.b, this.a, $$0, $$2);
        }

        private b a(iz $$0, Integer $$1) {
            return this.e.computeIfAbsent(this.d.a($$0, (int)$$1), this::a);
        }

        public b a(int $$0) {
            return this.a(this.c.h(), $$0);
        }

        public b b(int $$0) {
            return this.a(this.c.i(), $$0);
        }

        public b a() {
            return this.a(1);
        }

        public b b() {
            return this.b(1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "block;level;facing;center;cache", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "block;level;facing;center;cache", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "block;level;facing;center;cache", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public ehe c() {
            return this.a;
        }

        public dwp d() {
            return this.b;
        }

        public iz e() {
            return this.c;
        }

        public is f() {
            return this.d;
        }

        public Map<is, b> g() {
            return this.e;
        }
    }

    public static sealed interface b
    permits a, d {
        public is c();

        public boolean a();

        public boolean b();

        public boolean a(epp var1);

        default public void d() {
        }

        default public void e() {
        }

        default public void f() {
        }

        default public void g() {
        }
    }

    public record d(dwp a, ehe b, is c, epp d) implements b
    {
        private final dwp a;
        private final ehe b;
        private final epp d;

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public boolean b() {
            return this.d.b();
        }

        @Override
        public boolean a(epp $$0) {
            return this.d.a($$0);
        }

        @Override
        public void d() {
            this.b.a(this.a, this.c, this.d.d());
        }

        @Override
        public void e() {
            this.b.a(this.a, this.c, this.d.e());
        }

        @Override
        public void f() {
            this.b.a(this.a, this.c, this.d.f());
        }

        @Override
        public void g() {
            this.b.a(this.a, this.c, this.d.g());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "level;block;pos;part", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "level;block;pos;part", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "level;block;pos;part", "a", "b", "c", "d"}, this, $$0);
        }

        public dwp h() {
            return this.a;
        }

        public ehe i() {
            return this.b;
        }

        public epp j() {
            return this.d;
        }
    }

    public record a(is a) implements b
    {
        private final is a;

        @Override
        public boolean a() {
            return false;
        }

        @Override
        public boolean b() {
            return true;
        }

        @Override
        public boolean a(epp $$0) {
            return false;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pos", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pos", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pos", "a"}, this, $$0);
        }

        @Override
        public is c() {
            return this.a;
        }
    }
}

