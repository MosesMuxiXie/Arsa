/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class hov
implements AutoCloseable {
    public static final amo a = amo.b("main");
    private final List<hox> b;
    private final Map<amo, how.b> c;
    private final Set<amo> d;
    private final Map<amo, fxt> e = new HashMap<amo, fxt>();
    private final hnt f;

    private hov(List<hox> $$0, Map<amo, how.b> $$1, Set<amo> $$2, hnt $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.f = $$3;
    }

    public static hov a(how $$0, ilr $$12, Set<amo> $$2, amo $$3, hnt $$4) throws hph.b {
        Stream $$5 = $$0.b().stream().flatMap(how.c::a);
        Set<amo> $$6 = $$5.filter($$1 -> !$$0.a().containsKey($$1)).collect(Collectors.toSet());
        Sets.SetView $$7 = Sets.difference($$6, $$2);
        if (!$$7.isEmpty()) {
            throw new hph.b("Referenced external targets are not available in this context: " + String.valueOf($$7));
        }
        ImmutableList.Builder $$8 = ImmutableList.builder();
        for (int $$9 = 0; $$9 < $$0.b().size(); ++$$9) {
            how.c $$10 = $$0.b().get($$9);
            $$8.add((Object)hov.a($$12, $$10, $$3.g("/" + $$9)));
        }
        return new hov((List<hox>)$$8.build(), $$0.a(), $$6, $$4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static hox a(ilr $$02, how.c $$1, amo $$2) throws hph.b {
        RenderPipeline.Builder $$3 = RenderPipeline.builder(hpa.a).withFragmentShader($$1.c()).withVertexShader($$1.b()).withLocation($$2);
        for (how.a $$4 : $$1.d()) {
            $$3.withSampler($$4.a() + "Sampler");
        }
        $$3.withUniform("SamplerInfo", fyz.a);
        for (String $$5 : $$1.f().keySet()) {
            $$3.withUniform($$5, fyz.a);
        }
        RenderPipeline $$6 = $$3.build();
        ArrayList<hox.a> $$7 = new ArrayList<hox.a>();
        Iterator<how.a> iterator = $$1.d().iterator();
        block9: while (true) {
            how.a a2;
            if (!iterator.hasNext()) {
                return new hox($$6, $$1.e(), $$1.f(), $$7);
            }
            how.a $$8 = iterator.next();
            Objects.requireNonNull($$8);
            int n2 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{how.e.class, how.d.class}, (Object)a2, n2)) {
                case 0: {
                    boolean bl3;
                    Object object;
                    how.e e2 = (how.e)a2;
                    Object $$9 = object = e2.a();
                    Object $$10 = object = e2.c();
                    boolean $$11 = bl3 = e2.d();
                    boolean $$12 = bl3 = e2.e();
                    boolean $$13 = bl3 = (boolean)e2.f();
                    ikz $$14 = $$02.b(((amo)$$10).a($$0 -> "textures/effect/" + $$0 + ".png"));
                    $$7.add(new hox.d((String)$$9, $$14, $$11 ? 1 : 0, $$12 ? 1 : 0, $$13));
                    continue block9;
                }
                case 1: {
                    Object object = (how.d)a2;
                    try {
                        boolean bl2;
                        Object object2 = ((how.d)object).a();
                        String $$15 = object2;
                        Object $$16 = object2 = ((how.d)object).c();
                        boolean $$17 = bl2 = ((how.d)object).d();
                        boolean $$18 = bl2 = ((how.d)object).e();
                        $$7.add(new hox.c($$15, (amo)$$16, $$17, $$18));
                    }
                    catch (Throwable throwable) {
                        throw new MatchException(throwable.toString(), throwable);
                    }
                    continue block9;
                }
            }
            break;
        }
        throw new MatchException(null, null);
    }

    public void a(fwv $$0, int $$1, int $$2, a $$3) {
        GpuBufferSlice $$4 = this.f.a($$1, $$2);
        HashMap<amo, fyw<fxt>> $$5 = new HashMap<amo, fyw<fxt>>(this.c.size() + this.d.size());
        for (amo amo2 : this.d) {
            $$5.put(amo2, $$3.b(amo2));
        }
        for (Map.Entry entry : this.c.entrySet()) {
            amo $$8 = (amo)entry.getKey();
            how.b $$9 = (how.b)entry.getValue();
            fyu $$10 = new fyu($$9.a().orElse($$1), $$9.b().orElse($$2), true, $$9.d());
            if ($$9.c()) {
                fxt $$11 = this.a($$8, $$10);
                $$5.put($$8, $$0.a($$8.toString(), $$11));
                continue;
            }
            $$5.put($$8, $$0.a($$8.toString(), $$10));
        }
        for (hox hox2 : this.b) {
            hox2.a($$0, $$5, $$4);
        }
        for (amo amo3 : this.d) {
            $$3.a(amo3, (fyw)$$5.get(amo3));
        }
    }

    @Deprecated
    public void a(fxt $$0, fyt $$1) {
        fwv $$2 = new fwv();
        a $$3 = hov$a.b(a, $$2.a("main", $$0));
        this.a($$2, $$0.c, $$0.d, $$3);
        $$2.a($$1);
    }

    private fxt a(amo $$0, fyu $$1) {
        fxt $$2 = this.e.get($$0);
        if ($$2 == null || $$2.c != $$1.b() || $$2.d != $$1.c()) {
            if ($$2 != null) {
                $$2.a();
            }
            $$2 = $$1.a();
            $$1.a($$2);
            this.e.put($$0, $$2);
        }
        return $$2;
    }

    @Override
    public void close() {
        this.e.values().forEach(fxt::a);
        this.e.clear();
        for (hox $$0 : this.b) {
            $$0.close();
        }
    }

    public static interface a {
        public static a b(final amo $$0, final fyw<fxt> $$1) {
            return new a(){
                private fyw<fxt> c;
                {
                    this.c = $$1;
                }

                @Override
                public void a(amo $$02, fyw<fxt> $$12) {
                    if (!$$02.equals($$0)) {
                        throw new IllegalArgumentException("No target with id " + String.valueOf($$02));
                    }
                    this.c = $$12;
                }

                @Override
                public @Nullable fyw<fxt> a(amo $$02) {
                    return $$02.equals($$0) ? this.c : null;
                }
            };
        }

        public void a(amo var1, fyw<fxt> var2);

        public @Nullable fyw<fxt> a(amo var1);

        default public fyw<fxt> b(amo $$0) {
            fyw<fxt> $$1 = this.a($$0);
            if ($$1 == null) {
                throw new IllegalArgumentException("Missing target with id " + String.valueOf($$0));
            }
            return $$1;
        }
    }
}

