/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record vc(float c) implements vp
{
    private final float c;
    private static final int v = 12;
    public static final vc a = new vc(0.0f);
    public static final wb<vc> b = new wb.a<vc>(){

        public vc a(DataInput $$0, vi $$1) throws IOException {
            return vc.a(1.d($$0, $$1));
        }

        @Override
        public vw.b a(DataInput $$0, vw $$1, vi $$2) throws IOException {
            return $$1.a(1.d($$0, $$2));
        }

        private static float d(DataInput $$0, vi $$1) throws IOException {
            $$1.b(12L);
            return $$0.readFloat();
        }

        @Override
        public int c() {
            return 4;
        }

        @Override
        public String a() {
            return "FLOAT";
        }

        @Override
        public String b() {
            return "TAG_Float";
        }

        @Override
        public /* synthetic */ vz c(DataInput dataInput, vi vi2) throws IOException {
            return this.a(dataInput, vi2);
        }
    };

    public static vc a(float $$0) {
        if ($$0 == 0.0f) {
            return a;
        }
        return new vc($$0);
    }

    @Override
    public void a(DataOutput $$0) throws IOException {
        $$0.writeFloat(this.c);
    }

    @Override
    public int a() {
        return 12;
    }

    @Override
    public byte b() {
        return 5;
    }

    public wb<vc> c() {
        return b;
    }

    public vc e() {
        return this;
    }

    @Override
    public void a(wd $$0) {
        $$0.a(this);
    }

    @Override
    public long g() {
        return (long)this.c;
    }

    @Override
    public int h() {
        return bgj.b(this.c);
    }

    @Override
    public short i() {
        return (short)(bgj.b(this.c) & 0xFFFF);
    }

    @Override
    public byte j() {
        return (byte)(bgj.b(this.c) & 0xFF);
    }

    @Override
    public double k() {
        return this.c;
    }

    @Override
    public float l() {
        return this.c;
    }

    @Override
    public Number m() {
        return Float.valueOf(this.c);
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
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{vc.class, "value", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{vc.class, "value", "c"}, this, $$0);
    }

    public float n() {
        return this.c;
    }

    @Override
    public /* synthetic */ vz d() {
        return this.e();
    }
}

