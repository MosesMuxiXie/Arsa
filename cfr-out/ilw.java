/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ilw {
    private static final bfm.b<amo, MapCodec<? extends ilu>> c = new bfm.b();
    public static final Codec<ilu> a = c.a(amo.a).dispatch(ilu::a, $$0 -> $$0);
    public static final Codec<List<ilu>> b = a.listOf().fieldOf("sources").codec();

    public static void a() {
        c.a(amo.b("single"), imb.b);
        c.a(amo.b("directory"), ily.b);
        c.a(amo.b("filter"), imc.b);
        c.a(amo.b("unstitch"), imd.b);
        c.a(amo.b("paletted_permutations"), ima.c);
    }
}

