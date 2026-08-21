/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record gf(double b, double c, double d) implements ge
{
    private final double b;
    private final double c;
    private final double d;
    public static final char a = '^';

    @Override
    public ftm a(ed $$0) {
        ftm $$1 = $$0.n().a($$0);
        return ftm.a($$0.l(), new ftm(this.b, this.c, this.d)).b($$1.g, $$1.h, $$1.i);
    }

    @Override
    public ftl b(ed $$0) {
        return ftl.a;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    public static gf a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        double $$2 = gf.a($$0, $$1);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$1);
            throw gj.a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        double $$3 = gf.a($$0, $$1);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$1);
            throw gj.a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        double $$4 = gf.a($$0, $$1);
        return new gf($$2, $$3, $$4);
    }

    private static double a(StringReader $$0, int $$1) throws CommandSyntaxException {
        if (!$$0.canRead()) {
            throw gk.a.createWithContext((ImmutableStringReader)$$0);
        }
        if ($$0.peek() != '^') {
            $$0.setCursor($$1);
            throw gj.b.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        return $$0.canRead() && $$0.peek() != ' ' ? $$0.readDouble() : 0.0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gf.class, "left;up;forwards", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gf.class, "left;up;forwards", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gf.class, "left;up;forwards", "b", "c", "d"}, this, $$0);
    }

    public double d() {
        return this.b;
    }

    public double e() {
        return this.c;
    }

    public double f() {
        return this.d;
    }
}

