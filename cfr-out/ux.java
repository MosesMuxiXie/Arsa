/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ux
extends Record
implements vp {
    private final byte v;
    private static final int w = 9;
    public static final wb<ux> a = new wb.a<ux>(){

        public ux a(DataInput $$0, vi $$1) throws IOException {
            return ux.a(1.d($$0, $$1));
        }

        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) throws IOException {
            return $$1.a(1.d($$0, $$2));
        }

        private static byte d(DataInput $$0, vi $$1) throws IOException {
            $$1.b(9L);
            return $$0.readByte();
        }

        @Override
        public int c() {
            return 1;
        }

        @Override
        public String a() {
            return "BYTE";
        }

        @Override
        public String b() {
            return "TAG_Byte";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };
    public static final ux b = ux.a((byte)0);
    public static final ux c = ux.a((byte)1);

    @Deprecated(forRemoval=true)
    public ux(byte $$0) {
        this.v = $$0;
    }

    public static ux a(byte $$0) {
        return ux$a.a[128 + $$0];
    }

    public static ux a(boolean $$0) {
        return $$0 ? c : b;
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeByte(this.v);
    }

    @Override
    public int a() {
        return 9;
    }

    @Override
    public byte b() {
        return 1;
    }

    public wb<ux> c() {
        return a;
    }

    public ux e() {
        return this;
    }

    @Override
    public void a(wd $$0) {
        $$0.a(this);
    }

    @Override
    public long g() {
        return this.v;
    }

    @Override
    public int h() {
        return this.v;
    }

    @Override
    public short i() {
        return this.v;
    }

    @Override
    public byte j() {
        return this.v;
    }

    @Override
    public double k() {
        return this.v;
    }

    @Override
    public float l() {
        return this.v;
    }

    @Override
    public Number m() {
        return this.v;
    }

    @Override
    public vw.b a(vw $$0) {
        return $$0.a(this.v);
    }

    @Override
    public String toString() {
        vy $$0 = new vy();
        $$0.a(this);
        return $$0.a();
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ux.class, "value", "v"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ux.class, "value", "v"}, this, $$0);
    }

    public byte n() {
        return this.v;
    }

    @Override
    public /* synthetic */ vz d() {
        return this.e();
    }

    static class a {
        static final ux[] a = new ux[256];

        private a() {
        }

        static {
            for (int $$0 = 0; $$0 < a.length; ++$$0) {
                ux$a.a[$$0] = new ux((byte)($$0 - 128));
            }
        }
    }
}

