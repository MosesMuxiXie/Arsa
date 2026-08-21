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

public record gl(gk b, gk c, gk d) implements ge
{
    private final gk b;
    private final gk c;
    private final gk d;
    public static final gl a = gl.a(new ftl(0.0f, 0.0f));

    @Override
    public ftm a(ed $$0) {
        ftm $$1 = $$0.e();
        return new ftm(this.b.a($$1.g), this.c.a($$1.h), this.d.a($$1.i));
    }

    @Override
    public ftl b(ed $$0) {
        ftl $$1 = $$0.l();
        return new ftl((float)this.b.a($$1.j), (float)this.c.a($$1.k));
    }

    @Override
    public boolean a() {
        return this.b.a();
    }

    @Override
    public boolean b() {
        return this.c.a();
    }

    @Override
    public boolean c() {
        return this.d.a();
    }

    public static gl a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        gk $$2 = gk.a($$0);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$1);
            throw gj.a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        gk $$3 = gk.a($$0);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$1);
            throw gj.a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        gk $$4 = gk.a($$0);
        return new gl($$2, $$3, $$4);
    }

    public static gl a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
        int $$2 = $$0.getCursor();
        gk $$3 = gk.a($$0, $$1);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$2);
            throw gj.a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        gk $$4 = gk.a($$0, false);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$2);
            throw gj.a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        gk $$5 = gk.a($$0, $$1);
        return new gl($$3, $$4, $$5);
    }

    public static gl a(double $$0, double $$1, double $$2) {
        return new gl(new gk(false, $$0), new gk(false, $$1), new gk(false, $$2));
    }

    public static gl a(ftl $$0) {
        return new gl(new gk(false, $$0.j), new gk(false, $$0.k), new gk(true, 0.0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gl.class, "x;y;z", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gl.class, "x;y;z", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gl.class, "x;y;z", "b", "c", "d"}, this, $$0);
    }

    public gk d() {
        return this.b;
    }

    public gk e() {
        return this.c;
    }

    public gk f() {
        return this.d;
    }
}

