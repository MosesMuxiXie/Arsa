/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class adn
extends Record
implements aay<adb> {
    private final ccz b;
    private final boolean c;
    public static final aao<ByteBuf, adn> a = aao.a(ccz.f, adn::b, aam.b, adn::e, adn::new);

    public adn(ccz $$0, boolean $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<adn> a() {
        return ahz.l;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{adn.class, "difficulty;locked", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{adn.class, "difficulty;locked", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{adn.class, "difficulty;locked", "b", "c"}, this, $$0);
    }

    public ccz b() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }
}

