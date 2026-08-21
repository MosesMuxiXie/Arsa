/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class auo {
    private final ayx a;
    private final aum b;
    private final aup c;
    private final auy d;
    private final aut e;
    private final auv f;
    private final ava g;
    private final avc h;
    private final aur i;

    public auo(ayx $$0, aum $$1, aup $$2, auy $$3, aut $$4, auv $$5, ava $$6, avc $$7, aur $$8) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
        this.h = $$7;
        this.i = $$8;
    }

    public <V> CompletableFuture<V> a(Supplier<V> $$0) {
        return this.i.a($$0);
    }

    public CompletableFuture<Void> a(Runnable $$0) {
        return this.i.a($$0);
    }

    public aum a() {
        return this.b;
    }

    public aup b() {
        return this.c;
    }

    public auy c() {
        return this.d;
    }

    public aut d() {
        return this.e;
    }

    public auv e() {
        return this.f;
    }

    public ava f() {
        return this.g;
    }

    public avc g() {
        return this.h;
    }

    public ayx h() {
        return this.a;
    }

    public static auo a(ary $$0) {
        atw $$1 = new atw();
        aun $$2 = new aun($$0, $$1);
        auq $$3 = new auq($$0, $$1);
        auz $$4 = new auz($$0, $$1);
        auu $$5 = new auu($$0, $$1);
        auw $$6 = new auw($$0, $$1);
        avb $$7 = new avb($$0, $$1);
        avd $$8 = new avd($$0, $$1);
        aus $$9 = new aus($$0);
        return new auo($$0.C(), $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
    }
}

