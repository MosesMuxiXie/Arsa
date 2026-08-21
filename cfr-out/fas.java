/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fas
implements fac {
    public static final Codec<fas> a = RecordCodecBuilder.create($$02 -> $$02.group((App)fes.b.fieldOf("feature").forGetter($$0 -> $$0.b), (App)Codec.intRange((int)1, (int)64).fieldOf("required_vertical_space_for_tree").forGetter($$0 -> $$0.c), (App)Codec.intRange((int)1, (int)64).fieldOf("root_radius").forGetter($$0 -> $$0.d), (App)bef.b(mj.i).fieldOf("root_replaceable").forGetter($$0 -> $$0.e), (App)fcd.a.fieldOf("root_state_provider").forGetter($$0 -> $$0.f), (App)Codec.intRange((int)1, (int)256).fieldOf("root_placement_attempts").forGetter($$0 -> $$0.g), (App)Codec.intRange((int)1, (int)4096).fieldOf("root_column_max_height").forGetter($$0 -> $$0.h), (App)Codec.intRange((int)1, (int)64).fieldOf("hanging_root_radius").forGetter($$0 -> $$0.i), (App)Codec.intRange((int)1, (int)16).fieldOf("hanging_roots_vertical_span").forGetter($$0 -> $$0.j), (App)fcd.a.fieldOf("hanging_root_state_provider").forGetter($$0 -> $$0.k), (App)Codec.intRange((int)1, (int)256).fieldOf("hanging_root_placement_attempts").forGetter($$0 -> $$0.l), (App)Codec.intRange((int)1, (int)64).fieldOf("allowed_vertical_water_for_tree").forGetter($$0 -> $$0.n), (App)evx.b.fieldOf("allowed_tree_position").forGetter($$0 -> $$0.o)).apply((Applicative)$$02, fas::new));
    public final jd<fes> b;
    public final int c;
    public final int d;
    public final bef<dzq> e;
    public final fcd f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final fcd k;
    public final int l;
    public final int n;
    public final evx o;

    public fas(jd<fes> $$0, int $$1, int $$2, bef<dzq> $$3, fcd $$4, int $$5, int $$6, int $$7, int $$8, fcd $$9, int $$10, int $$11, evx $$12) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
        this.l = $$10;
        this.n = $$11;
        this.o = $$12;
    }
}

