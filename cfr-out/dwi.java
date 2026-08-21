/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import org.jspecify.annotations.Nullable;

public interface dwi {
    public static cex a(dwo $$0, @Nullable cgk $$1) {
        return $$0.as().d($$1, dwi.a($$1));
    }

    /*
     * WARNING - void declaration
     */
    public static @Nullable chl a(@Nullable cgk $$0) {
        chl chl2;
        cgk cgk2 = $$0;
        int n2 = 0;
        block5: while (true) {
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{czm.class, chl.class, dec.class}, (Object)cgk2, n2)) {
                case 0: {
                    czm $$1 = (czm)cgk2;
                    chl2 = $$1.e();
                    break block5;
                }
                case 1: {
                    chl $$2;
                    chl2 = $$2 = (chl)cgk2;
                    break block5;
                }
                case 2: {
                    void $$5;
                    dec $$3 = (dec)cgk2;
                    cgk cgk3 = $$3.p();
                    if (!(cgk3 instanceof chl)) {
                        n2 = 3;
                        continue block5;
                    }
                    chl $$4 = (chl)cgk3;
                    chl2 = $$5;
                    break block5;
                }
                default: {
                    chl2 = null;
                    break block5;
                }
            }
            break;
        }
        return chl2;
    }

    public axf a();

    public a b();

    public @Nullable chl c();

    public @Nullable cgk d();

    public float e();

    public ftm f();

    public boolean g();

    public boolean h();

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(false);
        public static final /* enum */ a b = new a(true);
        public static final /* enum */ a c = new a(true);
        public static final /* enum */ a d = new a(false);
        private final boolean e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(boolean $$0) {
            this.e = $$0;
        }

        public boolean a() {
            return this.e;
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            f = dwi$a.b();
        }
    }
}

