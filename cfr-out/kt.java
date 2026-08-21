/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class kt {
    public static final ks.d<kr> a = kt.a("damage", kr.a);
    public static final ks.d<ku.a> b = kt.a("enchantments", ku.a.a);
    public static final ks.d<ku.b> c = kt.a("stored_enchantments", ku.b.a);
    public static final ks.d<ky> d = kt.a("potion_contents", ky.a);
    public static final ks.d<kq> e = kt.a("custom_data", kq.a);
    public static final ks.d<kp> f = kt.a("container", kp.a);
    public static final ks.d<ko> g = kt.a("bundle_contents", ko.a);
    public static final ks.d<kv> h = kt.a("firework_explosion", kv.a);
    public static final ks.d<kw> i = kt.a("fireworks", kw.a);
    public static final ks.d<la> j = kt.a("writable_book_content", la.a);
    public static final ks.d<lb> k = kt.a("written_book_content", lb.a);
    public static final ks.d<kn> l = kt.a("attribute_modifiers", kn.a);
    public static final ks.d<kz> m = kt.a("trim", kz.a);
    public static final ks.d<kx> n = kt.a("jukebox_playable", kx.a);

    private static <T extends ks> ks.d<T> a(String $$0, Codec<T> $$1) {
        return jq.a(mi.ap, $$0, new ks.b<T>($$1));
    }

    public static ks.d<?> a(jq<ks.d<?>> $$0) {
        return a;
    }
}

