/*
 * Decompiled with CFR 0.152.
 */
public abstract sealed class eig
extends Enum<eig> {
    public static final /* enum */ eig a = new eig(){

        @Override
        public boolean a(eoh $$0, dvt $$1, is $$2, iz $$3) {
            return dzq.a($$0.h($$1, $$2), $$3);
        }
    };
    public static final /* enum */ eig b = new eig(){
        private final fug d = dzq.b(2.0, 0.0, 10.0);

        @Override
        public boolean a(eoh $$0, dvt $$1, is $$2, iz $$3) {
            return !fud.c($$0.h($$1, $$2).a($$3), this.d, ftq.c);
        }
    };
    public static final /* enum */ eig c = new eig(){
        private final fug d = fud.a(fud.b(), dzq.b(12.0, 0.0, 16.0), ftq.e);

        @Override
        public boolean a(eoh $$0, dvt $$1, is $$2, iz $$3) {
            return !fud.c($$0.h($$1, $$2).a($$3), this.d, ftq.c);
        }
    };
    private static final /* synthetic */ eig[] d;

    public static eig[] values() {
        return (eig[])d.clone();
    }

    public static eig valueOf(String $$0) {
        return Enum.valueOf(eig.class, $$0);
    }

    public abstract boolean a(eoh var1, dvt var2, is var3, iz var4);

    private static /* synthetic */ eig[] a() {
        return new eig[]{a, b, c};
    }

    static {
        d = eig.a();
    }
}

