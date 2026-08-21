/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ddk
extends Record {
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private static final byte j = 1;
    private static final byte k = 2;
    private static final byte l = 4;
    private static final byte m = 8;
    private static final byte n = 16;
    private static final byte o = 32;
    private static final byte p = 64;
    public static final aao<wx, ddk> a = new aao<wx, ddk>(){

        public void a(wx $$0, ddk $$1) {
            byte $$2 = 0;
            $$2 = (byte)($$2 | ($$1.a() ? 1 : 0));
            $$2 = (byte)($$2 | ($$1.b() ? 2 : 0));
            $$2 = (byte)($$2 | ($$1.c() ? 4 : 0));
            $$2 = (byte)($$2 | ($$1.d() ? 8 : 0));
            $$2 = (byte)($$2 | ($$1.e() ? 16 : 0));
            $$2 = (byte)($$2 | ($$1.f() ? 32 : 0));
            $$2 = (byte)($$2 | ($$1.g() ? 64 : 0));
            $$0.l($$2);
        }

        public ddk a(wx $$0) {
            byte $$1 = $$0.readByte();
            boolean $$2 = ($$1 & 1) != 0;
            boolean $$3 = ($$1 & 2) != 0;
            boolean $$4 = ($$1 & 4) != 0;
            boolean $$5 = ($$1 & 8) != 0;
            boolean $$6 = ($$1 & 0x10) != 0;
            boolean $$7 = ($$1 & 0x20) != 0;
            boolean $$8 = ($$1 & 0x40) != 0;
            return new ddk($$2, $$3, $$4, $$5, $$6, $$7, $$8);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((wx)((Object)object), (ddk)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((wx)((Object)object));
        }
    };
    public static ddk b = new ddk(false, false, false, false, false, false, false);

    public ddk(boolean $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ddk.class, "forward;backward;left;right;jump;shift;sprint", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ddk.class, "forward;backward;left;right;jump;shift;sprint", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ddk.class, "forward;backward;left;right;jump;shift;sprint", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public boolean a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    public boolean c() {
        return this.e;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.g;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return this.i;
    }
}

