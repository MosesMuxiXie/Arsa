/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;

public final class abo
extends Record
implements aay<abg> {
    private final UUID c;
    private final String d;
    private final String e;
    private final boolean f;
    private final Optional<yh> g;
    public static final int a = 40;
    public static final aao<ByteBuf, abo> b = aao.a(jx.g, abo::b, aam.p, abo::e, aam.b(40), abo::f, aam.b, abo::g, yj.f.a(aam::a), abo::h, abo::new);

    public abo(UUID $$0, String $$1, String $$2, boolean $$3, Optional<yh> $$4) {
        if ($$2.length() > 40) {
            throw new IllegalArgumentException("Hash is too long (max 40, was " + $$2.length() + ")");
        }
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    @Override
    public aba<abo> a() {
        return abu.h;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abo.class, "id;url;hash;required;prompt", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abo.class, "id;url;hash;required;prompt", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abo.class, "id;url;hash;required;prompt", "c", "d", "e", "f", "g"}, this, $$0);
    }

    public UUID b() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    public boolean g() {
        return this.f;
    }

    public Optional<yh> h() {
        return this.g;
    }
}

