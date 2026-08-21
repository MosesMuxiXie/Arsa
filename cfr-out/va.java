/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record va(double c) implements vp
{
    private final double c;
    private static final int v = 16;
    public static final va a = new va(0.0);
    public static final wb<va> b = new wb.a<va>(){

        public va a(DataInput $$0, vi $$1) throws IOException {
            return va.a(1.d($$0, $$1));
        }

        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) throws IOException {
            return $$1.a(1.d($$0, $$2));
        }

        private static double d(DataInput $$0, vi $$1) throws IOException {
            $$1.b(16L);
            return $$0.readDouble();
        }

        @Override
        public int c() {
            return 8;
        }

        @Override
        public String a() {
            return "DOUBLE";
        }

        @Override
        public String b() {
            return "TAG_Double";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };

    public static va a(double $$0) {
        if ($$0 == 0.0) {
            return a;
        }
        return new va($$0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeDouble(this.c);
    }

    @Override
    public int a() {
        return 16;
    }

    @Override
    public byte b() {
        return 6;
    }

    public wb<va> c() {
        return b;
    }

    public va e() {
        return this;
    }

    @Override
    public void a(wd $$0) {
        $$0.a(this);
    }

    @Override
    public long g() {
        return (long)Math.floor(this.c);
    }

    @Override
    public int h() {
        return bgj.c(this.c);
    }

    @Override
    public short i() {
        return (short)(bgj.c(this.c) & 0xFFFF);
    }

    @Override
    public byte j() {
        return (byte)(bgj.c(this.c) & 0xFF);
    }

    @Override
    public double k() {
        return this.c;
    }

    @Override
    public float l() {
        return (float)this.c;
    }

    @Override
    public Number m() {
        return this.c;
    }

    @Override
    public vw.b a(vw $$0) {
        return $$0.a(this.c);
    }

    @Override
    public String toString() {
        vy $$0 = new vy();
        $$0.a(this);
        return $$0.a();
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{va.class, "value", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{va.class, "value", "c"}, this, $$0);
    }

    public double n() {
        return this.c;
    }

    @Override
    public /* synthetic */ vz d() {
        return this.e();
    }
}

