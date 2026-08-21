/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.Optional;

public interface eto {
    public static final Codec<eto> c = mi.u.q().dispatch(eto::a, etp::a);
    public static final aao<xq, eto> d = aam.a(mj.ak).b(eto::a, etp::b);

    public Optional<ftm> a(dwo var1);

    public etp<? extends eto> a();
}

