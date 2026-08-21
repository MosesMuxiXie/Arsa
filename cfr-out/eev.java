/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class eev
extends Enum<eev>
implements bhh {
    public static final /* enum */ eev a = new eev("none", f.a);
    public static final /* enum */ eev b = new eev("left_right", f.B);
    public static final /* enum */ eev c = new eev("front_back", f.z);
    public static final Codec<eev> d;
    @Deprecated
    public static final Codec<eev> e;
    private final String f;
    private final yh g;
    private final f h;
    private static final /* synthetic */ eev[] i;

    public static eev[] values() {
        return (eev[])i.clone();
    }

    public static eev valueOf(String $$0) {
        return Enum.valueOf(eev.class, $$0);
    }

    private eev(String $$0, f $$1) {
        this.f = $$0;
        this.g = yh.c("mirror." + $$0);
        this.h = $$1;
    }

    public int a(int $$0, int $$1) {
        int $$2 = $$1 / 2;
        int $$3 = $$0 > $$2 ? $$0 - $$1 : $$0;
        switch (this.ordinal()) {
            case 2: {
                return ($$1 - $$3) % $$1;
            }
            case 1: {
                return ($$2 - $$3 + $$1) % $$1;
            }
        }
        return $$0;
    }

    public egm a(iz $$0) {
        iz.a $$1 = $$0.o();
        return this == b && $$1 == iz.a.c || this == c && $$1 == iz.a.a ? egm.c : egm.a;
    }

    public iz b(iz $$0) {
        if (this == c && $$0.o() == iz.a.a) {
            return $$0.g();
        }
        if (this == b && $$0.o() == iz.a.c) {
            return $$0.g();
        }
        return $$0;
    }

    public f a() {
        return this.h;
    }

    public yh b() {
        return this.g;
    }

    @Override
    public String c() {
        return this.f;
    }

    private static /* synthetic */ eev[] d() {
        return new eev[]{a, b, c};
    }

    static {
        i = eev.d();
        d = bhh.a(eev::values);
        e = bfm.c(eev::valueOf);
    }
}

