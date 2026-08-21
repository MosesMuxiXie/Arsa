/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;

public record iq(is b, is c) implements Iterable<is>
{
    private final is b;
    private final is c;
    public static final aao<ByteBuf, iq> a = new aao<ByteBuf, iq>(){

        public iq a(ByteBuf $$0) {
            return new iq(wx.c($$0), wx.c($$0));
        }

        public void a(ByteBuf $$0, iq $$1) {
            wx.a($$0, $$1.f());
            wx.a($$0, $$1.g());
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (iq)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };

    public iq(is $$0, is $$1) {
        this.b = is.a($$0, $$1);
        this.c = is.b($$0, $$1);
    }

    public static iq a(is $$0) {
        return new iq($$0, $$0);
    }

    public static iq a(is $$0, is $$1) {
        return new iq($$0, $$1);
    }

    public iq b(is $$0) {
        return new iq(is.a(this.b, $$0), is.b(this.c, $$0));
    }

    public boolean a() {
        return this.b.equals(this.c);
    }

    public boolean c(is $$0) {
        return $$0.u() >= this.b.u() && $$0.v() >= this.b.v() && $$0.w() >= this.b.w() && $$0.u() <= this.c.u() && $$0.v() <= this.c.v() && $$0.w() <= this.c.w();
    }

    public fth b() {
        return fth.a(this.b, this.c);
    }

    @Override
    public Iterator<is> iterator() {
        return is.c(this.b, this.c).iterator();
    }

    public int c() {
        return this.c.u() - this.b.u() + 1;
    }

    public int d() {
        return this.c.v() - this.b.v() + 1;
    }

    public int e() {
        return this.c.w() - this.b.w() + 1;
    }

    public iq a(iz $$0, int $$1) {
        if ($$1 == 0) {
            return this;
        }
        if ($$0.f() == iz.b.a) {
            return iq.a(this.b, is.b(this.b, this.c.a($$0, $$1)));
        }
        return iq.a(is.a(this.b.a($$0, $$1), this.c), this.c);
    }

    public iq b(iz $$0, int $$1) {
        if ($$1 == 0) {
            return this;
        }
        return new iq(this.b.a($$0, $$1), this.c.a($$0, $$1));
    }

    public iq a(jy $$0) {
        return new iq(this.b.a($$0), this.c.a($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{iq.class, "min;max", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{iq.class, "min;max", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{iq.class, "min;max", "b", "c"}, this, $$0);
    }

    public is f() {
        return this.b;
    }

    public is g() {
        return this.c;
    }
}

