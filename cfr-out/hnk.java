/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class hnk {
    private static final Logger b = LogUtils.getLogger();
    private static final int c = ddl.i();
    public static final Codec<hnk> a = Codec.PASSTHROUGH.listOf().validate($$0 -> bhs.a($$0, c)).xmap(hnk::new, $$0 -> $$0.f);
    private static final DynamicOps<vz> d = vn.a;
    private static final Dynamic<?> e = new Dynamic(d, (Object)((vz)dlt.f.encodeStart(d, (Object)dlt.l).getOrThrow()));
    private List<Dynamic<?>> f;

    private hnk(List<Dynamic<?>> $$0) {
        this.f = $$0;
    }

    public hnk() {
        this(Collections.nCopies(c, e));
    }

    public List<dlt> a(jf.a $$0) {
        return this.f.stream().map($$1 -> dlt.f.parse(ams.a($$1, $$0)).resultOrPartial($$0 -> b.warn("Could not parse hotbar item: {}", $$0)).orElse(dlt.l)).toList();
    }

    public void a(ddl $$02, jr $$1) {
        ams<vz> $$2 = $$1.a(d);
        ImmutableList.Builder $$3 = ImmutableList.builderWithExpectedSize((int)c);
        for (int $$4 = 0; $$4 < c; ++$$4) {
            dlt $$5 = $$02.a($$4);
            Optional<Dynamic> $$6 = dlt.f.encodeStart($$2, (Object)$$5).resultOrPartial($$0 -> b.warn("Could not encode hotbar item: {}", $$0)).map($$0 -> new Dynamic(d, $$0));
            $$3.add($$6.orElse(e));
        }
        this.f = $$3.build();
    }

    public boolean a() {
        for (Dynamic<?> $$0 : this.f) {
            if (hnk.a($$0)) continue;
            return false;
        }
        return true;
    }

    private static boolean a(Dynamic<?> $$0) {
        return e.equals($$0);
    }
}

