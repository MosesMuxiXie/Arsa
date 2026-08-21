/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

public class dnp
implements dgw {
    public static final Codec<jd<dnp>> a = mi.i.r();
    public static final aao<xq, jd<dnp>> b = aam.b(mj.am);
    private final String c;
    private final List<cfm> d;
    private dgz e = dhb.g;

    public dnp(String $$0, cfm ... $$1) {
        this.c = $$0;
        this.d = List.of($$1);
    }

    public dnp a(dgx ... $$0) {
        this.e = dhb.e.a($$0);
        return this;
    }

    @Override
    public dgz k() {
        return this.e;
    }

    public List<cfm> a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        for (cfm $$0 : this.d) {
            if (!$$0.c().a().a()) continue;
            return true;
        }
        return false;
    }
}

