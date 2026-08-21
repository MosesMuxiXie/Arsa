/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

public interface dqs<T extends dqy> {
    public static final Codec<dqs<?>> a = mi.s.q().dispatch(dqs::a, drc::a);
    public static final Codec<amt<dqs<?>>> b = amt.a(mj.bK);
    public static final aao<xq, dqs<?>> c = aam.a(mj.ap).b(dqs::a, drc::b);

    public boolean a(T var1, dwo var2);

    public dlt a(T var1, jf.a var2);

    default public boolean ar_() {
        return false;
    }

    default public boolean i() {
        return true;
    }

    default public String j() {
        return "";
    }

    public drc<? extends dqs<T>> a();

    public drd<? extends dqs<T>> b();

    public dqr aq_();

    default public List<dry> g() {
        return List.of();
    }

    public dqv h();
}

