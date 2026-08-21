/*
 * Decompiled with CFR 0.152.
 */
public abstract class diz
extends dhi {
    public diz(dis<?> $$0, int $$1) {
        super($$0, $$1);
    }

    public abstract a a(boolean var1, boolean var2, dqx<?> var3, axf var4, ddl var5);

    public abstract void a(ddu var1);

    public abstract dja ao_();

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = diz$a.a();
        }
    }
}

